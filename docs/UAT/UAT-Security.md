
# SAML SSO Authentication UAT

## Scenario 1. Register reference and attach species by ROLE_REFERENCE_MANAGER user.
Prerequisites: User shall have role ROLE_REFERENCE_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register reference|1. Open NGB.<br>2. Login as ROLE_REFERENCE_MANAGER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register reference by CLI command `ngb reg_ref {PATH_TO_FASTA} -n {REFERNCE_NAME}`.<br>7. Register species by CLI command `ngb reg_spec {SPECIES_NAME} {SPECIES_VERSION}`<br>8. Attach species to reference by CLI command `ngb add_spec {REFERNCE_NAME} {SPECIES_VERSION}`|Login is successful.<br>Reference is successfully registered.<br>Species is successfully registered.<br>Species is successfully added to reference.|
|2|Create dataset|1. Create dataset for registered reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Open NGB UI<br>3. Ensure "Dataset" tab is active and selected.|Registered dataset is displayed on "Dataset" tab.<br>Reference opposite dataset corresponds to registered reference name|
|3|Validate of species added on NGB UI.|1. Navigate to any covered by BAM file region.<br>2. Click on any read.<br>3. On appeared menu click on "BLAT Search" point.|"BLAT" tab is appeared.<br>On "BLAT" tab is displayed list of consensus sequences.|

## Scenario 2. Register BAM file and add in dataset by ROLE_BAM_MANAGER user.
Prerequisites: User shall have role ROLE_BAM_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register BAM file|1. Open NGB.<br>2. Login as ROLE_BAM_MANAGER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register BAM file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_BAM}?{PATH_TO_BAI} -n {BAM_NAME}`.|Login is successful.<br>BAM file is successfully registered.|
|2|Create dataset and add BAM in created dataset|1. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Add registered BAM file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {BAM_NAME}`.<br>3. Open NGB UI<br>4. Ensure "Dataset" tab is active and selected.<br>5. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab.<br>Reference opposite dataset corresponds to existed reference name.<br>In dataset is displayed registered BAM file.|
|3|View BAM track on NGB UI.|1. Select covered chromosome of BAM file by click on "CHR:NONE" on top left corner of "Browser" tab.<br>2. Navigate to covered region of BAM file|Reference is displayed as first track.<br>BAM track is displayed as second.<br>After step 1: on BAM track is displayed message "Zoom in to see reads. Minimal zoom level is at 150kBP".<br>After step 2: reads and coverage diagram is displayed on BAM track.


## Scenario 3. Register VCF file and add in dataset by ROLE_VCF_MANAGER user.
Prerequisites: User shall have role ROLE_VCF_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register VCF file|1. Open NGB.<br>2. Login as ROLE_VCF_MANAGER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register VCF file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_VCF} -n {VCF_NAME}`.|Login is successful.<br>VCF file is successfully registered.|
|2|Create dataset and add VCF in created dataset|1. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Add registered VCF file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {VCF_NAME}`.<br>3. Open NGB UI<br>4. Ensure "Dataset" tab is active and selected.<br>5. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab. Reference opposite dataset corresponds to existed reference name. In dataset is displayed registered VCF file.<br>Next plots is displayed on "Browser" tab: "Variants by chromosome", "Variants types", "Variants quality".|
|3|Validate variations tab on NGB UI.|Select "Variants" tab.|List of variations from VCF file are displayed.|
|4|View VCF track on NGB UI.|Click on any variation in the table of "Variants" tab.|Reference is displayed as first track.<br>VCF track is displayed as second.<br>Variation is displayed on VCF track.

## Scenario 4. Register SEG file and add in dataset by ROLE_SEG_MANAGER user.
Prerequisites: User shall have role ROLE_SEG_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register SEG file|1. Open NGB.<br>2. Login as ROLE_SEG_MANAGER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register SEG file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_SEG} -n {SEG_NAME}`.|Login is successful.<br>SEG file is successfully registered.|
|2|Create dataset and add SEG in created dataset|1. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Add registered SEG file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {SEG_NAME}`.<br>3. Open NGB UI<br>4. Ensure "Dataset" tab is active and selected.<br>5. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab. Reference opposite dataset corresponds to existed reference name. In dataset is displayed registered SEG file.|

## Scenario 5. Register WIG file and add in dataset by ROLE_WIG_MANAGER user.
Prerequisites: User shall have role ROLE_WIG_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register WIG file.|1. Open NGB.<br>2. Login as ROLE_WIG_MANAGER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register WIG file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_WIG} -n {WIG_NAME}`.|Login is successful.<br>WIG file is successfully registered.|
|2|Create dataset and add WIG in created dataset|1. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Add registered WIG file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {WIG_NAME}`.<br>3. Open NGB UI<br>4. Ensure "Dataset" tab is active and selected.<br>5. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab. Reference opposite dataset corresponds to existed reference name. In dataset is displayed registered WIG file.|
|3|View WIG track on NGB UI.|Select covered chromosome of WIG file by click on "CHR:NONE" on top left corner of "Browser" tab.|Reference is displayed as first track.<br>WIG track is displayed as second.<br>Content of WIG track is displayed.|

