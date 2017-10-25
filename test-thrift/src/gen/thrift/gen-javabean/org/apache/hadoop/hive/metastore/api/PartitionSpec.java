/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-10-25")
public class PartitionSpec implements org.apache.thrift.TBase<PartitionSpec, PartitionSpec._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionSpec");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ROOT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("rootPath", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SHARED_SDPARTITION_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("sharedSDPartitionSpec", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionList", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField INSTANCE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField INSTANCE_OWNER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceOwnerName", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField INSTANCE_OWNER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceOwnerType", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionSpecTupleSchemeFactory());
  }

  public String dbName; // required
  public String tableName; // required
  public String rootPath; // required
  public PartitionSpecWithSharedSD sharedSDPartitionSpec; // optional
  public PartitionListComposingSpec partitionList; // optional
  public String instanceName; // optional
  public String instanceOwnerName; // optional
  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType instanceOwnerType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TABLE_NAME((short)2, "tableName"),
    ROOT_PATH((short)3, "rootPath"),
    SHARED_SDPARTITION_SPEC((short)4, "sharedSDPartitionSpec"),
    PARTITION_LIST((short)5, "partitionList"),
    INSTANCE_NAME((short)6, "instanceName"),
    INSTANCE_OWNER_NAME((short)7, "instanceOwnerName"),
    /**
     * 
     * @see PrincipalType
     */
    INSTANCE_OWNER_TYPE((short)8, "instanceOwnerType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // ROOT_PATH
          return ROOT_PATH;
        case 4: // SHARED_SDPARTITION_SPEC
          return SHARED_SDPARTITION_SPEC;
        case 5: // PARTITION_LIST
          return PARTITION_LIST;
        case 6: // INSTANCE_NAME
          return INSTANCE_NAME;
        case 7: // INSTANCE_OWNER_NAME
          return INSTANCE_OWNER_NAME;
        case 8: // INSTANCE_OWNER_TYPE
          return INSTANCE_OWNER_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.SHARED_SDPARTITION_SPEC,_Fields.PARTITION_LIST,_Fields.INSTANCE_NAME,_Fields.INSTANCE_OWNER_NAME,_Fields.INSTANCE_OWNER_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROOT_PATH, new org.apache.thrift.meta_data.FieldMetaData("rootPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHARED_SDPARTITION_SPEC, new org.apache.thrift.meta_data.FieldMetaData("sharedSDPartitionSpec", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PartitionSpecWithSharedSD.class)));
    tmpMap.put(_Fields.PARTITION_LIST, new org.apache.thrift.meta_data.FieldMetaData("partitionList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PartitionListComposingSpec.class)));
    tmpMap.put(_Fields.INSTANCE_NAME, new org.apache.thrift.meta_data.FieldMetaData("instanceName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INSTANCE_OWNER_NAME, new org.apache.thrift.meta_data.FieldMetaData("instanceOwnerName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INSTANCE_OWNER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("instanceOwnerType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionSpec.class, metaDataMap);
  }

  public PartitionSpec() {
    this.instanceName = "default";

  }

  public PartitionSpec(
    String dbName,
    String tableName,
    String rootPath)
  {
    this();
    this.dbName = dbName;
    this.tableName = tableName;
    this.rootPath = rootPath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionSpec(PartitionSpec other) {
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetRootPath()) {
      this.rootPath = other.rootPath;
    }
    if (other.isSetSharedSDPartitionSpec()) {
      this.sharedSDPartitionSpec = new PartitionSpecWithSharedSD(other.sharedSDPartitionSpec);
    }
    if (other.isSetPartitionList()) {
      this.partitionList = new PartitionListComposingSpec(other.partitionList);
    }
    if (other.isSetInstanceName()) {
      this.instanceName = other.instanceName;
    }
    if (other.isSetInstanceOwnerName()) {
      this.instanceOwnerName = other.instanceOwnerName;
    }
    if (other.isSetInstanceOwnerType()) {
      this.instanceOwnerType = other.instanceOwnerType;
    }
  }

  public PartitionSpec deepCopy() {
    return new PartitionSpec(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tableName = null;
    this.rootPath = null;
    this.sharedSDPartitionSpec = null;
    this.partitionList = null;
    this.instanceName = "default";

    this.instanceOwnerName = null;
    this.instanceOwnerType = null;
  }

  public String getDbName() {
    return this.dbName;
  }

  public PartitionSpec setDbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getTableName() {
    return this.tableName;
  }

  public PartitionSpec setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public String getRootPath() {
    return this.rootPath;
  }

  public PartitionSpec setRootPath(String rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  public void unsetRootPath() {
    this.rootPath = null;
  }

  /** Returns true if field rootPath is set (has been assigned a value) and false otherwise */
  public boolean isSetRootPath() {
    return this.rootPath != null;
  }

  public void setRootPathIsSet(boolean value) {
    if (!value) {
      this.rootPath = null;
    }
  }

  public PartitionSpecWithSharedSD getSharedSDPartitionSpec() {
    return this.sharedSDPartitionSpec;
  }

  public PartitionSpec setSharedSDPartitionSpec(PartitionSpecWithSharedSD sharedSDPartitionSpec) {
    this.sharedSDPartitionSpec = sharedSDPartitionSpec;
    return this;
  }

  public void unsetSharedSDPartitionSpec() {
    this.sharedSDPartitionSpec = null;
  }

  /** Returns true if field sharedSDPartitionSpec is set (has been assigned a value) and false otherwise */
  public boolean isSetSharedSDPartitionSpec() {
    return this.sharedSDPartitionSpec != null;
  }

  public void setSharedSDPartitionSpecIsSet(boolean value) {
    if (!value) {
      this.sharedSDPartitionSpec = null;
    }
  }

  public PartitionListComposingSpec getPartitionList() {
    return this.partitionList;
  }

  public PartitionSpec setPartitionList(PartitionListComposingSpec partitionList) {
    this.partitionList = partitionList;
    return this;
  }

  public void unsetPartitionList() {
    this.partitionList = null;
  }

  /** Returns true if field partitionList is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionList() {
    return this.partitionList != null;
  }

  public void setPartitionListIsSet(boolean value) {
    if (!value) {
      this.partitionList = null;
    }
  }

  public String getInstanceName() {
    return this.instanceName;
  }

  public PartitionSpec setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public void unsetInstanceName() {
    this.instanceName = null;
  }

  /** Returns true if field instanceName is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceName() {
    return this.instanceName != null;
  }

  public void setInstanceNameIsSet(boolean value) {
    if (!value) {
      this.instanceName = null;
    }
  }

  public String getInstanceOwnerName() {
    return this.instanceOwnerName;
  }

  public PartitionSpec setInstanceOwnerName(String instanceOwnerName) {
    this.instanceOwnerName = instanceOwnerName;
    return this;
  }

  public void unsetInstanceOwnerName() {
    this.instanceOwnerName = null;
  }

  /** Returns true if field instanceOwnerName is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceOwnerName() {
    return this.instanceOwnerName != null;
  }

  public void setInstanceOwnerNameIsSet(boolean value) {
    if (!value) {
      this.instanceOwnerName = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getInstanceOwnerType() {
    return this.instanceOwnerType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public PartitionSpec setInstanceOwnerType(PrincipalType instanceOwnerType) {
    this.instanceOwnerType = instanceOwnerType;
    return this;
  }

  public void unsetInstanceOwnerType() {
    this.instanceOwnerType = null;
  }

  /** Returns true if field instanceOwnerType is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceOwnerType() {
    return this.instanceOwnerType != null;
  }

  public void setInstanceOwnerTypeIsSet(boolean value) {
    if (!value) {
      this.instanceOwnerType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case ROOT_PATH:
      if (value == null) {
        unsetRootPath();
      } else {
        setRootPath((String)value);
      }
      break;

    case SHARED_SDPARTITION_SPEC:
      if (value == null) {
        unsetSharedSDPartitionSpec();
      } else {
        setSharedSDPartitionSpec((PartitionSpecWithSharedSD)value);
      }
      break;

    case PARTITION_LIST:
      if (value == null) {
        unsetPartitionList();
      } else {
        setPartitionList((PartitionListComposingSpec)value);
      }
      break;

    case INSTANCE_NAME:
      if (value == null) {
        unsetInstanceName();
      } else {
        setInstanceName((String)value);
      }
      break;

    case INSTANCE_OWNER_NAME:
      if (value == null) {
        unsetInstanceOwnerName();
      } else {
        setInstanceOwnerName((String)value);
      }
      break;

    case INSTANCE_OWNER_TYPE:
      if (value == null) {
        unsetInstanceOwnerType();
      } else {
        setInstanceOwnerType((PrincipalType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case ROOT_PATH:
      return getRootPath();

    case SHARED_SDPARTITION_SPEC:
      return getSharedSDPartitionSpec();

    case PARTITION_LIST:
      return getPartitionList();

    case INSTANCE_NAME:
      return getInstanceName();

    case INSTANCE_OWNER_NAME:
      return getInstanceOwnerName();

    case INSTANCE_OWNER_TYPE:
      return getInstanceOwnerType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case ROOT_PATH:
      return isSetRootPath();
    case SHARED_SDPARTITION_SPEC:
      return isSetSharedSDPartitionSpec();
    case PARTITION_LIST:
      return isSetPartitionList();
    case INSTANCE_NAME:
      return isSetInstanceName();
    case INSTANCE_OWNER_NAME:
      return isSetInstanceOwnerName();
    case INSTANCE_OWNER_TYPE:
      return isSetInstanceOwnerType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionSpec)
      return this.equals((PartitionSpec)that);
    return false;
  }

  public boolean equals(PartitionSpec that) {
    if (that == null)
      return false;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_rootPath = true && this.isSetRootPath();
    boolean that_present_rootPath = true && that.isSetRootPath();
    if (this_present_rootPath || that_present_rootPath) {
      if (!(this_present_rootPath && that_present_rootPath))
        return false;
      if (!this.rootPath.equals(that.rootPath))
        return false;
    }

    boolean this_present_sharedSDPartitionSpec = true && this.isSetSharedSDPartitionSpec();
    boolean that_present_sharedSDPartitionSpec = true && that.isSetSharedSDPartitionSpec();
    if (this_present_sharedSDPartitionSpec || that_present_sharedSDPartitionSpec) {
      if (!(this_present_sharedSDPartitionSpec && that_present_sharedSDPartitionSpec))
        return false;
      if (!this.sharedSDPartitionSpec.equals(that.sharedSDPartitionSpec))
        return false;
    }

    boolean this_present_partitionList = true && this.isSetPartitionList();
    boolean that_present_partitionList = true && that.isSetPartitionList();
    if (this_present_partitionList || that_present_partitionList) {
      if (!(this_present_partitionList && that_present_partitionList))
        return false;
      if (!this.partitionList.equals(that.partitionList))
        return false;
    }

    boolean this_present_instanceName = true && this.isSetInstanceName();
    boolean that_present_instanceName = true && that.isSetInstanceName();
    if (this_present_instanceName || that_present_instanceName) {
      if (!(this_present_instanceName && that_present_instanceName))
        return false;
      if (!this.instanceName.equals(that.instanceName))
        return false;
    }

    boolean this_present_instanceOwnerName = true && this.isSetInstanceOwnerName();
    boolean that_present_instanceOwnerName = true && that.isSetInstanceOwnerName();
    if (this_present_instanceOwnerName || that_present_instanceOwnerName) {
      if (!(this_present_instanceOwnerName && that_present_instanceOwnerName))
        return false;
      if (!this.instanceOwnerName.equals(that.instanceOwnerName))
        return false;
    }

    boolean this_present_instanceOwnerType = true && this.isSetInstanceOwnerType();
    boolean that_present_instanceOwnerType = true && that.isSetInstanceOwnerType();
    if (this_present_instanceOwnerType || that_present_instanceOwnerType) {
      if (!(this_present_instanceOwnerType && that_present_instanceOwnerType))
        return false;
      if (!this.instanceOwnerType.equals(that.instanceOwnerType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dbName = true && (isSetDbName());
    list.add(present_dbName);
    if (present_dbName)
      list.add(dbName);

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_rootPath = true && (isSetRootPath());
    list.add(present_rootPath);
    if (present_rootPath)
      list.add(rootPath);

    boolean present_sharedSDPartitionSpec = true && (isSetSharedSDPartitionSpec());
    list.add(present_sharedSDPartitionSpec);
    if (present_sharedSDPartitionSpec)
      list.add(sharedSDPartitionSpec);

    boolean present_partitionList = true && (isSetPartitionList());
    list.add(present_partitionList);
    if (present_partitionList)
      list.add(partitionList);

    boolean present_instanceName = true && (isSetInstanceName());
    list.add(present_instanceName);
    if (present_instanceName)
      list.add(instanceName);

    boolean present_instanceOwnerName = true && (isSetInstanceOwnerName());
    list.add(present_instanceOwnerName);
    if (present_instanceOwnerName)
      list.add(instanceOwnerName);

    boolean present_instanceOwnerType = true && (isSetInstanceOwnerType());
    list.add(present_instanceOwnerType);
    if (present_instanceOwnerType)
      list.add(instanceOwnerType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRootPath()).compareTo(other.isSetRootPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRootPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rootPath, other.rootPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSharedSDPartitionSpec()).compareTo(other.isSetSharedSDPartitionSpec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSharedSDPartitionSpec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sharedSDPartitionSpec, other.sharedSDPartitionSpec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionList()).compareTo(other.isSetPartitionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionList, other.partitionList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceName()).compareTo(other.isSetInstanceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceName, other.instanceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceOwnerName()).compareTo(other.isSetInstanceOwnerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceOwnerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceOwnerName, other.instanceOwnerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceOwnerType()).compareTo(other.isSetInstanceOwnerType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceOwnerType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceOwnerType, other.instanceOwnerType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PartitionSpec(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rootPath:");
    if (this.rootPath == null) {
      sb.append("null");
    } else {
      sb.append(this.rootPath);
    }
    first = false;
    if (isSetSharedSDPartitionSpec()) {
      if (!first) sb.append(", ");
      sb.append("sharedSDPartitionSpec:");
      if (this.sharedSDPartitionSpec == null) {
        sb.append("null");
      } else {
        sb.append(this.sharedSDPartitionSpec);
      }
      first = false;
    }
    if (isSetPartitionList()) {
      if (!first) sb.append(", ");
      sb.append("partitionList:");
      if (this.partitionList == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionList);
      }
      first = false;
    }
    if (isSetInstanceName()) {
      if (!first) sb.append(", ");
      sb.append("instanceName:");
      if (this.instanceName == null) {
        sb.append("null");
      } else {
        sb.append(this.instanceName);
      }
      first = false;
    }
    if (isSetInstanceOwnerName()) {
      if (!first) sb.append(", ");
      sb.append("instanceOwnerName:");
      if (this.instanceOwnerName == null) {
        sb.append("null");
      } else {
        sb.append(this.instanceOwnerName);
      }
      first = false;
    }
    if (isSetInstanceOwnerType()) {
      if (!first) sb.append(", ");
      sb.append("instanceOwnerType:");
      if (this.instanceOwnerType == null) {
        sb.append("null");
      } else {
        sb.append(this.instanceOwnerType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sharedSDPartitionSpec != null) {
      sharedSDPartitionSpec.validate();
    }
    if (partitionList != null) {
      partitionList.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionSpecStandardSchemeFactory implements SchemeFactory {
    public PartitionSpecStandardScheme getScheme() {
      return new PartitionSpecStandardScheme();
    }
  }

  private static class PartitionSpecStandardScheme extends StandardScheme<PartitionSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROOT_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rootPath = iprot.readString();
              struct.setRootPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SHARED_SDPARTITION_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sharedSDPartitionSpec = new PartitionSpecWithSharedSD();
              struct.sharedSDPartitionSpec.read(iprot);
              struct.setSharedSDPartitionSpecIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.partitionList = new PartitionListComposingSpec();
              struct.partitionList.read(iprot);
              struct.setPartitionListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INSTANCE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instanceName = iprot.readString();
              struct.setInstanceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // INSTANCE_OWNER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instanceOwnerName = iprot.readString();
              struct.setInstanceOwnerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // INSTANCE_OWNER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.instanceOwnerType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
              struct.setInstanceOwnerTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.rootPath != null) {
        oprot.writeFieldBegin(ROOT_PATH_FIELD_DESC);
        oprot.writeString(struct.rootPath);
        oprot.writeFieldEnd();
      }
      if (struct.sharedSDPartitionSpec != null) {
        if (struct.isSetSharedSDPartitionSpec()) {
          oprot.writeFieldBegin(SHARED_SDPARTITION_SPEC_FIELD_DESC);
          struct.sharedSDPartitionSpec.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partitionList != null) {
        if (struct.isSetPartitionList()) {
          oprot.writeFieldBegin(PARTITION_LIST_FIELD_DESC);
          struct.partitionList.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.instanceName != null) {
        if (struct.isSetInstanceName()) {
          oprot.writeFieldBegin(INSTANCE_NAME_FIELD_DESC);
          oprot.writeString(struct.instanceName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.instanceOwnerName != null) {
        if (struct.isSetInstanceOwnerName()) {
          oprot.writeFieldBegin(INSTANCE_OWNER_NAME_FIELD_DESC);
          oprot.writeString(struct.instanceOwnerName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.instanceOwnerType != null) {
        if (struct.isSetInstanceOwnerType()) {
          oprot.writeFieldBegin(INSTANCE_OWNER_TYPE_FIELD_DESC);
          oprot.writeI32(struct.instanceOwnerType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionSpecTupleSchemeFactory implements SchemeFactory {
    public PartitionSpecTupleScheme getScheme() {
      return new PartitionSpecTupleScheme();
    }
  }

  private static class PartitionSpecTupleScheme extends TupleScheme<PartitionSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDbName()) {
        optionals.set(0);
      }
      if (struct.isSetTableName()) {
        optionals.set(1);
      }
      if (struct.isSetRootPath()) {
        optionals.set(2);
      }
      if (struct.isSetSharedSDPartitionSpec()) {
        optionals.set(3);
      }
      if (struct.isSetPartitionList()) {
        optionals.set(4);
      }
      if (struct.isSetInstanceName()) {
        optionals.set(5);
      }
      if (struct.isSetInstanceOwnerName()) {
        optionals.set(6);
      }
      if (struct.isSetInstanceOwnerType()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetDbName()) {
        oprot.writeString(struct.dbName);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetRootPath()) {
        oprot.writeString(struct.rootPath);
      }
      if (struct.isSetSharedSDPartitionSpec()) {
        struct.sharedSDPartitionSpec.write(oprot);
      }
      if (struct.isSetPartitionList()) {
        struct.partitionList.write(oprot);
      }
      if (struct.isSetInstanceName()) {
        oprot.writeString(struct.instanceName);
      }
      if (struct.isSetInstanceOwnerName()) {
        oprot.writeString(struct.instanceOwnerName);
      }
      if (struct.isSetInstanceOwnerType()) {
        oprot.writeI32(struct.instanceOwnerType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.dbName = iprot.readString();
        struct.setDbNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rootPath = iprot.readString();
        struct.setRootPathIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sharedSDPartitionSpec = new PartitionSpecWithSharedSD();
        struct.sharedSDPartitionSpec.read(iprot);
        struct.setSharedSDPartitionSpecIsSet(true);
      }
      if (incoming.get(4)) {
        struct.partitionList = new PartitionListComposingSpec();
        struct.partitionList.read(iprot);
        struct.setPartitionListIsSet(true);
      }
      if (incoming.get(5)) {
        struct.instanceName = iprot.readString();
        struct.setInstanceNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.instanceOwnerName = iprot.readString();
        struct.setInstanceOwnerNameIsSet(true);
      }
      if (incoming.get(7)) {
        struct.instanceOwnerType = org.apache.hadoop.hive.metastore.api.PrincipalType.findByValue(iprot.readI32());
        struct.setInstanceOwnerTypeIsSet(true);
      }
    }
  }

}

