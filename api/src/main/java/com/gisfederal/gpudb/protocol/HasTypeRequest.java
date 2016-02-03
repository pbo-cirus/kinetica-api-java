/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link
 * com.gisfederal.gpudb.GPUdb#hasType(HasTypeRequest)}.
 * <p>
 * Check the existance of a type in GPUdb.
 */
public class HasTypeRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("HasTypeRequest")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("typeId").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
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

    private String typeId;
    private Map<String, String> options;


    /**
     * Constructs a HasTypeRequest object with default parameters.
     */
    public HasTypeRequest() {
        typeId = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a HasTypeRequest object with the specified parameters.
     * 
     * @param typeId  Id of the type returned by GPUdb in response to {@link
     *                com.gisfederal.gpudb.GPUdb#createType(CreateTypeRequest)}
     *                request.
     * @param options  Optional parameters.
     * 
     */
    public HasTypeRequest(String typeId, Map<String, String> options) {
        this.typeId = (typeId == null) ? "" : typeId;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Id of the type returned by GPUdb in response to {@link
     *         com.gisfederal.gpudb.GPUdb#createType(CreateTypeRequest)}
     *         request.
     * 
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 
     * @param typeId  Id of the type returned by GPUdb in response to {@link
     *                com.gisfederal.gpudb.GPUdb#createType(CreateTypeRequest)}
     *                request.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public HasTypeRequest setTypeId(String typeId) {
        this.typeId = (typeId == null) ? "" : typeId;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public HasTypeRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
                return this.typeId;

            case 1:
                return this.options;

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
                this.typeId = (String)value;
                break;

            case 1:
                this.options = (Map<String, String>)value;
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

        HasTypeRequest that = (HasTypeRequest)obj;

        return ( this.typeId.equals( that.typeId )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "typeId" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.typeId ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "options" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.options ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.typeId.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
