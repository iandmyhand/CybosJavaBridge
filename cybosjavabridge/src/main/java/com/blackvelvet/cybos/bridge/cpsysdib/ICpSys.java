package com.blackvelvet.cybos.bridge.cpsysdib  ;

import com4j.*;

/**
 * ICpSys Interface
 */
@IID("{4BE681C3-67B8-4B6A-BC98-89FF0DF4238E}")
public interface ICpSys extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method Unlock
   * </p>
   * @param code1 Mandatory int parameter.
   * @param code2 Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void cpUnlock(
    int code1,
    int code2);


  // Properties:
}
