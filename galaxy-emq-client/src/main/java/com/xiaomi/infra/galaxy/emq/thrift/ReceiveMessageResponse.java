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
public class ReceiveMessageResponse implements libthrift091.TBase<ReceiveMessageResponse, ReceiveMessageResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ReceiveMessageResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ReceiveMessageResponse");

  private static final libthrift091.protocol.TField MESSAGE_ID_FIELD_DESC = new libthrift091.protocol.TField("messageID", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField RECEIPT_HANDLE_FIELD_DESC = new libthrift091.protocol.TField("receiptHandle", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField MESSAGE_BODY_FIELD_DESC = new libthrift091.protocol.TField("messageBody", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("attributes", libthrift091.protocol.TType.MAP, (short)4);
  private static final libthrift091.protocol.TField MESSAGE_ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("messageAttributes", libthrift091.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReceiveMessageResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReceiveMessageResponseTupleSchemeFactory());
  }

  /**
   * MessageID for the received message;
   * 
   */
  public String messageID; // required
  /**
   * Receipt Handle for the received message
   * Using when change visibility time/delete message
   * 
   */
  public String receiptHandle; // required
  /**
   * Message body for the received message;
   * 
   */
  public String messageBody; // required
  /**
   * Attributes of message, including:
   * - senderId
   * - messageLength
   * - md5OfBody
   * - sendTimestamp
   * - receiveTimestamp
   * - firstReceiveTimestamp
   * - receiveCount
   * 
   * If the message is received from a dead letter queue,
   * it has another four attributes:
   * - sourceQueueName
   * - sourceTag
   * - deadTimestamp
   * - originalMessageID
   * - originalReceiveCount
   * 
   * If the message has been set topic
   * - topic
   * 
   */
  public Map<String,String> attributes; // optional
  /**
   * User-defined attributes attached to message
   * 
   */
  public Map<String,MessageAttribute> messageAttributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * MessageID for the received message;
     * 
     */
    MESSAGE_ID((short)1, "messageID"),
    /**
     * Receipt Handle for the received message
     * Using when change visibility time/delete message
     * 
     */
    RECEIPT_HANDLE((short)2, "receiptHandle"),
    /**
     * Message body for the received message;
     * 
     */
    MESSAGE_BODY((short)3, "messageBody"),
    /**
     * Attributes of message, including:
     * - senderId
     * - messageLength
     * - md5OfBody
     * - sendTimestamp
     * - receiveTimestamp
     * - firstReceiveTimestamp
     * - receiveCount
     * 
     * If the message is received from a dead letter queue,
     * it has another four attributes:
     * - sourceQueueName
     * - sourceTag
     * - deadTimestamp
     * - originalMessageID
     * - originalReceiveCount
     * 
     * If the message has been set topic
     * - topic
     * 
     */
    ATTRIBUTES((short)4, "attributes"),
    /**
     * User-defined attributes attached to message
     * 
     */
    MESSAGE_ATTRIBUTES((short)5, "messageAttributes");

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
        case 1: // MESSAGE_ID
          return MESSAGE_ID;
        case 2: // RECEIPT_HANDLE
          return RECEIPT_HANDLE;
        case 3: // MESSAGE_BODY
          return MESSAGE_BODY;
        case 4: // ATTRIBUTES
          return ATTRIBUTES;
        case 5: // MESSAGE_ATTRIBUTES
          return MESSAGE_ATTRIBUTES;
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
  private static final _Fields optionals[] = {_Fields.ATTRIBUTES,_Fields.MESSAGE_ATTRIBUTES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE_ID, new libthrift091.meta_data.FieldMetaData("messageID", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECEIPT_HANDLE, new libthrift091.meta_data.FieldMetaData("receiptHandle", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_BODY, new libthrift091.meta_data.FieldMetaData("messageBody", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("attributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.MESSAGE_ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("messageAttributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MessageAttribute.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ReceiveMessageResponse.class, metaDataMap);
  }

  public ReceiveMessageResponse() {
  }

  public ReceiveMessageResponse(
    String messageID,
    String receiptHandle,
    String messageBody)
  {
    this();
    this.messageID = messageID;
    this.receiptHandle = receiptHandle;
    this.messageBody = messageBody;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReceiveMessageResponse(ReceiveMessageResponse other) {
    if (other.isSetMessageID()) {
      this.messageID = other.messageID;
    }
    if (other.isSetReceiptHandle()) {
      this.receiptHandle = other.receiptHandle;
    }
    if (other.isSetMessageBody()) {
      this.messageBody = other.messageBody;
    }
    if (other.isSetAttributes()) {
      Map<String,String> __this__attributes = new HashMap<String,String>(other.attributes);
      this.attributes = __this__attributes;
    }
    if (other.isSetMessageAttributes()) {
      Map<String,MessageAttribute> __this__messageAttributes = new HashMap<String,MessageAttribute>(other.messageAttributes.size());
      for (Map.Entry<String, MessageAttribute> other_element : other.messageAttributes.entrySet()) {

        String other_element_key = other_element.getKey();
        MessageAttribute other_element_value = other_element.getValue();

        String __this__messageAttributes_copy_key = other_element_key;

        MessageAttribute __this__messageAttributes_copy_value = new MessageAttribute(other_element_value);

        __this__messageAttributes.put(__this__messageAttributes_copy_key, __this__messageAttributes_copy_value);
      }
      this.messageAttributes = __this__messageAttributes;
    }
  }

  public ReceiveMessageResponse deepCopy() {
    return new ReceiveMessageResponse(this);
  }

  @Override
  public void clear() {
    this.messageID = null;
    this.receiptHandle = null;
    this.messageBody = null;
    this.attributes = null;
    this.messageAttributes = null;
  }

  /**
   * MessageID for the received message;
   * 
   */
  public String getMessageID() {
    return this.messageID;
  }

  /**
   * MessageID for the received message;
   * 
   */
  public ReceiveMessageResponse setMessageID(String messageID) {
    this.messageID = messageID;
    return this;
  }

  public void unsetMessageID() {
    this.messageID = null;
  }

  /** Returns true if field messageID is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageID() {
    return this.messageID != null;
  }

  public void setMessageIDIsSet(boolean value) {
    if (!value) {
      this.messageID = null;
    }
  }

  /**
   * Receipt Handle for the received message
   * Using when change visibility time/delete message
   * 
   */
  public String getReceiptHandle() {
    return this.receiptHandle;
  }

  /**
   * Receipt Handle for the received message
   * Using when change visibility time/delete message
   * 
   */
  public ReceiveMessageResponse setReceiptHandle(String receiptHandle) {
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
   * Message body for the received message;
   * 
   */
  public String getMessageBody() {
    return this.messageBody;
  }

  /**
   * Message body for the received message;
   * 
   */
  public ReceiveMessageResponse setMessageBody(String messageBody) {
    this.messageBody = messageBody;
    return this;
  }

  public void unsetMessageBody() {
    this.messageBody = null;
  }

  /** Returns true if field messageBody is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBody() {
    return this.messageBody != null;
  }

  public void setMessageBodyIsSet(boolean value) {
    if (!value) {
      this.messageBody = null;
    }
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public void putToAttributes(String key, String val) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String,String>();
    }
    this.attributes.put(key, val);
  }

  /**
   * Attributes of message, including:
   * - senderId
   * - messageLength
   * - md5OfBody
   * - sendTimestamp
   * - receiveTimestamp
   * - firstReceiveTimestamp
   * - receiveCount
   * 
   * If the message is received from a dead letter queue,
   * it has another four attributes:
   * - sourceQueueName
   * - sourceTag
   * - deadTimestamp
   * - originalMessageID
   * - originalReceiveCount
   * 
   * If the message has been set topic
   * - topic
   * 
   */
  public Map<String,String> getAttributes() {
    return this.attributes;
  }

  /**
   * Attributes of message, including:
   * - senderId
   * - messageLength
   * - md5OfBody
   * - sendTimestamp
   * - receiveTimestamp
   * - firstReceiveTimestamp
   * - receiveCount
   * 
   * If the message is received from a dead letter queue,
   * it has another four attributes:
   * - sourceQueueName
   * - sourceTag
   * - deadTimestamp
   * - originalMessageID
   * - originalReceiveCount
   * 
   * If the message has been set topic
   * - topic
   * 
   */
  public ReceiveMessageResponse setAttributes(Map<String,String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  public int getMessageAttributesSize() {
    return (this.messageAttributes == null) ? 0 : this.messageAttributes.size();
  }

  public void putToMessageAttributes(String key, MessageAttribute val) {
    if (this.messageAttributes == null) {
      this.messageAttributes = new HashMap<String,MessageAttribute>();
    }
    this.messageAttributes.put(key, val);
  }

  /**
   * User-defined attributes attached to message
   * 
   */
  public Map<String,MessageAttribute> getMessageAttributes() {
    return this.messageAttributes;
  }

  /**
   * User-defined attributes attached to message
   * 
   */
  public ReceiveMessageResponse setMessageAttributes(Map<String,MessageAttribute> messageAttributes) {
    this.messageAttributes = messageAttributes;
    return this;
  }

  public void unsetMessageAttributes() {
    this.messageAttributes = null;
  }

  /** Returns true if field messageAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageAttributes() {
    return this.messageAttributes != null;
  }

  public void setMessageAttributesIsSet(boolean value) {
    if (!value) {
      this.messageAttributes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE_ID:
      if (value == null) {
        unsetMessageID();
      } else {
        setMessageID((String)value);
      }
      break;

    case RECEIPT_HANDLE:
      if (value == null) {
        unsetReceiptHandle();
      } else {
        setReceiptHandle((String)value);
      }
      break;

    case MESSAGE_BODY:
      if (value == null) {
        unsetMessageBody();
      } else {
        setMessageBody((String)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((Map<String,String>)value);
      }
      break;

    case MESSAGE_ATTRIBUTES:
      if (value == null) {
        unsetMessageAttributes();
      } else {
        setMessageAttributes((Map<String,MessageAttribute>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_ID:
      return getMessageID();

    case RECEIPT_HANDLE:
      return getReceiptHandle();

    case MESSAGE_BODY:
      return getMessageBody();

    case ATTRIBUTES:
      return getAttributes();

    case MESSAGE_ATTRIBUTES:
      return getMessageAttributes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE_ID:
      return isSetMessageID();
    case RECEIPT_HANDLE:
      return isSetReceiptHandle();
    case MESSAGE_BODY:
      return isSetMessageBody();
    case ATTRIBUTES:
      return isSetAttributes();
    case MESSAGE_ATTRIBUTES:
      return isSetMessageAttributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReceiveMessageResponse)
      return this.equals((ReceiveMessageResponse)that);
    return false;
  }

  public boolean equals(ReceiveMessageResponse that) {
    if (that == null)
      return false;

    boolean this_present_messageID = true && this.isSetMessageID();
    boolean that_present_messageID = true && that.isSetMessageID();
    if (this_present_messageID || that_present_messageID) {
      if (!(this_present_messageID && that_present_messageID))
        return false;
      if (!this.messageID.equals(that.messageID))
        return false;
    }

    boolean this_present_receiptHandle = true && this.isSetReceiptHandle();
    boolean that_present_receiptHandle = true && that.isSetReceiptHandle();
    if (this_present_receiptHandle || that_present_receiptHandle) {
      if (!(this_present_receiptHandle && that_present_receiptHandle))
        return false;
      if (!this.receiptHandle.equals(that.receiptHandle))
        return false;
    }

    boolean this_present_messageBody = true && this.isSetMessageBody();
    boolean that_present_messageBody = true && that.isSetMessageBody();
    if (this_present_messageBody || that_present_messageBody) {
      if (!(this_present_messageBody && that_present_messageBody))
        return false;
      if (!this.messageBody.equals(that.messageBody))
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_messageAttributes = true && this.isSetMessageAttributes();
    boolean that_present_messageAttributes = true && that.isSetMessageAttributes();
    if (this_present_messageAttributes || that_present_messageAttributes) {
      if (!(this_present_messageAttributes && that_present_messageAttributes))
        return false;
      if (!this.messageAttributes.equals(that.messageAttributes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_messageID = true && (isSetMessageID());
    list.add(present_messageID);
    if (present_messageID)
      list.add(messageID);

    boolean present_receiptHandle = true && (isSetReceiptHandle());
    list.add(present_receiptHandle);
    if (present_receiptHandle)
      list.add(receiptHandle);

    boolean present_messageBody = true && (isSetMessageBody());
    list.add(present_messageBody);
    if (present_messageBody)
      list.add(messageBody);

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    boolean present_messageAttributes = true && (isSetMessageAttributes());
    list.add(present_messageAttributes);
    if (present_messageAttributes)
      list.add(messageAttributes);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReceiveMessageResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMessageID()).compareTo(other.isSetMessageID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageID()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageID, other.messageID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetMessageBody()).compareTo(other.isSetMessageBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBody()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBody, other.messageBody);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageAttributes()).compareTo(other.isSetMessageAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageAttributes, other.messageAttributes);
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
    StringBuilder sb = new StringBuilder("ReceiveMessageResponse(");
    boolean first = true;

    sb.append("messageID:");
    if (this.messageID == null) {
      sb.append("null");
    } else {
      sb.append(this.messageID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiptHandle:");
    if (this.receiptHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.receiptHandle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBody:");
    if (this.messageBody == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBody);
    }
    first = false;
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    if (isSetMessageAttributes()) {
      if (!first) sb.append(", ");
      sb.append("messageAttributes:");
      if (this.messageAttributes == null) {
        sb.append("null");
      } else {
        sb.append(this.messageAttributes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (messageID == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messageID' was not present! Struct: " + toString());
    }
    if (receiptHandle == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'receiptHandle' was not present! Struct: " + toString());
    }
    if (messageBody == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messageBody' was not present! Struct: " + toString());
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReceiveMessageResponseStandardSchemeFactory implements SchemeFactory {
    public ReceiveMessageResponseStandardScheme getScheme() {
      return new ReceiveMessageResponseStandardScheme();
    }
  }

  private static class ReceiveMessageResponseStandardScheme extends StandardScheme<ReceiveMessageResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ReceiveMessageResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.messageID = iprot.readString();
              struct.setMessageIDIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECEIPT_HANDLE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.receiptHandle = iprot.readString();
              struct.setReceiptHandleIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE_BODY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.messageBody = iprot.readString();
              struct.setMessageBodyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map44 = iprot.readMapBegin();
                struct.attributes = new HashMap<String,String>(2*_map44.size);
                String _key45;
                String _val46;
                for (int _i47 = 0; _i47 < _map44.size; ++_i47)
                {
                  _key45 = iprot.readString();
                  _val46 = iprot.readString();
                  struct.attributes.put(_key45, _val46);
                }
                iprot.readMapEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MESSAGE_ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map48 = iprot.readMapBegin();
                struct.messageAttributes = new HashMap<String,MessageAttribute>(2*_map48.size);
                String _key49;
                MessageAttribute _val50;
                for (int _i51 = 0; _i51 < _map48.size; ++_i51)
                {
                  _key49 = iprot.readString();
                  _val50 = new MessageAttribute();
                  _val50.read(iprot);
                  struct.messageAttributes.put(_key49, _val50);
                }
                iprot.readMapEnd();
              }
              struct.setMessageAttributesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ReceiveMessageResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.messageID != null) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.messageID);
        oprot.writeFieldEnd();
      }
      if (struct.receiptHandle != null) {
        oprot.writeFieldBegin(RECEIPT_HANDLE_FIELD_DESC);
        oprot.writeString(struct.receiptHandle);
        oprot.writeFieldEnd();
      }
      if (struct.messageBody != null) {
        oprot.writeFieldBegin(MESSAGE_BODY_FIELD_DESC);
        oprot.writeString(struct.messageBody);
        oprot.writeFieldEnd();
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.attributes.size()));
            for (Map.Entry<String, String> _iter52 : struct.attributes.entrySet())
            {
              oprot.writeString(_iter52.getKey());
              oprot.writeString(_iter52.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.messageAttributes != null) {
        if (struct.isSetMessageAttributes()) {
          oprot.writeFieldBegin(MESSAGE_ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.messageAttributes.size()));
            for (Map.Entry<String, MessageAttribute> _iter53 : struct.messageAttributes.entrySet())
            {
              oprot.writeString(_iter53.getKey());
              _iter53.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReceiveMessageResponseTupleSchemeFactory implements SchemeFactory {
    public ReceiveMessageResponseTupleScheme getScheme() {
      return new ReceiveMessageResponseTupleScheme();
    }
  }

  private static class ReceiveMessageResponseTupleScheme extends TupleScheme<ReceiveMessageResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ReceiveMessageResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.messageID);
      oprot.writeString(struct.receiptHandle);
      oprot.writeString(struct.messageBody);
      BitSet optionals = new BitSet();
      if (struct.isSetAttributes()) {
        optionals.set(0);
      }
      if (struct.isSetMessageAttributes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (Map.Entry<String, String> _iter54 : struct.attributes.entrySet())
          {
            oprot.writeString(_iter54.getKey());
            oprot.writeString(_iter54.getValue());
          }
        }
      }
      if (struct.isSetMessageAttributes()) {
        {
          oprot.writeI32(struct.messageAttributes.size());
          for (Map.Entry<String, MessageAttribute> _iter55 : struct.messageAttributes.entrySet())
          {
            oprot.writeString(_iter55.getKey());
            _iter55.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ReceiveMessageResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.messageID = iprot.readString();
      struct.setMessageIDIsSet(true);
      struct.receiptHandle = iprot.readString();
      struct.setReceiptHandleIsSet(true);
      struct.messageBody = iprot.readString();
      struct.setMessageBodyIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map56 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.attributes = new HashMap<String,String>(2*_map56.size);
          String _key57;
          String _val58;
          for (int _i59 = 0; _i59 < _map56.size; ++_i59)
          {
            _key57 = iprot.readString();
            _val58 = iprot.readString();
            struct.attributes.put(_key57, _val58);
          }
        }
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map60 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.messageAttributes = new HashMap<String,MessageAttribute>(2*_map60.size);
          String _key61;
          MessageAttribute _val62;
          for (int _i63 = 0; _i63 < _map60.size; ++_i63)
          {
            _key61 = iprot.readString();
            _val62 = new MessageAttribute();
            _val62.read(iprot);
            struct.messageAttributes.put(_key61, _val62);
          }
        }
        struct.setMessageAttributesIsSet(true);
      }
    }
  }

}

