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
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#showTriggers(ShowTriggersRequest)}.
 */
public class ShowTriggersResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowTriggersResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("triggerMap").type().map().values().map().values().stringType().noDefault()
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

    private Map<String, Map<String, String>> triggerMap;


    /**
     * Constructs a ShowTriggersResponse object with default parameters.
     */
    public ShowTriggersResponse() {
    }

    /**
     * 
     * @return This dictionary contains (key, value) pairs of (trigger ID,
     *         information map/dictionary) where the key is a Unicode string
     *         representing a Trigger ID. The value is another embedded
     *         dictionary containing (key, value) pairs where the keys consist
     *         of 'table_name', 'type' and the parameter names relating to the
     *         trigger type, e.g. *nai*, *min*, *max*. The values are unicode
     *         strings (numeric values are also converted to strings)
     *         representing the value of the respective parameter. If a trigger
     *         is associated with multiple tables, then the string value for
     *         *table_name* contains a comma separated list of table names.
     * 
     */
    public Map<String, Map<String, String>> getTriggerMap() {
        return triggerMap;
    }

    /**
     * 
     * @param triggerMap  This dictionary contains (key, value) pairs of
     *                    (trigger ID, information map/dictionary) where the
     *                    key is a Unicode string representing a Trigger ID.
     *                    The value is another embedded dictionary containing
     *                    (key, value) pairs where the keys consist of
     *                    'table_name', 'type' and the parameter names relating
     *                    to the trigger type, e.g. *nai*, *min*, *max*. The
     *                    values are unicode strings (numeric values are also
     *                    converted to strings) representing the value of the
     *                    respective parameter. If a trigger is associated with
     *                    multiple tables, then the string value for
     *                    *table_name* contains a comma separated list of table
     *                    names.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowTriggersResponse setTriggerMap(Map<String, Map<String, String>> triggerMap) {
        this.triggerMap = (triggerMap == null) ? new LinkedHashMap<String, Map<String, String>>() : triggerMap;
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
                return this.triggerMap;

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
                this.triggerMap = (Map<String, Map<String, String>>)value;
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

        ShowTriggersResponse that = (ShowTriggersResponse)obj;

        return ( this.triggerMap.equals( that.triggerMap ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "triggerMap" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.triggerMap ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.triggerMap.hashCode();
        return hashCode;
    }

}
