package com.qkl.tfcc.api.service.trade.api;

import java.math.BigDecimal;
import java.util.List;

import com.qkl.tfcc.api.entity.Page;
import com.qkl.util.help.pager.PageData;

public interface TradeService {
	
	
	public boolean addTradeDetail(PageData pd,String versionNo);
	
	
	public boolean modifyTradeDetail(PageData pd,String versionNo);
	
	public boolean modifyTradeStatus(PageData pd,String versionNo);
	
	
	public List<PageData> findTradeInfo(Page page,String versionNo);
	
	
	public int findTradeCount(PageData pd,String versionNo);
	
	
	public BigDecimal findAnmt(String userCode,String versionNo);
	   
}
