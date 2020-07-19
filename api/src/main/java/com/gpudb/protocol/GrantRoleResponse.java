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
 * A set of results returned by {@link
 * com.gpudb.GPUdb#grantRole(GrantRoleRequest)}.
 */
public class GrantRoleResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("GrantRoleResponse")
            .namespace("com.gpudb")
            .fields()
            .name("role").type().stringType().noDefault()
            .name("member").type().stringType().noDefault()
            .name("info").type().map().values().stringType().noDefault()
            .endRecord();
    private String role;
    private String member;
    private Map<String, String> info;
    /**
     * Constructs a GrantRoleResponse object with default parameters.
     */
    public GrantRoleResponse() {
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
     * @return Value of {@code role}.
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role Value of {@code role}.
     * @return {@code this} to mimic the builder pattern.
     */
    public GrantRoleResponse setRole(String role) {
        this.role = (role == null) ? "" : role;
        return this;
    }

    /**
     * @return Value of {@code member}.
     */
    public String getMember() {
        return member;
    }

    /**
     * @param member Value of {@code member}.
     * @return {@code this} to mimic the builder pattern.
     */
    public GrantRoleResponse setMember(String member) {
        this.member = (member == null) ? "" : member;
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
    public GrantRoleResponse setInfo(Map<String, String> info) {
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
                return this.role;

            case 1:
                return this.member;

            case 2:
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
                this.role = (String) value;
                break;

            case 1:
                this.member = (String) value;
                break;

            case 2:
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

        GrantRoleResponse that = (GrantRoleResponse) obj;

        return (this.role.equals(that.role)
                && this.member.equals(that.member)
                && this.info.equals(that.info));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("role"));
        builder.append(": ");
        builder.append(gd.toString(this.role));
        builder.append(", ");
        builder.append(gd.toString("member"));
        builder.append(": ");
        builder.append(gd.toString(this.member));
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
        hashCode = (31 * hashCode) + this.role.hashCode();
        hashCode = (31 * hashCode) + this.member.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
