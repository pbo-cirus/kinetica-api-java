package com.gpudb;

import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;

import java.nio.ByteBuffer;
import java.util.Map;

/**
 * Interface for objects that contain record data. Includes methods for getting
 * and setting fields by index or name and communicating with the Avro
 * framework.
 */
public interface Record extends IndexedRecord {
    /**
     * Returns the GPUdb {@link Type} of the record.
     *
     * @return the GPUdb type
     */
    Type getType();

    /**
     * Returns the Avro record schema of the record.
     *
     * @return the Avro record schema of the record
     */
    @Override
    Schema getSchema();

    /**
     * Returns the value of the specified field.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    @Override
    Object get(int index);

    /**
     * Returns the value of the specified field.
     *
     * @param name the name of the field
     * @return the value of the field, or {@code null} if no field with the
     * specified name exists
     */
    Object get(String name);

    /**
     * Returns the value of the specified field cast to a {@link ByteBuffer}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws ClassCastException        if the field is not of the correct type
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    ByteBuffer getBytes(int index);

    /**
     * Returns the value of the specified field cast to a {@link ByteBuffer}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param name the name of the field
     * @return the value of the field
     * @throws ClassCastException if the field is not of the correct type
     */
    ByteBuffer getBytes(String name);

    /**
     * Returns the value of the specified field cast to a {@link Double}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws ClassCastException        if the field is not of the correct type
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    Double getDouble(int index);

    /**
     * Returns the value of the specified field cast to a {@link Double}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param name the name of the field
     * @return the value of the field
     * @throws ClassCastException if the field is not of the correct type
     */
    Double getDouble(String name);

    /**
     * Returns the value of the specified field cast to a {@link Float}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws ClassCastException        if the field is not of the correct type
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    Float getFloat(int index);

    /**
     * Returns the value of the specified field cast to a {@link Float}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param name the name of the field
     * @return the value of the field
     * @throws ClassCastException if the field is not of the correct type
     */
    Float getFloat(String name);

    /**
     * Returns the value of the specified field cast to a {@link Integer}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws ClassCastException        if the field is not of the correct type
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    Integer getInt(int index);

    /**
     * Returns the value of the specified field cast to a {@link Integer}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param name the name of the field
     * @return the value of the field
     * @throws ClassCastException if the field is not of the correct type
     */
    Integer getInt(String name);

    /**
     * Returns the value of the specified field cast to a {@link Long}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws ClassCastException        if the field is not of the correct type
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    Long getLong(int index);

    /**
     * Returns the value of the specified field cast to a {@link Long}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param name the name of the field
     * @return the value of the field
     * @throws ClassCastException if the field is not of the correct type
     */
    Long getLong(String name);

    /**
     * Returns the value of the specified field cast to a {@link String}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param index the index of the field
     * @return the value of the field
     * @throws ClassCastException        if the field is not of the correct type
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    String getString(int index);

    /**
     * Returns the value of the specified field cast to a {@link String}.
     * If the field is not of the correct type an exception will be thrown.
     *
     * @param name the name of the field
     * @return the value of the field
     * @throws ClassCastException if the field is not of the correct type
     */
    String getString(String name);

    /**
     * Sets the value of the specified field.
     *
     * @param index the index of the field
     * @param value the new value
     * @throws IllegalArgumentException  if the field cannot be set to the
     *                                   specified value
     * @throws IndexOutOfBoundsException if the specified index is not valid
     */
    @Override
    void put(int index, Object value);

    /**
     * Sets the value of the specified field.
     *
     * @param name  the name of the field
     * @param value the new value
     * @throws IllegalArgumentException if no field exists with the specified
     *                                  name or the field cannot be set to the specified value
     */
    void put(String name, Object value);

    /**
     * Returns a {@link Map} of field names to values that is bound to the
     * record (updates made to the map are reflected in the record and vice
     * versa).
     *
     * @return the map
     */
    Map<String, Object> getDataMap();
}