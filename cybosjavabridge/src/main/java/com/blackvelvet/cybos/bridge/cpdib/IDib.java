package com.blackvelvet.cybos.bridge.cpdib  ;

import com4j.*;

/**
 * IDib Interface
 */
@IID("{33518A10-0931-11D4-8231-00105A7C4F8C}")
public interface IDib extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method Request
   * </p>
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void request();


  /**
   * <p>
   * method Subscribe
   * </p>
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void subscribe();


  /**
   * <p>
   * method Unsubscribe
   * </p>
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void unsubscribe();


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
  @VTID(10)
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
  @VTID(11)
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
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object input();


  /**
   * <p>
   * method GetHeaderValue
   * </p>
   * @param __MIDL__IDib0000 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHeaderValue(
    int __MIDL__IDib0000);


  /**
   * <p>
   * method GetDataValue
   * </p>
   * @param __MIDL__IDib0001 Mandatory int parameter.
   * @param __MIDL__IDib0002 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDataValue(
    int __MIDL__IDib0001,
    int __MIDL__IDib0002);


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
  @VTID(15)
  int _continue();


  /**
   * <p>
   * method GetInputValue
   * </p>
   * @param __MIDL__IDib0003 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getInputValue(
    int __MIDL__IDib0003);


  /**
   * <p>
   * method SetInputValue
   * </p>
   * @param __MIDL__IDib0004 Mandatory int parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  void setInputValue(
    int __MIDL__IDib0004,
    @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);


  /**
   * <p>
   * method GetDibStatus
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  short getDibStatus();


  /**
   * <p>
   * method GetDibMsg1
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String getDibMsg1();


  /**
   * <p>
   * method GetDibMsg2
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String getDibMsg2();


  /**
   * <p>
   * method BlockRequest
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  short blockRequest();


  /**
   * <p>
   * method SubscribeLatest
   * </p>
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  void subscribeLatest();


  /**
   * <p>
   * method BlockRequest2
   * </p>
   * @param blockOption Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  short blockRequest2(
    short blockOption);


  // Properties:
}
