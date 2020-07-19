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
 * com.gpudb.GPUdb#createUserInternal(CreateUserInternalRequest)}.
 * <p>
 * Creates a new internal user (a user whose credentials are managed by the
 * database system).
 */
public class CreateUserInternalRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateUserInternalRequest")
            .namespace("com.gpudb")
            .fields()
            .name("name").type().stringType().noDefault()
            .name("password").type().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String name;
    private String password;
    private Map<String, String> options;
    /**
     * Constructs a CreateUserInternalRequest object with default parameters.
     */
    public CreateUserInternalRequest() {
        name = "";
        password = "";
        options = new LinkedHashMap<>();
    }
    /**
     * Constructs a CreateUserInternalRequest object with the specified
     * parameters.
     *
     * @param name     Name of the user to be created. Must contain only lowercase
     *                 letters, digits, and underscores, and cannot begin with a
     *                 digit. Must not be the same name as an existing user or
     *                 role.
     * @param password Initial password of the user to be created. May be an
     *                 empty string for no password.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateUserInternalRequest.Options#RESOURCE_GROUP
     *                 RESOURCE_GROUP}: Name of an existing resource group to
     *                 associate with this user
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     */
    public CreateUserInternalRequest(String name, String password, Map<String, String> options) {
        this.name = (name == null) ? "" : name;
        this.password = (password == null) ? "" : password;
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
     * @return Name of the user to be created. Must contain only lowercase
     * letters, digits, and underscores, and cannot begin with a digit.
     * Must not be the same name as an existing user or role.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Name of the user to be created. Must contain only lowercase
     *             letters, digits, and underscores, and cannot begin with a
     *             digit. Must not be the same name as an existing user or
     *             role.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateUserInternalRequest setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * @return Initial password of the user to be created. May be an empty
     * string for no password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password Initial password of the user to be created. May be an
     *                 empty string for no password.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateUserInternalRequest setPassword(String password) {
        this.password = (password == null) ? "" : password;
        return this;
    }

    /**
     * @return Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateUserInternalRequest.Options#RESOURCE_GROUP
     * RESOURCE_GROUP}: Name of an existing resource group to associate
     * with this user
     * </ul>
     * The default value is an empty {@link Map}.
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * @param options Optional parameters.
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.CreateUserInternalRequest.Options#RESOURCE_GROUP
     *                RESOURCE_GROUP}: Name of an existing resource group to
     *                associate with this user
     *                </ul>
     *                The default value is an empty {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateUserInternalRequest setOptions(Map<String, String> options) {
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
                return this.name;

            case 1:
                return this.password;

            case 2:
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
                this.name = (String) value;
                break;

            case 1:
                this.password = (String) value;
                break;

            case 2:
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

        CreateUserInternalRequest that = (CreateUserInternalRequest) obj;

        return (this.name.equals(that.name)
                && this.password.equals(that.password)
                && this.options.equals(that.options));
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
        builder.append(gd.toString("password"));
        builder.append(": ");
        builder.append(gd.toString(this.password));
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.password.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateUserInternalRequest.Options#RESOURCE_GROUP
     * RESOURCE_GROUP}: Name of an existing resource group to associate with
     * this user
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of an existing resource group to associate with this user
         */
        public static final String RESOURCE_GROUP = "resource_group";

        private Options() {
        }
    }

}
