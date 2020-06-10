// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class MessageOptions extends Message<MessageOptions, MessageOptions.Builder> {
  public static final ProtoAdapter<MessageOptions> ADAPTER = new ProtoAdapter_MessageOptions();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_MESSAGE_SET_WIRE_FORMAT = false;

  public static final Boolean DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR = false;

  public static final Boolean DEFAULT_DEPRECATED = false;

  public static final Boolean DEFAULT_MAP_ENTRY = false;

  /**
   * Set true to use the old proto1 MessageSet wire format for extensions.
   * This is provided for backwards-compatibility with the MessageSet wire
   * format.  You should not use this for any other reason:  It's less
   * efficient, has fewer features, and is more complicated.
   *
   * The message must be defined exactly as follows:
   *   message Foo {
   *     option message_set_wire_format = true;
   *     extensions 4 to max;
   *   }
   * Note that the message cannot have any defined fields; MessageSets only
   * have extensions.
   *
   * All extensions of your type must be singular messages; e.g. they cannot
   * be int32s, enums, or repeated messages.
   *
   * Because this is an option, the above two restrictions are not enforced by
   * the protocol compiler.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean message_set_wire_format;

  /**
   * Disables the generation of the standard "descriptor()" accessor, which can
   * conflict with a field of the same name.  This is meant to make migration
   * from proto1 easier; new code should avoid fields named "descriptor".
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean no_standard_descriptor_accessor;

  /**
   * Is this message deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the message, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating messages.
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deprecated;

  /**
   * Whether the message is an automatically generated map entry type for the
   * maps field.
   *
   * For maps fields:
   *     map<KeyType, ValueType> map_field = 1;
   * The parsed descriptor looks like:
   *     message MapFieldEntry {
   *         option map_entry = true;
   *         optional KeyType key = 1;
   *         optional ValueType value = 2;
   *     }
   *     repeated MapFieldEntry map_field = 1;
   *
   * Implementations may choose not to generate the map_entry=true message, but
   * use a native map in the target language to hold the keys and values.
   * The reflection APIs in such implementations still need to work as
   * if the field is a repeated message field.
   *
   * NOTE: Do not set the option in .proto files. Always use the maps syntax
   * instead. The option should only be implicitly set by the proto compiler
   * parser.
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean map_entry;

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor,
      Boolean deprecated, Boolean map_entry) {
    this(message_set_wire_format, no_standard_descriptor_accessor, deprecated, map_entry, ByteString.EMPTY);
  }

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor,
      Boolean deprecated, Boolean map_entry, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.message_set_wire_format = message_set_wire_format;
    this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
    this.deprecated = deprecated;
    this.map_entry = map_entry;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.message_set_wire_format = message_set_wire_format;
    builder.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
    builder.deprecated = deprecated;
    builder.map_entry = map_entry;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MessageOptions)) return false;
    MessageOptions o = (MessageOptions) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(message_set_wire_format, o.message_set_wire_format)
        && Internal.equals(no_standard_descriptor_accessor, o.no_standard_descriptor_accessor)
        && Internal.equals(deprecated, o.deprecated)
        && Internal.equals(map_entry, o.map_entry);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (message_set_wire_format != null ? message_set_wire_format.hashCode() : 0);
      result = result * 37 + (no_standard_descriptor_accessor != null ? no_standard_descriptor_accessor.hashCode() : 0);
      result = result * 37 + (deprecated != null ? deprecated.hashCode() : 0);
      result = result * 37 + (map_entry != null ? map_entry.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (message_set_wire_format != null) builder.append(", message_set_wire_format=").append(message_set_wire_format);
    if (no_standard_descriptor_accessor != null) builder.append(", no_standard_descriptor_accessor=").append(no_standard_descriptor_accessor);
    if (deprecated != null) builder.append(", deprecated=").append(deprecated);
    if (map_entry != null) builder.append(", map_entry=").append(map_entry);
    return builder.replace(0, 2, "MessageOptions{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MessageOptions, Builder> {
    public Boolean message_set_wire_format;

    public Boolean no_standard_descriptor_accessor;

    public Boolean deprecated;

    public Boolean map_entry;

    public Builder() {
    }

    /**
     * Set true to use the old proto1 MessageSet wire format for extensions.
     * This is provided for backwards-compatibility with the MessageSet wire
     * format.  You should not use this for any other reason:  It's less
     * efficient, has fewer features, and is more complicated.
     *
     * The message must be defined exactly as follows:
     *   message Foo {
     *     option message_set_wire_format = true;
     *     extensions 4 to max;
     *   }
     * Note that the message cannot have any defined fields; MessageSets only
     * have extensions.
     *
     * All extensions of your type must be singular messages; e.g. they cannot
     * be int32s, enums, or repeated messages.
     *
     * Because this is an option, the above two restrictions are not enforced by
     * the protocol compiler.
     */
    public Builder message_set_wire_format(Boolean message_set_wire_format) {
      this.message_set_wire_format = message_set_wire_format;
      return this;
    }

    /**
     * Disables the generation of the standard "descriptor()" accessor, which can
     * conflict with a field of the same name.  This is meant to make migration
     * from proto1 easier; new code should avoid fields named "descriptor".
     */
    public Builder no_standard_descriptor_accessor(Boolean no_standard_descriptor_accessor) {
      this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
      return this;
    }

    /**
     * Is this message deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the message, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating messages.
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    /**
     * Whether the message is an automatically generated map entry type for the
     * maps field.
     *
     * For maps fields:
     *     map<KeyType, ValueType> map_field = 1;
     * The parsed descriptor looks like:
     *     message MapFieldEntry {
     *         option map_entry = true;
     *         optional KeyType key = 1;
     *         optional ValueType value = 2;
     *     }
     *     repeated MapFieldEntry map_field = 1;
     *
     * Implementations may choose not to generate the map_entry=true message, but
     * use a native map in the target language to hold the keys and values.
     * The reflection APIs in such implementations still need to work as
     * if the field is a repeated message field.
     *
     * NOTE: Do not set the option in .proto files. Always use the maps syntax
     * instead. The option should only be implicitly set by the proto compiler
     * parser.
     */
    public Builder map_entry(Boolean map_entry) {
      this.map_entry = map_entry;
      return this;
    }

    @Override
    public MessageOptions build() {
      return new MessageOptions(message_set_wire_format, no_standard_descriptor_accessor, deprecated, map_entry, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MessageOptions extends ProtoAdapter<MessageOptions> {
    public ProtoAdapter_MessageOptions() {
      super(FieldEncoding.LENGTH_DELIMITED, MessageOptions.class, "type.googleapis.com/google.protobuf.MessageOptions", Syntax.PROTO_2);
    }

    @Override
    public int encodedSize(MessageOptions value) {
      return ProtoAdapter.BOOL.encodedSizeWithTag(1, value.message_set_wire_format)
          + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.no_standard_descriptor_accessor)
          + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated)
          + ProtoAdapter.BOOL.encodedSizeWithTag(7, value.map_entry)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MessageOptions value) throws IOException {
      ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.message_set_wire_format);
      ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.no_standard_descriptor_accessor);
      ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated);
      ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.map_entry);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MessageOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.message_set_wire_format(ProtoAdapter.BOOL.decode(reader)); break;
          case 2: builder.no_standard_descriptor_accessor(ProtoAdapter.BOOL.decode(reader)); break;
          case 3: builder.deprecated(ProtoAdapter.BOOL.decode(reader)); break;
          case 7: builder.map_entry(ProtoAdapter.BOOL.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public MessageOptions redact(MessageOptions value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
