package com.blackvelvet.cybos.bridge.cpsysdib  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpField Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ICpField createCpField() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ICpField.class, "{BF085D15-ACE9-4E36-8E48-76BB29DA5584}" );
  }

  /**
   * CpFields Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ICpFields createCpFields() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ICpFields.class, "{43733869-291F-43B0-B2EE-8019E7363B55}" );
  }

  /**
   * CpSvrNew7224 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7224() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{E8931FA7-2E91-416F-85B8-F80351FD5C24}" );
  }

  /**
   * CpSvr3745 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr3745() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{AF38F980-ABC8-4C99-8B95-19A1CC39ACB7}" );
  }

  /**
   * CpSvr7043 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7043() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{EA332802-B845-4C3D-8C3A-BBF6D0B11B79}" );
  }

  /**
   * CpSvr8548 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr8548() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{DB6CADF4-515A-4845-BE7B-ECA2D93DAB26}" );
  }

  /**
   * CpSvrNew7221 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7221() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{942C11D6-2DA7-4119-8D4F-493F0623C1B7}" );
  }

  /**
   * CpSvrNew7221S Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7221S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{8A0FAF47-A6A1-4518-B66A-61B7143C389C}" );
  }

  /**
   * CpSvrNew7216 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7216() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{6B0B7CB1-03BC-44CB-8768-79FFC699B41A}" );
  }

  /**
   * CpSvr8114 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr8114() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{8DB220EA-04E0-4272-9AED-6B1550F6DBAB}" );
  }

  /**
   * CpSvr9842 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr9842() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{79A10F99-442F-472D-8088-816B25F85523}" );
  }

  /**
   * CpSvr9842S Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr9842S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{C6CE0564-B055-46AA-A406-DF1AF0A549C2}" );
  }

  /**
   * CpMarketWatch Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpMarketWatch() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{9FA37D6D-1E16-442C-8EDD-A3E423E8FEA1}" );
  }

  /**
   * CpMarketWatchS Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpMarketWatchS() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D6633FD4-D339-4782-B337-2A6C9ED3CA47}" );
  }

  /**
   * CpSvrNew7222 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7222() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{13173568-9547-4910-B040-9168A5DC950C}" );
  }

  /**
   * CpSvr7748 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7748() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{AF9498CB-FFBC-45FA-A5B5-3BE5E48146E5}" );
  }

  /**
   * ElwAll Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createElwAll() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{061DCC2D-02E9-4F42-9090-3EACF821480B}" );
  }

  /**
   * Elw Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createElw() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{49EC4E41-32D5-4994-8B0C-BC7AAB238E6A}" );
  }

  /**
   * ElwUnderCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createElwUnderCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{AE0BD6DB-C9C5-403B-AF49-7B953B362112}" );
  }

  /**
   * ElwInvest Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createElwInvest() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{51BEC419-2C7F-456F-AF83-4E1E9C1F7543}" );
  }

  /**
   * CpSvrNew7215A Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7215A() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{4E793A3C-DFD4-499A-93F6-B2CEC3DC151B}" );
  }

  /**
   * CpSvrNew7215B Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7215B() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{BE5F7180-7E74-4F44-8C67-700811BAD363}" );
  }

  /**
   * CpSvr7068 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7068() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{10674C56-4ACC-4104-BC8D-42F855EBA17D}" );
  }

  /**
   * CpSvr7063 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7063() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{C8C73E26-6C02-46CB-B8B6-1600E5A86A6B}" );
  }

  /**
   * ElwJpbid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createElwJpbid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{75CCA696-16F2-459D-9F73-9EE5B92D60B3}" );
  }

  /**
   * ElwJpbid2 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createElwJpbid2() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{DAAF202A-393E-4353-A4EA-092733536C64}" );
  }

  /**
   * CpSvr7066 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7066() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{42A23EE1-5CB9-4F9F-8467-208ED8602665}" );
  }

  /**
   * CpSvr7254 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7254() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{1B54A2E7-8F72-4825-B109-7E2DD61D6C8E}" );
  }

  /**
   * CpSvr3744 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr3744() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{923667A7-245E-44E2-AB39-CB224F5B913E}" );
  }

  /**
   * StockAdj Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockAdj() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{EF251164-0FC9-4582-A6EE-7C6A3B981111}" );
  }

  /**
   * StockUniMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockUniMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{7E291B7A-D229-4741-A8C1-C33B0DBBF6FB}" );
  }

  /**
   * StockUniCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockUniCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{DC573A7F-3301-47CE-B2F2-F36A1E5500B7}" );
  }

  /**
   * StockUniJpBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockUniJpBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{B7CC7EE7-C619-4D27-8EA9-03C2B0370ED0}" );
  }

  /**
   * StockUniWeek Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockUniWeek() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{348306A3-8692-4758-AE08-883CF96B0B4C}" );
  }

  /**
   * StockUniBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockUniBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{1C6B4381-B00C-4529-ABA1-FF705BFA342F}" );
  }

  /**
   * OptionCurOnly Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createOptionCurOnly() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{928A6FAF-3874-42D6-BCB6-74D65F758B35}" );
  }

  /**
   * WorldCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createWorldCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{3D49364D-18D9-49A8-9B9F-7C5471EB129B}" );
  }

  /**
   * MarketEye Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createMarketEye() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D71F9B56-85A0-49F8-B102-19C223ACF298}" );
  }

  /**
   * StockChart Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockChart() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{4F5E5E9A-5BEA-409F-9828-B66A70B4B51B}" );
  }

  /**
   * CpSvr7037 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7037() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{1AAC83CC-FA40-485F-952F-FB5667392E4F}" );
  }

  /**
   * K200Expect Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createK200Expect() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{39DADC73-104A-4C23-AC9B-9875B35EA194}" );
  }

  /**
   * FutOptChart Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createFutOptChart() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{5337FA2B-B02E-42DC-A5A1-12BC4F36B6DA}" );
  }

  /**
   * CpSvrNew7043 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7043() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{BC2B7C0D-8481-4067-B1A4-5D7BDCA9DCBA}" );
  }

  /**
   * CpSvrNew7212 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7212() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{DC43995C-F264-4ECA-B88A-20B4FD238DAF}" );
  }

  /**
   * CpSvr7726 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7726() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{23DEEA4C-FCF5-49B6-B1A8-07EF1D6D4AD4}" );
  }

  /**
   * CpSvrCpFutOptTheoVal Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpFutOptTheoVal() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{FFE900B3-D906-492B-9AA1-C9411371C108}" );
  }

  /**
   * CpSvr7326 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7326() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D9A23D4E-624D-43E8-9FDA-F9174A073209}" );
  }

  /**
   * StockOpenSb Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createStockOpenSb() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{F1AE467A-86BE-4F77-8A5C-F23D4883E3A7}" );
  }

  /**
   * CmeMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{9B08D6BE-4DE0-4F6A-B32A-22C9F0B182F7}" );
  }

  /**
   * CmeMo Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeMo() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{8195B34A-E25A-4174-A41E-3283BFD0CBD6}" );
  }

  /**
   * CmeBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{E7FBCAA1-E01F-4CD5-B215-DB77D3AF5448}" );
  }

  /**
   * CmeDaily Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeDaily() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{09832FA6-1662-4EE3-9F91-6C8CD66EB3B2}" );
  }

  /**
   * CmeBidOnly Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeBidOnly() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{2ADC5BB3-40A2-450C-A503-51084AD15D99}" );
  }

  /**
   * CmeCurOnly Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeCurOnly() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{75FDB7F9-6B05-49E7-B7BD-80DA111FF3D5}" );
  }

  /**
   * CmeCurr Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCmeCurr() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{70C14953-D33B-454B-856F-9464B7D7BAB5}" );
  }

  /**
   * FutureJpBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createFutureJpBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D14D1214-71D0-4207-9780-6DAC389EAE85}" );
  }

  /**
   * OptionJpBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createOptionJpBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{6D4EC009-130A-4C74-98D2-42B020889449}" );
  }

  /**
   * CWList Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCWList() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{EDD5DE53-96D2-4F1D-BA3D-C6DF75154066}" );
  }

  /**
   * NStockMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createNStockMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D3825EE2-C49F-4756-890D-530CDAA25EC5}" );
  }

  /**
   * NStockCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createNStockCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{3014C34B-46C3-4440-B6F5-93997817047B}" );
  }

  /**
   * BondMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createBondMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{A0B46FA8-216D-47EB-A5DC-C500ACCEEA1A}" );
  }

  /**
   * BondCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createBondCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{3618D98B-BE61-4A46-9A2B-C6B38ECD2A09}" );
  }

  /**
   * FOExpectCur Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createFOExpectCur() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{55D92823-F6CD-49FC-A3A8-9B4FAE025175}" );
  }

  /**
   * EurexBid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createEurexBid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{A45C67C3-53B6-4740-92AF-A04338D9215B}" );
  }

  /**
   * EurexDaily Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createEurexDaily() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{A0696F58-8C6B-4E3B-8F7B-9EB4CC094EBB}" );
  }

  /**
   * EurexCurOnly Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createEurexCurOnly() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{3626A621-23F1-409F-BDD0-5AE10FF924E0}" );
  }

  /**
   * EurexMst Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createEurexMst() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{65950801-9C94-4756-A92A-B20F319CDE2E}" );
  }

  /**
   * EurexJpbid Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createEurexJpbid() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D07D7BAC-7FDD-4AA1-9FEB-156EC5344B8E}" );
  }

  /**
   * CpSvrNew7244S Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew7244S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{5B6B6338-5843-4D9F-87BB-5C5BB40C579D}" );
  }

  /**
   * CpSvrNew8300 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvrNew8300() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{D03AB487-0553-4F48-8DAA-C7A8C1549B11}" );
  }

  /**
   * CssStgList Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCssStgList() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{B9CB3A84-F66B-4FB0-A481-C9CCC8B8AE1F}" );
  }

  /**
   * CssStgFind Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCssStgFind() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{60E404D1-AA50-4AC9-BC86-476626CBC983}" );
  }

  /**
   * CssWatchStgControl Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCssWatchStgControl() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{6F6615F0-DA4A-4E5F-8E74-F3597F9D6865}" );
  }

  /**
   * CssWatchStgSubscribe Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCssWatchStgSubscribe() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{7F5AF5D2-2C13-4E84-92E4-9298F1436756}" );
  }

  /**
   * CssAlert Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCssAlert() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{37001E74-5FAA-4502-94FA-3AE9FC102DEB}" );
  }

  /**
   * CpSvr7921 Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr7921() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{435AC599-969D-46A0-B119-6D7C4C7F5AB7}" );
  }

  /**
   * CpSvr8119S Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr8119S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{02762DC2-93FA-48CA-897C-DAE7D68514AB}" );
  }

  /**
   * CpSvr9619S Class
   */
  public static com.blackvelvet.cybos.bridge.cpsysdib.ISysDib createCpSvr9619S() {
    return COM4J.createInstance( com.blackvelvet.cybos.bridge.cpsysdib.ISysDib.class, "{772812D7-6F16-41C5-9E4A-95955F9203DC}" );
  }
}
