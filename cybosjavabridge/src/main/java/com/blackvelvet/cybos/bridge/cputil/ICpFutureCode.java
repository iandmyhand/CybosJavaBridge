package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpFutureCode Interface
 */
@IID("{FDDF6F98-B0AE-4B86-8C62-CC4469075F65}")
public interface ICpFutureCode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method GetCount
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  short getCount();


  /**
   * <p>
   * method GetData
   * </p>
   * @param type Mandatory short parameter.
   * @param index Mandatory short parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getData(
    short type,
    short index);


  /**
   * <p>
   * method CodeToName
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String codeToName(
    java.lang.String code);


  // Properties:
}
