package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 */
public enum USTYPE implements ComEnum {
  /**
   * <p>
   * 전종목
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  USTYPE_ALL(1),
  /**
   * <p>
   * 국가대표
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  USTYPE_COUNTRY(2),
  /**
   * <p>
   * 업종
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  USTYPE_UPJONG(3),
  /**
   * <p>
   * 종목
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  USTYPE_JONGMOK(4),
  /**
   * <p>
   * 예탁증서
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  USTYPE_DR(5),
  /**
   * <p>
   * 상품선물
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  USTYPE_RAW(6),
  /**
   * <p>
   * 환율
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  USTYPE_EXCHANGE(7),
  ;

  private final int value;
  USTYPE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