## Scenario 6. Register GENE file and add in dataset by ROLE_GENE_MANAGER user.
Prerequisites: User shall have role ROLE_GENE_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register GENE file GTF.|1. Open NGB.<br>2. Login as ROLE_GENE_MANAGER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register GENE file GTF for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_GTF} -n {GTF_NAME}`.|Login is successful.<br>GTF file is successfully registered.|
|2|Register GENE file GFF|1. Register GENE file GFF for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_GFF} -n {GFF_NAME}`.| GFF file is successfully registered.|
|3|Create dataset and add GENE in created dataset|1. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Add registered GENE files into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {GTF_NAME} {GFF_NAME}`.<br>3. Open NGB UI<br>4. Ensure "Dataset" tab is active and selected.<br>5. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab. Reference opposite dataset corresponds to existed reference name. In dataset is displayed registered GENE files.|
|4|View GENE track on NGB UI.|1. Select any chromosome by click on "CHR:NONE" on top left corner of "Browser" tab.<br>2. Zoom in to 5Mbp.|Reference is displayed as first track.<br>GENE track is displayed as second.<br>Diagram of genes is displayed on track.<br>After step 2 genes are displayed on track.|

## Scenario 7. Attach registered GENE file to registered reference.
Prerequisites: User shall have role ROLE_REFERENCE_MANAGER and READ permissions on any gene file. Reference and gene files shall be registered. At least one not empty dataset shall be registered.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Get token and login in CLI.<br>Check files from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check reference by CLI command `ngb list_ref -t`<br>7. Check gene file by CLI command `ngb search -l {GENE_FILE_NAME} -t`|Login is successful.<br>List of references is displayed like a table.<br>Info about GENE file is displayed like a table.|
|2|Add genes to reference and check it.|1. Add genes to reference by CLI command `ngb add_genes {REFERENCE_NAME} {GENE_FILE_NAME}` (REFERENCE_NAME shall corresponds to dataset's reference from prerequisites).<br>2. Open NGB UI.<br>3. Click on "dashboard" icon on left panel and click on "Restore default layout".<br>4. Select dataset from prerequisites.<br>5. Click on reference name on header of "Browser" panel.|Gene file is successfully added to reference.<br>After click on reference name on UI, gene file name is displayed in drop-down list.|

## Scenario 8. Register all files types and create dataset by ROLE_ADMIN user.
Prerequisites: User shall have role ROLE_ADMIN.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register reference|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register reference by CLI command `ngb reg_ref {PATH_TO_FASTA} -n {REFERNCE_NAME}`.<br>7. Register species by CLI command `ngb reg_spec {SPECIES_NAME} {SPECIES_VERSION}`<br>8. Attach species to reference by CLI command `ngb add_spec {REFERNCE_NAME} {SPECIES_VERSION}`|Login is successful.<br>Reference is successfully registered.<br>Species is successfully registered.<br>Species is successfully added to reference.|
|2|Register BAM file.<br>Create dataset and add BAM in created dataset.|1. Register BAM file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_BAM}?{PATH_TO_BAI} -n {BAM_NAME}`.<br>2. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>3. Add registered BAM file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {BAM_NAME}`.|BAM file is successfully registered.|
|3|Register VCF file and add in created dataset.|1. Register VCF file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_VCF} -n {VCF_NAME}`.<br>2. Add registered VCF file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {VCF_NAME}`.|VCF file is successfully registered.|
|4|Register WIG file and add in created dataset.|1. Register WIG file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_WIG} -n {WIG_NAME}`.<br>2. Add registered WIG file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {WIG_NAME}`.|WIG file is successfully registered.|
|5|Register GENE file GTF and add genes to reference.|1. Register GENE file GTF for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_GTF} -n {GTF_NAME}`.<br>2. Add genes to reference by CLI command `ngb add_genes {REFERENCE_NAME} {GENE_FILE_NAME}`.|Gene file is successfully added to reference.|
|6|Register GENE file GFF and add genes to reference.|1. Register GENE file GFF for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_GFF} -n {GFF_NAME}`.<br>2. Add genes to reference by CLI command `ngb add_genes {REFERENCE_NAME} {GENE_FILE_NAME}`.|Gene file is successfully added to reference.|
|7|Register SEG file and add in created dataset.|1. Register SEG file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_SEG} -n {SEG_NAME}`.<br>2. Add registered SEG file into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {SEG_NAME}`.|SEG file is successfully registered.|
|8|Validate registred files on NGB UI.|1. Open NGB UI.<br>2. Click on "dashboard" icon on left panel and click on "Restore default layout".<br>3. Select dataset {DATASET_NAME}<br>4. Click on reference name on header of "Browser" panel and select both GENE files.|Dataset is expanded.<br>All files are selected.<br>On "Browser" tab is displayed list of registered file names(REFERENCE, BAM, VCF, WIG, SEG), grouped by types.|
|9|Validate variations tab on NGB UI.|Select "Variants" tab.|List of variations from VCF file are displayed.|
|10|Validate tracks on NGB UI.|Select any chromosome by click on "CHR:NONE" on top left corner of "Browser" tab.|On "Browser" tab is displayed list of tracks: REFERENCE, BAM, VCF, WIG, SEG, GFF, GTF.|

## Scenario 9. View files by ROLE_USER user with READ permissions on all files in dataset.
Prerequisites: completed Scenario 8.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check login by CLI command `ngb list_ref -t`.|Login is successful.<br>List of references is displayed.|
|2|Grant READ permissions for a ROLE_USER user on registered in Scenario 8 BAM file.|1. Grant READ permissions on BAM file by CLI command `ngb chmod +r --users "{ROLE_USER_USER_NAME}" --files "{BAM_NAME}"`.|Permissions is successful granted.|
|3|Grant READ permissions for a ROLE_USER user on registered in Scenario 8 VCF file.|1. Grant READ permissions on VCF file by CLI command `ngb chmod +r --users "{ROLE_USER_USER_NAME}" --files "{VCF_NAME}"`.|Permissions is successful granted.|
|4|Grant READ permissions for a ROLE_USER user on registered in Scenario 8 WIG file.|1. Grant READ permissions on WIG file by CLI command `ngb chmod +r --users "{ROLE_USER_USER_NAME}" --files "{WIG_NAME}"`.|Permissions is successful granted.|
|5|Grant READ permissions for a ROLE_USER user on registered in Scenario 8 SEG file.|1. Grant READ permissions on SEG file by CLI command `ngb chmod +r --users "{ROLE_USER_USER_NAME}" --files "{SEG_NAME}"`.|Permissions is successful granted.|
|6|Login as ROLE_USER user.<br>Validate permissions on NGB UI.|1. Open NGB UI.<br>2. Login as ROLE_USER user.<br>3. Select dataset from Scenario 8.|BAM, VCF, WIG, SEG files is displayed under dataset name and on "Browser" panel.|
|7|Validate tracks on NGB UI.|Select any chromosome by click on "CHR:NONE" on top left corner of "Browser" tab.|On "Browser" tab is displayed list of tracks: REFERENCE, BAM, VCF, WIG, SEG, GFF, GTF.|

## Scenario 10. Search by features by ROLE_USER user.
Prerequisites: completed Scenario 9.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in NGB UI by ROLE_USER user and select dataset created in Scenario 8.|1. Open NGB UI.<br>2. Login as ROLE_USER user.<br>3. Select dataset from Scenario 8.|BAM, VCF, WIG, SEG files is displayed under dataset name and on "Browser" panel.|
|2|Search by genes.|1. Click on "TYPE COORDINATES" on top left corner of "Browser" panel.<br>2. Type valid feature name from GTF or GFF files registered in Scenario 8.<br>3. Click on feature name on appeared drop-down list.|List of corresponding features to the entered feature is opened.<br>Tracks are opened on selected feature coordinates.|

## Scenario 11. View files by ROLE_USER user without READ permissions on BAM file in dataset.
Prerequisites: completed Scenario 10.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check login by CLI command `ngb list_ref -t`.|Login is successful.<br>List of references is displayed.|
|2|Deny READ permissions for a ROLE_USER user on BAM file registered in Scenario 8.|1. Deny READ permissions on BAM file by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --files "{BAM_NAME}"`.|Permissions is successful denied.|
|3|Login as ROLE_USER user without READ permissions on BAM file.<br>Validate permissions on NGB UI.|Login in NGB UI by ROLE_USER user without READ permissions on BAM and select dataset created in Scenario 8.|BAM file isn't displayed in dataset.|

