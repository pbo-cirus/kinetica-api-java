/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link com.gpudb.GPUdb#createUnion(CreateUnionRequest)}.
 * <br />
 * <br />Creates a table that is the union of one or more existing tables.
 */
public class CreateUnionRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateUnionRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("tableNames").type().array().items().stringType().noDefault()
                .name("inputColumnNames").type().array().items().array().items().stringType().noDefault()
                .name("outputColumnNames").type().array().items().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }


    /**
     * Optional parameters.
     * <br /><ul>
     * <br />  <li> collection_name: Name of a collection which is to contain the union. If empty, then the union will be a
     * top-level table.
     * <br />  <li> mode: If 'merge_views' then this operation will merge (i.e. union) the provided views. All 'table_names' must be
     * views from the same underlying base table. Values: normal, merge_views.
     * <br />
     * <br /></ul>
     * <br />A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of a collection which is to contain the union. If empty, then the union will be a top-level table.
         */
        public static final String COLLECTION_NAME = "collection_name";

        /**
         * If 'merge_views' then this operation will merge (i.e. union) the provided views. All 'table_names' must be views from the
         * same underlying base table. Values: normal, merge_views.
         * <br />
         */
        public static final String MODE = "mode";

        /**
         * Normal operation.
         */
        public static final String NORMAL = "normal";

        /**
         * Merge (union) 2 or more views of the same base table into a new view.
         */
        public static final String MERGE_VIEWS = "merge_views";

        private Options() {  }
    }

    private String tableName;
    private List<String> tableNames;
    private List<List<String>> inputColumnNames;
    private List<String> outputColumnNames;
    private Map<String, String> options;


    /**
     * Constructs a CreateUnionRequest object with default parameters.
     */
    public CreateUnionRequest() {
        tableName = "";
        tableNames = new ArrayList<>();
        inputColumnNames = new ArrayList<>();
        outputColumnNames = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateUnionRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table to be created. Must not be the name of a currently existing GPUdb table. Cannot be an
     *                   empty string.
     * @param tableNames  The list of table names making up the union. Must contain the names of one or more existing tables.
     * @param inputColumnNames  The list of columns from each of the corresponding input tables.
     * @param outputColumnNames  The list of names of the columns to be stored in the union.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> collection_name: Name of a collection which is to contain the union. If empty, then the union
     *                 will be a top-level table.
     *                         <li> mode: If 'merge_views' then this operation will merge (i.e. union) the provided views. All
     *                 'table_names' must be views from the same underlying base table. Values: normal, merge_views.
     *                 </ul>
     * 
     */
    public CreateUnionRequest(String tableName, List<String> tableNames, List<List<String>> inputColumnNames, List<String> outputColumnNames, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        this.inputColumnNames = (inputColumnNames == null) ? new ArrayList<List<String>>() : inputColumnNames;
        this.outputColumnNames = (outputColumnNames == null) ? new ArrayList<String>() : outputColumnNames;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table to be created. Must not be the name of a currently existing GPUdb table. Cannot be an empty string.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table to be created. Must not be the name of a currently existing GPUdb table. Cannot be an
     *                   empty string.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUnionRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return The list of table names making up the union. Must contain the names of one or more existing tables.
     * 
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * 
     * @param tableNames  The list of table names making up the union. Must contain the names of one or more existing tables.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUnionRequest setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * 
     * @return The list of columns from each of the corresponding input tables.
     * 
     */
    public List<List<String>> getInputColumnNames() {
        return inputColumnNames;
    }

    /**
     * 
     * @param inputColumnNames  The list of columns from each of the corresponding input tables.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUnionRequest setInputColumnNames(List<List<String>> inputColumnNames) {
        this.inputColumnNames = (inputColumnNames == null) ? new ArrayList<List<String>>() : inputColumnNames;
        return this;
    }

    /**
     * 
     * @return The list of names of the columns to be stored in the union.
     * 
     */
    public List<String> getOutputColumnNames() {
        return outputColumnNames;
    }

    /**
     * 
     * @param outputColumnNames  The list of names of the columns to be stored in the union.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUnionRequest setOutputColumnNames(List<String> outputColumnNames) {
        this.outputColumnNames = (outputColumnNames == null) ? new ArrayList<String>() : outputColumnNames;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> collection_name: Name of a collection which is to contain the union. If empty, then the union will be a
     *         top-level table.
     *                 <li> mode: If 'merge_views' then this operation will merge (i.e. union) the provided views. All 'table_names'
     *         must be views from the same underlying base table. Values: normal, merge_views.
     *         </ul>
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> collection_name: Name of a collection which is to contain the union. If empty, then the union
     *                 will be a top-level table.
     *                         <li> mode: If 'merge_views' then this operation will merge (i.e. union) the provided views. All
     *                 'table_names' must be views from the same underlying base table. Values: normal, merge_views.
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUnionRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                return this.tableName;

            case 1:
                return this.tableNames;

            case 2:
                return this.inputColumnNames;

            case 3:
                return this.outputColumnNames;

            case 4:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                this.tableName = (String)value;
                break;

            case 1:
                this.tableNames = (List<String>)value;
                break;

            case 2:
                this.inputColumnNames = (List<List<String>>)value;
                break;

            case 3:
                this.outputColumnNames = (List<String>)value;
                break;

            case 4:
                this.options = (Map<String, String>)value;
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

        CreateUnionRequest that = (CreateUnionRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.tableNames.equals( that.tableNames )
                 && this.inputColumnNames.equals( that.inputColumnNames )
                 && this.outputColumnNames.equals( that.outputColumnNames )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "tableNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "inputColumnNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.inputColumnNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "outputColumnNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.outputColumnNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "options" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.options ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.inputColumnNames.hashCode();
        hashCode = (31 * hashCode) + this.outputColumnNames.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
