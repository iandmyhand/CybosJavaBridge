package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpElwCode 인터페이스
 */
@IID("{A162F0D1-894A-48D1-BDF4-E8589EA7607B}")
public interface ICpElwCode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method GetCount
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int getCount();


  /**
   * <p>
   * method GetData
   * </p>
   * @param type Mandatory short parameter.
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getData(
    short type,
    int index);


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


  /**
   * <p>
   * method GetStockElwBaseList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwBaseList();


  /**
   * <p>
   * method GetStockElwBaseCode
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String getStockElwBaseCode(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockElwBaseName
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String getStockElwBaseName(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockElwIssuerList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwIssuerList();


  /**
   * <p>
   * method GetStockElwLpCodeList
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwLpCodeList(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockElwLpName
   * </p>
   * @param bstrLpCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getNameByStockElwLpCode(
    java.lang.String bstrLpCode);


  /**
   * <p>
   * method GetStockElwBasketCodeList
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwBasketCodeList(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockElwBasketCompList
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwBasketCompList(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockElwCodeListByBaseCode
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwCodeListByBaseCode(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockElwCodeListByRightType
   * </p>
   * @param eRightType Mandatory com.blackvelvet.cybos.bridge.cputil.CPE_ECT_ELW_RIGHT_TYPE parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwCodeListByRightType(
    com.blackvelvet.cybos.bridge.cputil.CPE_ECT_ELW_RIGHT_TYPE eRightType);


  // Properties:
}
