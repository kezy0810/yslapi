package com.qkl.tfcc.api.service.trade.api;

import com.qkl.tfcc.api.po.trade.TradeDetail;
import com.qkl.util.help.pager.PageData;

public interface TradeService {
	
	
	public boolean addTradeDetail(PageData pd,String versionNo);
	
	
	public boolean modifyTradeDetail(PageData pd,String versionNo);
	
	public boolean modifyTradeStatus(PageData pd,String versionNo);
	   
}
