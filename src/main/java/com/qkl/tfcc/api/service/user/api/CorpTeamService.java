package com.qkl.tfcc.api.service.user.api;

import java.util.List;

import com.qkl.tfcc.api.entity.Page;
import com.qkl.util.help.pager.PageData;

public interface CorpTeamService {
	
	
	/**
	 * 查询投资公司LP会员数量
	 * @param userCode
	 * @return
	 */
	public long findNum(String userCode);
	
	/**
	 * 查询投资公司的LP会员信息列表
	 * @param page
	 * @return
	 */
	public List<PageData> findlplist(Page page);
	

}
