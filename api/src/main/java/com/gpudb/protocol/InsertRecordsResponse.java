/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.ArrayList;
import java.util.List;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link com.gpudb.GPUdb#insertRecordsRaw(RawInsertRecordsRequest)}.
 */
public class InsertRecordsResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("InsertRecordsResponse")
            .namespace("com.gpudb")
            .fields()
                .name("recordIds").type().array().items().stringType().noDefault()
                .name("countInserted").type().intType().noDefault()
                .name("countUpdated").type().intType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }

    private List<String> recordIds;
    private int countInserted;
    private int countUpdated;


    /**
     * Constructs an InsertRecordsResponse object with default parameters.
     */
    public InsertRecordsResponse() {
    }

    /**
     * 
     * @return An array containing the IDs with which GPUdb internally identifies the added records.
     * 
     */
    public List<String> getRecordIds() {
        return recordIds;
    }

    /**
     * 
     * @param recordIds  An array containing the IDs with which GPUdb internally identifies the added records.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsResponse setRecordIds(List<String> recordIds) {
        this.recordIds = (recordIds == null) ? new ArrayList<String>() : recordIds;
        return this;
    }

    /**
     * 
     * @return The number of records inserted.
     * 
     */
    public int getCountInserted() {
        return countInserted;
    }

    /**
     * 
     * @param countInserted  The number of records inserted.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsResponse setCountInserted(int countInserted) {
        this.countInserted = countInserted;
        return this;
    }

    /**
     * 
     * @return The number of records updated.
     * 
     */
    public int getCountUpdated() {
        return countUpdated;
    }

    /**
     * 
     * @param countUpdated  The number of records updated.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsResponse setCountUpdated(int countUpdated) {
        this.countUpdated = countUpdated;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                return this.recordIds;

            case 1:
                return this.countInserted;

            case 2:
                return this.countUpdated;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                this.recordIds = (List<String>)value;
                break;

            case 1:
                this.countInserted = (Integer)value;
                break;

            case 2:
                this.countUpdated = (Integer)value;
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

        InsertRecordsResponse that = (InsertRecordsResponse)obj;

        return ( this.recordIds.equals( that.recordIds )
                 && ( this.countInserted == that.countInserted )
                 && ( this.countUpdated == that.countUpdated ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "recordIds" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.recordIds ) );
        builder.append( ", " );
        builder.append( gd.toString( "countInserted" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.countInserted ) );
        builder.append( ", " );
        builder.append( gd.toString( "countUpdated" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.countUpdated ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.recordIds.hashCode();
        hashCode = (31 * hashCode) + this.countInserted;
        hashCode = (31 * hashCode) + this.countUpdated;
        return hashCode;
    }

}
