/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import java.util.ArrayList;
import java.util.List;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gisfederal.gpudb.GPUdb#aggregateKMeans(AggregateKMeansRequest)}.
 */
public class AggregateKMeansResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateKMeansResponse")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("means").type().array().items().array().items().doubleType().noDefault()
                .name("counts").type().array().items().longType().noDefault()
                .name("rmsDists").type().array().items().doubleType().noDefault()
                .name("count").type().longType().noDefault()
                .name("rmsDist").type().doubleType().noDefault()
                .name("tolerance").type().doubleType().noDefault()
                .name("numIters").type().intType().noDefault()
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

    private List<List<Double>> means;
    private List<Long> counts;
    private List<Double> rmsDists;
    private long count;
    private double rmsDist;
    private double tolerance;
    private int numIters;


    /**
     * Constructs an AggregateKMeansResponse object with default parameters.
     */
    public AggregateKMeansResponse() {
    }

    /**
     * 
     * @return The k-mean values found.
     * 
     */
    public List<List<Double>> getMeans() {
        return means;
    }

    /**
     * 
     * @param means  The k-mean values found.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setMeans(List<List<Double>> means) {
        this.means = (means == null) ? new ArrayList<List<Double>>() : means;
        return this;
    }

    /**
     * 
     * @return The number of elements in the cluster closest the corresponding
     *         k-means values.
     * 
     */
    public List<Long> getCounts() {
        return counts;
    }

    /**
     * 
     * @param counts  The number of elements in the cluster closest the
     *                corresponding k-means values.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setCounts(List<Long> counts) {
        this.counts = (counts == null) ? new ArrayList<Long>() : counts;
        return this;
    }

    /**
     * 
     * @return The root mean squared distance of the elements in the cluster
     *         for each of the k-means values.
     * 
     */
    public List<Double> getRmsDists() {
        return rmsDists;
    }

    /**
     * 
     * @param rmsDists  The root mean squared distance of the elements in the
     *                  cluster for each of the k-means values.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setRmsDists(List<Double> rmsDists) {
        this.rmsDists = (rmsDists == null) ? new ArrayList<Double>() : rmsDists;
        return this;
    }

    /**
     * 
     * @return The total count of all the clusters - will be the size of the
     *         input table.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * 
     * @param count  The total count of all the clusters - will be the size of
     *               the input table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setCount(long count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return The sum of all the rms_dists - the value the k-means algorithm
     *         is attempting to minimize.
     * 
     */
    public double getRmsDist() {
        return rmsDist;
    }

    /**
     * 
     * @param rmsDist  The sum of all the rms_dists - the value the k-means
     *                 algorithm is attempting to minimize.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setRmsDist(double rmsDist) {
        this.rmsDist = rmsDist;
        return this;
    }

    /**
     * 
     * @return The distance between the last two iterations of the algorithm
     *         before it quit.
     * 
     */
    public double getTolerance() {
        return tolerance;
    }

    /**
     * 
     * @param tolerance  The distance between the last two iterations of the
     *                   algorithm before it quit.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setTolerance(double tolerance) {
        this.tolerance = tolerance;
        return this;
    }

    /**
     * 
     * @return The number of iterations the algorithm executed before it quit.
     * 
     */
    public int getNumIters() {
        return numIters;
    }

    /**
     * 
     * @param numIters  The number of iterations the algorithm executed before
     *                  it quit.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansResponse setNumIters(int numIters) {
        this.numIters = numIters;
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
                return this.means;

            case 1:
                return this.counts;

            case 2:
                return this.rmsDists;

            case 3:
                return this.count;

            case 4:
                return this.rmsDist;

            case 5:
                return this.tolerance;

            case 6:
                return this.numIters;

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
                this.means = (List<List<Double>>)value;
                break;

            case 1:
                this.counts = (List<Long>)value;
                break;

            case 2:
                this.rmsDists = (List<Double>)value;
                break;

            case 3:
                this.count = (Long)value;
                break;

            case 4:
                this.rmsDist = (Double)value;
                break;

            case 5:
                this.tolerance = (Double)value;
                break;

            case 6:
                this.numIters = (Integer)value;
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

        AggregateKMeansResponse that = (AggregateKMeansResponse)obj;

        return ( this.means.equals( that.means )
                 && this.counts.equals( that.counts )
                 && this.rmsDists.equals( that.rmsDists )
                 && ( this.count == that.count )
                 && ( (Double)this.rmsDist ).equals( (Double)that.rmsDist )
                 && ( (Double)this.tolerance ).equals( (Double)that.tolerance )
                 && ( this.numIters == that.numIters ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "means" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.means ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "counts" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.counts ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "rmsDists" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.rmsDists ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "count" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.count ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "rmsDist" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.rmsDist ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "tolerance" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.tolerance ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "numIters" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.numIters ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.means.hashCode();
        hashCode = (31 * hashCode) + this.counts.hashCode();
        hashCode = (31 * hashCode) + this.rmsDists.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.count).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.rmsDist).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.tolerance).hashCode();
        hashCode = (31 * hashCode) + this.numIters;
        return hashCode;
    }

}