## Scenario 12. View files by ROLE_USER user without READ permissions on VCF file in dataset.
Prerequisites: completed Scenario 10.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check login by CLI command `ngb list_ref -t`.|Login is successful.<br>List of references is displayed.|
|2|Deny READ permissions for a ROLE_USER user on VCF file registered in Scenario 8.|1. Deny READ permissions on VCF file by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --files "{VCF_NAME}"`.|Permissions is successful denied.|
|3|Login as ROLE_USER user without READ permissions on VCF file.<br>Validate permissions on NGB UI.|Login in NGB UI by ROLE_USER user without READ permissions on VCF and select dataset created in Scenario 8.|VCF file isn't displayed in dataset.|

## Scenario 13. View files by ROLE_USER user without READ permissions on SEG file in dataset.
Prerequisites: completed Scenario 10.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check login by CLI command `ngb list_ref -t`.|Login is successful.<br>List of references is displayed.|
|2|Deny READ permissions for a ROLE_USER user on SEG file registered in Scenario 8.|1. Deny READ permissions on SEG file by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --files "{SEG_NAME}"`.|Permissions is successful denied.|
|3|Login as ROLE_USER user without READ permissions on SEG file.<br>Validate permissions on NGB UI.|Login in NGB UI by ROLE_USER user without READ permissions on SEG and select dataset created in Scenario 8.|SEG file isn't displayed in dataset.|

## Scenario 14. View files by ROLE_USER user without READ permissions on GTF file attached to reference.
Prerequisites: completed Scenario 10.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check login by CLI command `ngb list_ref -t`.|Login is successful.<br>List of references is displayed.|
|2|Deny READ permissions for a ROLE_USER user on GTF file registered in Scenario 8.|1. Deny READ permissions on GTF file by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --files "{GTF_NAME}"`.|Permissions is successful denied.|
|3|Login as ROLE_USER user without READ permissions on GTF file.<br>Validate permissions on NGB UI.|1. Login in NGB UI by ROLE_USER user without READ permissions on GTF and select dataset created in Scenario 8.<br>2. Click on "dashboard" icon on left panel and click on "Restore default layout".<br>3. Select dataset from prerequisites.<br>4. Click on reference name on header of "Browser" panel.|After click on reference name on UI, GTF file name isn't displayed in drop-down list.|

## Scenario 15. View files by ROLE_USER user without READ permissions on GFF file attached to reference.
Prerequisites: completed Scenario 10.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Check login by CLI command `ngb list_ref -t`.|Login is successful.<br>List of references is displayed.|
|2|Deny READ permissions for a ROLE_USER user on GFF file registered in Scenario 8.|1. Deny READ permissions on GFF file by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --files "{GFF_NAME}"`.|Permissions is successful denied.|
|3|Login as ROLE_USER user without READ permissions on GFF file.<br>Validate permissions on NGB UI.|1. Login in NGB UI by ROLE_USER user without READ permissions on GTF and select dataset created in Scenario 8.<br>2. Click on "dashboard" icon on left panel and click on "Restore default layout".<br>3. Select dataset from prerequisites.<br>4. Click on reference name on header of "Browser" panel.|After click on reference name on UI, GFF file name isn't displayed in drop-down list.|

