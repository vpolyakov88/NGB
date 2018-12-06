package com.epam.catgenome.util.aws;


import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.AmazonS3URI;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import org.apache.http.HttpStatus;

import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Class provides configuration of AWS client and utility methods for S3
 */
public final class S3Client {

    private static final int CONNECTIONS_NUMBER = 50;
    private static final int TIMEOUT = 10_000;
    private static final int MAX_RETRY = 10;
    private static final AmazonS3 aws;

    static {
        ClientConfiguration configuration = new ClientConfiguration()
                .withMaxConnections(CONNECTIONS_NUMBER)
                .withMaxErrorRetry(MAX_RETRY)
                .withConnectionTimeout(TIMEOUT)
                .withSocketTimeout(TIMEOUT)
                .withTcpKeepAlive(true);

        aws = AmazonS3ClientBuilder.standard().build();
    }

    static AmazonS3 getAws() {
        return aws;
    }

    /**
     * A method that returns true if a correct s3 URI was provided and false otherwise.
     *
     * @param uri The provided URI for the file.
     * @return a boolean value that shows whether the correct URI was provided
     */
    public static boolean isFileExisting(AmazonS3URI uri) {

        boolean exist = true;

        try {
            aws.getObjectMetadata(uri.getBucket(), uri.getKey());
        } catch (AmazonS3Exception e) {
            if (e.getStatusCode() == HttpStatus.SC_FORBIDDEN
                    || e.getStatusCode() == HttpStatus.SC_NOT_FOUND) {
                exist = false;
            } else {
                throw e;
            }
        }
        return exist;
    }

    /**
     * A method that returns the file size.
     *
     * @param amazonURI An s3 URI
     * @return long value of the file size in bytes
     */
    public static long getFileSize(AmazonS3URI amazonURI){
        return aws
                .getObjectMetadata(amazonURI.getBucket(), amazonURI.getKey())
                .getContentLength();
    }

    /**
     * A method that creates an InputStream on a specific range of the file.
     * InputStream classes wrapping order can be reversed.
     *
     * @param obj    target file URI
     * @param offset range start position
     * @param end    range end position
     * @return an InputStream object on the specific range of the file.
     */
    public static InputStream loadFromTo(AmazonS3URI obj, long offset, long end) {
        GetObjectRequest rangeObjectRequest = new GetObjectRequest(obj.getBucket(), obj.getKey());
        rangeObjectRequest.setRange(offset, end);
        S3Object s3Object = S3Client.getAws().getObject(rangeObjectRequest);
        S3ObjectInputStream objectStream = s3Object.getObjectContent();
        return new BufferedInputStream(objectStream);
    }

    /**
     * A method that creates an InputStream on a range
     * from a specific position to the end of the file.
     *
     * @param obj    target file URI
     * @param offset range start position
     * @return an InputStream object on the specific range of the file.
     */
    @SuppressWarnings("WeakerAccess")
    public static InputStream loadFrom(AmazonS3URI obj,
                                       @SuppressWarnings("SameParameterValue") long offset) {
        long contentLength = S3Client.getFileSize(obj);
        return loadFromTo(obj, offset, contentLength);
    }

    /**
     * A method that creates an InputStream on a specific file URI.
     *
     * @param obj target file URI
     * @return an InputStream object on the file URI.
     */
    @SuppressWarnings("WeakerAccess")
    public static InputStream loadFully(AmazonS3URI obj) {
        return loadFrom(obj, 0);
    }

}