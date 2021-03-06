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
public class ShowCompactResponseElement implements org.apache.thrift.TBase<ShowCompactResponseElement, ShowCompactResponseElement._Fields>, java.io.Serializable, Cloneable, Comparable<ShowCompactResponseElement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShowCompactResponseElement");

  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITIONNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField WORKERID_FIELD_DESC = new org.apache.thrift.protocol.TField("workerid", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField RUN_AS_FIELD_DESC = new org.apache.thrift.protocol.TField("runAs", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ShowCompactResponseElementStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ShowCompactResponseElementTupleSchemeFactory());
  }

  public String dbname; // required
  public String tablename; // required
  public String partitionname; // optional
  /**
   * 
   * @see CompactionType
   */
  public CompactionType type; // required
  public String state; // required
  public String workerid; // optional
  public long start; // optional
  public String runAs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DBNAME((short)1, "dbname"),
    TABLENAME((short)2, "tablename"),
    PARTITIONNAME((short)3, "partitionname"),
    /**
     * 
     * @see CompactionType
     */
    TYPE((short)4, "type"),
    STATE((short)5, "state"),
    WORKERID((short)6, "workerid"),
    START((short)7, "start"),
    RUN_AS((short)8, "runAs");

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
        case 1: // DBNAME
          return DBNAME;
        case 2: // TABLENAME
          return TABLENAME;
        case 3: // PARTITIONNAME
          return PARTITIONNAME;
        case 4: // TYPE
          return TYPE;
        case 5: // STATE
          return STATE;
        case 6: // WORKERID
          return WORKERID;
        case 7: // START
          return START;
        case 8: // RUN_AS
          return RUN_AS;
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
  private static final int __START_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITIONNAME,_Fields.WORKERID,_Fields.START,_Fields.RUN_AS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONNAME, new org.apache.thrift.meta_data.FieldMetaData("partitionname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CompactionType.class)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORKERID, new org.apache.thrift.meta_data.FieldMetaData("workerid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RUN_AS, new org.apache.thrift.meta_data.FieldMetaData("runAs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShowCompactResponseElement.class, metaDataMap);
  }

  public ShowCompactResponseElement() {
  }

  public ShowCompactResponseElement(
    String dbname,
    String tablename,
    CompactionType type,
    String state)
  {
    this();
    this.dbname = dbname;
    this.tablename = tablename;
    this.type = type;
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShowCompactResponseElement(ShowCompactResponseElement other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetPartitionname()) {
      this.partitionname = other.partitionname;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetWorkerid()) {
      this.workerid = other.workerid;
    }
    this.start = other.start;
    if (other.isSetRunAs()) {
      this.runAs = other.runAs;
    }
  }

  public ShowCompactResponseElement deepCopy() {
    return new ShowCompactResponseElement(this);
  }

  @Override
  public void clear() {
    this.dbname = null;
    this.tablename = null;
    this.partitionname = null;
    this.type = null;
    this.state = null;
    this.workerid = null;
    setStartIsSet(false);
    this.start = 0;
    this.runAs = null;
  }

  public String getDbname() {
    return this.dbname;
  }

  public ShowCompactResponseElement setDbname(String dbname) {
    this.dbname = dbname;
    return this;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  public String getTablename() {
    return this.tablename;
  }

  public ShowCompactResponseElement setTablename(String tablename) {
    this.tablename = tablename;
    return this;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  public String getPartitionname() {
    return this.partitionname;
  }

  public ShowCompactResponseElement setPartitionname(String partitionname) {
    this.partitionname = partitionname;
    return this;
  }

  public void unsetPartitionname() {
    this.partitionname = null;
  }

  /** Returns true if field partitionname is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionname() {
    return this.partitionname != null;
  }

  public void setPartitionnameIsSet(boolean value) {
    if (!value) {
      this.partitionname = null;
    }
  }

  /**
   * 
   * @see CompactionType
   */
  public CompactionType getType() {
    return this.type;
  }

  /**
   * 
   * @see CompactionType
   */
  public ShowCompactResponseElement setType(CompactionType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getState() {
    return this.state;
  }

  public ShowCompactResponseElement setState(String state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getWorkerid() {
    return this.workerid;
  }

  public ShowCompactResponseElement setWorkerid(String workerid) {
    this.workerid = workerid;
    return this;
  }

  public void unsetWorkerid() {
    this.workerid = null;
  }

  /** Returns true if field workerid is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerid() {
    return this.workerid != null;
  }

  public void setWorkeridIsSet(boolean value) {
    if (!value) {
      this.workerid = null;
    }
  }

  public long getStart() {
    return this.start;
  }

  public ShowCompactResponseElement setStart(long start) {
    this.start = start;
    setStartIsSet(true);
    return this;
  }

  public void unsetStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __START_ISSET_ID);
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return EncodingUtils.testBit(__isset_bitfield, __START_ISSET_ID);
  }

  public void setStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __START_ISSET_ID, value);
  }

  public String getRunAs() {
    return this.runAs;
  }

  public ShowCompactResponseElement setRunAs(String runAs) {
    this.runAs = runAs;
    return this;
  }

  public void unsetRunAs() {
    this.runAs = null;
  }

  /** Returns true if field runAs is set (has been assigned a value) and false otherwise */
  public boolean isSetRunAs() {
    return this.runAs != null;
  }

  public void setRunAsIsSet(boolean value) {
    if (!value) {
      this.runAs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((String)value);
      }
      break;

    case PARTITIONNAME:
      if (value == null) {
        unsetPartitionname();
      } else {
        setPartitionname((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((CompactionType)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((String)value);
      }
      break;

    case WORKERID:
      if (value == null) {
        unsetWorkerid();
      } else {
        setWorkerid((String)value);
      }
      break;

    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((Long)value);
      }
      break;

    case RUN_AS:
      if (value == null) {
        unsetRunAs();
      } else {
        setRunAs((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case PARTITIONNAME:
      return getPartitionname();

    case TYPE:
      return getType();

    case STATE:
      return getState();

    case WORKERID:
      return getWorkerid();

    case START:
      return getStart();

    case RUN_AS:
      return getRunAs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case PARTITIONNAME:
      return isSetPartitionname();
    case TYPE:
      return isSetType();
    case STATE:
      return isSetState();
    case WORKERID:
      return isSetWorkerid();
    case START:
      return isSetStart();
    case RUN_AS:
      return isSetRunAs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ShowCompactResponseElement)
      return this.equals((ShowCompactResponseElement)that);
    return false;
  }

  public boolean equals(ShowCompactResponseElement that) {
    if (that == null)
      return false;

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_partitionname = true && this.isSetPartitionname();
    boolean that_present_partitionname = true && that.isSetPartitionname();
    if (this_present_partitionname || that_present_partitionname) {
      if (!(this_present_partitionname && that_present_partitionname))
        return false;
      if (!this.partitionname.equals(that.partitionname))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_workerid = true && this.isSetWorkerid();
    boolean that_present_workerid = true && that.isSetWorkerid();
    if (this_present_workerid || that_present_workerid) {
      if (!(this_present_workerid && that_present_workerid))
        return false;
      if (!this.workerid.equals(that.workerid))
        return false;
    }

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (this.start != that.start)
        return false;
    }

    boolean this_present_runAs = true && this.isSetRunAs();
    boolean that_present_runAs = true && that.isSetRunAs();
    if (this_present_runAs || that_present_runAs) {
      if (!(this_present_runAs && that_present_runAs))
        return false;
      if (!this.runAs.equals(that.runAs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dbname = true && (isSetDbname());
    list.add(present_dbname);
    if (present_dbname)
      list.add(dbname);

    boolean present_tablename = true && (isSetTablename());
    list.add(present_tablename);
    if (present_tablename)
      list.add(tablename);

    boolean present_partitionname = true && (isSetPartitionname());
    list.add(present_partitionname);
    if (present_partitionname)
      list.add(partitionname);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state);

    boolean present_workerid = true && (isSetWorkerid());
    list.add(present_workerid);
    if (present_workerid)
      list.add(workerid);

    boolean present_start = true && (isSetStart());
    list.add(present_start);
    if (present_start)
      list.add(start);

    boolean present_runAs = true && (isSetRunAs());
    list.add(present_runAs);
    if (present_runAs)
      list.add(runAs);

    return list.hashCode();
  }

  @Override
  public int compareTo(ShowCompactResponseElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDbname()).compareTo(other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTablename()).compareTo(other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionname()).compareTo(other.isSetPartitionname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionname, other.partitionname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkerid()).compareTo(other.isSetWorkerid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerid, other.workerid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunAs()).compareTo(other.isSetRunAs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunAs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runAs, other.runAs);
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
    StringBuilder sb = new StringBuilder("ShowCompactResponseElement(");
    boolean first = true;

    sb.append("dbname:");
    if (this.dbname == null) {
      sb.append("null");
    } else {
      sb.append(this.dbname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tablename:");
    if (this.tablename == null) {
      sb.append("null");
    } else {
      sb.append(this.tablename);
    }
    first = false;
    if (isSetPartitionname()) {
      if (!first) sb.append(", ");
      sb.append("partitionname:");
      if (this.partitionname == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionname);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (isSetWorkerid()) {
      if (!first) sb.append(", ");
      sb.append("workerid:");
      if (this.workerid == null) {
        sb.append("null");
      } else {
        sb.append(this.workerid);
      }
      first = false;
    }
    if (isSetStart()) {
      if (!first) sb.append(", ");
      sb.append("start:");
      sb.append(this.start);
      first = false;
    }
    if (isSetRunAs()) {
      if (!first) sb.append(", ");
      sb.append("runAs:");
      if (this.runAs == null) {
        sb.append("null");
      } else {
        sb.append(this.runAs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (dbname == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbname' was not present! Struct: " + toString());
    }
    if (tablename == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablename' was not present! Struct: " + toString());
    }
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    if (state == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ShowCompactResponseElementStandardSchemeFactory implements SchemeFactory {
    public ShowCompactResponseElementStandardScheme getScheme() {
      return new ShowCompactResponseElementStandardScheme();
    }
  }

  private static class ShowCompactResponseElementStandardScheme extends StandardScheme<ShowCompactResponseElement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShowCompactResponseElement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITIONNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitionname = iprot.readString();
              struct.setPartitionnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.hadoop.hive.metastore.api.CompactionType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.state = iprot.readString();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WORKERID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.workerid = iprot.readString();
              struct.setWorkeridIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start = iprot.readI64();
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // RUN_AS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.runAs = iprot.readString();
              struct.setRunAsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShowCompactResponseElement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbname != null) {
        oprot.writeFieldBegin(DBNAME_FIELD_DESC);
        oprot.writeString(struct.dbname);
        oprot.writeFieldEnd();
      }
      if (struct.tablename != null) {
        oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
        oprot.writeString(struct.tablename);
        oprot.writeFieldEnd();
      }
      if (struct.partitionname != null) {
        if (struct.isSetPartitionname()) {
          oprot.writeFieldBegin(PARTITIONNAME_FIELD_DESC);
          oprot.writeString(struct.partitionname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeString(struct.state);
        oprot.writeFieldEnd();
      }
      if (struct.workerid != null) {
        if (struct.isSetWorkerid()) {
          oprot.writeFieldBegin(WORKERID_FIELD_DESC);
          oprot.writeString(struct.workerid);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStart()) {
        oprot.writeFieldBegin(START_FIELD_DESC);
        oprot.writeI64(struct.start);
        oprot.writeFieldEnd();
      }
      if (struct.runAs != null) {
        if (struct.isSetRunAs()) {
          oprot.writeFieldBegin(RUN_AS_FIELD_DESC);
          oprot.writeString(struct.runAs);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShowCompactResponseElementTupleSchemeFactory implements SchemeFactory {
    public ShowCompactResponseElementTupleScheme getScheme() {
      return new ShowCompactResponseElementTupleScheme();
    }
  }

  private static class ShowCompactResponseElementTupleScheme extends TupleScheme<ShowCompactResponseElement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShowCompactResponseElement struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dbname);
      oprot.writeString(struct.tablename);
      oprot.writeI32(struct.type.getValue());
      oprot.writeString(struct.state);
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionname()) {
        optionals.set(0);
      }
      if (struct.isSetWorkerid()) {
        optionals.set(1);
      }
      if (struct.isSetStart()) {
        optionals.set(2);
      }
      if (struct.isSetRunAs()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPartitionname()) {
        oprot.writeString(struct.partitionname);
      }
      if (struct.isSetWorkerid()) {
        oprot.writeString(struct.workerid);
      }
      if (struct.isSetStart()) {
        oprot.writeI64(struct.start);
      }
      if (struct.isSetRunAs()) {
        oprot.writeString(struct.runAs);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShowCompactResponseElement struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dbname = iprot.readString();
      struct.setDbnameIsSet(true);
      struct.tablename = iprot.readString();
      struct.setTablenameIsSet(true);
      struct.type = org.apache.hadoop.hive.metastore.api.CompactionType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.state = iprot.readString();
      struct.setStateIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.partitionname = iprot.readString();
        struct.setPartitionnameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.workerid = iprot.readString();
        struct.setWorkeridIsSet(true);
      }
      if (incoming.get(2)) {
        struct.start = iprot.readI64();
        struct.setStartIsSet(true);
      }
      if (incoming.get(3)) {
        struct.runAs = iprot.readString();
        struct.setRunAsIsSet(true);
      }
    }
  }

}

