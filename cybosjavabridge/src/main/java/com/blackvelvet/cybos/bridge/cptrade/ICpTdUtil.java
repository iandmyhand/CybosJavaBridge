package com.blackvelvet.cybos.bridge.cptrade  ;

import com4j.*;

/**
 * ICpTdUtil Interface
 */
@IID("{15CA8DD1-1CF9-4544-A1A4-5593CE63A845}")
public interface ICpTdUtil extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method TradeInit
   * </p>
   * @param reserved Optional parameter. Default value is 0
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  short tradeInit(
    @Optional @DefaultValue("0") int reserved);


  /**
   * <p>
   * property AccountNumber
   * </p>
   * <p>
   * Getter method for the COM property "AccountNumber"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object accountNumber();


  /**
   * <p>
   * property GoodsList
   * </p>
   * <p>
   * Getter method for the COM property "GoodsList"
   * </p>
   * @param acc Mandatory java.lang.String parameter.
   * @param filter Mandatory com.blackvelvet.cybos.bridge.cptrade.CPE_ACC_GOODS parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object goodsList(
    java.lang.String acc,
    com.blackvelvet.cybos.bridge.cptrade.CPE_ACC_GOODS filter);


  // Properties:
}
