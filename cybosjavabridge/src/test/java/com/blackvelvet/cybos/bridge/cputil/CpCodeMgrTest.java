package com.blackvelvet.cybos.bridge.cputil;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;

import com4j.Com4jObject;
import com4j.Variant;

public class CpCodeMgrTest {
	
	ICpCodeMgr cpCodeMgr;

	@Before
	public void setUp() throws Exception {
		cpCodeMgr = ClassFactory.createCpCodeMgr();
	}

	@Test
	public void test() {
		Object[] objs = (Object[])cpCodeMgr.getStockListByMarket(CPE_MARKET_KIND.CPC_MARKET_KOSPI);
		System.out.println(objs[0].getClass().getSimpleName());
		System.out.println(objs.length);
		System.out.println((String)objs[0]);
	}

}
