package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpStockCode Interface
 */
@IID("{081AAEAA-DFAF-4B7F-A53A-0D1E4AC58584}")
public interface ICpStockCode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method CodeToName
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String codeToName(
    java.lang.String code);


  /**
   * <p>
   * method FullCodeToName
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String fullCodeToName(
    java.lang.String code);


  /**
   * <p>
   * method GetCount
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short getCount();


  /**
   * <p>
   * method GetData
   * </p>
   * @param type Mandatory short parameter.
   * @param index Mandatory short parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getData(
    short type,
    short index);


  /**
   * <p>
   * method CodeToFullCode
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String codeToFullCode(
    java.lang.String code);


  /**
   * <p>
   * method FullCodeToCode
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String fullCodeToCode(
    java.lang.String code);


  /**
   * <p>
   * method NameToCode
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String nameToCode(
    java.lang.String name);


  /**
   * <p>
   * method CodeToIndex
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  int codeToIndex(
    java.lang.String code);


  /**
   * <p>
   * method GetPriceUnit
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @param basePrice Mandatory int parameter.
   * @param directionUp Optional parameter. Default value is false
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  int getPriceUnit(
    java.lang.String code,
    int basePrice,
    @Optional @DefaultValue("-1") boolean directionUp);


  // Properties:
}
