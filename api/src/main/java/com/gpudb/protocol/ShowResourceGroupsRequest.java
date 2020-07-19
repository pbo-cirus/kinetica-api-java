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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#showResourceGroups(ShowResourceGroupsRequest)}.
 * <p>
 * Requests resource group properties.
 * Returns detailed information about the requested resource groups.
 */
public class ShowResourceGroupsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowResourceGroupsRequest")
            .namespace("com.gpudb")
            .fields()
            .name("names").type().array().items().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private List<String> names;
    private Map<String, String> options;

    /**
     * Constructs a ShowResourceGroupsRequest object with default parameters.
     */
    public ShowResourceGroupsRequest() {
        names = new ArrayList<>();
        options = new LinkedHashMap<>();
    }
    /**
     * Constructs a ShowResourceGroupsRequest object with the specified
     * parameters.
     *
     * @param names   List of names of groups to be shown. A single entry with
     *                an empty string returns all groups.
     * @param options Optional parameters.
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_VALUES
     *                SHOW_DEFAULT_VALUES}: If {@code true} include values of
     *                fields that are based on the default resource group.
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE
     *                FALSE}
     *                </ul>
     *                The default value is {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}.
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_GROUP
     *                SHOW_DEFAULT_GROUP}: If {@code true} include the default
     *                resource group in the response.
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE
     *                FALSE}
     *                </ul>
     *                The default value is {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}.
     *                </ul>
     *                The default value is an empty {@link Map}.
     */
    public ShowResourceGroupsRequest(List<String> names, Map<String, String> options) {
        this.names = (names == null) ? new ArrayList<String>() : names;
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
     * @return List of names of groups to be shown. A single entry with an
     * empty string returns all groups.
     */
    public List<String> getNames() {
        return names;
    }

    /**
     * @param names List of names of groups to be shown. A single entry with
     *              an empty string returns all groups.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowResourceGroupsRequest setNames(List<String> names) {
        this.names = (names == null) ? new ArrayList<String>() : names;
        return this;
    }

    /**
     * @return Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_VALUES
     * SHOW_DEFAULT_VALUES}: If {@code true} include values of fields
     * that are based on the default resource group.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}.
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_GROUP
     * SHOW_DEFAULT_GROUP}: If {@code true} include the default
     * resource group in the response.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}.
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
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_VALUES
     *                SHOW_DEFAULT_VALUES}: If {@code true} include values of
     *                fields that are based on the default resource group.
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE
     *                FALSE}
     *                </ul>
     *                The default value is {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}.
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_GROUP
     *                SHOW_DEFAULT_GROUP}: If {@code true} include the default
     *                resource group in the response.
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}
     *                        <li> {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE
     *                FALSE}
     *                </ul>
     *                The default value is {@link
     *                com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE
     *                TRUE}.
     *                </ul>
     *                The default value is an empty {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowResourceGroupsRequest setOptions(Map<String, String> options) {
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
                return this.names;

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
     * @param index the position of the field to set
     * @param value the value to set
     * @throws IndexOutOfBoundsException
     */
    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.names = (List<String>) value;
                break;

            case 1:
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

        ShowResourceGroupsRequest that = (ShowResourceGroupsRequest) obj;

        return (this.names.equals(that.names)
                && this.options.equals(that.options));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("names"));
        builder.append(": ");
        builder.append(gd.toString(this.names));
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
        hashCode = (31 * hashCode) + this.names.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_VALUES
     * SHOW_DEFAULT_VALUES}: If {@code true} include values of fields that are
     * based on the default resource group.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}.
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#SHOW_DEFAULT_GROUP
     * SHOW_DEFAULT_GROUP}: If {@code true} include the default resource group
     * in the response.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code true} include values of fields that are based on the
         * default resource group.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}.
         */
        public static final String SHOW_DEFAULT_VALUES = "show_default_values";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * If {@code true} include the default resource group in the response.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowResourceGroupsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowResourceGroupsRequest.Options#TRUE TRUE}.
         */
        public static final String SHOW_DEFAULT_GROUP = "show_default_group";

        private Options() {
        }
    }

}
