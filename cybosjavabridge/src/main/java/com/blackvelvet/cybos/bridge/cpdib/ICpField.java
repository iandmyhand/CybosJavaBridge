package com.blackvelvet.cybos.bridge.cpdib  ;

import com4j.*;

/**
 * ICpField Interface
 */
@IID("{85934404-08FD-11D4-8231-00105A7C4F8C}")
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
