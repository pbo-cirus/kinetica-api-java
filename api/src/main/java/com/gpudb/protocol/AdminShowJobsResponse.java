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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#adminShowJobs(AdminShowJobsRequest)}.
 */
public class AdminShowJobsResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminShowJobsResponse")
            .namespace("com.gpudb")
            .fields()
            .name("jobId").type().array().items().longType().noDefault()
            .name("status").type().array().items().stringType().noDefault()
            .name("endpointName").type().array().items().stringType().noDefault()
            .name("timeReceived").type().array().items().longType().noDefault()
            .name("authId").type().array().items().stringType().noDefault()
            .name("sourceIp").type().array().items().stringType().noDefault()
            .name("userData").type().array().items().stringType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private List<Long> jobId;
    private List<String> status;
    private List<String> endpointName;
    private List<Long> timeReceived;
    private List<String> authId;
    private List<String> sourceIp;
    private List<String> userData;
    private Map<String, String> info;
    /**
     * Constructs an AdminShowJobsResponse object with default parameters.
     */
    public AdminShowJobsResponse() {
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

    public List<Long> getJobId() {
        return jobId;
    }

    /**
     * @param jobId
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setJobId(List<Long> jobId) {
        this.jobId = (jobId == null) ? new ArrayList<Long>() : jobId;
        return this;
    }

    public List<String> getStatus() {
        return status;
    }

    /**
     * @param status
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setStatus(List<String> status) {
        this.status = (status == null) ? new ArrayList<String>() : status;
        return this;
    }

    public List<String> getEndpointName() {
        return endpointName;
    }

    /**
     * @param endpointName
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setEndpointName(List<String> endpointName) {
        this.endpointName = (endpointName == null) ? new ArrayList<String>() : endpointName;
        return this;
    }

    public List<Long> getTimeReceived() {
        return timeReceived;
    }

    /**
     * @param timeReceived
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setTimeReceived(List<Long> timeReceived) {
        this.timeReceived = (timeReceived == null) ? new ArrayList<Long>() : timeReceived;
        return this;
    }

    public List<String> getAuthId() {
        return authId;
    }

    /**
     * @param authId
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setAuthId(List<String> authId) {
        this.authId = (authId == null) ? new ArrayList<String>() : authId;
        return this;
    }

    public List<String> getSourceIp() {
        return sourceIp;
    }

    /**
     * @param sourceIp
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setSourceIp(List<String> sourceIp) {
        this.sourceIp = (sourceIp == null) ? new ArrayList<String>() : sourceIp;
        return this;
    }

    public List<String> getUserData() {
        return userData;
    }

    /**
     * @param userData
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setUserData(List<String> userData) {
        this.userData = (userData == null) ? new ArrayList<String>() : userData;
        return this;
    }

    /**
     * @return Additional information.
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * @param info Additional information.
     * @return {@code this} to mimic the builder pattern.
     */
    public AdminShowJobsResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
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
                return this.jobId;

            case 1:
                return this.status;

            case 2:
                return this.endpointName;

            case 3:
                return this.timeReceived;

            case 4:
                return this.authId;

            case 5:
                return this.sourceIp;

            case 6:
                return this.userData;

            case 7:
                return this.info;

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
                this.jobId = (List<Long>) value;
                break;

            case 1:
                this.status = (List<String>) value;
                break;

            case 2:
                this.endpointName = (List<String>) value;
                break;

            case 3:
                this.timeReceived = (List<Long>) value;
                break;

            case 4:
                this.authId = (List<String>) value;
                break;

            case 5:
                this.sourceIp = (List<String>) value;
                break;

            case 6:
                this.userData = (List<String>) value;
                break;

            case 7:
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

        AdminShowJobsResponse that = (AdminShowJobsResponse) obj;

        return (this.jobId.equals(that.jobId)
                && this.status.equals(that.status)
                && this.endpointName.equals(that.endpointName)
                && this.timeReceived.equals(that.timeReceived)
                && this.authId.equals(that.authId)
                && this.sourceIp.equals(that.sourceIp)
                && this.userData.equals(that.userData)
                && this.info.equals(that.info));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("jobId"));
        builder.append(": ");
        builder.append(gd.toString(this.jobId));
        builder.append(", ");
        builder.append(gd.toString("status"));
        builder.append(": ");
        builder.append(gd.toString(this.status));
        builder.append(", ");
        builder.append(gd.toString("endpointName"));
        builder.append(": ");
        builder.append(gd.toString(this.endpointName));
        builder.append(", ");
        builder.append(gd.toString("timeReceived"));
        builder.append(": ");
        builder.append(gd.toString(this.timeReceived));
        builder.append(", ");
        builder.append(gd.toString("authId"));
        builder.append(": ");
        builder.append(gd.toString(this.authId));
        builder.append(", ");
        builder.append(gd.toString("sourceIp"));
        builder.append(": ");
        builder.append(gd.toString(this.sourceIp));
        builder.append(", ");
        builder.append(gd.toString("userData"));
        builder.append(": ");
        builder.append(gd.toString(this.userData));
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
        hashCode = (31 * hashCode) + this.jobId.hashCode();
        hashCode = (31 * hashCode) + this.status.hashCode();
        hashCode = (31 * hashCode) + this.endpointName.hashCode();
        hashCode = (31 * hashCode) + this.timeReceived.hashCode();
        hashCode = (31 * hashCode) + this.authId.hashCode();
        hashCode = (31 * hashCode) + this.sourceIp.hashCode();
        hashCode = (31 * hashCode) + this.userData.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
