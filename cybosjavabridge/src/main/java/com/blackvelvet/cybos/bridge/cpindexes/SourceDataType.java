package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 */
public enum SourceDataType implements ComEnum {
  /**
   * <p>
   * 시가
   * </p>
   * <p>
   * The value of this constant is 79
   * </p>
   */
  sdOpen(79),
  /**
   * <p>
   * 고가
   * </p>
   * <p>
   * The value of this constant is 72
   * </p>
   */
  sdHigh(72),
  /**
   * <p>
   * 저가
   * </p>
   * <p>
   * The value of this constant is 76
   * </p>
   */
  sdLow(76),
  /**
   * <p>
   * 종가
   * </p>
   * <p>
   * The value of this constant is 67
   * </p>
   */
  sdClose(67),
  /**
   * <p>
   * 거래량
   * </p>
   * <p>
   * The value of this constant is 86
   * </p>
   */
  sdVolume(86),
  /**
   * <p>
   * 중간가
   * </p>
   * <p>
   * The value of this constant is 77
   * </p>
   */
  sdMiddle(77),
  /**
   * <p>
   * 대표가
   * </p>
   * <p>
   * The value of this constant is 82
   * </p>
   */
  sdReprsent(82),
  /**
   * <p>
   * 확장값
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  sdExtend(0),
  ;

  private final int value;
  SourceDataType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
