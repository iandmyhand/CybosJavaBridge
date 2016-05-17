package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpUserInfo Interface
 */
@IID("{363AF9F5-0612-4E75-A563-211851B45A16}")
public interface ICpUserInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property ComID
   * </p>
   * <p>
   * Getter method for the COM property "ComID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String comID();


  /**
   * <p>
   * method VerifyUserInfo
   * </p>
   * @param socialNo Mandatory java.lang.String parameter.
   * @param userName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int verifyUserInfo(
    java.lang.String socialNo,
    java.lang.String userName);


  // Properties:
}
