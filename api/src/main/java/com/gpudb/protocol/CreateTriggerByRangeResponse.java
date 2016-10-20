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


/**
 * A set of results returned by {@link com.gpudb.GPUdb#createTriggerByRange(CreateTriggerByRangeRequest)}.
 */
public class CreateTriggerByRangeResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateTriggerByRangeResponse")
            .namespace("com.gpudb")
            .fields()
                .name("triggerId").type().stringType().noDefault()
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

    private String triggerId;


    /**
     * Constructs a CreateTriggerByRangeResponse object with default parameters.
     */
    public CreateTriggerByRangeResponse() {
    }

    /**
     * 
     * @return Value of {@code requestId}.
     * 
     */
    public String getTriggerId() {
        return triggerId;
    }

    /**
     * 
     * @param triggerId  Value of {@code requestId}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTriggerByRangeResponse setTriggerId(String triggerId) {
        this.triggerId = (triggerId == null) ? "" : triggerId;
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
                return this.triggerId;

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
                this.triggerId = (String)value;
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

        CreateTriggerByRangeResponse that = (CreateTriggerByRangeResponse)obj;

        return ( this.triggerId.equals( that.triggerId ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "triggerId" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.triggerId ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.triggerId.hashCode();
        return hashCode;
    }

}
