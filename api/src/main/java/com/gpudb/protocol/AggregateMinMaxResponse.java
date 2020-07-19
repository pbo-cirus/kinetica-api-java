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
 * A set of results returned by {@link
 * com.gpudb.GPUdb#aggregateMinMax(AggregateMinMaxRequest)}.
 */
public class AggregateMinMaxResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateMinMaxResponse")
            .namespace("com.gpudb")
            .fields()
            .name("min").type().doubleType().noDefault()
            .name("max").type().doubleType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private double min;
    private double max;
    private Map<String, String> info;
    /**
     * Constructs an AggregateMinMaxResponse object with default parameters.
     */
    public AggregateMinMaxResponse() {
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
     * @return Minimum value of the {@code columnName}.
     */
    public double getMin() {
        return min;
    }

    /**
     * @param min Minimum value of the {@code columnName}.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateMinMaxResponse setMin(double min) {
        this.min = min;
        return this;
    }

    /**
     * @return Maximum value of the {@code columnName}.
     */
    public double getMax() {
        return max;
    }

    /**
     * @param max Maximum value of the {@code columnName}.
     * @return {@code this} to mimic the builder pattern.
     */
    public AggregateMinMaxResponse setMax(double max) {
        this.max = max;
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
    public AggregateMinMaxResponse setInfo(Map<String, String> info) {
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
                return this.min;

            case 1:
                return this.max;

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
                this.min = (Double) value;
                break;

            case 1:
                this.max = (Double) value;
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

        AggregateMinMaxResponse that = (AggregateMinMaxResponse) obj;

        return (((Double) this.min).equals((Double) that.min)
                && ((Double) this.max).equals((Double) that.max)
                && this.info.equals(that.info));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("min"));
        builder.append(": ");
        builder.append(gd.toString(this.min));
        builder.append(", ");
        builder.append(gd.toString("max"));
        builder.append(": ");
        builder.append(gd.toString(this.max));
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
        hashCode = (31 * hashCode) + ((Double) this.min).hashCode();
        hashCode = (31 * hashCode) + ((Double) this.max).hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
