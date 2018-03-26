/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#visualizeImageChart(VisualizeImageChartRequest)}.
 */
public class VisualizeImageChartResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("VisualizeImageChartResponse")
            .namespace("com.gpudb")
            .fields()
                .name("minX").type().doubleType().noDefault()
                .name("maxX").type().doubleType().noDefault()
                .name("minY").type().doubleType().noDefault()
                .name("maxY").type().doubleType().noDefault()
                .name("width").type().intType().noDefault()
                .name("height").type().intType().noDefault()
                .name("bgColor").type().stringType().noDefault()
                .name("imageData").type().bytesType().noDefault()
                .name("axesInfo").type().map().values().array().items().stringType().noDefault()
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


    /**
     * Information returned for drawing labels for the axes associated with
     * non-numeric columns.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#SORTED_X_VALUES
     * SORTED_X_VALUES}: Sorted non-numeric x column value list for drawing x
     * axis label.
     *         <li> {@link
     * com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#LOCATION_X
     * LOCATION_X}: X axis label positions of sorted_x_values in pixel
     * coordinates.
     *         <li> {@link
     * com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#SORTED_Y_VALUES
     * SORTED_Y_VALUES}: Sorted non-numeric y column value list for drawing y
     * axis label.
     *         <li> {@link
     * com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#LOCATION_Y
     * LOCATION_Y}: Y axis label positions of sorted_y_values in pixel
     * coordinates.
     * </ul>
     * A set of string constants for the parameter {@code axesInfo}.
     */
    public static final class AxesInfo {

        /**
         * Sorted non-numeric x column value list for drawing x axis label.
         */
        public static final String SORTED_X_VALUES = "sorted_x_values";

        /**
         * X axis label positions of sorted_x_values in pixel coordinates.
         */
        public static final String LOCATION_X = "location_x";

        /**
         * Sorted non-numeric y column value list for drawing y axis label.
         */
        public static final String SORTED_Y_VALUES = "sorted_y_values";

        /**
         * Y axis label positions of sorted_y_values in pixel coordinates.
         */
        public static final String LOCATION_Y = "location_y";

        private AxesInfo() {  }
    }

    private double minX;
    private double maxX;
    private double minY;
    private double maxY;
    private int width;
    private int height;
    private String bgColor;
    private ByteBuffer imageData;
    private Map<String, List<String>> axesInfo;


    /**
     * Constructs a VisualizeImageChartResponse object with default parameters.
     */
    public VisualizeImageChartResponse() {
    }

    /**
     * 
     * @return Lower bound for the x column values as provided in {@code minX}
     *         or calculated for non-numeric columns when plot_all option is
     *         used.
     * 
     */
    public double getMinX() {
        return minX;
    }

    /**
     * 
     * @param minX  Lower bound for the x column values as provided in {@code
     *              minX} or calculated for non-numeric columns when plot_all
     *              option is used.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setMinX(double minX) {
        this.minX = minX;
        return this;
    }

    /**
     * 
     * @return Upper bound for the x column values as provided in {@code maxX}
     *         or calculated for non-numeric columns when plot_all option is
     *         used.
     * 
     */
    public double getMaxX() {
        return maxX;
    }

    /**
     * 
     * @param maxX  Upper bound for the x column values as provided in {@code
     *              maxX} or calculated for non-numeric columns when plot_all
     *              option is used.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setMaxX(double maxX) {
        this.maxX = maxX;
        return this;
    }

    /**
     * 
     * @return Lower bound for the y column values as provided in {@code minY}
     *         or calculated for non-numeric columns when plot_all option is
     *         used.
     * 
     */
    public double getMinY() {
        return minY;
    }

    /**
     * 
     * @param minY  Lower bound for the y column values as provided in {@code
     *              minY} or calculated for non-numeric columns when plot_all
     *              option is used.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setMinY(double minY) {
        this.minY = minY;
        return this;
    }

    /**
     * 
     * @return Upper bound for the y column values as provided in {@code maxY}
     *         or calculated for non-numeric columns when plot_all option is
     *         used.
     * 
     */
    public double getMaxY() {
        return maxY;
    }

    /**
     * 
     * @param maxY  Upper bound for the y column values as provided in {@code
     *              maxY} or calculated for non-numeric columns when plot_all
     *              option is used.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setMaxY(double maxY) {
        this.maxY = maxY;
        return this;
    }

    /**
     * 
     * @return Width of the image as provided in {@code width}.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * 
     * @param width  Width of the image as provided in {@code width}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return Height of the image as provided in {@code height}.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * 
     * @param height  Height of the image as provided in {@code height}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return Background color of the image as provided in {@code bgColor}.
     * 
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * 
     * @param bgColor  Background color of the image as provided in {@code
     *                 bgColor}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setBgColor(String bgColor) {
        this.bgColor = (bgColor == null) ? "" : bgColor;
        return this;
    }

    /**
     * 
     * @return The generated image data.
     * 
     */
    public ByteBuffer getImageData() {
        return imageData;
    }

    /**
     * 
     * @param imageData  The generated image data.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setImageData(ByteBuffer imageData) {
        this.imageData = (imageData == null) ? ByteBuffer.wrap( new byte[0] ) : imageData;
        return this;
    }

    /**
     * 
     * @return Information returned for drawing labels for the axes associated
     *         with non-numeric columns.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#SORTED_X_VALUES
     *         SORTED_X_VALUES}: Sorted non-numeric x column value list for
     *         drawing x axis label.
     *                 <li> {@link
     *         com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#LOCATION_X
     *         LOCATION_X}: X axis label positions of sorted_x_values in pixel
     *         coordinates.
     *                 <li> {@link
     *         com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#SORTED_Y_VALUES
     *         SORTED_Y_VALUES}: Sorted non-numeric y column value list for
     *         drawing y axis label.
     *                 <li> {@link
     *         com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#LOCATION_Y
     *         LOCATION_Y}: Y axis label positions of sorted_y_values in pixel
     *         coordinates.
     *         </ul>
     * 
     */
    public Map<String, List<String>> getAxesInfo() {
        return axesInfo;
    }

    /**
     * 
     * @param axesInfo  Information returned for drawing labels for the axes
     *                  associated with non-numeric columns.
     *                  <ul>
     *                          <li> {@link
     *                  com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#SORTED_X_VALUES
     *                  SORTED_X_VALUES}: Sorted non-numeric x column value
     *                  list for drawing x axis label.
     *                          <li> {@link
     *                  com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#LOCATION_X
     *                  LOCATION_X}: X axis label positions of sorted_x_values
     *                  in pixel coordinates.
     *                          <li> {@link
     *                  com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#SORTED_Y_VALUES
     *                  SORTED_Y_VALUES}: Sorted non-numeric y column value
     *                  list for drawing y axis label.
     *                          <li> {@link
     *                  com.gpudb.protocol.VisualizeImageChartResponse.AxesInfo#LOCATION_Y
     *                  LOCATION_Y}: Y axis label positions of sorted_y_values
     *                  in pixel coordinates.
     *                  </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public VisualizeImageChartResponse setAxesInfo(Map<String, List<String>> axesInfo) {
        this.axesInfo = (axesInfo == null) ? new LinkedHashMap<String, List<String>>() : axesInfo;
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
                return this.minX;

            case 1:
                return this.maxX;

            case 2:
                return this.minY;

            case 3:
                return this.maxY;

            case 4:
                return this.width;

            case 5:
                return this.height;

            case 6:
                return this.bgColor;

            case 7:
                return this.imageData;

            case 8:
                return this.axesInfo;

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
                this.minX = (Double)value;
                break;

            case 1:
                this.maxX = (Double)value;
                break;

            case 2:
                this.minY = (Double)value;
                break;

            case 3:
                this.maxY = (Double)value;
                break;

            case 4:
                this.width = (Integer)value;
                break;

            case 5:
                this.height = (Integer)value;
                break;

            case 6:
                this.bgColor = (String)value;
                break;

            case 7:
                this.imageData = (ByteBuffer)value;
                break;

            case 8:
                this.axesInfo = (Map<String, List<String>>)value;
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

        VisualizeImageChartResponse that = (VisualizeImageChartResponse)obj;

        return ( ( (Double)this.minX ).equals( (Double)that.minX )
                 && ( (Double)this.maxX ).equals( (Double)that.maxX )
                 && ( (Double)this.minY ).equals( (Double)that.minY )
                 && ( (Double)this.maxY ).equals( (Double)that.maxY )
                 && ( this.width == that.width )
                 && ( this.height == that.height )
                 && this.bgColor.equals( that.bgColor )
                 && this.imageData.equals( that.imageData )
                 && this.axesInfo.equals( that.axesInfo ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "minX" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.minX ) );
        builder.append( ", " );
        builder.append( gd.toString( "maxX" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.maxX ) );
        builder.append( ", " );
        builder.append( gd.toString( "minY" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.minY ) );
        builder.append( ", " );
        builder.append( gd.toString( "maxY" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.maxY ) );
        builder.append( ", " );
        builder.append( gd.toString( "width" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.width ) );
        builder.append( ", " );
        builder.append( gd.toString( "height" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.height ) );
        builder.append( ", " );
        builder.append( gd.toString( "bgColor" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.bgColor ) );
        builder.append( ", " );
        builder.append( gd.toString( "imageData" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.imageData ) );
        builder.append( ", " );
        builder.append( gd.toString( "axesInfo" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.axesInfo ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + ((Double)this.minX).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.maxX).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.minY).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.maxY).hashCode();
        hashCode = (31 * hashCode) + this.width;
        hashCode = (31 * hashCode) + this.height;
        hashCode = (31 * hashCode) + this.bgColor.hashCode();
        hashCode = (31 * hashCode) + this.imageData.hashCode();
        hashCode = (31 * hashCode) + this.axesInfo.hashCode();
        return hashCode;
    }

}