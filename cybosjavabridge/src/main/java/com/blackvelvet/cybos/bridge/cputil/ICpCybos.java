package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpCybos Interface
 */
@IID("{3722B490-A340-45C5-BDA5-3C736DDEB423}")
public interface ICpCybos extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property IsConnect
   * </p>
   * <p>
   * Getter method for the COM property "IsConnect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int isConnect();


  /**
   * <p>
   * property ServerType
   * </p>
   * <p>
   * Getter method for the COM property "ServerType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short serverType();


  /**
   * <p>
   * property LimitRequestRemainTime
   * </p>
   * <p>
   * Getter method for the COM property "LimitRequestRemainTime"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int limitRequestRemainTime();


  /**
   * <p>
   * method GetLimitRequestRemainCount
   * </p>
   * @param limitType Mandatory com.blackvelvet.cybos.bridge.cputil.LIMIT_TYPE parameter.
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int getLimitRemainCount(
    com.blackvelvet.cybos.bridge.cputil.LIMIT_TYPE limitType);


  // Properties:
}
