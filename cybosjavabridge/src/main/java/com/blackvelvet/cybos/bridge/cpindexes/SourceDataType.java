package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 */
public enum SourceDataType implements ComEnum {
  /**
   * <p>
   * �ð�
   * </p>
   * <p>
   * The value of this constant is 79
   * </p>
   */
  sdOpen(79),
  /**
   * <p>
   * ��
   * </p>
   * <p>
   * The value of this constant is 72
   * </p>
   */
  sdHigh(72),
  /**
   * <p>
   * ����
   * </p>
   * <p>
   * The value of this constant is 76
   * </p>
   */
  sdLow(76),
  /**
   * <p>
   * ����
   * </p>
   * <p>
   * The value of this constant is 67
   * </p>
   */
  sdClose(67),
  /**
   * <p>
   * �ŷ���
   * </p>
   * <p>
   * The value of this constant is 86
   * </p>
   */
  sdVolume(86),
  /**
   * <p>
   * �߰���
   * </p>
   * <p>
   * The value of this constant is 77
   * </p>
   */
  sdMiddle(77),
  /**
   * <p>
   * ��ǥ��
   * </p>
   * <p>
   * The value of this constant is 82
   * </p>
   */
  sdReprsent(82),
  /**
   * <p>
   * Ȯ�尪
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
