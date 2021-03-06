
/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;


import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class CreateExternalTableRequest implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("CreateExternalTableRequest")
            .namespace("com.gpudb")
            .fields()
            .name("tableName").type().stringType().noDefault()
            .name("filepaths").type().array().items().stringType().noDefault()
            .name("createTableOptions").type().map().values().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String tableName;
    private List<String> filepaths;
    private Map<String, String> createTableOptions;
    private Map<String, String> options;
    public CreateExternalTableRequest() {
        tableName = "";
        filepaths = new ArrayList<>();
        createTableOptions = new LinkedHashMap<>();
        options = new LinkedHashMap<>();
    }
    public CreateExternalTableRequest(String tableName, List<String> filepaths, Map<String, String> createTableOptions, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.filepaths = (filepaths == null) ? new ArrayList<String>() : filepaths;
        this.createTableOptions = (createTableOptions == null) ? new LinkedHashMap<String, String>() : createTableOptions;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    public static Schema getClassSchema() {
        return schema$;
    }

    public String getTableName() {
        return tableName;
    }

    public CreateExternalTableRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    public List<String> getFilepaths() {
        return filepaths;
    }

    public CreateExternalTableRequest setFilepaths(List<String> filepaths) {
        this.filepaths = (filepaths == null) ? new ArrayList<String>() : filepaths;
        return this;
    }

    public Map<String, String> getCreateTableOptions() {
        return createTableOptions;
    }

    public CreateExternalTableRequest setCreateTableOptions(Map<String, String> createTableOptions) {
        this.createTableOptions = (createTableOptions == null) ? new LinkedHashMap<String, String>() : createTableOptions;
        return this;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public CreateExternalTableRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }

    @Override
    public Schema getSchema() {
        return schema$;
    }

    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.tableName;

            case 1:
                return this.filepaths;

            case 2:
                return this.createTableOptions;

            case 3:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.tableName = (String) value;
                break;

            case 1:
                this.filepaths = (List<String>) value;
                break;

            case 2:
                this.createTableOptions = (Map<String, String>) value;
                break;

            case 3:
                this.options = (Map<String, String>) value;
                break;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        CreateExternalTableRequest that = (CreateExternalTableRequest) obj;

        return (this.tableName.equals(that.tableName)
                && this.filepaths.equals(that.filepaths)
                && this.createTableOptions.equals(that.createTableOptions)
                && this.options.equals(that.options));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("tableName"));
        builder.append(": ");
        builder.append(gd.toString(this.tableName));
        builder.append(", ");
        builder.append(gd.toString("filepaths"));
        builder.append(": ");
        builder.append(gd.toString(this.filepaths));
        builder.append(", ");
        builder.append(gd.toString("createTableOptions"));
        builder.append(": ");
        builder.append(gd.toString(this.createTableOptions));
        builder.append(", ");
        builder.append(gd.toString("options"));
        builder.append(": ");
        builder.append(gd.toString(this.options));
        builder.append("}");

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.filepaths.hashCode();
        hashCode = (31 * hashCode) + this.createTableOptions.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

    public static final class CreateTableOptions {

        public static final String TYPE_ID = "type_id";


        private CreateTableOptions() {
        }
    }

    public static final class Options {

        public static final String TABLE_TYPE = "table_type";

        public static final String MATERIALIZED = "materialized";

        public static final String LOGICAL = "logical";

        public static final String LOGICAL_TMP = "logical_tmp";

        public static final String FILE_TYPE = "file_type";

        public static final String DELIMITED_TEXT = "delimited_text";

        public static final String PARQUET = "parquet";

        public static final String LOADING_MODE = "loading_mode";

        public static final String HEAD = "head";

        public static final String DISTRIBUTED_SHARED = "distributed_shared";

        public static final String DISTRIBUTED_LOCAL = "distributed_local";

        public static final String ERROR_HANDLING = "error_handling";

        public static final String PERMISSIVE = "permissive";

        public static final String IGNORE_BAD_RECORDS = "ignore_bad_records";

        public static final String ABORT = "abort";

        public static final String BATCH_SIZE = "batch_size";

        public static final String REFRESH_METHOD = "refresh_method";

        public static final String MANUAL = "manual";

        public static final String ON_START = "on_start";

        public static final String COLUMN_FORMATS = "column_formats";

        public static final String DEFAULT_COLUMN_FORMATS = "default_column_formats";

        public static final String DRY_RUN = "dry_run";

        public static final String FALSE = "false";

        public static final String TRUE = "true";

        public static final String TEXT_HAS_HEADER = "text_has_header";

        public static final String TEXT_DELIMITER = "text_delimiter";

        public static final String TEXT_HEADER_PROPERTY_DELIMITER = "text_header_property_delimiter";

        public static final String COLUMNS_TO_LOAD = "columns_to_load";

        public static final String TEXT_COMMENT_STRING = "text_comment_string";

        public static final String TEXT_NULL_STRING = "text_null_string";

        public static final String TEXT_QUOTE_CHARACTER = "text_quote_character";

        public static final String TEXT_ESCAPE_CHARACTER = "text_escape_character";

        public static final String EXTERNAL_STORAGE_LOCATION = "external_storage_location";

        public static final String S3_BUCKET_NAME = "s3_bucket_name";

        public static final String S3_REGION = "s3_region";

        public static final String NUM_TASKS_PER_RANK = "num_tasks_per_rank";


        private Options() {
        }
    }


}
