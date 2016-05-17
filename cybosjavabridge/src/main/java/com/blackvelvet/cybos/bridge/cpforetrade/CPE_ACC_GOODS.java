package com.blackvelvet.cybos.bridge.cpforetrade  ;

import com4j.*;

/**
 */
public enum CPE_ACC_GOODS implements ComEnum {
  /**
   * <p>
   * ��ü
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  CPC_ALL_ACC(-1),
  /**
   * <p>
   * �ֽİ���
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CPC_STOCK_ACC(1),
  /**
   * <p>
   * ��������
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CPC_FUTURE_ACC(2),
  ;

  private final int value;
  CPE_ACC_GOODS(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
