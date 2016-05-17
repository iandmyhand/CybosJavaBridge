package com.blackvelvet.cybos.bridge.cpsysdib  ;

import com4j.*;

/**
 * ICpField Interface
 */
@IID("{C9FAC560-BE19-4FB2-801D-54F89D3FBC0A}")
public interface ICpField extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property Name
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * property fid
   * </p>
   * <p>
   * Getter method for the COM property "fid"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short fid();


  // Properties:
}