## Scenario 16. Search by features by ROLE_USER user without READ permissions on GENE files attached to reference.
Prerequisites: completed Scenario 9.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in NGB UI by ROLE_USER user and select dataset created in Scenario 8.|1. Open NGB UI.<br>2. Login as ROLE_USER user.<br>3. Select dataset from Scenario 8.|WIG file is displayed under dataset name and on "Browser" panel.|
|2|Search by genes.|1. Click on "TYPE COORDINATES" on top left corner of "Browser" panel.<br>2. Type valid feature name from GTF or GFF files registered in Scenario 8.|"No genes found" message is displayed on appeared drop-down.|

## Scenario 17. Create dataset in dataset by ROLE_USER user with READ and WRITE permissions on dataset.
Prerequisites: User shall have role ROLE_USER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Create root dataset.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Create dataset by CLI command `ngb reg_dataset {REFERENCE_NAME} {PARENT_DATASET_NAME}`.<br>7. Grant READ and WRITE permissions on created dataset for ROLE_USER user.|Login is successful.<br>Permissions on dataset are successfully granted.|
|2|Create child dataset.|1. Open NGB.<br>2. Login as  ROLE_USER user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Create dataset by CLI command `ngb reg_dataset {REFERENCE_NAME} {CHILD_DATASET_NAME}`.<br>7. Move {CHILD_DATASET} to {PARENT_DATASET} by CLI command `ngb md {CHILD_DATASET_NAME} -p {PARENT_DATASET_NAME}`.|Child dataset is successfully registered.<br>Child dataset is successfully added in parent dataset.|
|3|Validate child dataset on NGB UI.|1. Open NGB.<br>2. Login as ROLE_USER user.<br>3. Expand {PARENT_DATASET_NAME}.|Near {PARENT_DATASET_NAME} is displayed label "1 DATASET".<br>After parent dataset expanding, child dataset is displayed under parent dataset.|

## Scenario 18.  Validate multiple roles user (ROLE_REFERENCE_MANAGER and ROLE_GENE_MANAGER).
Prerequisites: User shall have role ROLE_REFERENCE_MANAGER and ROLE_GENE_MANAGER.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register reference|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register reference by CLI command `ngb reg_ref {PATH_TO_FASTA} -n {REFERNCE_NAME}`.<br>7. Register species by CLI command `ngb reg_spec {SPECIES_NAME} {SPECIES_VERSION}`<br>8. Attach species to reference by CLI command `ngb add_spec {REFERNCE_NAME} {SPECIES_VERSION}`|Login is successful.<br>Reference is successfully registered.<br>Species is successfully registered.<br>Species is successfully added to reference.|
|2|Register GENE file GTF.|Register GENE file GTF for reference (registered on step 1) by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_GTF} -n {GTF_NAME}`.|GTF file is successfully registered.|
|3|Add genes to reference.|Add genes to reference by CLI command `ngb add_genes {REFERENCE_NAME} {GENE_FILE_NAME}` (REFERENCE_NAME shall be equal reference name from step 1).|Gene file is successfully added to reference.|
|4|Register GENE file GFF|1. Register GENE file GFF for reference (registered on step 1) by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_GFF} -n {GFF_NAME}`.| GFF file is successfully registered.|
|5|Create dataset and add GENE in created dataset|1. Create dataset for existed reference by CLI command `ngb reg_dataset {REFERENCE_NAME} {DATASET_NAME}`.<br>2. Add registered GENE files into created dataset by CLI command `ngb add_dataset {DATASET_NAME} {GTF_NAME} {GFF_NAME}`.<br>3. Open NGB UI<br>4. Ensure "Dataset" tab is active and selected.<br>5. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab. Reference opposite dataset corresponds to existed reference name. In dataset is displayed registered GENE files.|
|6|View GENE track on NGB UI.|1. Select any chromosome by click on "CHR:NONE" on top left corner of "Browser" tab.<br>2. Zoom in to 5Mbp.|Reference is displayed as first track.<br>GENE track is displayed as second.<br>Diagram of genes is displayed on track.<br>After step 2 genes are displayed on track.|

