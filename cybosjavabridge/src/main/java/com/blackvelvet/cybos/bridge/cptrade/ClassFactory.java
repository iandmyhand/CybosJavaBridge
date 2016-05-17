package com.blackvelvet.cybos.bridge.cptrade  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpTdField Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdField createCpTdField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdField.class, "{672A5C44-9446-4405-9F0E-1EA1FEFC29ED}" );
  }

  /**
   * CpTdFields Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdFields createCpTdFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdFields.class, "{4AABFB5F-4AC0-41D5-9458-D670489A8B66}" );
  }

  /**
   * CpTdUtil Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdUtil createCpTdUtil() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdUtil.class, "{1172DA0D-1235-4348-880B-10F95AC86E46}" );
  }

  /**
   * CpTradeKey Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTradeKey() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{0CAA9637-7CAA-4A96-80D2-8CBEAFD66EEE}" );
  }

  /**
   * CpTd0311 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0311() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{ACAD853E-9FA9-4165-9CE9-166BF4414AA3}" );
  }

  /**
   * CpTd5341 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd5341() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{8203C86A-2282-4225-A79E-A9559357A3BC}" );
  }

  /**
   * CpTd5339 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd5339() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{D82177A9-9AD3-4B30-9134-9C28BE43656D}" );
  }

  /**
   * CpTd0312 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0312() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{1497FD6D-0439-47BC-95B3-B838CD32D00F}" );
  }

  /**
   * CpTd0313 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0313() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{CB3DDA0D-E824-4008-8E69-CF168ABB6361}" );
  }

  /**
   * CpTd0303 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0303() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{A4B66D34-D296-477C-B4C2-3900810DF8F3}" );
  }

  /**
   * CpTd0314 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0314() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{15110F2E-4E3A-4921-AF52-EE6BF85AAD6E}" );
  }

  /**
   * CpTd6033 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6033() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{1E090CEF-B084-4961-93C3-92360F4D2226}" );
  }

  /**
   * CpTd5342 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd5342() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{4E87EAB5-DB31-4FA6-AE19-47FFFE0672B9}" );
  }

  /**
   * CpTd0315 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0315() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{ED55E435-4C27-48A0-9033-309EF9D88E1F}" );
  }

  /**
   * CpTd0316 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0316() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{91875829-5FDE-4254-BA35-52272D546F8F}" );
  }

  /**
   * CpTd0306 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0306() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{0002AEE1-A91F-4CF8-AD84-13E5844EC471}" );
  }

  /**
   * CpTd0317 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0317() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{60D268EF-1D95-49B2-9E83-35B5DCD2A241}" );
  }

  /**
   * CpTd6740 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6740() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{F717B1BE-567C-4F55-A140-6E02FA7B8BD9}" );
  }

  /**
   * CpTd6743R Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6743R() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{F1BEF87C-30DC-424E-B5FC-01F1B5E10FED}" );
  }

  /**
   * CpTd6750L Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6750L() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{6B725C6E-D885-480B-B08C-D6AAF4BB76AC}" );
  }

  /**
   * CpTd6751 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6751() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{138A98B2-BA82-4CB9-BFD1-5FD4AE078DDF}" );
  }

  /**
   * CpTd6753 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6753() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{1C5CD253-54F6-4175-AD38-0F9BFE7B7B5A}" );
  }

  /**
   * CpTd6754 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6754() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{233AA076-0DF8-47DA-BAED-A035138540F8}" );
  }

  /**
   * CpTd6831 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6831() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{BB347FF1-D974-4A50-85FB-C751235AE061}" );
  }

  /**
   * CpTd6832 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6832() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{0BF841E1-849B-4AB9-8D85-5821458A437C}" );
  }

  /**
   * CpTd6833 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6833() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{6DCE8A22-6811-4399-9D34-B915D84F0727}" );
  }

  /**
   * CpTd5371 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd5371() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{2370A08A-7AE8-4ADE-89A3-09477A941C1D}" );
  }

  /**
   * CpTd3811 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd3811() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{EF56DD80-F726-4C1A-A5A8-12D30A2543EF}" );
  }

  /**
   * CpTd5372 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd5372() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{BD6AF962-E715-4014-ADC7-7AE2132DB763}" );
  }

  /**
   * CpTd0723class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0723() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{F4294E75-719A-4728-A240-161773E1C964}" );
  }

  /**
   * CpTd6722 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6722() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{BE3394F1-4D4E-4508-923E-865CDAB9DCC8}" );
  }

  /**
   * CpTd6841 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6841() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{B6E99909-F65C-4DF9-9C0A-8EF2318610D0}" );
  }

  /**
   * CpTd6842 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6842() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{20A0CCAB-B4C8-4671-9624-AF420FCA1831}" );
  }

  /**
   * CpTd6843 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6843() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{97ABDC4A-3287-4D8C-822D-BB1476504E23}" );
  }

  /**
   * CpTd0322 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0322() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{BCF369E7-2657-4BD5-AE57-3E06A0FE461B}" );
  }

  /**
   * CpTd0326 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0326() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{BCB65B18-E3E5-4099-9070-B602D9B4BB42}" );
  }

  /**
   * CpTd0355 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0355() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{40A1A9C2-43E3-4BD8-A0A6-223C5BC5E86F}" );
  }

  /**
   * CpTd0356 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0356() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{C82BFF91-9F5C-400D-9B52-40BA3AC47F73}" );
  }

  /**
   * CpTdNew5331A Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTdNew5331A() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{A01B00EA-B723-4F29-884E-F12F6760F248}" );
  }

  /**
   * CpTdNew5331B Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTdNew5331B() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{99EE8587-50FE-4520-8551-BEE017B3C16F}" );
  }

  /**
   * CpTd6197 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd6197() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{4DE84A1D-FB39-4B57-8E61-0216777A1B31}" );
  }

  /**
   * CpTd0386 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0386() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{A7984EA5-C50B-4DF3-A92C-7E6CC7AFB20A}" );
  }

  /**
   * CpTd0387 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0387() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{EB4C7EC4-5D99-454B-930C-12081EA02658}" );
  }

  /**
   * CpTd0389 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0389() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{C24DC073-D02C-409A-8358-C8BEB483BE41}" );
  }

  /**
   * CpTd9065 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9065() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{DA92E1FD-717F-4549-BB5C-90391302E84F}" );
  }

  /**
   * CpTd9081 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9081() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{8B8DA4AD-72A4-4D06-B249-90273D97CC14}" );
  }

  /**
   * CpTd9082 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9082() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{4C91160F-8C08-432D-A809-48A908D96016}" );
  }

  /**
   * CpTd9083 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9083() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{D44BB8E2-8E72-42E5-8B83-0D70E4338128}" );
  }

  /**
   * CpTd9084 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9084() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{D178011D-1CEB-4250-BB80-F9D42776BB46}" );
  }

  /**
   * CpTd9085 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9085() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{D585FF27-E7C3-484F-8F19-CAFF39CE0A49}" );
  }

  /**
   * CpTd0354 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0354() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{63A29BB8-469C-4965-B4E2-FC1A545E4E2B}" );
  }

  /**
   * CpTd0323 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0323() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{5BE98374-8EE2-4C9C-AF7A-46D33E12F476}" );
  }

  /**
   * CpTd0359 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0359() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{E476724F-D2F2-4BB9-86E5-C350891E4FB4}" );
  }

  /**
   * CpTd0388 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0388() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{C9410BA8-F7DB-4433-BEBA-670FC9D71C74}" );
  }

  /**
   * CpTd0721F Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0721F() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{CE7160AC-297A-4274-9AEB-26F9D1312DF8}" );
  }

  /**
   * CpTd0732 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0732() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{FCC8B385-6ABB-44E5-AD6C-78448F901895}" );
  }

  /**
   * CpTdNew9061 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTdNew9061() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{6C7B3B4E-7D8B-4598-AE1A-518E8FD459C2}" );
  }

  /**
   * CpTdNew9064 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTdNew9064() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{3AE88694-EAE6-4DDE-AB31-CA5A1408319B}" );
  }

  /**
   * CpTd3661 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd3661() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{AB94158B-0724-46B5-985D-75D818856A56}" );
  }

  /**
   * CpTd3661D Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd3661D() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{9842E02C-187C-4B0B-9120-5D02FEB58474}" );
  }

  /**
   * CmeOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCmeOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{FB214CC6-2265-4078-9405-FEF5D909B227}" );
  }

  /**
   * CmeBalance Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCmeBalance() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{DEAC8F35-DD30-4C02-B105-9F558863D797}" );
  }

  /**
   * CmeConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCmeConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{F415CACE-CCFF-4F7A-8ACD-4C3045DDD2D1}" );
  }

  /**
   * CmeNoConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCmeNoConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{6C242F93-DE5E-4039-961F-4C116D74BE66}" );
  }

  /**
   * EurexBalance Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createEurexBalance() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{1D18474B-29CA-45B5-A3A5-A75B3593888B}" );
  }

  /**
   * EurexConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createEurexConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{47FA1A84-D56E-4AC7-A176-D9A2BCF01C72}" );
  }

  /**
   * EurexNoConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createEurexNoConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{C822BB56-2BB3-412F-BFD7-9DE5E42E2A48}" );
  }

  /**
   * EurexOrder Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createEurexOrder() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{62055D8A-2A2C-482A-AB61-4B6808A6B95F}" );
  }

  /**
   * CmeConclusionDay Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCmeConclusionDay() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{2E24A4D5-749A-4E08-98B7-081897BF6612}" );
  }

  /**
   * EurexConclusionDay Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createEurexConclusionDay() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{81C12AD3-D154-4908-81FF-01C6D65A052E}" );
  }

  /**
   * CmeEurexProfitLoss Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCmeEurexProfitLoss() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{7163F543-C48D-4BF4-8CB9-723D1160C03A}" );
  }

  /**
   * CpTd9197 Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd9197() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{8BA40942-F695-44D4-A159-BBD40E92F35C}" );
  }

  /**
   * CpTd0711AtmAll Class
   */
  public static com.blackvelvet.cybos.bridge.cptrade.ICpTdDib createCpTd0711AtmAll() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cptrade.ICpTdDib.class, "{DED73E82-8BC5-44CF-8B68-6D4D0A629D4F}" );
  }
}
