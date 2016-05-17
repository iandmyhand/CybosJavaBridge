package com.blackvelvet.cybos.bridge.cpgmaxdib  ;

import com4j.*;

/**
 * IGmaxDib Interface
 */
@IID("{4F19B471-0986-4B9E-9D58-0041FC451575}")
public interface IGmaxDib extends Com4jObject {
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
   * method GetHeaderValue
   * </p>
   * @param __MIDL__IGmaxDib0000 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHeaderValue(
    int __MIDL__IGmaxDib0000);


  /**
   * <p>
   * method GetDataValue
   * </p>
   * @param __MIDL__IGmaxDib0001 Mandatory int parameter.
   * @param __MIDL__IGmaxDib0002 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getDataValue(
    int __MIDL__IGmaxDib0001,
    int __MIDL__IGmaxDib0002);


  /**
   * <p>
   * property Continue
   * </p>
   * <p>
   * Getter method for the COM property "Continue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int _continue();


  /**
   * <p>
   * method SetInputValue
   * </p>
   * @param __MIDL__IGmaxDib0003 Mandatory int parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void setInputValue(
    int __MIDL__IGmaxDib0003,
    @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);


  /**
   * <p>
   * method GetDibStatus
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  short getDibStatus();


  /**
   * <p>
   * method GetDibMsg1
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getDibMsg1();


  /**
   * <p>
   * method GetDibMsg2
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String getDibMsg2();


  /**
   * <p>
   * method BlockRequest
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  short blockRequest();


  /**
   * <p>
   * method SubscribeLatest
   * </p>
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  void subscribeLatest();


  /**
   * <p>
   * method BlockRequest2
   * </p>
   * @param blockOption Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  short blockRequest2(
    short blockOption);


  /**
   * <p>
   * method SetInputDataValue
   * </p>
   * @param __MIDL__IGmaxDib0004 Mandatory int parameter.
   * @param __MIDL__IGmaxDib0005 Mandatory int parameter.
   * @param newVal Mandatory java.lang.Object parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  void setInputDataValue(
    int __MIDL__IGmaxDib0004,
    int __MIDL__IGmaxDib0005,
    @MarshalAs(NativeType.VARIANT) java.lang.Object newVal);


  // Properties:
}
