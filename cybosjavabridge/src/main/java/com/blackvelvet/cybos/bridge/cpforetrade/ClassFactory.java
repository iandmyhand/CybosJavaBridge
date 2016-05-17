package com.blackvelvet.cybos.bridge.cpforetrade  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpTdField Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpTdField createCpTdField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpTdField.class, "{138DF993-B1BB-4E51-8C71-6248B9C010C4}" );
  }

  /**
   * CpTdFields Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpTdFields createCpTdFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpTdFields.class, "{8C150715-212A-453E-AC5A-1A1183B0A36F}" );
  }

  /**
   * CpForeTdUtil Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdUtil createCpForeTdUtil() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdUtil.class, "{D99B83AA-06D4-4944-81BC-7B18C0FCC491}" );
  }

  /**
   * CpForeTradeKey Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createCpForeTradeKey() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{31A04D10-E36E-4571-A058-B5FFD650E269}" );
  }

  /**
   * OvFutOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createOvFutOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{CF80E93D-C153-404F-8728-DE2B2C259B92}" );
  }

  /**
   * OvFutConInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createOvFutConInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{A03A1CC0-0DD3-4CB6-9DEB-5942013547C9}" );
  }

  /**
   * OvFutNotConInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createOvFutNotConInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{ECD09FE2-F364-40CE-84D4-0519789852E8}" );
  }

  /**
   * OvfNotPaymentInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createOvfNotPaymentInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{87C0CF3C-BD04-43C7-A769-258F6ECD4E95}" );
  }

  /**
   * OvfDepositRecInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createOvfDepositRecInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{EA07EC46-90D7-4FDA-86AB-B9E18FE20B97}" );
  }

  /**
   * FxMgOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createFxMgOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{EA025F0D-E04D-43E8-B2AD-FB136B7D871A}" );
  }

  /**
   * FxMgConInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createFxMgConInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{35BA0F1E-9483-4A7E-945C-2106D99B86F1}" );
  }

  /**
   * FxMgNotConInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createFxMgNotConInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{D78F80D3-7189-45B1-9D41-40323059E330}" );
  }

  /**
   * FxMgNotPaymentInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createFxMgNotPaymentInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{46131954-6A5A-43B8-94B2-63056A75171C}" );
  }

  /**
   * FxMgDepositRecInq Class
   */
  public static com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib createFxMgDepositRecInq() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforetrade.ICpForeTdDib.class, "{65210B9E-4F64-419A-AB4E-A41FD1202943}" );
  }
}
