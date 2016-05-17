package com.blackvelvet.cybos.bridge.cpnanosysdib  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * ElwatsManageItem Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createElwatsManageItem() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{B95FAED9-137E-4C27-B5CC-4E18CD532247}" );
  }

  /**
   * ElwatsControl Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createElwatsControl() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{31002173-562D-42D3-8CEC-9EA44801EFA6}" );
  }

  /**
   * ElwatsManageTradeInfo Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createElwatsManageTradeInfo() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{A1A0B478-C456-4E8C-A10D-3AC4945C1BB6}" );
  }

  /**
   * ElwatsSearchList Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createElwatsSearchList() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{585C6108-69A7-4C8B-B95A-7FA17EC1E3B3}" );
  }

  /**
   * ElwatsManualOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createElwatsManualOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{5E9CCD00-16D3-4A25-941A-4A2D8F20D2A5}" );
  }

  /**
   * ElwatsSessionRecovery Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createElwatsSessionRecovery() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{D717CA73-B58D-4496-9D75-2939819313F3}" );
  }

  /**
   * CpPrivErrConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createCpPrivErrConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{CAA19F8B-838E-4A46-A717-5156103C53F2}" );
  }

  /**
   * CpPrivConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib createCpPrivConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpnanosysdib.INanoSysDib.class, "{0C6FDC17-FF83-4D22-9610-EB319B90481B}" );
  }
}
