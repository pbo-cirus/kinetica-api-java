/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#clearTable(ClearTableRequest)}.
 */
public class ClearTableResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ClearTableResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("status").type().stringType().noDefault()
                .name("tableName").type().stringType().noDefault()
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

    private String status;
    private String tableName;


    /**
     * Constructs a ClearTableResponse object with default parameters.
     */
    public ClearTableResponse() {
    }

    /**
     * 
     * @return Returns ``TABLE CLEARED`` along with the table name if the table
     *         or all tables were cleared successfully.  This field is not
     *         present if an error is encountered while clearing the table such
     *         as the table is not found or the table or the collection is
     *         protected in which case the *status* in the *status_info* is set
     *         to 'ERROR'
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status  Returns ``TABLE CLEARED`` along with the table name if
     *                the table or all tables were cleared successfully.  This
     *                field is not present if an error is encountered while
     *                clearing the table such as the table is not found or the
     *                table or the collection is protected in which case the
     *                *status* in the *status_info* is set to 'ERROR'
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ClearTableResponse setStatus(String status) {
        this.status = (status == null) ? "" : status;
        return this;
    }

    /**
     * 
     * @return Value of {@code tableName} prefixed with 'TABLE_NAME CLEARED:',
     *         or 'ALL CLEARED' in case of clearing all sets.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Value of {@code tableName} prefixed with 'TABLE_NAME
     *                   CLEARED:', or 'ALL CLEARED' in case of clearing all
     *                   sets.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ClearTableResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
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
                return this.status;

            case 1:
                return this.tableName;

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
                this.status = (String)value;
                break;

            case 1:
                this.tableName = (String)value;
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

        ClearTableResponse that = (ClearTableResponse)obj;

        return ( this.status.equals( that.status )
                 && this.tableName.equals( that.tableName ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "status" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.status ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "tableName" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.tableName ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.status.hashCode();
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        return hashCode;
    }

}
