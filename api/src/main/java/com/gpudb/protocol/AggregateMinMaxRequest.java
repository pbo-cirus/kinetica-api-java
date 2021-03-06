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

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#aggregateMinMax(AggregateMinMaxRequest)}.
 * <p>
 * Calculates and returns the minimum and maximum values of a particular column
 * in a table.
 */
public class AggregateMinMaxRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateMinMaxRequest")
            .namespace("com.gpudb")
            .fields()
            .name("tableName").type().stringType().noDefault()
            .name("columnName").type().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String tableName;
    private String columnName;
    private Map<String, String> options;
    /**
     * Constructs an AggregateMinMaxRequest object with default parameters.
     */
    public AggregateMinMaxRequest() {
        tableName = "";
        columnName = "";
        options = new LinkedHashMap<>();
    }


    /**
     * Constructs an AggregateMinMaxRequest object with the specified
     * parameters.
     *
     * @param tableName  Name of the table on which the operation will be
     *                   performed. Must be an existing table.
     * @param columnName Name of a column or an expression of one or more
     *                   column on which the min-max will be calculated.
     * @param options    Optional parameters.  The default value is an empty
     *                   {@link Map}.
     */
    public AggregateMinMaxRequest(String tableName, String columnName, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.columnName = (columnName == null) ? "" : columnName;
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
     * @return Name of the table on which the operation will be performed. Must
     * be an existing table.
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName Name of the table on which the operation will be
     *                  performed. Must be an existing table.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateMinMaxRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * @return Name of a column or an expression of one or more column on which
     * the min-max will be calculated.
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName Name of a column or an expression of one or more
     *                   column on which the min-max will be calculated.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateMinMaxRequest setColumnName(String columnName) {
        this.columnName = (columnName == null) ? "" : columnName;
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
    public AggregateMinMaxRequest setOptions(Map<String, String> options) {
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
                return this.columnName;

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
                this.columnName = (String) value;
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

        AggregateMinMaxRequest that = (AggregateMinMaxRequest) obj;

        return (this.tableName.equals(that.tableName)
                && this.columnName.equals(that.columnName)
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
        builder.append(gd.toString("columnName"));
        builder.append(": ");
        builder.append(gd.toString(this.columnName));
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
        hashCode = (31 * hashCode) + this.columnName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
