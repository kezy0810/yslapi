package com.qkl.ztysl.api.service.user.api;
import java.util.List;
import java.util.Map;

import com.qkl.ztysl.api.entity.Page;
import com.qkl.ztysl.api.po.user.ComTeamVip;
import com.qkl.util.help.pager.PageData;





public interface ComTeamVipService {

	//查询各类会员的数量
	public ComTeamVip findcount(String userCode);
	//查询各类会员信息列表
	public List<PageData> findVipList(Page page);
	
}
