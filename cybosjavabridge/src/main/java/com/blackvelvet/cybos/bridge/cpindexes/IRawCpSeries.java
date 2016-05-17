package com.blackvelvet.cybos.bridge.cpindexes  ;

import com4j.*;

/**
 * IRawCpSeries 인터페이스
 */
@IID("{2C6A064A-DE70-4AFD-AE57-2FD3A443CBA4}")
public interface IRawCpSeries extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method GetRawData
   * </p>
   * @param startIndex Optional parameter. Default value is 0
   * @return  Returns a value of type int
   */

  @VTID(3)
  int getRawData(
    @Optional @DefaultValue("0") int startIndex);


  // Properties:
}
