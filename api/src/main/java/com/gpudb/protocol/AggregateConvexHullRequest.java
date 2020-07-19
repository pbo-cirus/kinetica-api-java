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
 * com.gpudb.GPUdb#aggregateConvexHull(AggregateConvexHullRequest)}.
 * <p>
 * Calculates and returns the convex hull for the values in a table specified
 * by {@code tableName}.
 */
public class AggregateConvexHullRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateConvexHullRequest")
            .namespace("com.gpudb")
            .fields()
            .name("tableName").type().stringType().noDefault()
            .name("xColumnName").type().stringType().noDefault()
            .name("yColumnName").type().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String tableName;
    private String xColumnName;
    private String yColumnName;
    private Map<String, String> options;
    /**
     * Constructs an AggregateConvexHullRequest object with default parameters.
     */
    public AggregateConvexHullRequest() {
        tableName = "";
        xColumnName = "";
        yColumnName = "";
        options = new LinkedHashMap<>();
    }


    /**
     * Constructs an AggregateConvexHullRequest object with the specified
     * parameters.
     *
     * @param tableName   Name of table on which the operation will be
     *                    performed. Must be an existing table.  It cannot be a
     *                    collection.
     * @param xColumnName Name of the column containing the x coordinates of
     *                    the points for the operation being performed.
     * @param yColumnName Name of the column containing the y coordinates of
     *                    the points for the operation being performed.
     * @param options     Optional parameters.  The default value is an empty
     *                    {@link Map}.
     */
    public AggregateConvexHullRequest(String tableName, String xColumnName, String yColumnName, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
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
     * @return Name of table on which the operation will be performed. Must be
     * an existing table.  It cannot be a collection.
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName Name of table on which the operation will be
     *                  performed. Must be an existing table.  It cannot be a
     *                  collection.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateConvexHullRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * @return Name of the column containing the x coordinates of the points
     * for the operation being performed.
     */
    public String getXColumnName() {
        return xColumnName;
    }

    /**
     * @param xColumnName Name of the column containing the x coordinates of
     *                    the points for the operation being performed.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateConvexHullRequest setXColumnName(String xColumnName) {
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        return this;
    }

    /**
     * @return Name of the column containing the y coordinates of the points
     * for the operation being performed.
     */
    public String getYColumnName() {
        return yColumnName;
    }

    /**
     * @param yColumnName Name of the column containing the y coordinates of
     *                    the points for the operation being performed.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateConvexHullRequest setYColumnName(String yColumnName) {
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
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
    public AggregateConvexHullRequest setOptions(Map<String, String> options) {
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
                return this.xColumnName;

            case 2:
                return this.yColumnName;

            case 3:
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
                this.xColumnName = (String) value;
                break;

            case 2:
                this.yColumnName = (String) value;
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

        AggregateConvexHullRequest that = (AggregateConvexHullRequest) obj;

        return (this.tableName.equals(that.tableName)
                && this.xColumnName.equals(that.xColumnName)
                && this.yColumnName.equals(that.yColumnName)
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
        builder.append(gd.toString("xColumnName"));
        builder.append(": ");
        builder.append(gd.toString(this.xColumnName));
        builder.append(", ");
        builder.append(gd.toString("yColumnName"));
        builder.append(": ");
        builder.append(gd.toString(this.yColumnName));
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
        hashCode = (31 * hashCode) + this.xColumnName.hashCode();
        hashCode = (31 * hashCode) + this.yColumnName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