## Scenario 19.  Validate multiple roles user (ROLE_VCF_MANAGER, ROLE_BAM_MANAGER and ROLE_WIG_MANAGER).
Prerequisites: User shall have role ROLE_VCF_MANAGER, ROLE_BAM_MANAGER and ROLE_WIG_MANAGER. Scenario 18 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI and register BAM file.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Register BAM file for reference (reference from step 1, Scenario 18) by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_BAM}?{PATH_TO_BAI} -n {BAM_NAME}`.|Login is successful.<br>BAM file is successfully registered.|
|2|Add BAM in dataset. (dataset created on step 5, Scenario 18)|1. Add registered BAM file into dataset created on step 5, Scenario 18, by CLI command `ngb add_dataset {DATASET_NAME} {BAM_NAME}`.<br>2. Open NGB UI<br>3. Ensure "Dataset" tab is active and selected.<br>4. Expand and select created dataset.|In dataset is displayed registered BAM file.|
|3|View BAM track on NGB UI.|1. Select covered chromosome of BAM file by click on "CHR:NONE" on top left corner of "Browser" tab.<br>2. Navigate to covered region of BAM file|Reference is displayed as first track.<br>BAM track is displayed as second.<br>After step 1: on BAM track is displayed message "Zoom in to see reads. Minimal zoom level is at 150kBP".<br>After step 2: reads and coverage diagram is displayed on BAM track.|
|4|Register VCF file.|1. Register VCF file for reference (reference from step 1, Scenario 18) by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_VCF} -n {VCF_NAME}`.|VCF file is successfully registered.|
|5|Add VCF in created dataset. (dataset created on step 5, Scenario 18)|1. Add registered VCF file into dataset created on step 1 Scenario 18, by CLI command `ngb add_dataset {DATASET_NAME} {VCF_NAME}`.<br>2. Open NGB UI<br>3. Ensure "Dataset" tab is active and selected.<br>4. Expand and select created dataset.|In dataset is displayed registered VCF file.<br>Next plots is displayed on "Browser" tab: "Variants by chromosome", "Variants types", "Variants quality".|
|6|Validate variations tab on NGB UI.|Select "Variants" tab.|List of variations from VCF file are displayed.|
|7|View VCF track on NGB UI.|Click on any variation in the table of "Variants" tab.|Reference is displayed as first track.<br>BAM track is displayed as second.<br>VCF track is displayed as third.<br>Variation is displayed on VCF track.<br>Reads and coverage diagram is displayed on BAM track.|
|8|Register WIG file.|Register WIG file for existed reference by CLI command `ngb reg_file {REFERNCE_NAME} {PATH_TO_WIG} -n {WIG_NAME}`.|Login is successful.<br>WIG file is successfully registered.|
|9|Add WIG in created dataset. (dataset created on step 5, Scenario 18)|1. Add registered WIG file into dataset created on step 1 Scenario 18, by CLI command `ngb add_dataset {DATASET_NAME} {WIG_NAME}`.<br>2. Open NGB UI<br>3. Ensure "Dataset" tab is active and selected.<br>4. Expand and select created dataset.|Registered dataset is displayed on "Dataset" tab. Reference opposite dataset corresponds to existed reference name. In dataset is displayed registered WIG file.|
|10|View WIG track on NGB UI.|Select covered chromosome of WIG file by click on "CHR:NONE" on top left corner of "Browser" tab.|Reference is displayed as first track.<br>BAM track is displayed as second.<br>VCF track is displayed as third.<br>WIG track is displayed as fourth.<br>Content of WIG track is displayed.|

## Scenario 20. Try to login by user without roles and permissions.
Prerequisites: User shall not have any role and permissions.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Try to login by user without roles and permissions.|Login by user from prerequisites.|No datasets are displayed.|

## Scenario 21. Remove species by ROLE_REFERENCE_MANAGER user.
Prerequisites: User shall have role ROLE_REFERENCE_MANAGER. Scenario 1 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Remove species from reference.|1. Remove species from reference by CLI command `ngb remove_spec {REFERNCE_NAME}`2. Ensure species isn't deleted bu CLI command `ngb list_spec -t`.|Species successful removed from reference. Species is displayed in available species list.|
|3|Validate of species is successfully deleted from reference on NGB UI.|1. Navigate to any covered by BAM file region.<br>2. Click on any read.<br>3. On appeared menu click on "BLAT Search" point.|"BLAT" tab is appeared.<br>On "BLAT" tab is displayed message: "No species for reference file'{REFERNCE_NAME}'"|
|4|Remove species from NGB server and check.|1. Remove species from NGB server by CLI command `ngb del_spec SPECIES_VERSION`.<br>2. Ensure species is removed from NGB server by CLI command `ngb list_spec -t`.|CLI return next message "No species registered on the server."|

## Scenario 22. Remove WIG and BAM file by ROLE_BAM_MANAGER and ROLE_WIG_MANAGER user.
Prerequisites: User shall have role ROLE_BAM_MANAGER and ROLE_WIG_MANAGER. Scenario 19 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Remove BAM file.|1. Remove BAM file from dataset created on step 5, Scenario 18, by CLI command `ngb remove_dataset {DATASET_NAME} {BAM_FILE_NAME}`.<br>2. Remove BAM file registered in step 1, Scenario 19, by CLI command `ngb del_file {BAM_NAME}`.|BAM file is successfully removed.|
|3|Remove WIG file.|1. Remove WIG file from dataset created on step 5, Scenario 18, by CLI command `ngb remove_dataset {DATASET_NAME} {WIG_FILE_NAME}`.<br>2. Remove WIG file registered in step 8, Scenario 19, by CLI command `ngb del_file {WIG_NAME}`.|WIG file is successfully removed.|
|4|Validate lack of the removed files on NGB UI.|Expand and select dataset created on step 5, Scenario 18.|No BAM and WIG files in dataset.|

