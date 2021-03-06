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


public class CameraEventMesg extends Mesg {

   protected static final	Mesg cameraEventMesg;
   static {         
      // camera_event   
      cameraEventMesg = new Mesg("camera_event", MesgNum.CAMERA_EVENT);
      cameraEventMesg.addField(new Field("timestamp", 253, 134, 1, 0, "s", false));
      
      cameraEventMesg.addField(new Field("timestamp_ms", 0, 132, 1, 0, "ms", false));
      
      cameraEventMesg.addField(new Field("camera_event_type", 1, 0, 1, 0, "", false));
      
      cameraEventMesg.addField(new Field("camera_file_uuid", 2, 7, 1, 0, "", false));
      
      cameraEventMesg.addField(new Field("camera_orientation", 3, 0, 1, 0, "", false));
      
   }

   public CameraEventMesg() {
      super(Factory.createMesg(MesgNum.CAMERA_EVENT));
   }

   public CameraEventMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get timestamp field
    * Units: s
    * Comment: Whole second part of the timestamp.
    *
    * @return timestamp
    */
   public DateTime getTimestamp() {
      return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
   }

   /**
    * Set timestamp field
    * Units: s
    * Comment: Whole second part of the timestamp.
    *
    * @param timestamp
    */
   public void setTimestamp(DateTime timestamp) {
      setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get timestamp_ms field
    * Units: ms
    * Comment: Millisecond part of the timestamp.
    *
    * @return timestamp_ms
    */
   public Integer getTimestampMs() {
      return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set timestamp_ms field
    * Units: ms
    * Comment: Millisecond part of the timestamp.
    *
    * @param timestampMs
    */
   public void setTimestampMs(Integer timestampMs) {
      setFieldValue(0, 0, timestampMs, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get camera_event_type field
    *
    * @return camera_event_type
    */
   public CameraEventType getCameraEventType() {
      Short value = getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return CameraEventType.getByValue(value);
   }

   /**
    * Set camera_event_type field
    *
    * @param cameraEventType
    */
   public void setCameraEventType(CameraEventType cameraEventType) {
      setFieldValue(1, 0, cameraEventType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get camera_file_uuid field
    *
    * @return camera_file_uuid
    */
   public String getCameraFileUuid() {
      return getFieldStringValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set camera_file_uuid field
    *
    * @param cameraFileUuid
    */
   public void setCameraFileUuid(String cameraFileUuid) {
      setFieldValue(2, 0, cameraFileUuid, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get camera_orientation field
    *
    * @return camera_orientation
    */
   public CameraOrientationType getCameraOrientation() {
      Short value = getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return CameraOrientationType.getByValue(value);
   }

   /**
    * Set camera_orientation field
    *
    * @param cameraOrientation
    */
   public void setCameraOrientation(CameraOrientationType cameraOrientation) {
      setFieldValue(3, 0, cameraOrientation.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

}
