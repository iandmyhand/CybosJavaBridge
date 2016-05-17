package com.blackvelvet.cybos.bridge.cpdib  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpField Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.ICpField createCpField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.ICpField.class, "{85934405-08FD-11D4-8231-00105A7C4F8C}" );
  }

  /**
   * CpFields Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.ICpFields createCpFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.ICpFields.class, "{55D0C6E5-0966-11D4-8232-00105A7C4F8C}" );
  }

  /**
   * StockMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{9FF543E2-FB11-11D3-8224-00105A7C4F8C}" );
  }

  /**
   * StockCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{55D0C6E7-0966-11D4-8232-00105A7C4F8C}" );
  }

  /**
   * StockBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{D6122124-0B4C-11D4-8234-00105A7C4F8C}" );
  }

  /**
   * StockFrnord Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockFrnord() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{48096137-0B62-11D4-8234-00105A7C4F8C}" );
  }

  /**
   * StockJpbid Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockJpbid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{4809613A-0B62-11D4-8234-00105A7C4F8C}" );
  }

  /**
   * StockJpbid2 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockJpbid2() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{4809613F-0B62-11D4-8234-00105A7C4F8C}" );
  }

  /**
   * StockCbchk Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockCbchk() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{5B886BA4-0B8E-11D4-8235-00105A7C4F8C}" );
  }

  /**
   * StockMember Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockMember() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{02CAF55C-0C31-11D4-8236-00105A7C4F8C}" );
  }

  /**
   * StockMember1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockMember1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{02CAF560-0C31-11D4-8236-00105A7C4F8C}" );
  }

  /**
   * StockWeek Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockWeek() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{7C79B1F6-0E74-11D4-823A-00105A7C4F8C}" );
  }

  /**
   * CbGraph1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCbGraph1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{8A1D75A5-0F42-11D4-823D-00105A7C4F8C}" );
  }

  /**
   * FutureMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1583EA45-B4D3-4B3A-8018-A0FDF8334619}" );
  }

  /**
   * FutureCurr Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureCurr() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{8F101465-F973-4601-ABF6-7B281A79C93C}" );
  }

  /**
   * FutureIndexi Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureIndexi() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{B28635B1-FF2B-4E03-98CC-427D71AA5AC4}" );
  }

  /**
   * FutureWide Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureWide() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{9D5B7EF6-30C3-43F7-B9F5-6AD9A3CE6A26}" );
  }

  /**
   * FutureMo1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureMo1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{8F86C563-8079-47FD-979E-6C4C7D647786}" );
  }

  /**
   * OptionMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{B040FF23-27CD-46B2-BDC8-E7E793509C65}" );
  }

  /**
   * OptionCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{2A90886E-86C7-4E37-94BF-D66FD36426F9}" );
  }

  /**
   * OptionMo Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionMo() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{505B3ED8-392F-482D-A0C4-6D40F9E7EA72}" );
  }

  /**
   * OptionGreek Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionGreek() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{F39298B4-74D1-4699-AE7D-82C2CC428E25}" );
  }

  /**
   * OptionGen Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionGen() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{309CFF13-AE6E-48BD-8BE0-13B75D33D3E7}" );
  }

  /**
   * OptionCallput Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionCallput() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{0E581B11-5E74-4A79-8609-AF117BDB88E0}" );
  }

  /**
   * StockIndexir Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockIndexir() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1C95CC46-DDC7-4015-8D06-7028FACDE801}" );
  }

  /**
   * StockIndexis Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockIndexis() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{354E2635-A0AB-4511-BCD9-13C187A37C89}" );
  }

  /**
   * FutureBid1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureBid1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{12A49893-A2E9-42A0-9DD4-C28851E597D0}" );
  }

  /**
   * StockMstm Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockMstm() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{92372A60-C14C-4B8B-A656-1BB5C17F84AC}" );
  }

  /**
   * FutureIndexh Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureIndexh() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{A8341025-9D81-467C-8D44-5F569BF37842}" );
  }

  /**
   * StockStu Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockStu() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1D9E7343-8C92-430A-9C8D-F8C6DCF3D635}" );
  }

  /**
   * FutureFtu Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureFtu() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{CEE55BF3-DE0B-46B9-AD5E-108D875E54FE}" );
  }

  /**
   * OptionFtu Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionFtu() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{70A9C960-FBFF-4981-A081-3F323B3A439F}" );
  }

  /**
   * FutureGr1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureGr1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1EF6F3EE-F43F-4FEC-845A-44D4CF769272}" );
  }

  /**
   * OptionGr1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionGr1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{65735FE8-5B16-4285-A832-532E5FFC9B38}" );
  }

  /**
   * CpSvr7225 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr7225() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{C12D47E0-BACB-47AE-BC6C-4BD5744A8680}" );
  }

  /**
   * PgAtime8112 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createPgAtime8112() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{44F25C73-57E6-4BAA-9369-9B6F42CD5D55}" );
  }

  /**
   * StockAdS Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockAdS() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{5CBBF6AD-6896-40A2-BC7F-630C274627BE}" );
  }

  /**
   * StockAdR Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockAdR() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{7630F872-FDF8-4880-BE46-C7B912CA5CC1}" );
  }

  /**
   * CpConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{72FDAF04-F87B-47E1-9396-0A7C98F4E5C5}" );
  }

  /**
   * StockAdkS Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockAdkS() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{58172CD3-659D-45C7-8E5E-9C65049C8202}" );
  }

  /**
   * StockAdkR Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockAdkR() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{0D60B192-F361-4353-8B23-44514911FA6F}" );
  }

  /**
   * CpFConclusion Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpFConclusion() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{F33F2A8E-A1F8-40C3-9F0D-8001E409B18A}" );
  }

  /**
   * FutureWeek1 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureWeek1() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{0D4CDCEC-DD27-402B-8036-094CB9D18F3E}" );
  }

  /**
   * OptionBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{137C4125-1323-469D-86BC-962C2C9CAC11}" );
  }

  /**
   * FutureK200 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureK200() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{52F1E791-07E5-49DD-ADBD-4F59CEE7E56D}" );
  }

  /**
   * OptionWeek Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionWeek() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{B946B892-D57E-4D7D-A8A2-D857EC54C419}" );
  }

  /**
   * OptionInfo Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionInfo() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{F68D10E7-FEED-4FDE-BBAA-D1FF881771BA}" );
  }

  /**
   * OptionTV Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionTV() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{594BC899-B2DF-4C32-83DF-6E0AA542B8DC}" );
  }

  /**
   * CpSvr7223 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr7223() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1F1E0B94-8A20-4F9E-A89D-53C3E5C1EC56}" );
  }

  /**
   * CpSvr8092S Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8092S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{362648C3-A91F-4BD6-B65C-354FCE9FCC5E}" );
  }

  /**
   * CpSvr8561 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8561() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{71A629F4-D2A8-4F0C-AD48-B2B6494FD0F8}" );
  }

  /**
   * CpSvr8561T Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8561T() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{B76AB425-5D82-4A74-BE0F-B5FAC0453787}" );
  }

  /**
   * CpSvr8562 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8562() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{BCBE0F92-D5A0-44CF-ACB1-572E5246F4C3}" );
  }

  /**
   * CpSvr8563 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8563() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{B40008F5-BE02-42D1-AF05-0A95713D9F5C}" );
  }

  /**
   * CpSvr8091 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8091() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{2A04F706-DFCD-4588-9130-CCBC2C6043C8}" );
  }

  /**
   * CpSvr8091S Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8091S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{FA8F5A92-82B3-45A5-957B-F052EDCE3556}" );
  }

  /**
   * SoptionWeek Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createSoptionWeek() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{0D6CDFB5-78EF-472B-807E-6C994FE01830}" );
  }

  /**
   * SoptionMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createSoptionMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{DEFA472E-99E2-4355-B2C7-B1894541CC3D}" );
  }

  /**
   * SoptionCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createSoptionCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{CB5D1FFE-52B0-415F-9D97-DF8261878A1A}" );
  }

  /**
   * SoptionBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createSoptionBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{B17A779E-1C22-46B9-81C9-F52A92DCBAA2}" );
  }

  /**
   * SoptionCallput Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createSoptionCallput() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1D98FA00-46A7-410D-BEEE-378BE2F232B4}" );
  }

  /**
   * CpSvr8081 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8081() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{9D163A76-6432-46D8-AC7E-0F998B7AE283}" );
  }

  /**
   * CpSvr8082 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8082() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{C375F210-E366-4CB4-9AE2-60D77D306FCF}" );
  }

  /**
   * CpSvr8083 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8083() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{46570098-CA2D-4CCE-A9B0-348728C96814}" );
  }

  /**
   * CpSvr8111 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8111() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{4BDD0A5C-CBD7-426A-A1B0-CD7BB6DA3EF7}" );
  }

  /**
   * CpSvr8111S Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8111S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{2D79A13E-79DA-41A2-B565-BD9AED15E84B}" );
  }

  /**
   * CpSvr8111KS Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8111KS() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{91E94973-C856-4368-9402-E1707CE2146C}" );
  }

  /**
   * CpSvr8116 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8116() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{F17A78B1-7DE3-48AC-AB79-588869083989}" );
  }

  /**
   * CpSvr7818 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr7818() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{757B16A4-9A6A-427D-9332-BD5ABBAA3083}" );
  }

  /**
   * CpSvr7818C Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr7818C() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{18457BCD-7EC0-4312-9245-0036DC2DDACE}" );
  }

  /**
   * CpSvr7819 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr7819() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{C2DCC501-49E9-4ADB-8353-294FE25E7428}" );
  }

  /**
   * CpSvr7819C Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr7819C() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1481AECC-DCC7-4161-9829-91DFDD24E70B}" );
  }

  /**
   * CpSvr8300 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8300() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{C517AF9D-F297-449F-BECA-7B59F1DB845B}" );
  }

  /**
   * CpFore8311 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpFore8311() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{0049522C-26C0-4BCC-AB77-E7AEAD1A4620}" );
  }

  /**
   * CpFore8312 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpFore8312() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{C192C148-EDC1-400C-ADE8-48778BE42737}" );
  }

  /**
   * StockMst2 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockMst2() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{EEA6A7D7-1E8C-4D90-8ACB-7BD391694978}" );
  }

  /**
   * StockOutMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockOutMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{1D5575F8-D57A-443E-80E8-F2A26F8FC168}" );
  }

  /**
   * StockOutCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockOutCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{A58788CC-6F6D-4287-8194-D1D5EBFC13CE}" );
  }

  /**
   * OptionAtm Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionAtm() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{7163F981-6552-49E9-84AF-EC1E62FEC867}" );
  }

  /**
   * FutureOptionStat Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureOptionStat() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{76F545B3-CAD9-4474-BA39-F67352924174}" );
  }

  /**
   * FutureOptionStatPB Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureOptionStatPB() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{2079F79D-798E-4C4D-9A0E-7BAC8FE294C3}" );
  }

  /**
   * StockIndexiChart Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createStockIndexiChart() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{3116500C-0DC1-4C63-B760-043903A463C5}" );
  }

  /**
   * FutOptRest Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutOptRest() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{4FF1F71F-0D95-46F1-80D2-C62E50D46995}" );
  }

  /**
   * ExpectIndexR Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createExpectIndexR() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{A2570BF0-8BF3-4AB8-A4B9-200741A16A11}" );
  }

  /**
   * ExpectIndexS Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createExpectIndexS() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{484427BE-E0C6-45DD-9368-DEF8DB3EFC9D}" );
  }

  /**
   * FutureCurOnly Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createFutureCurOnly() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{21123F9D-FFFC-49B2-ACC1-B89B4EE50A18}" );
  }

  /**
   * CpSvrNew8300 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvrNew8300() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{35E4CB92-E022-4905-B006-519345316A80}" );
  }

  /**
   * CmeConclusionRt Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCmeConclusionRt() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{DC9ECD73-16FE-4AA3-BEC9-2A8D1E9A8B72}" );
  }

  /**
   * EurexConclusionRt Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createEurexConclusionRt() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{06CD6CE2-CC6E-46A3-B1DF-FB51DEA97A77}" );
  }

  /**
   * OptionCallput2 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createOptionCallput2() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{E530DD89-64A2-4DA4-BA1D-546A68BDD193}" );
  }

  /**
   * CpSvr8119 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8119() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{5D1F4780-250E-4D0D-873D-2D059454F5F1}" );
  }

  /**
   * CpSvr8412 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvr8412() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{E1017E1F-F779-4624-88FD-97381687E54F}" );
  }

  /**
   * CpSvrNew8119 Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvrNew8119() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{8113D43D-FCCB-4521-A13D-B7CCA8EBF378}" );
  }

  /**
   * CpSvrNew8119Chart Class
   */
  public static com.blackvelvet.cybos.bridge.cpdib.IDib createCpSvrNew8119Chart() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpdib.IDib.class, "{FD0CCD4E-3E44-4288-A42C-606D9703373B}" );
  }
}
