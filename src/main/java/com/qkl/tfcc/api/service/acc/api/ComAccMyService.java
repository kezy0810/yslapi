package com.qkl.tfcc.api.service.acc.api;

import java.util.List;
import java.util.Map;

import com.qkl.tfcc.api.entity.Page;
import com.qkl.tfcc.api.po.acc.ComAccMy;
import com.qkl.util.help.pager.PageData;

public interface ComAccMyService {

	
	 
	 //查询TFCC的余额
	 
	public ComAccMy findTB(String userCode);
	
	//查询JFFC的余额
	
	public ComAccMy findJB(String userCode);
	
	//查询推荐会员奖励的TFCC
	public ComAccMy findReward(String userCode);
		
	//查询推荐网点奖励的TFCC
	public ComAccMy findWReward(String userCode);
		
	//查询累奖励的TFCC
	public ComAccMy findTTReward(String userCode);
	//查询推荐各级别会员所得奖励列表
	
	public List<PageData> findAll(Page page);
}
