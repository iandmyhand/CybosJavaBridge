package com.blackvelvet.cybos.bridge.cpgmaxdib  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * ElwatsManageItem Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsManageItem() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{3B7BD248-6A90-45CB-863D-0D3D3C7B0E19}" );
  }

  /**
   * ElwatsControl Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsControl() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{9B932C07-B13C-4B21-9358-53780CCE60A3}" );
  }

  /**
   * ElwatsManageTradeInfo Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsManageTradeInfo() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{20A0DF9B-03E7-4C01-9DF1-F0AA727ACCB6}" );
  }

  /**
   * ElwatsManageTradePoint Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsManageTradePoint() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{710EFE2C-52D3-4F15-9E22-261DF7D1B430}" );
  }

  /**
   * ElwatsSearchList Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsSearchList() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{8E95B81D-1A3B-4FEB-A013-43E4C96034C5}" );
  }

  /**
   * ElwatsManualOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsManualOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{2FEBCAEC-8A6A-4EAC-884E-1E583831CA24}" );
  }

  /**
   * ElwatsSessionRecovery Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createElwatsSessionRecovery() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{44F3034E-293B-435C-ADE8-77833003A26C}" );
  }

  /**
   * CpPrivErrConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createCpPrivErrConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{7877F65E-EC2B-4FD2-B5AC-38FBAA70B1FB}" );
  }

  /**
   * CpPrivConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib createCpPrivConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpgmaxdib.IGmaxDib.class, "{0666DF3A-9D41-4FF3-B912-D8DF810A3B23}" );
  }
}
