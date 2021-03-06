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
 * A set of parameters for {@link com.gpudb.GPUdb#killProc(KillProcRequest)}.
 * <p>
 * Kills a running proc instance.
 */
public class KillProcRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("KillProcRequest")
            .namespace("com.gpudb")
            .fields()
            .name("runId").type().stringType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String runId;
    private Map<String, String> options;

    /**
     * Constructs a KillProcRequest object with default parameters.
     */
    public KillProcRequest() {
        runId = "";
        options = new LinkedHashMap<>();
    }
    /**
     * Constructs a KillProcRequest object with the specified parameters.
     *
     * @param runId   The run ID of a running proc instance. If a proc with a
     *                matching run ID is not found or the proc instance has
     *                already completed, no procs will be killed. If not
     *                specified, all running proc instances will be killed.  The
     *                default value is ''.
     * @param options Optional parameters.
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.KillProcRequest.Options#RUN_TAG
     *                RUN_TAG}: If {@code runId} is specified, kill the proc
     *                instance that has a matching run ID and a matching run
     *                tag that was provided to {@link
     *                com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}. If
     *                {@code runId} is not specified, kill the proc
     *                instance(s) where a matching run tag was provided to
     *                {@link com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.
     *                The default value is ''.
     *                </ul>
     *                The default value is an empty {@link Map}.
     */
    public KillProcRequest(String runId, Map<String, String> options) {
        this.runId = (runId == null) ? "" : runId;
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
     * @return The run ID of a running proc instance. If a proc with a matching
     * run ID is not found or the proc instance has already completed,
     * no procs will be killed. If not specified, all running proc
     * instances will be killed.  The default value is ''.
     */
    public String getRunId() {
        return runId;
    }

    /**
     * @param runId The run ID of a running proc instance. If a proc with a
     *              matching run ID is not found or the proc instance has
     *              already completed, no procs will be killed. If not
     *              specified, all running proc instances will be killed.  The
     *              default value is ''.
     * @return {@code this} to mimic the builder pattern.
     */
    public KillProcRequest setRunId(String runId) {
        this.runId = (runId == null) ? "" : runId;
        return this;
    }

    /**
     * @return Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.KillProcRequest.Options#RUN_TAG RUN_TAG}: If
     * {@code runId} is specified, kill the proc instance that has a
     * matching run ID and a matching run tag that was provided to
     * {@link com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}. If
     * {@code runId} is not specified, kill the proc instance(s) where
     * a matching run tag was provided to {@link
     * com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.  The default
     * value is ''.
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
     *                com.gpudb.protocol.KillProcRequest.Options#RUN_TAG
     *                RUN_TAG}: If {@code runId} is specified, kill the proc
     *                instance that has a matching run ID and a matching run
     *                tag that was provided to {@link
     *                com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}. If
     *                {@code runId} is not specified, kill the proc
     *                instance(s) where a matching run tag was provided to
     *                {@link com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.
     *                The default value is ''.
     *                </ul>
     *                The default value is an empty {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public KillProcRequest setOptions(Map<String, String> options) {
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
                return this.runId;

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
                this.runId = (String) value;
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

        KillProcRequest that = (KillProcRequest) obj;

        return (this.runId.equals(that.runId)
                && this.options.equals(that.options));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("runId"));
        builder.append(": ");
        builder.append(gd.toString(this.runId));
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
        hashCode = (31 * hashCode) + this.runId.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link com.gpudb.protocol.KillProcRequest.Options#RUN_TAG
     * RUN_TAG}: If {@code runId} is specified, kill the proc instance that has
     * a matching run ID and a matching run tag that was provided to {@link
     * com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}. If {@code runId} is
     * not specified, kill the proc instance(s) where a matching run tag was
     * provided to {@link com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.
     * The default value is ''.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code runId} is specified, kill the proc instance that has a
         * matching run ID and a matching run tag that was provided to {@link
         * com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}. If {@code runId}
         * is not specified, kill the proc instance(s) where a matching run tag
         * was provided to {@link
         * com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.  The default value
         * is ''.
         */
        public static final String RUN_TAG = "run_tag";

        private Options() {
        }
    }

}
