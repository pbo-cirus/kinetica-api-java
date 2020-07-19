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
 * A set of parameters for {@link
 * com.gpudb.GPUdb#createTriggerByArea(CreateTriggerByAreaRequest)}.
 * <p>
 * Sets up an area trigger mechanism for two column_names for one or more
 * tables. (This function is essentially the two-dimensional version of {@link
 * com.gpudb.GPUdb#createTriggerByRange(CreateTriggerByRangeRequest)}.) Once
 * the trigger has been activated, any record added to the listed tables(s) via
 * {@link com.gpudb.GPUdb#insertRecordsRaw(RawInsertRecordsRequest)} with the
 * chosen columns' values falling within the specified region will trip the
 * trigger. All such records will be queued at the trigger port (by default
 * '9001' but able to be retrieved via {@link
 * com.gpudb.GPUdb#showSystemStatus(ShowSystemStatusRequest)}) for any
 * listening client to collect. Active triggers can be cancelled by using the
 * {@link com.gpudb.GPUdb#clearTrigger(ClearTriggerRequest)} endpoint or by
 * clearing all relevant tables.
 * <p>
 * The output returns the trigger handle as well as indicating success or
 * failure of the trigger activation.
 */
public class CreateTriggerByAreaRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateTriggerByAreaRequest")
            .namespace("com.gpudb")
            .fields()
            .name("requestId").type().stringType().noDefault()
            .name("tableNames").type().array().items().stringType().noDefault()
            .name("xColumnName").type().stringType().noDefault()
            .name("xVector").type().array().items().doubleType().noDefault()
            .name("yColumnName").type().stringType().noDefault()
            .name("yVector").type().array().items().doubleType().noDefault()
            .name("options").type().map().values().stringType().noDefault()
            .endRecord();
    private String requestId;
    private List<String> tableNames;
    private String xColumnName;
    private List<Double> xVector;
    private String yColumnName;
    private List<Double> yVector;
    private Map<String, String> options;
    /**
     * Constructs a CreateTriggerByAreaRequest object with default parameters.
     */
    public CreateTriggerByAreaRequest() {
        requestId = "";
        tableNames = new ArrayList<>();
        xColumnName = "";
        xVector = new ArrayList<>();
        yColumnName = "";
        yVector = new ArrayList<>();
        options = new LinkedHashMap<>();
    }


    /**
     * Constructs a CreateTriggerByAreaRequest object with the specified
     * parameters.
     *
     * @param requestId   User-created ID for the trigger. The ID can be
     *                    alphanumeric, contain symbols, and must contain at
     *                    least one character.
     * @param tableNames  Names of the tables on which the trigger will be
     *                    activated and maintained.
     * @param xColumnName Name of a numeric column on which the trigger is
     *                    activated. Usually 'x' for geospatial data points.
     * @param xVector     The respective coordinate values for the region on which
     *                    the trigger is activated. This usually translates to the
     *                    x-coordinates of a geospatial region.
     * @param yColumnName Name of a second numeric column on which the trigger
     *                    is activated. Usually 'y' for geospatial data
     *                    points.
     * @param yVector     The respective coordinate values for the region on which
     *                    the trigger is activated. This usually translates to the
     *                    y-coordinates of a geospatial region. Must be the same
     *                    length as xvals.
     * @param options     Optional parameters.  The default value is an empty
     *                    {@link Map}.
     */
    public CreateTriggerByAreaRequest(String requestId, List<String> tableNames, String xColumnName, List<Double> xVector, String yColumnName, List<Double> yVector, Map<String, String> options) {
        this.requestId = (requestId == null) ? "" : requestId;
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        this.xVector = (xVector == null) ? new ArrayList<Double>() : xVector;
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        this.yVector = (yVector == null) ? new ArrayList<Double>() : yVector;
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
     * @return User-created ID for the trigger. The ID can be alphanumeric,
     * contain symbols, and must contain at least one character.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId User-created ID for the trigger. The ID can be
     *                  alphanumeric, contain symbols, and must contain at
     *                  least one character.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setRequestId(String requestId) {
        this.requestId = (requestId == null) ? "" : requestId;
        return this;
    }

    /**
     * @return Names of the tables on which the trigger will be activated and
     * maintained.
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * @param tableNames Names of the tables on which the trigger will be
     *                   activated and maintained.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * @return Name of a numeric column on which the trigger is activated.
     * Usually 'x' for geospatial data points.
     */
    public String getXColumnName() {
        return xColumnName;
    }

    /**
     * @param xColumnName Name of a numeric column on which the trigger is
     *                    activated. Usually 'x' for geospatial data points.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setXColumnName(String xColumnName) {
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        return this;
    }

    /**
     * @return The respective coordinate values for the region on which the
     * trigger is activated. This usually translates to the
     * x-coordinates of a geospatial region.
     */
    public List<Double> getXVector() {
        return xVector;
    }

    /**
     * @param xVector The respective coordinate values for the region on which
     *                the trigger is activated. This usually translates to the
     *                x-coordinates of a geospatial region.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setXVector(List<Double> xVector) {
        this.xVector = (xVector == null) ? new ArrayList<Double>() : xVector;
        return this;
    }

    /**
     * @return Name of a second numeric column on which the trigger is
     * activated. Usually 'y' for geospatial data points.
     */
    public String getYColumnName() {
        return yColumnName;
    }

    /**
     * @param yColumnName Name of a second numeric column on which the trigger
     *                    is activated. Usually 'y' for geospatial data
     *                    points.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setYColumnName(String yColumnName) {
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        return this;
    }

    /**
     * @return The respective coordinate values for the region on which the
     * trigger is activated. This usually translates to the
     * y-coordinates of a geospatial region. Must be the same length as
     * xvals.
     */
    public List<Double> getYVector() {
        return yVector;
    }

    /**
     * @param yVector The respective coordinate values for the region on which
     *                the trigger is activated. This usually translates to the
     *                y-coordinates of a geospatial region. Must be the same
     *                length as xvals.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setYVector(List<Double> yVector) {
        this.yVector = (yVector == null) ? new ArrayList<Double>() : yVector;
        return this;
    }

    /**
     * @return Optional parameters.  The default value is an empty {@link Map}.
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * @param options Optional parameters.  The default value is an empty
     *                {@link Map}.
     * @return {@code this} to mimic the builder pattern.
     */
    public CreateTriggerByAreaRequest setOptions(Map<String, String> options) {
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
                return this.requestId;

            case 1:
                return this.tableNames;

            case 2:
                return this.xColumnName;

            case 3:
                return this.xVector;

            case 4:
                return this.yColumnName;

            case 5:
                return this.yVector;

            case 6:
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
                this.requestId = (String) value;
                break;

            case 1:
                this.tableNames = (List<String>) value;
                break;

            case 2:
                this.xColumnName = (String) value;
                break;

            case 3:
                this.xVector = (List<Double>) value;
                break;

            case 4:
                this.yColumnName = (String) value;
                break;

            case 5:
                this.yVector = (List<Double>) value;
                break;

            case 6:
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

        CreateTriggerByAreaRequest that = (CreateTriggerByAreaRequest) obj;

        return (this.requestId.equals(that.requestId)
                && this.tableNames.equals(that.tableNames)
                && this.xColumnName.equals(that.xColumnName)
                && this.xVector.equals(that.xVector)
                && this.yColumnName.equals(that.yColumnName)
                && this.yVector.equals(that.yVector)
                && this.options.equals(that.options));
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(gd.toString("requestId"));
        builder.append(": ");
        builder.append(gd.toString(this.requestId));
        builder.append(", ");
        builder.append(gd.toString("tableNames"));
        builder.append(": ");
        builder.append(gd.toString(this.tableNames));
        builder.append(", ");
        builder.append(gd.toString("xColumnName"));
        builder.append(": ");
        builder.append(gd.toString(this.xColumnName));
        builder.append(", ");
        builder.append(gd.toString("xVector"));
        builder.append(": ");
        builder.append(gd.toString(this.xVector));
        builder.append(", ");
        builder.append(gd.toString("yColumnName"));
        builder.append(": ");
        builder.append(gd.toString(this.yColumnName));
        builder.append(", ");
        builder.append(gd.toString("yVector"));
        builder.append(": ");
        builder.append(gd.toString(this.yVector));
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
        hashCode = (31 * hashCode) + this.requestId.hashCode();
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.xColumnName.hashCode();
        hashCode = (31 * hashCode) + this.xVector.hashCode();
        hashCode = (31 * hashCode) + this.yColumnName.hashCode();
        hashCode = (31 * hashCode) + this.yVector.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
