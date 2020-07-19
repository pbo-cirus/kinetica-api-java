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
 * com.gpudb.GPUdb#collectStatistics(CollectStatisticsRequest)}.
 */
public class CollectStatisticsResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CollectStatisticsResponse")
            .namespace("com.gpudb")
            .fields()
            .name("tableName").type().stringType().noDefault()
            .name("columnNames").type().array().items().stringType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private String tableName;
    private List<String> columnNames;
    private Map<String, String> info;
    /**
     * Constructs a CollectStatisticsResponse object with default parameters.
     */
    public CollectStatisticsResponse() {
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
    public CollectStatisticsResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * @return Value of {@code columnNames}.
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * @param columnNames Value of {@code columnNames}.
     * @return {@code this} to mimic the builder pattern.
     */
    public CollectStatisticsResponse setColumnNames(List<String> columnNames) {
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
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
    public CollectStatisticsResponse setInfo(Map<String, String> info) {
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
                return this.columnNames;

            case 2:
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
                this.columnNames = (List<String>) value;
                break;

            case 2:
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

        CollectStatisticsResponse that = (CollectStatisticsResponse) obj;

        return (this.tableName.equals(that.tableName)
                && this.columnNames.equals(that.columnNames)
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
        builder.append(gd.toString("columnNames"));
        builder.append(": ");
        builder.append(gd.toString(this.columnNames));
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
        hashCode = (31 * hashCode) + this.columnNames.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
