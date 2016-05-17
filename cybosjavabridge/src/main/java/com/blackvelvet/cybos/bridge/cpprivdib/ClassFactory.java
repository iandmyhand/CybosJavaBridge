package com.blackvelvet.cybos.bridge.cpprivdib  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpField Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.ICpField createCpField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.ICpField.class, "{1E5F9F7E-6802-47CB-A687-AA0DF230D33F}" );
  }

  /**
   * CpFields Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.ICpFields createCpFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.ICpFields.class, "{A9B08C81-DACC-4985-A66C-DD29827BDD96}" );
  }

  /**
   * ElwatsManageItem Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsManageItem() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{8C5F269F-7D34-47CE-8F41-1436CC32AAF4}" );
  }

  /**
   * ElwatsManageTradeinfo Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsManageTradeInfo() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{6F316AAA-62C0-43EB-B035-D2F480383CFF}" );
  }

  /**
   * ElwatsControl Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsControl() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{C0E689BD-9A36-41D0-97CE-FD1C6A6F34C6}" );
  }

  /**
   * ElwatsManageTradePoint Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsManageTradePoint() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{ACAEDF40-058F-4F56-BBD2-05E16DC6D996}" );
  }

  /**
   * ElwatsSearchList Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsSearchList() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{383D6741-9C6D-49BB-8CF2-4ED7F9FD29C2}" );
  }

  /**
   * ElwatsElwManualOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsElwManualOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{62839C81-8DAE-47B3-A7A0-38EBB28D5004}" );
  }

  /**
   * ElwatsSearchTradePoint Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsSearchTradePoint() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{DCA87087-E7AC-4D50-A7ED-51A1A80C0981}" );
  }

  /**
   * CpPrivConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createCpPrivConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{66EE26F0-BA01-4095-B7A4-48316E9130A5}" );
  }

  /**
   * ElwatsSessionRecovery Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createElwatsSessionRecovery() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{E6F178FE-6860-4AA6-8467-83C800495E4A}" );
  }

  /**
   * CpPrivConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib createCpPrivErrConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpprivdib.IPrivDib.class, "{A971E1F3-F8AF-445C-8354-3FAF0637C254}" );
  }
}
