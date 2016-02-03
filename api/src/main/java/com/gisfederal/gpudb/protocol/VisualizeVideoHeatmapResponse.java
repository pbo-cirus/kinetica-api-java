/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#visualizeVideoHeatmap(VisualizeVideoHeatmapRequest)}.
 */
public class VisualizeVideoHeatmapResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("VisualizeVideoHeatmapResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("width").type().doubleType().noDefault()
                .name("height").type().doubleType().noDefault()
                .name("bgColor").type().longType().noDefault()
                .name("numFrames").type().intType().noDefault()
                .name("sessionKey").type().stringType().noDefault()
                .name("data").type().array().items().bytesType().noDefault()
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

    private double width;
    private double height;
    private long bgColor;
    private int numFrames;
    private String sessionKey;
    private List<ByteBuffer> data;


    /**
     * Constructs a VisualizeVideoHeatmapResponse object with default
     * parameters.
     */
    public VisualizeVideoHeatmapResponse() {
    }

    /**
     * 
     * @return Value of {@code width}.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * 
     * @param width  Value of {@code width}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeVideoHeatmapResponse setWidth(double width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return Value of {@code height}.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * 
     * @param height  Value of {@code height}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeVideoHeatmapResponse setHeight(double height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return Value of {@code bgColor}.
     * 
     */
    public long getBgColor() {
        return bgColor;
    }

    /**
     * 
     * @param bgColor  Value of {@code bgColor}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeVideoHeatmapResponse setBgColor(long bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    /**
     * 
     * @return Number of frames created by GPUdb for this request.
     * 
     */
    public int getNumFrames() {
        return numFrames;
    }

    /**
     * 
     * @param numFrames  Number of frames created by GPUdb for this request.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeVideoHeatmapResponse setNumFrames(int numFrames) {
        this.numFrames = numFrames;
        return this;
    }

    /**
     * 
     * @return Value of {@code sessionKey}.
     * 
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * 
     * @param sessionKey  Value of {@code sessionKey}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeVideoHeatmapResponse setSessionKey(String sessionKey) {
        this.sessionKey = (sessionKey == null) ? "" : sessionKey;
        return this;
    }
    public List<ByteBuffer> getData() {
        return data;
    }

    /**
     * 
     * @param data
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeVideoHeatmapResponse setData(List<ByteBuffer> data) {
        this.data = (data == null) ? new ArrayList<ByteBuffer>() : data;
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
                return this.width;

            case 1:
                return this.height;

            case 2:
                return this.bgColor;

            case 3:
                return this.numFrames;

            case 4:
                return this.sessionKey;

            case 5:
                return this.data;

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
                this.width = (Double)value;
                break;

            case 1:
                this.height = (Double)value;
                break;

            case 2:
                this.bgColor = (Long)value;
                break;

            case 3:
                this.numFrames = (Integer)value;
                break;

            case 4:
                this.sessionKey = (String)value;
                break;

            case 5:
                this.data = (List<ByteBuffer>)value;
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

        VisualizeVideoHeatmapResponse that = (VisualizeVideoHeatmapResponse)obj;

        return ( ( (Double)this.width ).equals( (Double)that.width )
                 && ( (Double)this.height ).equals( (Double)that.height )
                 && ( this.bgColor == that.bgColor )
                 && ( this.numFrames == that.numFrames )
                 && this.sessionKey.equals( that.sessionKey )
                 && this.data.equals( that.data ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "width" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.width ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "height" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.height ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "bgColor" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.bgColor ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "numFrames" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.numFrames ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "sessionKey" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.sessionKey ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "data" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.data ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + ((Double)this.width).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.height).hashCode();
        hashCode = (31 * hashCode) + ((Long)this.bgColor).hashCode();
        hashCode = (31 * hashCode) + this.numFrames;
        hashCode = (31 * hashCode) + this.sessionKey.hashCode();
        hashCode = (31 * hashCode) + this.data.hashCode();
        return hashCode;
    }

}
