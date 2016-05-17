package com.blackvelvet.cybos.bridge.cpforetrade  ;

import com4j.*;

/**
 * ICpTdField Interface
 */
@IID("{9B522D78-88D9-4D5F-A4E0-16A936830F43}")
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
