package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpSeries Class
   */
  public static com.blackvelvet.cybos.bridge.cpindexes.ICpSeries createCpSeries() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpindexes.ICpSeries.class, "{9FDCED6B-F909-4633-9985-15A45BFC85F2}" );
  }

  /**
   * CpIndex Class
   */
  public static com.blackvelvet.cybos.bridge.cpindexes.ICpIndex createCpIndex() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpindexes.ICpIndex.class, "{60EE7DC7-ECEC-4CA1-A098-2EDF4DC726F2}" );
  }
}
