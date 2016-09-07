package com.qkl.tfcc.api.service.trade.api;

import com.qkl.tfcc.api.po.trade.TradeDetail;

public interface TradeService {
	
	
	public boolean addTradeDetail(TradeDetail tradeDetail,String versionNo);
	
	
	public boolean modifyTradeDetail(TradeDetail tradeDetail,String versionNo);
	
	
	   
}
