package com.blackvelvet.cybos.bridge.cpinttrade  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpIntField Class
   */
  public static com.blackvelvet.cybos.bridge.cpinttrade.ICpIntField createCpIntField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpinttrade.ICpIntField.class, "{ED7A0783-A1CA-4415-BDD4-FE637D388666}" );
  }

  /**
   * CpIntFields Class
   */
  public static com.blackvelvet.cybos.bridge.cpinttrade.ICpIntFields createCpIntFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpinttrade.ICpIntFields.class, "{48E5BDE5-DAC0-4334-B44D-9C7450D6F0D7}" );
  }

  /**
   * Cmr9197 Class
   */
  public static com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade createCmr9197() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade.class, "{FB254BEA-3D92-4F02-A910-6EBBFE8725CF}" );
  }

  /**
   * Cmr9198 Class
   */
  public static com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade createCmr9198() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade.class, "{D56939BE-8337-4A44-BEA9-32613A1CFE74}" );
  }

  /**
   * Cmr3074 Class
   */
  public static com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade createCmr3074() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade.class, "{97444944-A93B-44AC-AABD-9636B42B5C81}" );
  }

  /**
   * Cmr3653 Class
   */
  public static com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade createCmr3653() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpinttrade.IIntTrade.class, "{9D569A3E-7EF2-40FA-9F8B-C4F703694118}" );
  }
}
