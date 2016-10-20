/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link com.gpudb.GPUdb#adminOffline(AdminOfflineRequest)}.
 * <br />
 * <br />Take the system offline. When the system is offline, no user operations can be performed with the exception of a system
 * shutdown.
 */
public class AdminOfflineRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminOfflineRequest")
            .namespace("com.gpudb")
            .fields()
                .name("offline").type().booleanType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
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


    /**
     * Set to true if desired state is offline. Values: true, false.
     * <br />
     * <br />A set of string constants for the parameter {@code offline}.
     */
    public static final class Offline {
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Offline() {  }
    }

    private boolean offline;
    private Map<String, String> options;


    /**
     * Constructs an AdminOfflineRequest object with default parameters.
     */
    public AdminOfflineRequest() {
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AdminOfflineRequest object with the specified parameters.
     * 
     * @param offline  Set to true if desired state is offline. Values: true, false.
     * @param options  Optional parameters.
     * 
     */
    public AdminOfflineRequest(boolean offline, Map<String, String> options) {
        this.offline = offline;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Set to true if desired state is offline. Values: true, false.
     * 
     */
    public boolean getOffline() {
        return offline;
    }

    /**
     * 
     * @param offline  Set to true if desired state is offline. Values: true, false.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminOfflineRequest setOffline(boolean offline) {
        this.offline = offline;
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
    public AdminOfflineRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
                return this.offline;

            case 1:
                return this.options;

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
                this.offline = (Boolean)value;
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

        AdminOfflineRequest that = (AdminOfflineRequest)obj;

        return ( ( this.offline == that.offline )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "offline" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.offline ) );
        builder.append( ", " );
        builder.append( gd.toString( "options" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.options ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + ((Boolean)this.offline).hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
