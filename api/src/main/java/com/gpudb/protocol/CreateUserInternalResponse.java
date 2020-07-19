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
 * com.gpudb.GPUdb#createUserInternal(CreateUserInternalRequest)}.
 */
public class CreateUserInternalResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateUserInternalResponse")
            .namespace("com.gpudb")
            .fields()
            .name("name").type().stringType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private String name;
    private Map<String, String> info;

    /**
     * Constructs a CreateUserInternalResponse object with default parameters.
     */
    public CreateUserInternalResponse() {
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
     * @return Value of {@code name}.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Value of {@code name}.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateUserInternalResponse setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * @return Additional information.
     * <ul>
     * </ul>
     * The default value is an empty {@link Map}.
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * @param info Additional information.
     *             <ul>
     *             </ul>
     *             The default value is an empty {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateUserInternalResponse setInfo(Map<String, String> info) {
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
                return this.name;

            case 1:
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
                this.name = (String) value;
                break;

            case 1:
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

        CreateUserInternalResponse that = (CreateUserInternalResponse) obj;

        return (this.name.equals(that.name)
                && this.info.equals(that.info));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("name"));
        builder.append(": ");
        builder.append(gd.toString(this.name));
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

    /**
     * Additional information.
     * <ul>
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code info}.
     */
    public static final class Info {

        private Info() {
        }
    }

}
