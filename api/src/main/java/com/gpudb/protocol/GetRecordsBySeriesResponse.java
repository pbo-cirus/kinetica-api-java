/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import org.apache.avro.generic.GenericData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#getRecordsBySeries(Object, GetRecordsBySeriesRequest)}.
 *
 * @param <T> The type of object being processed.
 */
public class GetRecordsBySeriesResponse<T> {
    private List<String> tableNames;
    private List<String> typeNames;
    private List<String> typeSchemas;
    private List<List<T>> data;
    private Map<String, String> info;


    /**
     * Constructs a GetRecordsBySeriesResponse object with default parameters.
     */
    public GetRecordsBySeriesResponse() {
    }

    /**
     * @return The table name (one per series/track) of the returned
     * series/tracks.
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * @param tableNames The table name (one per series/track) of the returned
     *                   series/tracks.
     * @return {@code this} to mimic the builder pattern.
     */
    public GetRecordsBySeriesResponse<T> setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * @return The type IDs (one per series/track) of the returned
     * series/tracks. This is useful when {@code tableName} is a
     * collection and the returned series/tracks belong to tables with
     * different types.
     */
    public List<String> getTypeNames() {
        return typeNames;
    }

    /**
     * @param typeNames The type IDs (one per series/track) of the returned
     *                  series/tracks. This is useful when {@code tableName}
     *                  is a collection and the returned series/tracks belong
     *                  to tables with different types.
     * @return {@code this} to mimic the builder pattern.
     */
    public GetRecordsBySeriesResponse<T> setTypeNames(List<String> typeNames) {
        this.typeNames = (typeNames == null) ? new ArrayList<String>() : typeNames;
        return this;
    }

    /**
     * @return The type schemas (one per series/track) of the returned
     * series/tracks.
     */
    public List<String> getTypeSchemas() {
        return typeSchemas;
    }

    /**
     * @param typeSchemas The type schemas (one per series/track) of the
     *                    returned series/tracks.
     * @return {@code this} to mimic the builder pattern.
     */
    public GetRecordsBySeriesResponse<T> setTypeSchemas(List<String> typeSchemas) {
        this.typeSchemas = (typeSchemas == null) ? new ArrayList<String>() : typeSchemas;
        return this;
    }

    /**
     * @return If the encoding parameter of the request was 'binary' then this
     * list-of-lists contains the binary encoded records for each
     * object (inner list) in each series/track (outer list).
     * Otherwise, empty list-of-lists.
     */
    public List<List<T>> getData() {
        return data;
    }

    /**
     * @param data If the encoding parameter of the request was 'binary' then
     *             this list-of-lists contains the binary encoded records for
     *             each object (inner list) in each series/track (outer list).
     *             Otherwise, empty list-of-lists.
     * @return {@code this} to mimic the builder pattern.
     */
    public GetRecordsBySeriesResponse<T> setData(List<List<T>> data) {
        this.data = (data == null) ? new ArrayList<List<T>>() : data;
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
    public GetRecordsBySeriesResponse<T> setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
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

        GetRecordsBySeriesResponse that = (GetRecordsBySeriesResponse) obj;

        return (this.tableNames.equals(that.tableNames)
                && this.typeNames.equals(that.typeNames)
                && this.typeSchemas.equals(that.typeSchemas)
                && this.data.equals(that.data)
                && this.info.equals(that.info));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("tableNames"));
        builder.append(": ");
        builder.append(gd.toString(this.tableNames));
        builder.append(", ");
        builder.append(gd.toString("typeNames"));
        builder.append(": ");
        builder.append(gd.toString(this.typeNames));
        builder.append(", ");
        builder.append(gd.toString("typeSchemas"));
        builder.append(": ");
        builder.append(gd.toString(this.typeSchemas));
        builder.append(", ");
        builder.append(gd.toString("data"));
        builder.append(": ");
        builder.append(gd.toString(this.data));
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
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.typeNames.hashCode();
        hashCode = (31 * hashCode) + this.typeSchemas.hashCode();
        hashCode = (31 * hashCode) + this.data.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
