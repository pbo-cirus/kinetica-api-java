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
 * A set of results returned by {@link
 * com.gpudb.GPUdb#showSqlProc(ShowSqlProcRequest)}.
 */
public class ShowSqlProcResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowSqlProcResponse")
            .namespace("com.gpudb")
            .fields()
            .name("procedureNames").type().array().items().stringType().noDefault()
            .name("procedureDefinitions").type().array().items().stringType().noDefault()
            .name("additionalInfo").type().array().items().map().values().stringType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private List<String> procedureNames;
    private List<String> procedureDefinitions;
    private List<Map<String, String>> additionalInfo;
    private Map<String, String> info;
    /**
     * Constructs a ShowSqlProcResponse object with default parameters.
     */
    public ShowSqlProcResponse() {
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
     * @return A list of the names of the requested procedures.
     */
    public List<String> getProcedureNames() {
        return procedureNames;
    }

    /**
     * @param procedureNames A list of the names of the requested procedures.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowSqlProcResponse setProcedureNames(List<String> procedureNames) {
        this.procedureNames = (procedureNames == null) ? new ArrayList<String>() : procedureNames;
        return this;
    }

    /**
     * @return A list of the definitions for the requested procedures.
     */
    public List<String> getProcedureDefinitions() {
        return procedureDefinitions;
    }

    /**
     * @param procedureDefinitions A list of the definitions for the requested
     *                             procedures.
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowSqlProcResponse setProcedureDefinitions(List<String> procedureDefinitions) {
        this.procedureDefinitions = (procedureDefinitions == null) ? new ArrayList<String>() : procedureDefinitions;
        return this;
    }

    /**
     * @return Additional information about the respective tables in the
     * requested procedures.
     * Supported values:
     * <ul>
     * </ul>
     */
    public List<Map<String, String>> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * @param additionalInfo Additional information about the respective
     *                       tables in the requested procedures.
     *                       Supported values:
     *                       <ul>
     *                       </ul>
     * @return {@code this} to mimic the builder pattern.
     */
    public ShowSqlProcResponse setAdditionalInfo(List<Map<String, String>> additionalInfo) {
        this.additionalInfo = (additionalInfo == null) ? new ArrayList<Map<String, String>>() : additionalInfo;
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
    public ShowSqlProcResponse setInfo(Map<String, String> info) {
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
                return this.procedureNames;

            case 1:
                return this.procedureDefinitions;

            case 2:
                return this.additionalInfo;

            case 3:
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
                this.procedureNames = (List<String>) value;
                break;

            case 1:
                this.procedureDefinitions = (List<String>) value;
                break;

            case 2:
                this.additionalInfo = (List<Map<String, String>>) value;
                break;

            case 3:
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

        ShowSqlProcResponse that = (ShowSqlProcResponse) obj;

        return (this.procedureNames.equals(that.procedureNames)
                && this.procedureDefinitions.equals(that.procedureDefinitions)
                && this.additionalInfo.equals(that.additionalInfo)
                && this.info.equals(that.info));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("procedureNames"));
        builder.append(": ");
        builder.append(gd.toString(this.procedureNames));
        builder.append(", ");
        builder.append(gd.toString("procedureDefinitions"));
        builder.append(": ");
        builder.append(gd.toString(this.procedureDefinitions));
        builder.append(", ");
        builder.append(gd.toString("additionalInfo"));
        builder.append(": ");
        builder.append(gd.toString(this.additionalInfo));
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
        hashCode = (31 * hashCode) + this.procedureNames.hashCode();
        hashCode = (31 * hashCode) + this.procedureDefinitions.hashCode();
        hashCode = (31 * hashCode) + this.additionalInfo.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

    /**
     * Additional information about the respective tables in the requested
     * procedures.
     * Supported values:
     * <ul>
     * </ul>
     * A set of string constants for the parameter {@code additionalInfo}.
     */
    public static final class AdditionalInfo {

        /**
         * The initial date/time that periodic execution began.  The default
         * value is ''.
         */
        public static final String EXECUTE_START_TIME = "execute_start_time";

        /**
         * The periodic execution interval in seconds.  The default value is
         * ''.
         */
        public static final String EXECUTE_INTERVAL = "execute_interval";

        private AdditionalInfo() {
        }
    }

}