## Scenario 23. Remove files by ROLE_USER user without special permissions.
Prerequisites: User shall have role ROLE_USER and no any other special permissions. Scenario 19 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Remove VCF file.|1. Remove VCF file from dataset created on step 5, Scenario 18, by CLI command `ngb remove_dataset {DATASET_NAME} {VCF_FILE_NAME}`.<br>2. Remove VCF file registered in step 4, Scenario 19, by CLI command `ngb del_file {VCF_FILE_NAME}`.|Authorization error is displayed.|
|3|Validate VCF file on NGB UI.|1. Open NGB UI<br>2. Ensure "Dataset" tab is active and selected.<br>3. Expand and select dataset created on step 5, Scenario 18.<br>4. Select "Variants" tab.|In dataset is displayed registered VCF file.<br>Next plots is displayed on "Browser" tab: "Variants by chromosome", "Variants types", "Variants quality".<br>List of variations from VCF file are displayed.|
|4|Force remove dataset.|Remove dataset created on step 5, Scenario 18, by CLI command `ngb del_dataset {DATASET_NAME} --force`|Authorization error is displayed.|
|5|Validate dataset and file on NGB UI.|1. Open NGB UI<br>2. Ensure "Dataset" tab is active and selected.<br>3. Expand and select dataset created on step 5, Scenario 18.<br>4. Select "Variants" tab.|Dataset still displayed.<br>In dataset is displayed registered VCF file.<br>Next plots is displayed on "Browser" tab: "Variants by chromosome", "Variants types", "Variants quality".<br>List of variations from VCF file are displayed.|

## Scenario 24. Force remove dataset by ROLE_VCF_MANAGER user.
Prerequisites: User shall have role ROLE_VCF_MANAGER. Scenario 20 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Force remove dataset.|Remove dataset created on step 5, Scenario 18, by CLI command `ngb del_dataset {DATASET_NAME} --force`|Dataset is successfully deleted.
|3|Validate lack of the removed files on NGB UI.|Open NGB UI.|Dataset created on step 5, Scenario 18 is absent.|

## Scenario 25. Remove attached to reference GENE file by ROLE_GENE_MANAGER user with WRITE permissions on reference.
Prerequisites: User shall have role ROLE_GENE_MANAGER and WRITE permissions on reference. Scenarios 8 and 9 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Remove a gene file from the reference.|Remove attached to reference, on step 2 Scenario 7, gene file by CLI command `ngb remove_genes {REFERENCE_NAME}`.|Gene file successfully removed from reference.|
|3|Validate lack of the removed from reference gene file on NGB UI.|1. Open NGB UI.<br>2. Click on "dashboard" icon on left panel and click on "Restore default layout".<br>3. Select dataset created on step 2, Scenario 8.<br>4. Click on reference name on header of "Browser" panel.|No drop-down list is displayed.|

## Scenario 26. Force remove dataset by ROLE_ADMIN user.
Prerequisites: User shall have role ROLE_ADMIN. Scenario 8 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Force remove dataset.|Remove dataset created on step 2, Scenario 8, by CLI command `ngb del_dataset {DATASET_NAME} --force`|Dataset is successfully deleted.
|3|Validate lack of the removed files on NGB UI.|Open NGB UI.|Dataset created on step 2, Scenario 8 is absent.|

## Scenario 27. Remove reference by ROLE_REFERENCE_MANAGER user.
Prerequisites: User shall have role ROLE_REFERENCE_MANAGER. No dataset and files registered for {REFERNCE_NAME}.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.|Login is successful.|
|2|Remove reference.|1. Remove reference by CLI command `ngb del_ref {REFERNCE_NAME}`.<br>2. Ensure reference is removed from NGB server by CLI command `ngb list_ref -t`.|Reference is absent in appeared references list.|

## Scenario 28. READ permission edit for the dataset for ROLE_USER user.
Prerequisites: user shall have role ROLE_USER. At least one dataset shall be registered in NGB. Dataset shall not have any special permissions. 

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI as ROLE_ADMIN user and deny dataset read permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Deny READ permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>READ permissions on dataset successfully denied.|
|2|Try to find denied dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Click on "dashboard" icon on left panel and click on "Restore default layout".|{DATASET_NAME} isn't displayed on "Datasets" tab.|
|3|Login in CLI as ROLE_ADMIN user and unset dataset read permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Unset READ permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod !r --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>READ permissions on dataset successfully unset.|
|4|Try to find denied dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Click on "dashboard" icon on left panel and click on "Restore default layout".|{DATASET_NAME} is displayed on "Datasets" tab.|
|5|Login in CLI as ROLE_ADMIN user and deny dataset read permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Deny READ permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod -r --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>READ permissions on dataset successfully denied.|
|6|Try to find denied dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Click on "dashboard" icon on left panel and click on "Restore default layout".|{DATASET_NAME} isn't displayed on "Datasets" tab.|
|5|Login in CLI as ROLE_ADMIN user and grant dataset read permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Deny READ permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod +r --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>READ permissions on dataset successfully denied.|
|6|Try to find denied dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Click on "dashboard" icon on left panel and click on "Restore default layout".|{DATASET_NAME} is displayed on "Datasets" tab.|

