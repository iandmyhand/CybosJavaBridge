package com.blackvelvet.cybos.bridge.cputil  ;

import com4j.*;

/**
 * ICpBondCode 인터페이스
 */
@IID("{D226367D-66EC-42FE-AED5-696F697AFB6D}")
public interface ICpBondCode extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property Code
   * </p>
   * <p>
   * Getter method for the COM property "code"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String code();


  /**
   * <p>
   * property Name
   * </p>
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * property Type
   * </p>
   * <p>
   * Getter method for the COM property "type"
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_BOND_TYPE
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  com.blackvelvet.cybos.bridge.cputil.CPE_BOND_TYPE type();


  /**
   * <p>
   * property Remain
   * </p>
   * <p>
   * Getter method for the COM property "Remain"
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_BOND_REMAIN
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  com.blackvelvet.cybos.bridge.cputil.CPE_BOND_REMAIN remain();


  /**
   * <p>
   * property Issue
   * </p>
   * <p>
   * Getter method for the COM property "Issue"
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_BOND_ISSUE
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  com.blackvelvet.cybos.bridge.cputil.CPE_BOND_ISSUE issue();


  /**
   * <p>
   * property Interest
   * </p>
   * <p>
   * Getter method for the COM property "Interest"
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_BOND_INTEREST
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  com.blackvelvet.cybos.bridge.cputil.CPE_BOND_INTEREST interest();


  /**
   * <p>
   * property IssueDate
   * </p>
   * <p>
   * Getter method for the COM property "IssueDate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  int issueDate();


  /**
   * <p>
   * property ExpirationDate
   * </p>
   * <p>
   * Getter method for the COM property "ExpirationDate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  int expirationDate();


  /**
   * <p>
   * property Retail
   * </p>
   * <p>
   * Getter method for the COM property "Retail"
   * </p>
   * @return  Returns a value of type com.blackvelvet.cybos.bridge.cputil.CPE_BOND_RETAIL
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  com.blackvelvet.cybos.bridge.cputil.CPE_BOND_RETAIL retail();


  /**
   * <p>
   * property CouponRate
   * </p>
   * <p>
   * Getter method for the COM property "CouponRate"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  double couponRate();


  /**
   * <p>
   * property InterestShortName
   * </p>
   * <p>
   * Getter method for the COM property "InterestShortName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String interestShortName();


  /**
   * <p>
   * property InterestCycle
   * </p>
   * <p>
   * Getter method for the COM property "InterestCycle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  int interestCycle();


  /**
   * <p>
   * property RiskLevel
   * </p>
   * <p>
   * Getter method for the COM property "RiskLevel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String riskLevel();


  // Properties:
}
