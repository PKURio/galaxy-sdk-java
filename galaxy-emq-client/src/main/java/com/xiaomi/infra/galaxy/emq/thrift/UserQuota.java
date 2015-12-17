/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
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
/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: haxiaolin@xiaomi.com
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-17")
public class UserQuota implements libthrift091.TBase<UserQuota, UserQuota._Fields>, java.io.Serializable, Cloneable, Comparable<UserQuota> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("UserQuota");

  private static final libthrift091.protocol.TField THROUGHPUT_FIELD_DESC = new libthrift091.protocol.TField("throughput", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField MAX_QUEUE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("maxQueueNumber", libthrift091.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserQuotaTupleSchemeFactory());
  }

  /**
   * The restriction of user throughput;
   *  
   */
  public com.xiaomi.infra.galaxy.emq.thrift.Throughput throughput; // optional
  /**
   * The maximum number of queues owned by one user;
   *  
   */
  public long maxQueueNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The restriction of user throughput;
     *  
     */
    THROUGHPUT((short)1, "throughput"),
    /**
     * The maximum number of queues owned by one user;
     *  
     */
    MAX_QUEUE_NUMBER((short)2, "maxQueueNumber");

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
        case 1: // THROUGHPUT
          return THROUGHPUT;
        case 2: // MAX_QUEUE_NUMBER
          return MAX_QUEUE_NUMBER;
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
  private static final int __MAXQUEUENUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.THROUGHPUT,_Fields.MAX_QUEUE_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THROUGHPUT, new libthrift091.meta_data.FieldMetaData("throughput", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.emq.thrift.Throughput.class)));
    tmpMap.put(_Fields.MAX_QUEUE_NUMBER, new libthrift091.meta_data.FieldMetaData("maxQueueNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(UserQuota.class, metaDataMap);
  }

  public UserQuota() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserQuota(UserQuota other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetThroughput()) {
      this.throughput = new com.xiaomi.infra.galaxy.emq.thrift.Throughput(other.throughput);
    }
    this.maxQueueNumber = other.maxQueueNumber;
  }

  public UserQuota deepCopy() {
    return new UserQuota(this);
  }

  @Override
  public void clear() {
    this.throughput = null;
    setMaxQueueNumberIsSet(false);
    this.maxQueueNumber = 0;
  }

  /**
   * The restriction of user throughput;
   *  
   */
  public com.xiaomi.infra.galaxy.emq.thrift.Throughput getThroughput() {
    return this.throughput;
  }

  /**
   * The restriction of user throughput;
   *  
   */
  public UserQuota setThroughput(com.xiaomi.infra.galaxy.emq.thrift.Throughput throughput) {
    this.throughput = throughput;
    return this;
  }

  public void unsetThroughput() {
    this.throughput = null;
  }

  /** Returns true if field throughput is set (has been assigned a value) and false otherwise */
  public boolean isSetThroughput() {
    return this.throughput != null;
  }

  public void setThroughputIsSet(boolean value) {
    if (!value) {
      this.throughput = null;
    }
  }

  /**
   * The maximum number of queues owned by one user;
   *  
   */
  public long getMaxQueueNumber() {
    return this.maxQueueNumber;
  }

  /**
   * The maximum number of queues owned by one user;
   *  
   */
  public UserQuota setMaxQueueNumber(long maxQueueNumber) {
    this.maxQueueNumber = maxQueueNumber;
    setMaxQueueNumberIsSet(true);
    return this;
  }

  public void unsetMaxQueueNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXQUEUENUMBER_ISSET_ID);
  }

  /** Returns true if field maxQueueNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxQueueNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXQUEUENUMBER_ISSET_ID);
  }

  public void setMaxQueueNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXQUEUENUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case THROUGHPUT:
      if (value == null) {
        unsetThroughput();
      } else {
        setThroughput((com.xiaomi.infra.galaxy.emq.thrift.Throughput)value);
      }
      break;

    case MAX_QUEUE_NUMBER:
      if (value == null) {
        unsetMaxQueueNumber();
      } else {
        setMaxQueueNumber((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THROUGHPUT:
      return getThroughput();

    case MAX_QUEUE_NUMBER:
      return Long.valueOf(getMaxQueueNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case THROUGHPUT:
      return isSetThroughput();
    case MAX_QUEUE_NUMBER:
      return isSetMaxQueueNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserQuota)
      return this.equals((UserQuota)that);
    return false;
  }

  public boolean equals(UserQuota that) {
    if (that == null)
      return false;

    boolean this_present_throughput = true && this.isSetThroughput();
    boolean that_present_throughput = true && that.isSetThroughput();
    if (this_present_throughput || that_present_throughput) {
      if (!(this_present_throughput && that_present_throughput))
        return false;
      if (!this.throughput.equals(that.throughput))
        return false;
    }

    boolean this_present_maxQueueNumber = true && this.isSetMaxQueueNumber();
    boolean that_present_maxQueueNumber = true && that.isSetMaxQueueNumber();
    if (this_present_maxQueueNumber || that_present_maxQueueNumber) {
      if (!(this_present_maxQueueNumber && that_present_maxQueueNumber))
        return false;
      if (this.maxQueueNumber != that.maxQueueNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_throughput = true && (isSetThroughput());
    list.add(present_throughput);
    if (present_throughput)
      list.add(throughput);

    boolean present_maxQueueNumber = true && (isSetMaxQueueNumber());
    list.add(present_maxQueueNumber);
    if (present_maxQueueNumber)
      list.add(maxQueueNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetThroughput()).compareTo(other.isSetThroughput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThroughput()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throughput, other.throughput);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxQueueNumber()).compareTo(other.isSetMaxQueueNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxQueueNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxQueueNumber, other.maxQueueNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserQuota(");
    boolean first = true;

    if (isSetThroughput()) {
      sb.append("throughput:");
      if (this.throughput == null) {
        sb.append("null");
      } else {
        sb.append(this.throughput);
      }
      first = false;
    }
    if (isSetMaxQueueNumber()) {
      if (!first) sb.append(", ");
      sb.append("maxQueueNumber:");
      sb.append(this.maxQueueNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (throughput != null) {
      throughput.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserQuotaStandardSchemeFactory implements SchemeFactory {
    public UserQuotaStandardScheme getScheme() {
      return new UserQuotaStandardScheme();
    }
  }

  private static class UserQuotaStandardScheme extends StandardScheme<UserQuota> {

    public void read(libthrift091.protocol.TProtocol iprot, UserQuota struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THROUGHPUT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.throughput = new com.xiaomi.infra.galaxy.emq.thrift.Throughput();
              struct.throughput.read(iprot);
              struct.setThroughputIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_QUEUE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.maxQueueNumber = iprot.readI64();
              struct.setMaxQueueNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, UserQuota struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.throughput != null) {
        if (struct.isSetThroughput()) {
          oprot.writeFieldBegin(THROUGHPUT_FIELD_DESC);
          struct.throughput.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMaxQueueNumber()) {
        oprot.writeFieldBegin(MAX_QUEUE_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.maxQueueNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserQuotaTupleSchemeFactory implements SchemeFactory {
    public UserQuotaTupleScheme getScheme() {
      return new UserQuotaTupleScheme();
    }
  }

  private static class UserQuotaTupleScheme extends TupleScheme<UserQuota> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, UserQuota struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetThroughput()) {
        optionals.set(0);
      }
      if (struct.isSetMaxQueueNumber()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetThroughput()) {
        struct.throughput.write(oprot);
      }
      if (struct.isSetMaxQueueNumber()) {
        oprot.writeI64(struct.maxQueueNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, UserQuota struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.throughput = new com.xiaomi.infra.galaxy.emq.thrift.Throughput();
        struct.throughput.read(iprot);
        struct.setThroughputIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxQueueNumber = iprot.readI64();
        struct.setMaxQueueNumberIsSet(true);
      }
    }
  }

}
