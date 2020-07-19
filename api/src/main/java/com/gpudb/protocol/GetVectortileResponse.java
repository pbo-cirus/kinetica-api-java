
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


public class GetVectortileResponse implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("GetVectortileResponse")
            .namespace("com.gpudb")
            .fields()
            .name("encodedData").type().stringType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private String encodedData;
    private Map<String, String> info;
    public GetVectortileResponse() {
    }

    public static Schema getClassSchema() {
        return schema$;
    }

    public String getEncodedData() {
        return encodedData;
    }

    public GetVectortileResponse setEncodedData(String encodedData) {
        this.encodedData = (encodedData == null) ? "" : encodedData;
        return this;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public GetVectortileResponse setInfo(Map<String, String> info) {
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
                return this.encodedData;

            case 1:
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
                this.encodedData = (String) value;
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

        GetVectortileResponse that = (GetVectortileResponse) obj;

        return (this.encodedData.equals(that.encodedData)
                && this.info.equals(that.info));
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("encodedData"));
        builder.append(": ");
        builder.append(gd.toString(this.encodedData));
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
        hashCode = (31 * hashCode) + this.encodedData.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }


}
