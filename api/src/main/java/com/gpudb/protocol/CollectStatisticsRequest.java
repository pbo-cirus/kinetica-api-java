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
 * A set of parameters for {@link
 * com.gpudb.GPUdb#collectStatistics(CollectStatisticsRequest)}.
 * <p>
 * Collect statistics for a column(s) in a specified table.
 */
public class CollectStatisticsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CollectStatisticsRequest")
            .namespace("com.gpudb")
            .fields()
            .name("tableName").type().stringType().noDefault()
            .name("columnNames").type().array().items().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String tableName;
    private List<String> columnNames;
    private Map<String, String> options;
    /**
     * Constructs a CollectStatisticsRequest object with default parameters.
     */
    public CollectStatisticsRequest() {
        tableName = "";
        columnNames = new ArrayList<>();
        options = new LinkedHashMap<>();
    }


    /**
     * Constructs a CollectStatisticsRequest object with the specified
     * parameters.
     *
     * @param tableName   Name of a table. Must be an existing table.
     * @param columnNames List of one or more column names in {@code
     *                    tableName} for which to collect statistics
     *                    (cardinality, mean value, etc.).
     * @param options     Optional parameters.  The default value is an empty
     *                    {@link Map}.
     */
    public CollectStatisticsRequest(String tableName, List<String> columnNames, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
     * @return Name of a table. Must be an existing table.
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName Name of a table. Must be an existing table.
     * @return {@code this} to mimic the builder pattern.
     */
    public CollectStatisticsRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * @return List of one or more column names in {@code tableName} for which
     * to collect statistics (cardinality, mean value, etc.).
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * @param columnNames List of one or more column names in {@code
     *                    tableName} for which to collect statistics
     *                    (cardinality, mean value, etc.).
     * @return {@code this} to mimic the builder pattern.
     */
    public CollectStatisticsRequest setColumnNames(List<String> columnNames) {
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        return this;
    }

    /**
     * @return Optional parameters.  The default value is an empty {@link Map}.
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * @param options Optional parameters.  The default value is an empty
     *                {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public CollectStatisticsRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
                return this.columnNames;

            case 2:
                return this.options;

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
                this.columnNames = (List<String>) value;
                break;

            case 2:
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

        CollectStatisticsRequest that = (CollectStatisticsRequest) obj;

        return (this.tableName.equals(that.tableName)
                && this.columnNames.equals(that.columnNames)
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
        builder.append(gd.toString("columnNames"));
        builder.append(": ");
        builder.append(gd.toString(this.columnNames));
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
        hashCode = (31 * hashCode) + this.columnNames.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
