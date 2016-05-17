package com.blackvelvet.cybos.bridge.cpforedib  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpForeField Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.ICpForeField createCpForeField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.ICpForeField.class, "{93CEC1C0-47AE-474C-93BD-A952B67C5256}" );
  }

  /**
   * CpForeFields Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.ICpForeFields createCpForeFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.ICpForeFields.class, "{EF426FAC-8B2F-4D4E-883F-42ADCA3D258C}" );
  }

  /**
   * OvFutMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{60291C5F-0F0D-413F-A7E5-8FB699E8F050}" );
  }

  /**
   * OvFutCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{10C45173-F22A-4037-AEF9-0A13BA3FA146}" );
  }

  /**
   * OvFutBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{2117D620-501B-48F5-A6C0-2EA83A91453A}" );
  }

  /**
   * FxMgMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createFxMgMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{DFCAA3BE-2C51-4D22-8B40-8BD5A26987B9}" );
  }

  /**
   * FxMgCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createFxMgCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{1BA716D8-C71E-42B8-813D-F07BBDC08887}" );
  }

  /**
   * FxMgOrdReceive Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createFxMgOrdReceive() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{1BDD5625-B398-44EF-B81D-28F599E5F932}" );
  }

  /**
   * FxMgConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createFxMgConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{1593F7B5-6E9A-47D2-A121-0A370A363F64}" );
  }

  /**
   * FxMgBalance Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createFxMgBalance() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{CDB1D9C6-C6DF-4004-8BB7-E6D282BBF938}" );
  }

  /**
   * OvFutOrdReceive Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutOrdReceive() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{DF4AF880-ED67-4825-A61C-24D1E5D62BF1}" );
  }

  /**
   * OvFutConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{F49DAF7B-8F8C-4EBA-A379-A7A8D7119152}" );
  }

  /**
   * OvFutBalance Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutBalance() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{B5F48DBB-14A4-4346-966C-35187E1390B6}" );
  }

  /**
   * OvFutureChart Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createOvFutureChart() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{C5082D47-B750-4F6B-A71B-2FFF2BECEFB9}" );
  }

  /**
   * FxMgChart Class
   */
  public static com.blackvelvet.cybos.bridge.cpforedib.IForeDib createFxMgChart() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforedib.IForeDib.class, "{13C7321A-77F2-46EA-8330-405553D0EB44}" );
  }
}
