/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-4-24")
public class Transaction implements libthrift091.TBase<Transaction, Transaction._Fields>, java.io.Serializable, Cloneable, Comparable<Transaction> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Transaction");

  private static final libthrift091.protocol.TField START_TS_FIELD_DESC = new libthrift091.protocol.TField("startTs", libthrift091.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TransactionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TransactionTupleSchemeFactory());
  }

  /**
   * start时间戳
   */
  public long startTs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * start时间戳
     */
    START_TS((short)1, "startTs");

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
        case 1: // START_TS
          return START_TS;
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
  private static final int __STARTTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_TS, new libthrift091.meta_data.FieldMetaData("startTs", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Transaction.class, metaDataMap);
  }

  public Transaction() {
  }

  public Transaction(
    long startTs)
  {
    this();
    this.startTs = startTs;
    setStartTsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Transaction(Transaction other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startTs = other.startTs;
  }

  public Transaction deepCopy() {
    return new Transaction(this);
  }

  @Override
  public void clear() {
    setStartTsIsSet(false);
    this.startTs = 0;
  }

  /**
   * start时间戳
   */
  public long getStartTs() {
    return this.startTs;
  }

  /**
   * start时间戳
   */
  public Transaction setStartTs(long startTs) {
    this.startTs = startTs;
    setStartTsIsSet(true);
    return this;
  }

  public void unsetStartTs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTS_ISSET_ID);
  }

  /** Returns true if field startTs is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTs() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTS_ISSET_ID);
  }

  public void setStartTsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_TS:
      if (value == null) {
        unsetStartTs();
      } else {
        setStartTs((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TS:
      return Long.valueOf(getStartTs());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_TS:
      return isSetStartTs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Transaction)
      return this.equals((Transaction)that);
    return false;
  }

  public boolean equals(Transaction that) {
    if (that == null)
      return false;

    boolean this_present_startTs = true;
    boolean that_present_startTs = true;
    if (this_present_startTs || that_present_startTs) {
      if (!(this_present_startTs && that_present_startTs))
        return false;
      if (this.startTs != that.startTs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startTs = true;
    list.add(present_startTs);
    if (present_startTs)
      list.add(startTs);

    return list.hashCode();
  }

  @Override
  public int compareTo(Transaction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartTs()).compareTo(other.isSetStartTs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTs()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startTs, other.startTs);
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
    StringBuilder sb = new StringBuilder("Transaction(");
    boolean first = true;

    sb.append("startTs:");
    sb.append(this.startTs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TransactionStandardSchemeFactory implements SchemeFactory {
    public TransactionStandardScheme getScheme() {
      return new TransactionStandardScheme();
    }
  }

  private static class TransactionStandardScheme extends StandardScheme<Transaction> {

    public void read(libthrift091.protocol.TProtocol iprot, Transaction struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_TS
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startTs = iprot.readI64();
              struct.setStartTsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Transaction struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_TS_FIELD_DESC);
      oprot.writeI64(struct.startTs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionTupleSchemeFactory implements SchemeFactory {
    public TransactionTupleScheme getScheme() {
      return new TransactionTupleScheme();
    }
  }

  private static class TransactionTupleScheme extends TupleScheme<Transaction> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Transaction struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStartTs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStartTs()) {
        oprot.writeI64(struct.startTs);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Transaction struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.startTs = iprot.readI64();
        struct.setStartTsIsSet(true);
      }
    }
  }

}

