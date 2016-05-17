package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 */
public enum CPE_CONTROL_KIND {
  /**
   * <p>
   * 정상
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  CPC_CONTROL_NONE, // 0
  /**
   * <p>
   * 주의
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  CPC_CONTROL_ATTENTION, // 1
  /**
   * <p>
   * 경고
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  CPC_CONTROL_WARNING, // 2
  /**
   * <p>
   * 위험예고
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  CPC_CONTROL_DANGER_NOTICE, // 3
  /**
   * <p>
   * 위험
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  CPC_CONTROL_DANGER, // 4
}
