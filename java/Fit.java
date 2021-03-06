////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2015 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 16.10Release
// Tag = development-akw-16.10.00-0
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;

import java.util.HashMap;

public class Fit {
   public static boolean debug = false;

   public static final int PROTOCOL_VERSION_MAJOR = 1; // Non-backwards compatible changes. Decode compatible with this version and earlier.
   public static final int PROTOCOL_VERSION_MINOR = 0; // Backwards compatible changes.
   public static final int PROTOCOL_VERSION_MAJOR_SHIFT = 4;
   public static final int PROTOCOL_VERSION_MAJOR_MASK = (0x0F << PROTOCOL_VERSION_MAJOR_SHIFT);
   public static final int PROTOCOL_VERSION_MINOR_MASK = 0x0F;
   public static final int PROTOCOL_VERSION = (PROTOCOL_VERSION_MAJOR << PROTOCOL_VERSION_MAJOR_SHIFT) | PROTOCOL_VERSION_MINOR;

   public static final int PROFILE_VERSION_MAJOR = 16;
   public static final int PROFILE_VERSION_MINOR = 10;
   public static final String PROFILE_TYPE = "Release";
   public static final int PROFILE_VERSION_SCALE = 100;
   public static final int PROFILE_VERSION = PROFILE_VERSION_MAJOR * PROFILE_VERSION_SCALE + PROFILE_VERSION_MINOR;

   public static final int ANTFS_FILE_DATA_TYPE = 128;

   public static final int FILE_HDR_SIZE = 14;

   public static final int HDR_SIZE = 1;
   public static final int HDR_TIME_REC_BIT = 0x80;
   public static final int HDR_TIME_TYPE_MASK = 0x60;
   public static final int HDR_TIME_TYPE_SHIFT = 5;
   public static final int HDR_TIME_OFFSET_MASK = 0x1F;
   public static final int HDR_TYPE_DEF_BIT = 0x40;
   public static final int HDR_TYPE_MASK = 0x0F;
   public static final int MAX_LOCAL_MESGS = HDR_TYPE_MASK + 1;

   public static final int MAX_MESG_SIZE = 255;

   public static final int ARCH_ENDIAN_MASK = 0x01;
   public static final int ARCH_ENDIAN_LITTLE = 0;
   public static final int ARCH_ENDIAN_BIG = 1;

   public static final int MAX_FIELD_SIZE = 255;

   public static final int FIELD_NUM_INVALID = 255;
   public static final int FIELD_NUM_MESSAGE_INDEX = 254;
   public static final int FIELD_NUM_TIMESTAMP = 253;

   public static final int SUBFIELD_INDEX_ACTIVE_SUBFIELD = 65534;
   public static final int SUBFIELD_INDEX_MAIN_FIELD = 65535;
   public static final String SUBFIELD_NAME_MAIN_FIELD = new String();

   public static final int BASE_TYPE_ENDIAN_FLAG = 0x80;
   public static final int BASE_TYPE_RESERVED = 0x60;
   public static final int BASE_TYPE_NUM_MASK = 0x1F;

   public static final Short ENUM_INVALID = Short.decode("0xFF");
   public static final int BASE_TYPE_ENUM = 0x00;
   public static final Byte SINT8_INVALID = Byte.decode("0x7F");
   public static final int BASE_TYPE_SINT8 = 0x01;
   public static final Short UINT8_INVALID = Short.decode("0xFF");
   public static final int BASE_TYPE_UINT8 = 0x02;
   public static final Short SINT16_INVALID = Short.decode("0x7FFF");
   public static final int BASE_TYPE_SINT16 = 0x83;
   public static final Integer UINT16_INVALID = Integer.decode("0xFFFF");
   public static final int BASE_TYPE_UINT16 = 0x84;
   public static final Integer SINT32_INVALID = Integer.decode("0x7FFFFFFF");
   public static final int BASE_TYPE_SINT32 = 0x85;
   public static final Long UINT32_INVALID = Long.decode("0xFFFFFFFF");
   public static final int BASE_TYPE_UINT32 = 0x86;
   public static final String STRING_INVALID = new String();
   public static final int BASE_TYPE_STRING = 0x07;
   public static final Float FLOAT32_INVALID = Float.intBitsToFloat(0xFFFFFFFF);
   public static final int BASE_TYPE_FLOAT32 = 0x88;
   public static final Double FLOAT64_INVALID = Double.longBitsToDouble(0xFFFFFFFFFFFFFFFFL);
   public static final int BASE_TYPE_FLOAT64 = 0x89;
   public static final Short UINT8Z_INVALID = Short.decode("0x00");
   public static final int BASE_TYPE_UINT8Z = 0x0A;
   public static final Integer UINT16Z_INVALID = Integer.decode("0x0000");
   public static final int BASE_TYPE_UINT16Z = 0x8B;
   public static final Long UINT32Z_INVALID = Long.decode("0x00000000");
   public static final int BASE_TYPE_UINT32Z = 0x8C;
   public static final Short BYTE_INVALID = 0xFF;
   public static final int BASE_TYPE_BYTE = 0x0D;
   public static final int BASE_TYPES = 14;

   public static final int baseTypeSizes[] = {1, 1, 1, 2, 2, 4, 4, 1, 4, 8, 1, 2, 4, 1};

   public static final byte UTF8_BOM_BYTE_1 = (byte)0xEF;
   public static final byte UTF8_BOM_BYTE_2 = (byte)0xBB;
   public static final byte UTF8_BOM_BYTE_3 = (byte)0xBF;
   public static final int UTF8_NUM_BOM_BYTES = 3;
   public static final char UTF8_BOM = '\uFEFF';

   // This flag enables deprecated behaviour in the SDK.
   //
   // As of 16.10:
   //
   //    If a get method is used on a field containing invalid
   //    values, null is returned. When disabled, an appropriate
   //    invalid value is returned instead.
   public static final boolean ENABLE_LEGACY_BEHAVIOUR = true;

   public static final HashMap<Integer, Object> baseTypeInvalidMap;
   static {
      baseTypeInvalidMap = new HashMap<Integer, Object>(20);
      baseTypeInvalidMap.put(BASE_TYPE_ENUM, ENUM_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_SINT8, SINT8_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_UINT8, UINT8_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_SINT16, SINT16_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_UINT16, UINT16_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_SINT32, SINT32_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_UINT32, UINT32_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_STRING, STRING_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_FLOAT32, FLOAT32_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_FLOAT64, FLOAT64_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_UINT8Z, UINT8Z_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_UINT16Z, UINT16Z_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_UINT32Z, UINT32Z_INVALID);
      baseTypeInvalidMap.put(BASE_TYPE_BYTE, BYTE_INVALID);
   }
}
