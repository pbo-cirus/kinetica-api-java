/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#createType(CreateTypeRequest)}.
 */
public class CreateTypeResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateTypeResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("typeId").type().stringType().noDefault()
                .name("typeDefinition").type().stringType().noDefault()
                .name("label").type().stringType().noDefault()
                .name("properties").type().map().values().array().items().stringType().noDefault()
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
    private String typeDefinition;
    private String label;
    private Map<String, List<String>> properties;


    /**
     * Constructs a CreateTypeResponse object with default parameters.
     */
    public CreateTypeResponse() {
    }

    /**
     * 
     * @return A GPUdb identifier representing the created type. This type_id
     *         can be used in subsequent calls to {@link
     *         com.gisfederal.gpudb.GPUdb#createTable(CreateTableRequest)
     *         create a table}
     * 
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 
     * @param typeId  A GPUdb identifier representing the created type. This
     *                type_id can be used in subsequent calls to {@link
     *                com.gisfederal.gpudb.GPUdb#createTable(CreateTableRequest)
     *                create a table}
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTypeResponse setTypeId(String typeId) {
        this.typeId = (typeId == null) ? "" : typeId;
        return this;
    }

    /**
     * 
     * @return Value of {@code typeDefinition}.
     * 
     */
    public String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * 
     * @param typeDefinition  Value of {@code typeDefinition}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTypeResponse setTypeDefinition(String typeDefinition) {
        this.typeDefinition = (typeDefinition == null) ? "" : typeDefinition;
        return this;
    }

    /**
     * 
     * @return Value of {@code label}.
     * 
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label  Value of {@code label}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTypeResponse setLabel(String label) {
        this.label = (label == null) ? "" : label;
        return this;
    }

    /**
     * 
     * @return Value of {@code properties}.
     * 
     */
    public Map<String, List<String>> getProperties() {
        return properties;
    }

    /**
     * 
     * @param properties  Value of {@code properties}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTypeResponse setProperties(Map<String, List<String>> properties) {
        this.properties = (properties == null) ? new LinkedHashMap<String, List<String>>() : properties;
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
                return this.typeDefinition;

            case 2:
                return this.label;

            case 3:
                return this.properties;

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
                this.typeDefinition = (String)value;
                break;

            case 2:
                this.label = (String)value;
                break;

            case 3:
                this.properties = (Map<String, List<String>>)value;
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

        CreateTypeResponse that = (CreateTypeResponse)obj;

        return ( this.typeId.equals( that.typeId )
                 && this.typeDefinition.equals( that.typeDefinition )
                 && this.label.equals( that.label )
                 && this.properties.equals( that.properties ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "typeId" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.typeId ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "typeDefinition" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.typeDefinition ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "label" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.label ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "properties" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.properties ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.typeId.hashCode();
        hashCode = (31 * hashCode) + this.typeDefinition.hashCode();
        hashCode = (31 * hashCode) + this.label.hashCode();
        hashCode = (31 * hashCode) + this.properties.hashCode();
        return hashCode;
    }

}
