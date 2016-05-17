package com.blackvelvet.cybos.bridge.cpforeutil  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpForeOvFutCode Class
   */
  public static com.blackvelvet.cybos.bridge.cpforeutil.ICpForeOvFutCode createCpForeOvFutCode() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpforeutil.ICpForeOvFutCode.class, "{029CD802-DCCD-4D4E-B765-0F9E70BFEEFC}" );
  }
}
