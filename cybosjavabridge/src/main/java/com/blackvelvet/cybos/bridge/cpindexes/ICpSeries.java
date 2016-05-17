package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 * ICpSeries 인터페이스
 */
@IID("{B4699E1B-A709-4880-AD88-D11B4088D24B}")
public interface ICpSeries extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method Clear
   * </p>
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void clear();


  /**
   * <p>
   * method Add
   * </p>
   * @param close Mandatory java.lang.Object parameter.
   * @param open Optional parameter. Default value is com4j.Variant.getMissing()
   * @param high Optional parameter. Default value is com4j.Variant.getMissing()
   * @param low Optional parameter. Default value is com4j.Variant.getMissing()
   * @param volume Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object close,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object open,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object high,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object low,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object volume,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comment);


  /**
   * <p>
   * method Update
   * </p>
   * @param close Mandatory java.lang.Object parameter.
   * @param open Optional parameter. Default value is com4j.Variant.getMissing()
   * @param high Optional parameter. Default value is com4j.Variant.getMissing()
   * @param low Optional parameter. Default value is com4j.Variant.getMissing()
   * @param volume Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comment Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void update(
    @MarshalAs(NativeType.VARIANT) java.lang.Object close,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object open,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object high,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object low,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object volume,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comment);


  /**
   * <p>
   * property Count
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * method GetOpen
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  double getOpen(
    int index);


  /**
   * <p>
   * method GetOpens
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type double[]
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  double[] getOpens(
    @Optional @DefaultValue("0") int startIndex);


  /**
   * <p>
   * method GetHigh
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  double getHigh(
    int index);


  /**
   * <p>
   * method GetHighs
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type double[]
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  double[] getHighs(
    @Optional @DefaultValue("0") int startIndex);


  /**
   * <p>
   * method GetLow
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  double getLow(
    int index);


  /**
   * <p>
   * method GetLows
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type double[]
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  double[] getLows(
    @Optional @DefaultValue("0") int startIndex);


  /**
   * <p>
   * method GetClose
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  double getClose(
    int index);


  /**
   * <p>
   * method GetCloses
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type double[]
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  double[] getCloses(
    @Optional @DefaultValue("0") int startIndex);


  /**
   * <p>
   * method GetVolume
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  double getVolume(
    int index);


  /**
   * <p>
   * method GetVolumes
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type double[]
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  double[] getVolumes(
    @Optional @DefaultValue("0") int startIndex);


  /**
   * <p>
   * method GetComment
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getComment(
    int index);


  /**
   * <p>
   * method GetComments
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.Object[] getComments(
    @Optional @DefaultValue("0") int startIndex);


  // Properties:
}
