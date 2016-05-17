package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 */
public enum CPE_LAC_KIND implements ComEnum {
  /**
   * <p>
   * 구분없음
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  CPC_LAC_NORMAL(0),
  /**
   * <p>
   * 권리락
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CPC_LAC_EX_RIGHTS(1),
  /**
   * <p>
   * 배당락
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CPC_LAC_EX_DIVIDEND(2),
  /**
   * <p>
   * 분배락
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  CPC_LAC_EX_DISTRI_DIVIDEND(3),
  /**
   * <p>
   * 권배락
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  CPC_LAC_EX_RIGHTS_DIVIDEND(4),
  /**
   * <p>
   * 중간배당락
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  CPC_LAC_INTERIM_DIVIDEND(5),
  /**
   * <p>
   * 권리중간배당락
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  CPC_LAC_EX_RIGHTS_INTERIM_DIVIDEND(6),
  /**
   * <p>
   * 액면분할
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  CPC_LAC_PAR_DIVIDE(7),
  /**
   * <p>
   * 액면병합
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  CPC_LAC_PAR_MERGE(8),
  /**
   * <p>
   * 감자
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  CPC_LAC_REDUCTION(9),
  /**
   * <p>
   * 병합
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  CPC_LAC_MERGE(10),
  /**
   * <p>
   * 기타
   * </p>
   * <p>
   * The value of this constant is 99
   * </p>
   */
  CPC_LAC_ETC(99),
  ;

  private final int value;
  CPE_LAC_KIND(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
