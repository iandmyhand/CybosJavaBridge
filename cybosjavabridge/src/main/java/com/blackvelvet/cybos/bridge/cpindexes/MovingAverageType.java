package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 */
public enum MovingAverageType implements ComEnum {
  /**
   * <p>
   * 단순
   * </p>
   * <p>
   * The value of this constant is 83
   * </p>
   */
  mvSimple(83),
  /**
   * <p>
   * 지수
   * </p>
   * <p>
   * The value of this constant is 69
   * </p>
   */
  mvExponent(69),
  /**
   * <p>
   * 가중
   * </p>
   * <p>
   * The value of this constant is 87
   * </p>
   */
  mvWeight(87),
  /**
   * <p>
   * 기하
   * </p>
   * <p>
   * The value of this constant is 71
   * </p>
   */
  mvGeometry(71),
  /**
   * <p>
   * 삼각가중
   * </p>
   * <p>
   * The value of this constant is 84
   * </p>
   */
  mvTriWeight(84),
  /**
   * <p>
   * 누적
   * </p>
   * <p>
   * The value of this constant is 65
   * </p>
   */
  mvAccumulate(65),
  /**
   * <p>
   * 평활
   * </p>
   * <p>
   * The value of this constant is 77
   * </p>
   */
  mvSmoothed(77),
  /**
   * <p>
   * 최소자승
   * </p>
   * <p>
   * The value of this constant is 76
   * </p>
   */
  mvLeastSquare(76),
  ;

  private final int value;
  MovingAverageType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
