/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#filterBySeries(FilterBySeriesRequest)}.
 */
public class FilterBySeriesResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterBySeriesResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("count").type().longType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }

    private long count;


    /**
     * Constructs a FilterBySeriesResponse object with default parameters.
     */
    public FilterBySeriesResponse() {
    }

    /**
     * 
     * @return The number of records passing the series filter.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * 
     * @param count  The number of records passing the series filter.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterBySeriesResponse setCount(long count) {
        this.count = count;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to get
     * 
     * @return value of the field with the given index.
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.count;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to set
     * @param value  the value to set
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.count = (Long)value;
                break;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        FilterBySeriesResponse that = (FilterBySeriesResponse)obj;

        return ( ( this.count == that.count ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "count" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.count ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + ((Long)this.count).hashCode();
        return hashCode;
    }

}
