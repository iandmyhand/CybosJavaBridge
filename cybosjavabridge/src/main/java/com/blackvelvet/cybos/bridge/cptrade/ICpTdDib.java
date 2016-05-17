package com.blackvelvet.cybos.bridge.cptrade  ;

import com4j.*;

/**
 * IDib Interface
 */
@IID("{F75A3C47-4B29-46E8-AD1C-D34BD89B5143}")
public interface ICpTdDib extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property Header
   * </p>
   * <p>
   * Getter method for the COM property "Header"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object header();


  /**
   * <p>
   * property Data
   * </p>
   * <p>
   * Getter method for the COM property "Data"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object data();


  /**
   * <p>
   * property Input
   * </p>
   * <p>
   * Getter method for the COM property "Input"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object input();


  /**
   * <p>
   * method GetHeaderValue
   * </p>
   * @param __MIDL__ICpTdDib0000 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHeaderValue(
    int __MIDL__ICpTdDib0000);


  /**
   * <p>
   * method GetDataValue
   * </p>
   * @param __MIDL__ICpTdDib0001 Mandatory int parameter.
   * @param __MIDL__ICpTdDib0002 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDataValue(
    int __MIDL__ICpTdDib0001,
    int __MIDL__ICpTdDib0002);


  /**
   * <p>
   * property Continue
   * </p>
   * <p>
   * Getter method for the COM property "Continue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(12)
  int _continue();


  /**
   * <p>
   * property Continue
   * </p>
   * <p>
   * Setter method for the COM property "Continue"
   * </p>
   * @param pVal Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(13)
  void _continue(
    int pVal);


  /**
   * <p>
   * method GetInputValue
   * </p>
   * @param __MIDL__ICpTdDib0003 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getInputValue(
    int __MIDL__ICpTdDib0003);


  /**
   * <p>
   * method SetInputValue
   * </p>
   * @param __MIDL__ICpTdDib0004 Mandatory int parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(15)
  void setInputValue(
    int __MIDL__ICpTdDib0004,
    @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);


  /**
   * <p>
   * method GetDibStatus
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(16)
  short getDibStatus();


  /**
   * <p>
   * method GetDibMsg1
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String getDibMsg1();


  /**
   * <p>
   * method GetDibMsg2
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String getDibMsg2();


  /**
   * <p>
   * method BlockRequest
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(19)
  short blockRequest();


  /**
   * <p>
   * method BlockRequest2
   * </p>
   * @param blockOption Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(20)
  short blockRequest2(
    short blockOption);


  /**
   * <p>
   * method Request
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(21)
  short request();


  // Properties:
}
