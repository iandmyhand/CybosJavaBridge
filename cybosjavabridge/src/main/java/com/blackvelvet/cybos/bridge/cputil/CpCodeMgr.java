package com.blackvelvet.cybos.bridge.cputil;

import java.util.List;

import com.google.common.collect.Lists;

public class CpCodeMgr {
	
	private ICpCodeMgr instance;
	
	public CpCodeMgr() {
		super();
		if(null == instance) instance = ClassFactory.createCpCodeMgr();
	}

	public List<String> getStockListByMarket(CPE_MARKET_KIND marketKind) {
		Object[] objs = (Object[]) instance.getStockListByMarket(marketKind);
		List<String> codes = Lists.newArrayList();
		for(Object obj : objs) {
			codes.add((String)obj);
		}
		return codes;
	}

}
