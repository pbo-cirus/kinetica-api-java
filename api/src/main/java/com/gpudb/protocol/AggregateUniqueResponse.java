/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import com.gpudb.Record;
import com.gpudb.Type;
import org.apache.avro.generic.GenericData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#aggregateUnique(AggregateUniqueRequest)}.
 */
public class AggregateUniqueResponse {
    private String tableName;
    private List<Record> data;
    private boolean hasMoreRecords;
    private Map<String, String> info;
    private Type dataType;


    /**
     * Constructs an AggregateUniqueResponse object with default parameters.
     */
    public AggregateUniqueResponse() {
    }

    /**
     * @return The same table name as was passed in the parameter list.
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName The same table name as was passed in the parameter
     *                  list.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateUniqueResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * @return Avro binary encoded response.
     */
    public List<Record> getData() {
        return data;
    }

    /**
     * @param data Avro binary encoded response.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateUniqueResponse setData(List<Record> data) {
        this.data = (data == null) ? new ArrayList<Record>() : data;
        return this;
    }

    /**
     * @return Too many records. Returned a partial set.
     */
    public boolean getHasMoreRecords() {
        return hasMoreRecords;
    }

    /**
     * @param hasMoreRecords Too many records. Returned a partial set.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateUniqueResponse setHasMoreRecords(boolean hasMoreRecords) {
        this.hasMoreRecords = hasMoreRecords;
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
    public AggregateUniqueResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
        return this;
    }

    /**
     * @return The {@link Type} object containing the type of the dynamically
     * generated data.
     */
    public Type getDataType() {
        return dataType;
    }

    /**
     * @param dataType The {@link Type} object containing the type of the
     *                 dynamically generated data.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateUniqueResponse setDataType(Type dataType) {
        this.dataType = dataType;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        AggregateUniqueResponse that = (AggregateUniqueResponse) obj;

        return (this.tableName.equals(that.tableName)
                && this.data.equals(that.data)
                && (this.hasMoreRecords == that.hasMoreRecords)
                && this.info.equals(that.info)
                && this.dataType.equals(that.dataType));
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
        builder.append(gd.toString("data"));
        builder.append(": ");
        builder.append(gd.toString(this.data));
        builder.append(", ");
        builder.append(gd.toString("hasMoreRecords"));
        builder.append(": ");
        builder.append(gd.toString(this.hasMoreRecords));
        builder.append(", ");
        builder.append(gd.toString("info"));
        builder.append(": ");
        builder.append(gd.toString(this.info));
        builder.append(", ");
        builder.append(gd.toString("dataType"));
        builder.append(": ");
        builder.append(gd.toString(this.dataType));
        builder.append("}");

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.data.hashCode();
        hashCode = (31 * hashCode) + ((Boolean) this.hasMoreRecords).hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        hashCode = (31 * hashCode) + this.dataType.hashCode();
        return hashCode;
    }

}
