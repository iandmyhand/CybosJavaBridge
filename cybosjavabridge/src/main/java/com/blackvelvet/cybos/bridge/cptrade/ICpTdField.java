package com.blackvelvet.cybos.bridge.cptrade  ;

import com4j.*;

/**
 * ICpTdField Interface
 */
@IID("{E7BD5AF6-4EB1-47E1-BB3B-9505E2F09F0A}")
public interface ICpTdField extends Com4jObject {
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
