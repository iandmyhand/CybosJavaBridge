package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 * ICpIndex 인터페이스
 */
@IID("{1006BF24-2AE7-44B5-98ED-B5ECD0627924}")
public interface ICpIndex extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property Series
   * </p>
   * <p>
   * Setter method for the COM property "Series"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void series(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject rhs);


  /**
   * <p>
   * property StartIndex
   * </p>
   * <p>
   * Setter method for the COM property "StartIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void startIndex(
    int rhs);


  /**
   * <p>
   * method Calculate
   * </p>
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void calculate();


  /**
   * <p>
   * method GetResult
   * </p>
   * @param item Optional parameter. Default value is 0
   * @param index Optional parameter. Default value is 0
   * @return  Returns a value of type double
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  double getResult(
    @Optional @DefaultValue("0") int item,
    @Optional @DefaultValue("0") int index);


  /**
   * <p>
   * method GetResults
   * </p>
   * @param item Optional parameter. Default value is 0
   * @return  Returns a value of type double[]
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  double[] getResults(
    @Optional @DefaultValue("0") int item);


  /**
   * <p>
   * method GetCount
   * </p>
   * @param item Optional parameter. Default value is 0
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int getCount(
    @Optional @DefaultValue("0") int item);


  /**
   * <p>
   * property SourceData
   * </p>
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory com.blackvelvet.cybos.bridge.cpindexes.SourceDataType parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void sourceData(
    com.blackvelvet.cybos.bridge.cpindexes.SourceDataType rhs);


  /**
   * <p>
   * property Term1
   * </p>
   * <p>
   * Setter method for the COM property "Term1"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(14)
  void term1(
    int rhs);


  /**
   * <p>
   * property Term2
   * </p>
   * <p>
   * Setter method for the COM property "Term2"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(15)
  void term2(
    int rhs);


  /**
   * <p>
   * property Term3
   * </p>
   * <p>
   * Setter method for the COM property "Term3"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(16)
  void term3(
    int rhs);


  /**
   * <p>
   * property Term4
   * </p>
   * <p>
   * Setter method for the COM property "Term4"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(17)
  void term4(
    int rhs);


  /**
   * <p>
   * property Signal
   * </p>
   * <p>
   * Setter method for the COM property "Signal"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(18)
  void signal(
    int rhs);


  /**
   * <p>
   * property SignalMA
   * </p>
   * <p>
   * Setter method for the COM property "SignalMA"
   * </p>
   * @param rhs Mandatory com.blackvelvet.cybos.bridge.cpindexes.MovingAverageType parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(19)
  void signalMA(
    com.blackvelvet.cybos.bridge.cpindexes.MovingAverageType rhs);


  /**
   * <p>
   * property CalculateMethod
   * </p>
   * <p>
   * Setter method for the COM property "CalculateMethod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(20)
  void calculateMethod(
    int rhs);


  /**
   * <p>
   * property ItemCount
   * </p>
   * <p>
   * Getter method for the COM property "ItemCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(21)
  int itemCount();


  /**
   * <p>
   * method GetSkipResultCount
   * </p>
   * @param item Optional parameter. Default value is 0
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(22)
  int getSkipResultCount(
    @Optional @DefaultValue("0") int item);


  /**
   * <p>
   * property DTerm1
   * </p>
   * <p>
   * Setter method for the COM property "DTerm1"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(23)
  void dTerm1(
    double rhs);


  /**
   * <p>
   * property DTerm2
   * </p>
   * <p>
   * Setter method for the COM property "DTerm2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(24)
  void dTerm2(
    double rhs);


  /**
   * <p>
   * method put_IndexDefault
   * </p>
   * @param pRet Mandatory java.lang.Object parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(25)
  void put_IndexDefault(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pRet);


  /**
   * <p>
   * method GetChartIndexCodeList
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getChartIndexCodeList();


  /**
   * <p>
   * method GetChartIndexCodeListByIndex
   * </p>
   * @param pVal1 Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getChartIndexCodeListByIndex(
    int pVal1);


  /**
   * <p>
   * method GetChartIndexNameByIndex
   * </p>
   * @param pVal Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getChartIndexNameByIndex(
    int pVal);


  /**
   * <p>
   * method GetChartIndexByName
   * </p>
   * @param pVal Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getChartIndexByName(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pVal);


  /**
   * <p>
   * method put_IndexKind
   * </p>
   * @param pRet Mandatory java.lang.Object parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(30)
  void put_IndexKind(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pRet);


  /**
   * <p>
   * method GetLineResults
   * </p>
   * @param indexID Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getLineResults(
    @Optional @DefaultValue("0") int indexID);


  /**
   * <p>
   * method GetLineCount
   * </p>
   * @param item Optional parameter. Default value is 0
   * @return  Returns a value of type int
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(32)
  int getLineCount(
    @Optional @DefaultValue("0") int item);


  /**
   * <p>
   * method getSourceData
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cpindexes.SourceDataType
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(33)
  com.blackvelvet.cybos.bridge.cpindexes.SourceDataType getSourceData();


  /**
   * <p>
   * method get_Term1
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(34)
  int get_Term1();


  /**
   * <p>
   * method get_Term2
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(35)
  int get_Term2();


  /**
   * <p>
   * method get_Term3
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(36)
  int get_Term3();


  /**
   * <p>
   * method get_Term4
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(37)
  int get_Term4();


  /**
   * <p>
   * method get_Signal
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(38)
  int get_Signal();


  /**
   * <p>
   * method get_SignalMA
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cpindexes.MovingAverageType
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(39)
  com.blackvelvet.cybos.bridge.cpindexes.MovingAverageType get_SignalMA();


  /**
   * <p>
   * method get_CalculateMethod
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(40)
  int get_CalculateMethod();


  /**
   * <p>
   * method get_DTerm1
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(41)
  double get_DTerm1();


  /**
   * <p>
   * method get_DTerm2
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(42)
  double get_DTerm2();


  /**
   * <p>
   * method Update
   * </p>
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(43)
  void update();


  // Properties:
}
