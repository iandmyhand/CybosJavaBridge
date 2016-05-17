package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 */
public enum CALLPUT_TYPE implements ComEnum {
  /**
   * <p>
   * ÄÝ
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  OT_CALL(1),
  /**
   * <p>
   * Ç²
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  OT_PUT(-1),
  ;

  private final int value;
  CALLPUT_TYPE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
