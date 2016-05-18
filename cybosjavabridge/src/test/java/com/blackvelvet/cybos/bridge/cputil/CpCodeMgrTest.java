package com.blackvelvet.cybos.bridge.cputil;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CpCodeMgrTest {

	ICpCodeMgr iCpCodeMgr;
	CpCodeMgr cpCodeMgr;

	@Before
	public void setUp() throws Exception {
		if(null == iCpCodeMgr) iCpCodeMgr = ClassFactory.createCpCodeMgr();
		if(null == cpCodeMgr) cpCodeMgr = new CpCodeMgr();
	}

	@Test
	public void testIGetStockListByMarket() {
		Object[] objs = (Object[]) iCpCodeMgr.getStockListByMarket(CPE_MARKET_KIND.CPC_MARKET_KOSPI);
		assertEquals("String", objs[0].getClass().getSimpleName());
		
		assertTrue(0 < objs.length);
		System.out.println(objs.length);
		
		assertEquals("A000020", (String)objs[0]);
		System.out.println((String)objs[0]);
	}

	@Test
	public void testGetStockListByMarket() {
		List<String> codes = cpCodeMgr.getStockListByMarket(CPE_MARKET_KIND.CPC_MARKET_KOSPI);
		assertTrue(0 < codes.size());		
		assertEquals("A000020", codes.get(0));
	}

}
