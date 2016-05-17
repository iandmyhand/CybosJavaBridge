package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 */
public enum MovingAverageType implements ComEnum {
  /**
   * <p>
   * �ܼ�
   * </p>
   * <p>
   * The value of this constant is 83
   * </p>
   */
  mvSimple(83),
  /**
   * <p>
   * ����
   * </p>
   * <p>
   * The value of this constant is 69
   * </p>
   */
  mvExponent(69),
  /**
   * <p>
   * ����
   * </p>
   * <p>
   * The value of this constant is 87
   * </p>
   */
  mvWeight(87),
  /**
   * <p>
   * ����
   * </p>
   * <p>
   * The value of this constant is 71
   * </p>
   */
  mvGeometry(71),
  /**
   * <p>
   * �ﰢ����
   * </p>
   * <p>
   * The value of this constant is 84
   * </p>
   */
  mvTriWeight(84),
  /**
   * <p>
   * ����
   * </p>
   * <p>
   * The value of this constant is 65
   * </p>
   */
  mvAccumulate(65),
  /**
   * <p>
   * ��Ȱ
   * </p>
   * <p>
   * The value of this constant is 77
   * </p>
   */
  mvSmoothed(77),
  /**
   * <p>
   * �ּ��ڽ�
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
