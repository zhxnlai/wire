// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: packed_encoding.proto
package squareup.protos.packed_encoding

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class EmbeddedMessage(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.PACKED
  )
  val inner_repeated_number: List<Int> = emptyList(),
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val inner_number_after: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<EmbeddedMessage, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EmbeddedMessage) return false
    if (unknownFields != other.unknownFields) return false
    if (inner_repeated_number != other.inner_repeated_number) return false
    if (inner_number_after != other.inner_number_after) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + inner_repeated_number.hashCode()
      result = result * 37 + inner_number_after.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (inner_repeated_number.isNotEmpty()) result +=
        """inner_repeated_number=$inner_repeated_number"""
    if (inner_number_after != null) result += """inner_number_after=$inner_number_after"""
    return result.joinToString(prefix = "EmbeddedMessage{", separator = ", ", postfix = "}")
  }

  fun copy(
    inner_repeated_number: List<Int> = this.inner_repeated_number,
    inner_number_after: Int? = this.inner_number_after,
    unknownFields: ByteString = this.unknownFields
  ): EmbeddedMessage = EmbeddedMessage(inner_repeated_number, inner_number_after, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<EmbeddedMessage> = object : ProtoAdapter<EmbeddedMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      EmbeddedMessage::class, 
      "type.googleapis.com/squareup.protos.packed_encoding.EmbeddedMessage", 
      PROTO_2
    ) {
      override fun encodedSize(value: EmbeddedMessage): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, value.inner_repeated_number)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.inner_number_after)
        return size
      }

      override fun encode(writer: ProtoWriter, value: EmbeddedMessage) {
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, value.inner_repeated_number)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.inner_number_after)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): EmbeddedMessage {
        val inner_repeated_number = mutableListOf<Int>()
        var inner_number_after: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> inner_repeated_number.add(ProtoAdapter.INT32.decode(reader))
            2 -> inner_number_after = ProtoAdapter.INT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return EmbeddedMessage(
          inner_repeated_number = inner_repeated_number,
          inner_number_after = inner_number_after,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: EmbeddedMessage): EmbeddedMessage = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
