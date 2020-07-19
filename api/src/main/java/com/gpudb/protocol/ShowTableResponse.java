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


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#showTable(ShowTableRequest)}.
 */
public class ShowTableResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowTableResponse")
            .namespace("com.gpudb")
            .fields()
            .name("tableName").type().stringType().noDefault()
            .name("tableNames").type().array().items().stringType().noDefault()
            .name("tableDescriptions").type().array().items().array().items().stringType().noDefault()
            .name("typeIds").type().array().items().stringType().noDefault()
            .name("typeSchemas").type().array().items().stringType().noDefault()
            .name("typeLabels").type().array().items().stringType().noDefault()
            .name("properties").type().array().items().map().values().array().items().stringType().noDefault()
            .name("additionalInfo").type().array().items().map().values().stringType().noDefault()
            .name("sizes").type().array().items().longType().noDefault()
            .name("fullSizes").type().array().items().longType().noDefault()
            .name("joinSizes").type().array().items().doubleType().noDefault()
            .name("totalSize").type().longType().noDefault()
            .name("totalFullSize").type().longType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private String tableName;
    private List<String> tableNames;
    private List<List<String>> tableDescriptions;
    private List<String> typeIds;
    private List<String> typeSchemas;
    private List<String> typeLabels;
    private List<Map<String, List<String>>> properties;
    private List<Map<String, String>> additionalInfo;
    private List<Long> sizes;
    private List<Long> fullSizes;
    private List<Double> joinSizes;
    private long totalSize;
    private long totalFullSize;
    private Map<String, String> info;
    /**
     * Constructs a ShowTableResponse object with default parameters.
     */
    public ShowTableResponse() {
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     *
     * @return the schema for the class.
     */
    public static Schema getClassSchema() {
        return schema$;
    }

    /**
     * @return Value of {@code tableName}.
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName Value of {@code tableName}.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * @return If {@code tableName} is a table or view, then the single element
     * of the array is {@code tableName}. If {@code tableName} is a
     * collection and {@code show_children} is set to {@code true},
     * then this array is populated with the names of all tables and
     * views contained by the given collection; if {@code
     * show_children} is {@code false} then this array will only
     * include the collection name itself. If {@code tableName} is an
     * empty string, then the array contains the names of all
     * collections and top-level tables.
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * @param tableNames If {@code tableName} is a table or view, then the
     *                   single element of the array is {@code tableName}. If
     *                   {@code tableName} is a collection and {@code
     *                   show_children} is set to {@code true}, then this
     *                   array is populated with the names of all tables and
     *                   views contained by the given collection; if {@code
     *                   show_children} is {@code false} then this array will
     *                   only include the collection name itself. If {@code
     *                   tableName} is an empty string, then the array
     *                   contains the names of all collections and top-level
     *                   tables.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * @return List of descriptions for the respective tables in {@code
     * tableNames}.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#COLLECTION
     * COLLECTION}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#VIEW
     * VIEW}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#REPLICATED
     * REPLICATED}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#JOIN
     * JOIN}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#RESULT_TABLE
     * RESULT_TABLE}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW
     * MATERIALIZED_VIEW}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW_MEMBER
     * MATERIALIZED_VIEW_MEMBER}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW_UNDER_CONSTRUCTION
     * MATERIALIZED_VIEW_UNDER_CONSTRUCTION}
     * </ul>
     */
    public List<List<String>> getTableDescriptions() {
        return tableDescriptions;
    }

    /**
     * @param tableDescriptions List of descriptions for the respective tables
     *                          in {@code tableNames}.
     *                          Supported values:
     *                          <ul>
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#COLLECTION
     *                          COLLECTION}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#VIEW
     *                          VIEW}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#REPLICATED
     *                          REPLICATED}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#JOIN
     *                          JOIN}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#RESULT_TABLE
     *                          RESULT_TABLE}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW
     *                          MATERIALIZED_VIEW}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW_MEMBER
     *                          MATERIALIZED_VIEW_MEMBER}
     *                                  <li> {@link
     *                          com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW_UNDER_CONSTRUCTION
     *                          MATERIALIZED_VIEW_UNDER_CONSTRUCTION}
     *                          </ul>
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTableDescriptions(List<List<String>> tableDescriptions) {
        this.tableDescriptions = (tableDescriptions == null) ? new ArrayList<List<String>>() : tableDescriptions;
        return this;
    }

    /**
     * @return Type ids of the respective tables in {@code tableNames}.
     */
    public List<String> getTypeIds() {
        return typeIds;
    }

    /**
     * @param typeIds Type ids of the respective tables in {@code tableNames}.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTypeIds(List<String> typeIds) {
        this.typeIds = (typeIds == null) ? new ArrayList<String>() : typeIds;
        return this;
    }

    /**
     * @return Type schemas of the respective tables in {@code tableNames}.
     */
    public List<String> getTypeSchemas() {
        return typeSchemas;
    }

    /**
     * @param typeSchemas Type schemas of the respective tables in {@code
     *                    tableNames}.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTypeSchemas(List<String> typeSchemas) {
        this.typeSchemas = (typeSchemas == null) ? new ArrayList<String>() : typeSchemas;
        return this;
    }

    /**
     * @return Type labels of the respective tables in {@code tableNames}.
     */
    public List<String> getTypeLabels() {
        return typeLabels;
    }

    /**
     * @param typeLabels Type labels of the respective tables in {@code
     *                   tableNames}.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTypeLabels(List<String> typeLabels) {
        this.typeLabels = (typeLabels == null) ? new ArrayList<String>() : typeLabels;
        return this;
    }

    /**
     * @return Property maps of the respective tables in {@code tableNames}.
     */
    public List<Map<String, List<String>>> getProperties() {
        return properties;
    }

    /**
     * @param properties Property maps of the respective tables in {@code
     *                   tableNames}.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setProperties(List<Map<String, List<String>>> properties) {
        this.properties = (properties == null) ? new ArrayList<Map<String, List<String>>>() : properties;
        return this;
    }

    /**
     * @return Additional information about the respective tables in {@code
     * tableNames}.
     * Supported values:
     * <ul>
     * </ul>
     */
    public List<Map<String, String>> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * @param additionalInfo Additional information about the respective
     *                       tables in {@code tableNames}.
     *                       Supported values:
     *                       <ul>
     *                       </ul>
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setAdditionalInfo(List<Map<String, String>> additionalInfo) {
        this.additionalInfo = (additionalInfo == null) ? new ArrayList<Map<String, String>>() : additionalInfo;
        return this;
    }

    /**
     * @return If {@code get_sizes} is {@code true}, an array containing the
     * number of records of each corresponding table in {@code
     * tableNames}.  Otherwise, an empty array.
     */
    public List<Long> getSizes() {
        return sizes;
    }

    /**
     * @param sizes If {@code get_sizes} is {@code true}, an array containing
     *              the number of records of each corresponding table in
     *              {@code tableNames}.  Otherwise, an empty array.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setSizes(List<Long> sizes) {
        this.sizes = (sizes == null) ? new ArrayList<Long>() : sizes;
        return this;
    }

    /**
     * @return If {@code get_sizes} is {@code true}, an array containing the
     * number of records of each corresponding table in {@code
     * tableNames} (same values as {@code sizes}).  Otherwise, an empty
     * array.
     */
    public List<Long> getFullSizes() {
        return fullSizes;
    }

    /**
     * @param fullSizes If {@code get_sizes} is {@code true}, an array
     *                  containing the number of records of each corresponding
     *                  table in {@code tableNames} (same values as {@code
     *                  sizes}).  Otherwise, an empty array.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setFullSizes(List<Long> fullSizes) {
        this.fullSizes = (fullSizes == null) ? new ArrayList<Long>() : fullSizes;
        return this;
    }

    /**
     * @return If {@code get_sizes} is {@code true}, an array containing the
     * number of unfiltered records in the cross product of the
     * sub-tables of each corresponding join-table in {@code
     * tableNames}. For simple tables, this number will be the same as
     * {@code sizes}.  For join-tables, this value gives the number of
     * joined-table rows that must be processed by any aggregate
     * functions operating on the table.  Otherwise, (if {@code
     * get_sizes} is {@code false}), an empty array.
     */
    public List<Double> getJoinSizes() {
        return joinSizes;
    }

    /**
     * @param joinSizes If {@code get_sizes} is {@code true}, an array
     *                  containing the number of unfiltered records in the
     *                  cross product of the sub-tables of each corresponding
     *                  join-table in {@code tableNames}. For simple tables,
     *                  this number will be the same as {@code sizes}.  For
     *                  join-tables, this value gives the number of
     *                  joined-table rows that must be processed by any
     *                  aggregate functions operating on the table.
     *                  Otherwise, (if {@code get_sizes} is {@code false}), an
     *                  empty array.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setJoinSizes(List<Double> joinSizes) {
        this.joinSizes = (joinSizes == null) ? new ArrayList<Double>() : joinSizes;
        return this;
    }

    /**
     * @return If {@code get_sizes} is {@code true}, the sum of the elements of
     * {@code sizes}.  Otherwise, -1.
     */
    public long getTotalSize() {
        return totalSize;
    }

    /**
     * @param totalSize If {@code get_sizes} is {@code true}, the sum of the
     *                  elements of {@code sizes}.  Otherwise, -1.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTotalSize(long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * @return If {@code get_sizes} is {@code true}, the sum of the elements of
     * {@code fullSizes} (same value as {@code totalSize}).  Otherwise,
     * -1.
     */
    public long getTotalFullSize() {
        return totalFullSize;
    }

    /**
     * @param totalFullSize If {@code get_sizes} is {@code true}, the sum of
     *                      the elements of {@code fullSizes} (same value as
     *                      {@code totalSize}).  Otherwise, -1.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setTotalFullSize(long totalFullSize) {
        this.totalFullSize = totalFullSize;
        return this;
    }

    /**
     * @return Additional information.
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * @param info Additional information.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowTableResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     *
     * @return the schema object describing this class.
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     *
     * @param index the position of the field to get
     * @return value of the field with the given index.
     * @throws IndexOutOfBoundsException
     */
    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.tableName;

            case 1:
                return this.tableNames;

            case 2:
                return this.tableDescriptions;

            case 3:
                return this.typeIds;

            case 4:
                return this.typeSchemas;

            case 5:
                return this.typeLabels;

            case 6:
                return this.properties;

            case 7:
                return this.additionalInfo;

            case 8:
                return this.sizes;

            case 9:
                return this.fullSizes;

            case 10:
                return this.joinSizes;

            case 11:
                return this.totalSize;

            case 12:
                return this.totalFullSize;

            case 13:
                return this.info;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     *
     * @param index the position of the field to set
     * @param value the value to set
     * @throws IndexOutOfBoundsException
     */
    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.tableName = (String) value;
                break;

            case 1:
                this.tableNames = (List<String>) value;
                break;

            case 2:
                this.tableDescriptions = (List<List<String>>) value;
                break;

            case 3:
                this.typeIds = (List<String>) value;
                break;

            case 4:
                this.typeSchemas = (List<String>) value;
                break;

            case 5:
                this.typeLabels = (List<String>) value;
                break;

            case 6:
                this.properties = (List<Map<String, List<String>>>) value;
                break;

            case 7:
                this.additionalInfo = (List<Map<String, String>>) value;
                break;

            case 8:
                this.sizes = (List<Long>) value;
                break;

            case 9:
                this.fullSizes = (List<Long>) value;
                break;

            case 10:
                this.joinSizes = (List<Double>) value;
                break;

            case 11:
                this.totalSize = (Long) value;
                break;

            case 12:
                this.totalFullSize = (Long) value;
                break;

            case 13:
                this.info = (Map<String, String>) value;
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

        ShowTableResponse that = (ShowTableResponse) obj;

        return (this.tableName.equals(that.tableName)
                && this.tableNames.equals(that.tableNames)
                && this.tableDescriptions.equals(that.tableDescriptions)
                && this.typeIds.equals(that.typeIds)
                && this.typeSchemas.equals(that.typeSchemas)
                && this.typeLabels.equals(that.typeLabels)
                && this.properties.equals(that.properties)
                && this.additionalInfo.equals(that.additionalInfo)
                && this.sizes.equals(that.sizes)
                && this.fullSizes.equals(that.fullSizes)
                && this.joinSizes.equals(that.joinSizes)
                && (this.totalSize == that.totalSize)
                && (this.totalFullSize == that.totalFullSize)
                && this.info.equals(that.info));
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
        builder.append(gd.toString("tableNames"));
        builder.append(": ");
        builder.append(gd.toString(this.tableNames));
        builder.append(", ");
        builder.append(gd.toString("tableDescriptions"));
        builder.append(": ");
        builder.append(gd.toString(this.tableDescriptions));
        builder.append(", ");
        builder.append(gd.toString("typeIds"));
        builder.append(": ");
        builder.append(gd.toString(this.typeIds));
        builder.append(", ");
        builder.append(gd.toString("typeSchemas"));
        builder.append(": ");
        builder.append(gd.toString(this.typeSchemas));
        builder.append(", ");
        builder.append(gd.toString("typeLabels"));
        builder.append(": ");
        builder.append(gd.toString(this.typeLabels));
        builder.append(", ");
        builder.append(gd.toString("properties"));
        builder.append(": ");
        builder.append(gd.toString(this.properties));
        builder.append(", ");
        builder.append(gd.toString("additionalInfo"));
        builder.append(": ");
        builder.append(gd.toString(this.additionalInfo));
        builder.append(", ");
        builder.append(gd.toString("sizes"));
        builder.append(": ");
        builder.append(gd.toString(this.sizes));
        builder.append(", ");
        builder.append(gd.toString("fullSizes"));
        builder.append(": ");
        builder.append(gd.toString(this.fullSizes));
        builder.append(", ");
        builder.append(gd.toString("joinSizes"));
        builder.append(": ");
        builder.append(gd.toString(this.joinSizes));
        builder.append(", ");
        builder.append(gd.toString("totalSize"));
        builder.append(": ");
        builder.append(gd.toString(this.totalSize));
        builder.append(", ");
        builder.append(gd.toString("totalFullSize"));
        builder.append(": ");
        builder.append(gd.toString(this.totalFullSize));
        builder.append(", ");
        builder.append(gd.toString("info"));
        builder.append(": ");
        builder.append(gd.toString(this.info));
        builder.append("}");

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.tableDescriptions.hashCode();
        hashCode = (31 * hashCode) + this.typeIds.hashCode();
        hashCode = (31 * hashCode) + this.typeSchemas.hashCode();
        hashCode = (31 * hashCode) + this.typeLabels.hashCode();
        hashCode = (31 * hashCode) + this.properties.hashCode();
        hashCode = (31 * hashCode) + this.additionalInfo.hashCode();
        hashCode = (31 * hashCode) + this.sizes.hashCode();
        hashCode = (31 * hashCode) + this.fullSizes.hashCode();
        hashCode = (31 * hashCode) + this.joinSizes.hashCode();
        hashCode = (31 * hashCode) + ((Long) this.totalSize).hashCode();
        hashCode = (31 * hashCode) + ((Long) this.totalFullSize).hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

    /**
     * List of descriptions for the respective tables in {@code tableNames}.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#COLLECTION
     * COLLECTION}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#VIEW VIEW}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#REPLICATED
     * REPLICATED}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#JOIN JOIN}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#RESULT_TABLE
     * RESULT_TABLE}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW
     * MATERIALIZED_VIEW}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW_MEMBER
     * MATERIALIZED_VIEW_MEMBER}
     *         <li> {@link
     * com.gpudb.protocol.ShowTableResponse.TableDescriptions#MATERIALIZED_VIEW_UNDER_CONSTRUCTION
     * MATERIALIZED_VIEW_UNDER_CONSTRUCTION}
     * </ul>
     * A set of string constants for the parameter {@code tableDescriptions}.
     */
    public static final class TableDescriptions {
        public static final String COLLECTION = "COLLECTION";
        public static final String VIEW = "VIEW";
        public static final String REPLICATED = "REPLICATED";
        public static final String JOIN = "JOIN";
        public static final String RESULT_TABLE = "RESULT_TABLE";
        public static final String MATERIALIZED_VIEW = "MATERIALIZED_VIEW";
        public static final String MATERIALIZED_VIEW_MEMBER = "MATERIALIZED_VIEW_MEMBER";
        public static final String MATERIALIZED_VIEW_UNDER_CONSTRUCTION = "MATERIALIZED_VIEW_UNDER_CONSTRUCTION";

        private TableDescriptions() {
        }
    }

    /**
     * Additional information about the respective tables in {@code
     * tableNames}.
     * Supported values:
     * <ul>
     * </ul>
     * A set of string constants for the parameter {@code additionalInfo}.
     */
    public static final class AdditionalInfo {

        /**
         * Method by which this table was created.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#CREATE_TABLE
         * CREATE_TABLE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#CREATE_PROJECTION
         * CREATE_PROJECTION}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#CREATE_UNION
         * CREATE_UNION}
         * </ul>
         */
        public static final String REQUEST_AVRO_TYPE = "request_avro_type";
        public static final String CREATE_TABLE = "create_table";
        public static final String CREATE_PROJECTION = "create_projection";
        public static final String CREATE_UNION = "create_union";

        /**
         * The JSON representation of request creating this table.  The default
         * value is ''.
         */
        public static final String REQUEST_AVRO_JSON = "request_avro_json";

        /**
         * Indicates whether the respective table is <a
         * href="../../../../../concepts/protection.html"
         * target="_top">protected</a> or not.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#FALSE FALSE}
         * </ul>
         */
        public static final String PROTECTED = "protected";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * The number of in-memory bytes per record which is the sum of the
         * byte sizes of all columns with property  'data'.
         */
        public static final String RECORD_BYTES = "record_bytes";

        /**
         * The names of the collections this table is part of. Only set if
         * table is part of a collection
         */
        public static final String COLLECTION_NAMES = "collection_names";

        /**
         * The value of the <a href="../../../../../concepts/ttl.html"
         * target="_top">time-to-live</a> setting.  Not present for
         * collections.
         */
        public static final String TABLE_TTL = "table_ttl";

        /**
         * The remaining <a href="../../../../../concepts/ttl.html"
         * target="_top">time-to-live</a>, in minutes, before the respective
         * table expires (-1 if it will never expire).  Not present for
         * collections.
         */
        public static final String REMAINING_TABLE_TTL = "remaining_table_ttl";

        /**
         * Semicolon-separated list of <a
         * href="../../../../../concepts/tables.html#foreign-key"
         * target="_top">foreign keys</a>, of the format 'source_column
         * references target_table(primary_key_column)'. Not present for
         * collections.  The default value is ''.
         */
        public static final String FOREIGN_KEYS = "foreign_keys";

        /**
         * Foreign shard key description of the format: 'fk_foreign_key
         * references pk_column_name from pk_table_name(pk_primary_key)'. Not
         * present for collections.  The default value is ''.
         */
        public static final String FOREIGN_SHARD_KEY = "foreign_shard_key";

        /**
         * <a href="../../../../../concepts/tables.html#partitioning"
         * target="_top">Partitioning</a> scheme used for this table
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#RANGE RANGE}:
         * Using <a
         * href="../../../../../concepts/tables.html#partitioning-by-range"
         * target="_top">range partitioning</a>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#INTERVAL
         * INTERVAL}: Using <a
         * href="../../../../../concepts/tables.html#partitioning-by-interval"
         * target="_top">interval partitioning</a>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#LIST LIST}:
         * Using <a
         * href="../../../../../concepts/tables.html#partitioning-by-list-manual"
         * target="_top">manual list partitioning</a>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#NONE NONE}:
         * Using no partitioning
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#NONE NONE}.
         */
        public static final String PARTITION_TYPE = "partition_type";

        /**
         * Using <a
         * href="../../../../../concepts/tables.html#partitioning-by-range"
         * target="_top">range partitioning</a>
         */
        public static final String RANGE = "RANGE";

        /**
         * Using <a
         * href="../../../../../concepts/tables.html#partitioning-by-interval"
         * target="_top">interval partitioning</a>
         */
        public static final String INTERVAL = "INTERVAL";

        /**
         * Using <a
         * href="../../../../../concepts/tables.html#partitioning-by-list-manual"
         * target="_top">manual list partitioning</a>
         */
        public static final String LIST = "LIST";

        /**
         * Using no partitioning
         */
        public static final String NONE = "NONE";

        /**
         * Comma-separated list of partition keys.  The default value is ''.
         */
        public static final String PARTITION_KEYS = "partition_keys";

        /**
         * Comma-separated list of partition definitions, whose format depends
         * on the partition_type.  See <a
         * href="../../../../../concepts/tables.html#partitioning"
         * target="_top">partitioning</a> documentation for details.  The
         * default value is ''.
         */
        public static final String PARTITION_DEFINITIONS = "partition_definitions";

        /**
         * True if partitions will be created for LIST VALUES which don't fall
         * into existing partitions.  The default value is ''.
         */
        public static final String IS_AUTOMATIC_PARTITION = "is_automatic_partition";

        /**
         * Semicolon-separated list of columns that have <a
         * href="../../../../../concepts/indexes.html#column-index"
         * target="_top">indexes</a>. Not present for collections.  The default
         * value is ''.
         */
        public static final String ATTRIBUTE_INDEXES = "attribute_indexes";

        /**
         * Semicolon-separated list of <a
         * href="../../../../../concepts/compression.html"
         * target="_top">compressed</a> columns with the corresponding
         * compression type for each; e.g.:
         * {first_name,snappy};{last_name,lz4hc}. Not present for collections.
         * The default value is ''.
         */
        public static final String COMPRESSED_COLUMNS = "compressed_columns";

        /**
         * JSON-encoded string representing a map of column name to information
         * including memory usage if if the {@code get_column_info} option is
         * {@code true}.  The default value is ''.
         */
        public static final String COLUMN_INFO = "column_info";

        /**
         * Returns the global access mode (i.e. lock status) for the table.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#NO_ACCESS
         * NO_ACCESS}: No read/write operations are allowed on this table.
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#READ_ONLY
         * READ_ONLY}: Only read operations are allowed on this table.
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#WRITE_ONLY
         * WRITE_ONLY}: Only write operations are allowed on this table.
         *         <li> {@link
         * com.gpudb.protocol.ShowTableResponse.AdditionalInfo#READ_WRITE
         * READ_WRITE}: All read/write operations are allowed on this table.
         * </ul>
         */
        public static final String GLOBAL_ACCESS_MODE = "global_access_mode";

        /**
         * No read/write operations are allowed on this table.
         */
        public static final String NO_ACCESS = "no_access";

        /**
         * Only read operations are allowed on this table.
         */
        public static final String READ_ONLY = "read_only";

        /**
         * Only write operations are allowed on this table.
         */
        public static final String WRITE_ONLY = "write_only";

        /**
         * All read/write operations are allowed on this table.
         */
        public static final String READ_WRITE = "read_write";

        /**
         * For materialized view the name of the view this member table is part
         * of - if same as the table_name then this is the root of the view.
         * The default value is ''.
         */
        public static final String VIEW_TABLE_NAME = "view_table_name";

        /**
         * True if the view named view_table_name is persisted - reported for
         * each view member.  Means method of recreating this member is saved -
         * not the members data.  The default value is ''.
         */
        public static final String IS_VIEW_PERSISTED = "is_view_persisted";

        /**
         * True if some input table of the materialized view that affects this
         * member table has been modified since the last refresh.  The default
         * value is ''.
         */
        public static final String IS_DIRTY = "is_dirty";

        /**
         * For materialized view current refresh_method - one of manual,
         * periodic, on_change.  The default value is ''.
         */
        public static final String REFRESH_METHOD = "refresh_method";

        /**
         * For materialized view with periodic refresh_method the current
         * intial datetime string that periodic refreshes began.  The default
         * value is ''.
         */
        public static final String REFRESH_START_TIME = "refresh_start_time";

        /**
         * For materialized view with periodic refresh_method the current
         * refresh period in seconds.  The default value is ''.
         */
        public static final String REFRESH_PERIOD = "refresh_period";

        /**
         * For materialized view the a datatime string indicating the last time
         * the view was refreshed.  The default value is ''.
         */
        public static final String LAST_REFRESH_TIME = "last_refresh_time";

        /**
         * For materialized view with periodic refresh_method a datetime string
         * indicating the next time the view is to be refreshed.  The default
         * value is ''.
         */
        public static final String NEXT_REFRESH_TIME = "next_refresh_time";

        /**
         * User-specified number of records per chunk, if provided at table
         * creation time.  The default value is ''.
         */
        public static final String USER_CHUNK_SIZE = "user_chunk_size";

        /**
         * Semicolon-separated list of shard keys that were equated in joins
         * (applicable for join tables).  The default value is ''.
         */
        public static final String ALTERNATE_SHARD_KEYS = "alternate_shard_keys";

        private AdditionalInfo() {
        }
    }

}
