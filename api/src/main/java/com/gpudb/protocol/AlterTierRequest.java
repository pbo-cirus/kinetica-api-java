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


/**
 * A set of parameters for {@link com.gpudb.GPUdb#alterTier(AlterTierRequest)}.
 * <p>
 * Alters properties of an exisiting <a
 * href="../../../../../rm/concepts.html#storage-tiers" target="_top">tier</a>
 * to facilitate <a href="../../../../../rm/concepts.html"
 * target="_top">resource management</a>.
 * <p>
 * To disable <a
 * href="../../../../../rm/concepts.html#watermark-based-eviction"
 * target="_top">watermark-based eviction</a>, set both {@code high_watermark}
 * and {@code low_watermark} to 100.
 */
public class AlterTierRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AlterTierRequest")
            .namespace("com.gpudb")
            .fields()
            .name("name").type().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String name;
    private Map<String, String> options;

    /**
     * Constructs an AlterTierRequest object with default parameters.
     */
    public AlterTierRequest() {
        name = "";
        options = new LinkedHashMap<>();
    }
    /**
     * Constructs an AlterTierRequest object with the specified parameters.
     *
     * @param name    Name of the tier to be altered. Must be an existing tier
     *                group name.
     * @param options Optional parameters.
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.AlterTierRequest.Options#CAPACITY
     *                CAPACITY}: Maximum size in bytes this tier may hold at
     *                once.
     *                        <li> {@link
     *                com.gpudb.protocol.AlterTierRequest.Options#HIGH_WATERMARK
     *                HIGH_WATERMARK}: Threshold of usage of this tier's
     *                resource that, once exceeded, will trigger
     *                watermark-based eviction from this tier.
     *                        <li> {@link
     *                com.gpudb.protocol.AlterTierRequest.Options#LOW_WATERMARK
     *                LOW_WATERMARK}: Threshold of resource usage that, once
     *                fallen below after crossing the {@code high_watermark},
     *                will cease watermark-based eviction from this tier.
     *                </ul>
     *                The default value is an empty {@link Map}.
     */
    public AlterTierRequest(String name, Map<String, String> options) {
        this.name = (name == null) ? "" : name;
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
     * @return Name of the tier to be altered. Must be an existing tier group
     * name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Name of the tier to be altered. Must be an existing tier
     *             group name.
     * @return {@code this} to mimic the builder pattern.
     */
    public AlterTierRequest setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * @return Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterTierRequest.Options#CAPACITY CAPACITY}:
     * Maximum size in bytes this tier may hold at once.
     *         <li> {@link
     * com.gpudb.protocol.AlterTierRequest.Options#HIGH_WATERMARK
     * HIGH_WATERMARK}: Threshold of usage of this tier's resource
     * that, once exceeded, will trigger watermark-based eviction from
     * this tier.
     *         <li> {@link
     * com.gpudb.protocol.AlterTierRequest.Options#LOW_WATERMARK
     * LOW_WATERMARK}: Threshold of resource usage that, once fallen
     * below after crossing the {@code high_watermark}, will cease
     * watermark-based eviction from this tier.
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
     *                com.gpudb.protocol.AlterTierRequest.Options#CAPACITY
     *                CAPACITY}: Maximum size in bytes this tier may hold at
     *                once.
     *                        <li> {@link
     *                com.gpudb.protocol.AlterTierRequest.Options#HIGH_WATERMARK
     *                HIGH_WATERMARK}: Threshold of usage of this tier's
     *                resource that, once exceeded, will trigger
     *                watermark-based eviction from this tier.
     *                        <li> {@link
     *                com.gpudb.protocol.AlterTierRequest.Options#LOW_WATERMARK
     *                LOW_WATERMARK}: Threshold of resource usage that, once
     *                fallen below after crossing the {@code high_watermark},
     *                will cease watermark-based eviction from this tier.
     *                </ul>
     *                The default value is an empty {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public AlterTierRequest setOptions(Map<String, String> options) {
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
                return this.name;

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
                this.name = (String) value;
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

        AlterTierRequest that = (AlterTierRequest) obj;

        return (this.name.equals(that.name)
                && this.options.equals(that.options));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("name"));
        builder.append(": ");
        builder.append(gd.toString(this.name));
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link com.gpudb.protocol.AlterTierRequest.Options#CAPACITY
     * CAPACITY}: Maximum size in bytes this tier may hold at once.
     *         <li> {@link
     * com.gpudb.protocol.AlterTierRequest.Options#HIGH_WATERMARK
     * HIGH_WATERMARK}: Threshold of usage of this tier's resource that, once
     * exceeded, will trigger watermark-based eviction from this tier.
     *         <li> {@link
     * com.gpudb.protocol.AlterTierRequest.Options#LOW_WATERMARK
     * LOW_WATERMARK}: Threshold of resource usage that, once fallen below
     * after crossing the {@code high_watermark}, will cease watermark-based
     * eviction from this tier.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Maximum size in bytes this tier may hold at once.
         */
        public static final String CAPACITY = "capacity";

        /**
         * Threshold of usage of this tier's resource that, once exceeded, will
         * trigger watermark-based eviction from this tier.
         */
        public static final String HIGH_WATERMARK = "high_watermark";

        /**
         * Threshold of resource usage that, once fallen below after crossing
         * the {@code high_watermark}, will cease watermark-based eviction from
         * this tier.
         */
        public static final String LOW_WATERMARK = "low_watermark";

        private Options() {
        }
    }

}