## Scenario 29. WRITE permission edit for the dataset for ROLE_USER user.
Prerequisites: user shall have role ROLE_USER. At least one dataset shall be registered in NGB. Dataset shall not have any special permissions. User shall have READ permission on at least one track file (BAM, VCF, SEG, MAF).

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in CLI as ROLE_ADMIN user and deny dataset WRITE permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Deny READ permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod -w --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>WRITE permissions on dataset successfully denied.|
|2|Try to add file in dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Add file from prerequisites in dataset {DATASET_NAME} by CLI command `ngb add_dataset {DATASET_NAME} {FILE_NAME`.|Access denied message is displayed.|
|3|Login in CLI as ROLE_ADMIN user and unset dataset WRITE permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Unset WRITE permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod !w --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>WRITE permissions on dataset successfully unset.|
|4|Try to add file in dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Add file from prerequisites in dataset {DATASET_NAME} by CLI command `ngb add_dataset {DATASET_NAME} {FILE_NAME`.|File is successfully added in dataset.|
|5|Try to remove file in dataset on NGB UI by user from prerequisites.|Remove file from prerequisites in dataset {DATASET_NAME} by CLI command `ngb remove_dataset {DATASET_NAME} {FILE_NAME`.|File is successfully removed in dataset.|
|6|Login in CLI as ROLE_ADMIN user and deny dataset WRITE permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Deny READ permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod -w --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>WRITE permissions on dataset successfully denied.|
|7|Try to add file in dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Add file from prerequisites in dataset {DATASET_NAME} by CLI command `ngb add_dataset {DATASET_NAME} {FILE_NAME`.|Access denied message is displayed.|
|8|Login in CLI as ROLE_ADMIN user and grant dataset WRITE permissions for prerequisites user.|1. Open NGB.<br>2. Login as ROLE_ADMIN user.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Grant WRITE permissions on {DATASET_NAME} for user from prerequisites by CLI command `ngb chmod +w --users "{ROLE_USER_USER_NAME}" --datasets "{DATASET_NAME}"`|Login is successful.<br>WRITE permissions on dataset successfully granted.|
|9|Try to add file in dataset on NGB UI by user from prerequisites.|1. Open NGB.<br>2. Login as user from prerequisites.<br>3. Get authentication token.<br>4. Open CLI.<br>5. Login in CLI by command `ngb set_token {TOKEN}`.<br>6. Add file from prerequisites in dataset {DATASET_NAME} by CLI command `ngb add_dataset {DATASET_NAME} {FILE_NAME}`.|File is successfully added in dataset.|

# UI tests.

## Scenario 30. Add user by NGB UI.
Prerequisites: user shall have access to ROLE_ADMIN user.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login in NGB UI by ROLE_ADMIN user and add new user.|1. Login in NGB UI by ROLE_ADMIN user.<br>2. Click on "Users" icon on left panel.<br>3. Click on "CREATE USER" button.<br>4. Enter valid username. ("User1")<br>5. Click on "CREATE" button.|Login is successful.<br>"User management" pop-up is appeared.<br>"Create user" pop-up is appeared.<br>After click on "CREATE" button on "Create user" pop-up, "User management" pop-up is refreshed and new user is displayed in the list.<br>ROLE_USER role is set automatically.|
|2|Login as new user and validate.|Login as new user.|"User" icon on left panel isn't displayed.<br>Only datasets are permitted for ROLE_USER user is displayed.|

## Scenario 31. Add new ROLE_ADMIN role for user by NGB UI.
Prerequisites: Scenarios 30 shall be completed successfully.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and add new role for user "User1".|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "Pencil" icon opposite user name "User1" (user added in case 30).<br>4. Click on "Select role or group to add" combobox.<br>5. Click on "ROLE_ADMIN" point.<br>6. Click on empty area of pop-up.<br>7. Click on "ADD" button.<br>8. Click on "SAVE" button.|Login is successful.<br>"User management" pop-up is appeared.<br>"Create user" pop-up is appeared.<br>After click on "Select role or group to add" combobox - list of available roles is displayed.<br>After click on "ROLE_ADMIN" point, checkbox is enabled.<br>After click on "ADD" button, "ROLE_ADMIN" role is added in table.<br>After click on "SAVE" button on "Edit user" pop-up, "User management" pop-up is refreshed and new label "ROLE_ADMIN" is displayed for edited user.|
|2|Login as "User1" (user added in case 30) and validate permissions.|Login as "User1" (user added in case 30).|"User" icon on left panel is displayed.<br>All datasets are displayed.|

## Scenario 32. Create group by NGB UI.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and add new group.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "GROUPS" tab.<br>4. Click on "CREATE GROUP" button.<br>5. Enter valid group name.<br>6. Click on "CREATE" button.|Login is successful.<br>“User management” pop-up is appeared.<br>"GROUPS" tab is opened.<br>"Create group" pop-up is opened.<br>After click on "CREATE" button new group is appeared in the table on "GROUPS" tab.|

## Scenario 33. Add user in group by NGB UI.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and add user into group.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "GROUPS" tab.<br>4. Click on "Pencil" icon opposite any group name.<br>5. Click on combo-box "Select user to add".<br>6. Select user "User1".<br>7. Click on empty area of pop-up.<br>8. Click on "ADD" button.<br>9. Click on "SAVE" button.|Login is successful.<br>"User management" pop-up is appeared.<br>"Edit group" pop-up is opened.<br>After click on "Select user to add" combobox - list of available users is displayed.<br>After click on "User1" point, checkbox is enabled.<br>After click on "ADD" button, "User1" user is added in table.<br>After click on "SAVE" button pop-up is closed.|
|2|Validate user in group.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "USERS" tab.<br>4. Find user that was added in group on step 1 ("User1").|Login is successful.<br>"User management" pop-up is appeared.<br>In column "Groups" opposite user name ("User1") is displayed new group name.|

