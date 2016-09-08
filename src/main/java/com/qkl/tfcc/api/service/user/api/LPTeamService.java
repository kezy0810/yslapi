package com.qkl.tfcc.api.service.user.api;

import java.util.List;
import java.util.Map;
import com.qkl.tfcc.api.po.acc.LPTeam;


	public interface LPTeamService {
	
	/**
	 * 查询累计推荐的LP会员人数
	 * @param userCode
	 * @return
	 */
	public long findLPcount(String userCode);
	
	
	/**
	 * 按条件查询列表
	 * @param map
	 * @return
	 */
	public List<LPTeam> find(Map<String, Object> map);

}
