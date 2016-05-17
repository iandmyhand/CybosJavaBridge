package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpBondCodes 인터페이스
 */
@IID("{C09E3D05-D1D5-41FE-9DCF-1900FCB69708}")
public interface ICpBondCodes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * property Count
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * property Item
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param __MIDL__ICpBondCodes0000 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object __MIDL__ICpBondCodes0000);


  /**
   * <p>
   * property _NewEnum
   * </p>
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
