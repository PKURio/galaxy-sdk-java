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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-28")
public class ChangeMessageVisibilityBatchRequestEntry implements libthrift091.TBase<ChangeMessageVisibilityBatchRequestEntry, ChangeMessageVisibilityBatchRequestEntry._Fields>, java.io.Serializable, Cloneable, Comparable<ChangeMessageVisibilityBatchRequestEntry> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ChangeMessageVisibilityBatchRequestEntry");

  private static final libthrift091.protocol.TField RECEIPT_HANDLE_FIELD_DESC = new libthrift091.protocol.TField("receiptHandle", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField INVISIBILITY_SECONDS_FIELD_DESC = new libthrift091.protocol.TField("invisibilitySeconds", libthrift091.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChangeMessageVisibilityBatchRequestEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChangeMessageVisibilityBatchRequestEntryTupleSchemeFactory());
  }

  /**
   * receiptHandle for change visibility;
   * 
   */
  public String receiptHandle; // required
  /**
   * The extra invisibilitySeconds for this message (0s ~ 12hour)
   * 
   */
  public int invisibilitySeconds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * receiptHandle for change visibility;
     * 
     */
    RECEIPT_HANDLE((short)1, "receiptHandle"),
    /**
     * The extra invisibilitySeconds for this message (0s ~ 12hour)
     * 
     */
    INVISIBILITY_SECONDS((short)2, "invisibilitySeconds");

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
        case 1: // RECEIPT_HANDLE
          return RECEIPT_HANDLE;
        case 2: // INVISIBILITY_SECONDS
          return INVISIBILITY_SECONDS;
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
  private static final int __INVISIBILITYSECONDS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECEIPT_HANDLE, new libthrift091.meta_data.FieldMetaData("receiptHandle", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.INVISIBILITY_SECONDS, new libthrift091.meta_data.FieldMetaData("invisibilitySeconds", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ChangeMessageVisibilityBatchRequestEntry.class, metaDataMap);
  }

  public ChangeMessageVisibilityBatchRequestEntry() {
  }

  public ChangeMessageVisibilityBatchRequestEntry(
    String receiptHandle,
    int invisibilitySeconds)
  {
    this();
    this.receiptHandle = receiptHandle;
    this.invisibilitySeconds = invisibilitySeconds;
    setInvisibilitySecondsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChangeMessageVisibilityBatchRequestEntry(ChangeMessageVisibilityBatchRequestEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetReceiptHandle()) {
      this.receiptHandle = other.receiptHandle;
    }
    this.invisibilitySeconds = other.invisibilitySeconds;
  }

  public ChangeMessageVisibilityBatchRequestEntry deepCopy() {
    return new ChangeMessageVisibilityBatchRequestEntry(this);
  }

  @Override
  public void clear() {
    this.receiptHandle = null;
    setInvisibilitySecondsIsSet(false);
    this.invisibilitySeconds = 0;
  }

  /**
   * receiptHandle for change visibility;
   * 
   */
  public String getReceiptHandle() {
    return this.receiptHandle;
  }

  /**
   * receiptHandle for change visibility;
   * 
   */
  public ChangeMessageVisibilityBatchRequestEntry setReceiptHandle(String receiptHandle) {
    this.receiptHandle = receiptHandle;
    return this;
  }

  public void unsetReceiptHandle() {
    this.receiptHandle = null;
  }

  /** Returns true if field receiptHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiptHandle() {
    return this.receiptHandle != null;
  }

  public void setReceiptHandleIsSet(boolean value) {
    if (!value) {
      this.receiptHandle = null;
    }
  }

  /**
   * The extra invisibilitySeconds for this message (0s ~ 12hour)
   * 
   */
  public int getInvisibilitySeconds() {
    return this.invisibilitySeconds;
  }

  /**
   * The extra invisibilitySeconds for this message (0s ~ 12hour)
   * 
   */
  public ChangeMessageVisibilityBatchRequestEntry setInvisibilitySeconds(int invisibilitySeconds) {
    this.invisibilitySeconds = invisibilitySeconds;
    setInvisibilitySecondsIsSet(true);
    return this;
  }

  public void unsetInvisibilitySeconds() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INVISIBILITYSECONDS_ISSET_ID);
  }

  /** Returns true if field invisibilitySeconds is set (has been assigned a value) and false otherwise */
  public boolean isSetInvisibilitySeconds() {
    return EncodingUtils.testBit(__isset_bitfield, __INVISIBILITYSECONDS_ISSET_ID);
  }

  public void setInvisibilitySecondsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INVISIBILITYSECONDS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECEIPT_HANDLE:
      if (value == null) {
        unsetReceiptHandle();
      } else {
        setReceiptHandle((String)value);
      }
      break;

    case INVISIBILITY_SECONDS:
      if (value == null) {
        unsetInvisibilitySeconds();
      } else {
        setInvisibilitySeconds((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECEIPT_HANDLE:
      return getReceiptHandle();

    case INVISIBILITY_SECONDS:
      return Integer.valueOf(getInvisibilitySeconds());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECEIPT_HANDLE:
      return isSetReceiptHandle();
    case INVISIBILITY_SECONDS:
      return isSetInvisibilitySeconds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChangeMessageVisibilityBatchRequestEntry)
      return this.equals((ChangeMessageVisibilityBatchRequestEntry)that);
    return false;
  }

  public boolean equals(ChangeMessageVisibilityBatchRequestEntry that) {
    if (that == null)
      return false;

    boolean this_present_receiptHandle = true && this.isSetReceiptHandle();
    boolean that_present_receiptHandle = true && that.isSetReceiptHandle();
    if (this_present_receiptHandle || that_present_receiptHandle) {
      if (!(this_present_receiptHandle && that_present_receiptHandle))
        return false;
      if (!this.receiptHandle.equals(that.receiptHandle))
        return false;
    }

    boolean this_present_invisibilitySeconds = true;
    boolean that_present_invisibilitySeconds = true;
    if (this_present_invisibilitySeconds || that_present_invisibilitySeconds) {
      if (!(this_present_invisibilitySeconds && that_present_invisibilitySeconds))
        return false;
      if (this.invisibilitySeconds != that.invisibilitySeconds)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_receiptHandle = true && (isSetReceiptHandle());
    list.add(present_receiptHandle);
    if (present_receiptHandle)
      list.add(receiptHandle);

    boolean present_invisibilitySeconds = true;
    list.add(present_invisibilitySeconds);
    if (present_invisibilitySeconds)
      list.add(invisibilitySeconds);

    return list.hashCode();
  }

  @Override
  public int compareTo(ChangeMessageVisibilityBatchRequestEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReceiptHandle()).compareTo(other.isSetReceiptHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiptHandle()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.receiptHandle, other.receiptHandle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvisibilitySeconds()).compareTo(other.isSetInvisibilitySeconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvisibilitySeconds()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.invisibilitySeconds, other.invisibilitySeconds);
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
    StringBuilder sb = new StringBuilder("ChangeMessageVisibilityBatchRequestEntry(");
    boolean first = true;

    sb.append("receiptHandle:");
    if (this.receiptHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.receiptHandle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invisibilitySeconds:");
    sb.append(this.invisibilitySeconds);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (receiptHandle == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'receiptHandle' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'invisibilitySeconds' because it's a primitive and you chose the non-beans generator.
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

  private static class ChangeMessageVisibilityBatchRequestEntryStandardSchemeFactory implements SchemeFactory {
    public ChangeMessageVisibilityBatchRequestEntryStandardScheme getScheme() {
      return new ChangeMessageVisibilityBatchRequestEntryStandardScheme();
    }
  }

  private static class ChangeMessageVisibilityBatchRequestEntryStandardScheme extends StandardScheme<ChangeMessageVisibilityBatchRequestEntry> {

    public void read(libthrift091.protocol.TProtocol iprot, ChangeMessageVisibilityBatchRequestEntry struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECEIPT_HANDLE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.receiptHandle = iprot.readString();
              struct.setReceiptHandleIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INVISIBILITY_SECONDS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.invisibilitySeconds = iprot.readI32();
              struct.setInvisibilitySecondsIsSet(true);
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
      if (!struct.isSetInvisibilitySeconds()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'invisibilitySeconds' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, ChangeMessageVisibilityBatchRequestEntry struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.receiptHandle != null) {
        oprot.writeFieldBegin(RECEIPT_HANDLE_FIELD_DESC);
        oprot.writeString(struct.receiptHandle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INVISIBILITY_SECONDS_FIELD_DESC);
      oprot.writeI32(struct.invisibilitySeconds);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChangeMessageVisibilityBatchRequestEntryTupleSchemeFactory implements SchemeFactory {
    public ChangeMessageVisibilityBatchRequestEntryTupleScheme getScheme() {
      return new ChangeMessageVisibilityBatchRequestEntryTupleScheme();
    }
  }

  private static class ChangeMessageVisibilityBatchRequestEntryTupleScheme extends TupleScheme<ChangeMessageVisibilityBatchRequestEntry> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ChangeMessageVisibilityBatchRequestEntry struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.receiptHandle);
      oprot.writeI32(struct.invisibilitySeconds);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ChangeMessageVisibilityBatchRequestEntry struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.receiptHandle = iprot.readString();
      struct.setReceiptHandleIsSet(true);
      struct.invisibilitySeconds = iprot.readI32();
      struct.setInvisibilitySecondsIsSet(true);
    }
  }

}

