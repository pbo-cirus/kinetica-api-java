
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


public class CreateExternalTableResponse implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("CreateExternalTableResponse")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("typeId").type().stringType().noDefault()
                .name("countInserted").type().longType().noDefault()
                .name("countSkipped").type().longType().noDefault()
                .name("countUpdated").type().longType().noDefault()
                .name("info").type().map().values().stringType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    private String tableName;
    private String typeId;
    private long countInserted;
    private long countSkipped;
    private long countUpdated;
    private Map<String, String> info;


    public CreateExternalTableResponse() {
    }

    public String getTableName() {
        return tableName;
    }

    public CreateExternalTableResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    public String getTypeId() {
        return typeId;
    }

    public CreateExternalTableResponse setTypeId(String typeId) {
        this.typeId = (typeId == null) ? "" : typeId;
        return this;
    }

    public long getCountInserted() {
        return countInserted;
    }

    public CreateExternalTableResponse setCountInserted(long countInserted) {
        this.countInserted = countInserted;
        return this;
    }

    public long getCountSkipped() {
        return countSkipped;
    }

    public CreateExternalTableResponse setCountSkipped(long countSkipped) {
        this.countSkipped = countSkipped;
        return this;
    }

    public long getCountUpdated() {
        return countUpdated;
    }

    public CreateExternalTableResponse setCountUpdated(long countUpdated) {
        this.countUpdated = countUpdated;
        return this;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public CreateExternalTableResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
        return this;
    }

    @Override
    public Schema getSchema() {
        return schema$;
    }

    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.tableName;

            case 1:
                return this.typeId;

            case 2:
                return this.countInserted;

            case 3:
                return this.countSkipped;

            case 4:
                return this.countUpdated;

            case 5:
                return this.info;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.tableName = (String)value;
                break;

            case 1:
                this.typeId = (String)value;
                break;

            case 2:
                this.countInserted = (Long)value;
                break;

            case 3:
                this.countSkipped = (Long)value;
                break;

            case 4:
                this.countUpdated = (Long)value;
                break;

            case 5:
                this.info = (Map<String, String>)value;
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

        CreateExternalTableResponse that = (CreateExternalTableResponse)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.typeId.equals( that.typeId )
                 && ( this.countInserted == that.countInserted )
                 && ( this.countSkipped == that.countSkipped )
                 && ( this.countUpdated == that.countUpdated )
                 && this.info.equals( that.info ) );
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "typeId" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeId ) );
        builder.append( ", " );
        builder.append( gd.toString( "countInserted" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.countInserted ) );
        builder.append( ", " );
        builder.append( gd.toString( "countSkipped" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.countSkipped ) );
        builder.append( ", " );
        builder.append( gd.toString( "countUpdated" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.countUpdated ) );
        builder.append( ", " );
        builder.append( gd.toString( "info" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.info ) );
        builder.append( "}" );

        return builder.toString();
    }


    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.typeId.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.countInserted).hashCode();
        hashCode = (31 * hashCode) + ((Long)this.countSkipped).hashCode();
        hashCode = (31 * hashCode) + ((Long)this.countUpdated).hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }


}
