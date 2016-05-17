package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpCodeMgr 인터페이스
 */
@IID("{6893A6D3-03FD-46EB-BB0E-28A22D3AEC9B}")
public interface ICpCodeMgr extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method GetGroupCodeList
   * </p>
   * @param groupCode Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getGroupCodeList(
    int groupCode);


  /**
   * <p>
   * method CodeToName
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String codeToName(
    java.lang.String code);


  /**
   * <p>
   * method GetUsCodeList
   * </p>
   * @param type Optional parameter. Default value is 1
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getUsCodeList(
    @Optional @DefaultValue("1") short type);


  /**
   * <p>
   * method GetUsCodeName
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String getUsCodeName(
    java.lang.String code);


  /**
   * <p>
   * method GetStockMarginRate
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  int getStockMarginRate(
    java.lang.String code);


  /**
   * <p>
   * method GetStockMemeMin
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int getStockMemeMin(
    java.lang.String code);


  /**
   * <p>
   * method GetStockElwBasketCodeList
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
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

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockElwBasketCompList(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetMarketStartTime
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  short getMarketStartTime();


  /**
   * <p>
   * method GetMarketEndTime
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  short getMarketEndTime();


  /**
   * <p>
   * method GetStockIndustryCode
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String getStockIndustryCode(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockMarketKind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_MARKET_KIND
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  com.blackvelvet.cybos.bridge.cputil.CPE_MARKET_KIND getStockMarketKind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockControlKind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_CONTROL_KIND
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  com.blackvelvet.cybos.bridge.cputil.CPE_CONTROL_KIND getStockControlKind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockSupervisionKind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_SUPERVISION_KIND
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  com.blackvelvet.cybos.bridge.cputil.CPE_SUPERVISION_KIND getStockSupervisionKind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockCapital
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_CAPITAL_SIZE
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  com.blackvelvet.cybos.bridge.cputil.CPE_CAPITAL_SIZE getStockCapital(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockFiscalMonth
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  int getStockFiscalMonth(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockGroupCode
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  int getStockGroupCode(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockKospi200Kind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_KOSPI200_KIND
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  com.blackvelvet.cybos.bridge.cputil.CPE_KOSPI200_KIND getStockKospi200Kind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockStatusKind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_STOCK_STATUS_KIND
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(25)
  com.blackvelvet.cybos.bridge.cputil.CPE_STOCK_STATUS_KIND getStockStatusKind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetGroupList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getGroupList();


  /**
   * <p>
   * method GetGroupName
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String getGroupName(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetIndustryList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getIndustryList();


  /**
   * <p>
   * method GetKrxIndustryList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getKrxIndustryList();


  /**
   * <p>
   * method GetIndustryName
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String getIndustryName(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetMemberList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getMemberList();


  /**
   * <p>
   * method GetMemberName
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String getMemberName(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetKosdaqIndustry1List
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getKosdaqIndustry1List();


  /**
   * <p>
   * method GetKosdaqIndustry2List
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getKosdaqIndustry2List();


  /**
   * <p>
   * method GetStockListByMarket
   * </p>
   * @param marketKind Mandatory com.blackvelvet.cybos.bridge.cputil.CPE_MARKET_KIND parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getStockListByMarket(
    com.blackvelvet.cybos.bridge.cputil.CPE_MARKET_KIND marketKind);


  /**
   * <p>
   * method GetStockSectionKind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_KSE_SECTION_KIND
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(36)
  com.blackvelvet.cybos.bridge.cputil.CPE_KSE_SECTION_KIND getStockSectionKind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockLacKind
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_LAC_KIND
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(37)
  com.blackvelvet.cybos.bridge.cputil.CPE_LAC_KIND getStockLacKind(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetStockCodeByName
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String getStockCodeByName(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockListedDate
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(39)
  int getStockListedDate(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockMaxPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(40)
  int getStockMaxPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockMinPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(41)
  int getStockMinPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockParPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(42)
  int getStockParPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockStdPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(43)
  int getStockStdPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockYdOpenPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(44)
  int getStockYdOpenPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockYdHighPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(45)
  int getStockYdHighPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockYdLowPrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(46)
  int getStockYdLowPrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockYdClosePrice
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(47)
  int getStockYdClosePrice(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockParPriceChageType
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_ECT_PARPRICE_CHANGE
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(48)
  com.blackvelvet.cybos.bridge.cputil.CPE_ECT_PARPRICE_CHANGE getStockParPriceChageType(
    java.lang.String bstrName);


  /**
   * <p>
   * method IsStockCreditEnable
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(49)
  int isStockCreditEnable(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetVentureKind
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_ECT_VENTURE_KIND
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(50)
  com.blackvelvet.cybos.bridge.cputil.CPE_ECT_VENTURE_KIND getVentureKind(
    java.lang.String bstrName);


  /**
   * <p>
   * method IsStockLoanEnable
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(51)
  int isStockLoanEnable(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetStockEngName
   * </p>
   * @param bstrCode Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String getStockEngName(
    java.lang.String bstrCode);


  /**
   * <p>
   * method GetWorkDate
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String getWorkDate();


  /**
   * <p>
   * method IsSPAC
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(54)
  int isSPAC(
    java.lang.String bstrName);


  /**
   * <p>
   * method IsLendingStockEnable
   * </p>
   * @param bstrName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(55)
  int isLendingStockEnable(
    java.lang.String bstrName);


  /**
   * <p>
   * method GetMiniFutureList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getMiniFutureList();


  // Properties:
}
