/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import java.nio.ByteBuffer;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#aggregateGroupByRaw(AggregateGroupByRequest)}.
 */
public class RawAggregateGroupByResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RawAggregateGroupByResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("responseSchemaStr").type().stringType().noDefault()
                .name("binaryEncodedResponse").type().bytesType().noDefault()
                .name("jsonEncodedResponse").type().stringType().noDefault()
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

    private String responseSchemaStr;
    private ByteBuffer binaryEncodedResponse;
    private String jsonEncodedResponse;


    /**
     * Constructs a RawAggregateGroupByResponse object with default parameters.
     */
    public RawAggregateGroupByResponse() {
    }

    /**
     * 
     * @return Avro schema of {@code binaryEncodedResponse} or {@code
     *         jsonEncodedResponse}.
     * 
     */
    public String getResponseSchemaStr() {
        return responseSchemaStr;
    }

    /**
     * 
     * @param responseSchemaStr  Avro schema of {@code binaryEncodedResponse}
     *                           or {@code jsonEncodedResponse}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setResponseSchemaStr(String responseSchemaStr) {
        this.responseSchemaStr = (responseSchemaStr == null) ? "" : responseSchemaStr;
        return this;
    }

    /**
     * 
     * @return Avro binary encoded response.
     * 
     */
    public ByteBuffer getBinaryEncodedResponse() {
        return binaryEncodedResponse;
    }

    /**
     * 
     * @param binaryEncodedResponse  Avro binary encoded response.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setBinaryEncodedResponse(ByteBuffer binaryEncodedResponse) {
        this.binaryEncodedResponse = (binaryEncodedResponse == null) ? ByteBuffer.wrap( new byte[0] ) : binaryEncodedResponse;
        return this;
    }

    /**
     * 
     * @return Avro JSON encoded response.
     * 
     */
    public String getJsonEncodedResponse() {
        return jsonEncodedResponse;
    }

    /**
     * 
     * @param jsonEncodedResponse  Avro JSON encoded response.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawAggregateGroupByResponse setJsonEncodedResponse(String jsonEncodedResponse) {
        this.jsonEncodedResponse = (jsonEncodedResponse == null) ? "" : jsonEncodedResponse;
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
                return this.responseSchemaStr;

            case 1:
                return this.binaryEncodedResponse;

            case 2:
                return this.jsonEncodedResponse;

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
                this.responseSchemaStr = (String)value;
                break;

            case 1:
                this.binaryEncodedResponse = (ByteBuffer)value;
                break;

            case 2:
                this.jsonEncodedResponse = (String)value;
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

        RawAggregateGroupByResponse that = (RawAggregateGroupByResponse)obj;

        return ( this.responseSchemaStr.equals( that.responseSchemaStr )
                 && this.binaryEncodedResponse.equals( that.binaryEncodedResponse )
                 && this.jsonEncodedResponse.equals( that.jsonEncodedResponse ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "responseSchemaStr" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.responseSchemaStr ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "binaryEncodedResponse" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.binaryEncodedResponse ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "jsonEncodedResponse" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.jsonEncodedResponse ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.responseSchemaStr.hashCode();
        hashCode = (31 * hashCode) + this.binaryEncodedResponse.hashCode();
        hashCode = (31 * hashCode) + this.jsonEncodedResponse.hashCode();
        return hashCode;
    }

}