## Scenario 34. Add user in role by NGB UI.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and add user into role.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "ROLES" tab.<br>4. Click on "Pencil" icon opposite any role name.<br>5. Click on combo-box "Select user to add".<br>6. Select user "User1".<br>7. Click on empty area of pop-up.<br>8. Click on "ADD" button.<br>9. Click on "SAVE" button.|Login is successful.<br>"User management" pop-up is appeared.<br>"Edit role" is opened.<br>After click on "Select user to add" combobox - list of available users is displayed.<br>After click on "User1" point, checkbox is enabled.<br>After click on "ADD" button, "User1" user is added in table.<br>After click on "SAVE" button pop-up is closed.|
|2|Validate user in role.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "USERS" tab.<br>4. Find user that was added in role on step 1 ("User1").|Login is successful.<br>"User management" pop-up is appeared.<br>In column "Roles" opposite user name ("User1") is displayed new role name.|

## Scenario 35. Remove user by NGB UI.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and remove user.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.<br>3. Click on "USERS" tab.<br>4. Click on "Pencil" icon opposite user name "User1" (user added in case 30).<br>5. Click on "DELETE" button.|Login is successful.<br>"User management" pop-up is appeared.<br>"Edit user" is opened.<br>"User management" pop-up is refreshed and deleted user isn't displayed in the list.|
|2|Try to login by deleted user.|Login in NGB UI by deleted user.|Login is failed.|

## Scenario 36. Validate default group behavior.
Prerequisites: at least one not default group.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and set group as default.|1. Login in NGB UI by ROLE_ADMIN user.<br>2. Click on "Users" icon on left panel.<br>3. Click on "GROUPS" tab.<br>4. Click on "Pencil" icon opposite group name.<br>5. Enable "User default" check-box.|Login is successful.<br>"User management" pop-up is appeared.<br>"Edit group" pop-up is opened.|
|2|Add user.|1. Click on "Users" icon on left panel.<br>2. Click on "CREATE USER" button.<br>3. Enter valid username. ("User1")<br>4. Click on "CREATE" button.|"User management" pop-up is appeared.<br>"Create user" pop-up is appeared.<br>After click on "CREATE" button on "Create user" pop-up, "User management" pop-up is refreshed and new user is displayed in the list.<br>Group that was set as default is displayed for added user.|

## Scenario 37. Validate default role behavior.
Prerequisites: at least one not default role.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user and set role as default.|1. Login in NGB UI by ROLE_ADMIN user.<br>2. Click on "Users" icon on left panel.<br>3. Click on "ROLES" tab.<br>4. Click on "Pencil" icon opposite role name.<br>5. Enable "User default" check-box.|Login is successful.<br>"User management" pop-up is appeared.<br>"Edit role" is opened.|
|2|Add user.|1. Click on "Users" icon on left panel.<br>2. Click on "CREATE USER" button.<br>3. Enter valid username. ("User1")<br>4. Click on "CREATE" button.|"User management" pop-up is appeared.<br>"Create user" pop-up is appeared.<br>After click on "CREATE" button on "Create user" pop-up, "User management" pop-up is refreshed and new user is displayed in the list.<br>Role that was set as default is displayed for added user.|

## Scenario 38. Validate search users, groups and roles.
Prerequisites: several registered users and groups.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.|Login is successful.<br>"User management" pop-up is appeared.|
|2|Search users.|1. Click on "USERS" tab.<br>2. Enter part of valid user name.|In table is displaying all user-names that contains entered sub-string.|
|3|Search groups.|1. Click on "GROUPS" tab.<br>2. Enter part of valid group name.|In table is displaying all group names that contains entered sub-string.|
|4|Search roles.|1. Click on "ROLES" tab.<br>2. Enter "F".|In table is displaying next roles: "ROLE_REFERENCE_MANAGER", "ROLE_VCF_MANAGER".|

## Scenario 39. Remove user from group by NGB UI.
Prerequisites: group that contain at least one user.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.|Login is successful.<br>"User management" pop-up is appeared.|
|2|Remove user from group.|1. Click on "GROUPS" tab.<br>2. Click on on "Pencil" icon opposite group name that contain user.<br>3. Click on "Bin" icon near user name.<br>4. Click on "SAVE" button.|"Edit group" pop-up is opened.<br>Deleted user is disappeared from table.<br>"Edit group" pop-up is closed.|
|3|Validate user groups.|1. Click on "USERS" tab<br>2. Find user name that was deleted from group.|Group name isn't displayed near user name.|

## Scenario 40. Remove user from role by NGB UI.
Prerequisites: role that contain at least one user.

|ID|Name|Steps|Expected result|
|--|--|--|--|
|1|Login as ROLE_ADMIN user.|1. Login in NGB UI by ROLE_ADMIN user<br>2. Click on "Users" icon on left panel.|Login is successful.<br>"User management" pop-up is appeared.|
|2|Remove user from role.|1. Click on "ROLES" tab.<br>2. Click on on "Pencil" icon opposite role name that contain user.<br>3. Click on "Bin" icon near user name.<br>4. Click on "SAVE" button.|"Edit role" pop-up is opened.<br>Deleted user is disappeared from table.<br>"Edit role" pop-up is closed.|
|3|Validate user roles.|1. Click on "USERS" tab<br>2. Find user name that was deleted from role.|Role name isn't displayed near user name.|