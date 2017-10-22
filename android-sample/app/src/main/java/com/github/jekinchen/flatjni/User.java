// automatically generated by the FlatBuffers compiler, do not modify

package com.github.jekinchen.flatjni;

import java.nio.*;
import java.lang.*;
import java.util.*;
import android.support.annotation.Nullable;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class User extends Table {
  public static User getRootAsUser(ByteBuffer _bb) { return getRootAsUser(_bb, new User()); }
  public static User getRootAsUser(ByteBuffer _bb, User obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public User __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public int age() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean isBoy() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public byte voiceData(int j) { int o = __offset(12); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int voiceDataLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer voiceDataAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public long timestamp() { int o = __offset(14); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }

  public static int createUser(FlatBufferBuilder builder,
      long id,
      int nameOffset,
      int age,
      boolean isBoy,
      int voiceDataOffset,
      long timestamp) {
    builder.startObject(6);
    User.addTimestamp(builder, timestamp);
    User.addVoiceData(builder, voiceDataOffset);
    User.addName(builder, nameOffset);
    User.addId(builder, id);
    User.addIsBoy(builder, isBoy);
    User.addAge(builder, age);
    return User.endUser(builder);
  }

  public static void startUser(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addInt(0, (int)id, (int)0L); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addAge(FlatBufferBuilder builder, int age) { builder.addByte(2, (byte)age, (byte)0); }
  public static void addIsBoy(FlatBufferBuilder builder, boolean isBoy) { builder.addBoolean(3, isBoy, false); }
  public static void addVoiceData(FlatBufferBuilder builder, int voiceDataOffset) { builder.addOffset(4, voiceDataOffset, 0); }
  public static int createVoiceDataVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startVoiceDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTimestamp(FlatBufferBuilder builder, long timestamp) { builder.addLong(5, timestamp, 0L); }
  public static int endUser(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
