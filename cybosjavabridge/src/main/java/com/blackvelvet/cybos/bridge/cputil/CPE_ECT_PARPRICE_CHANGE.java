package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 */
public enum CPE_ECT_PARPRICE_CHANGE implements ComEnum {
  /**
   * <p>
   * 해당없음
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  CPC_PARPRICE_CHANGE_NONE(0),
  /**
   * <p>
   * 액면분할
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CPC_PARPRICE_CHANGE_DIVIDE(1),
  /**
   * <p>
   * 액면병합
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CPC_PARPRICE_CHANGE_MERGE(2),
  /**
   * <p>
   * 기타
   * </p>
   * <p>
   * The value of this constant is 99
   * </p>
   */
  CPC_PARPRICE_CHANGE_ETC(99),
  ;

  private final int value;
  CPE_ECT_PARPRICE_CHANGE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
