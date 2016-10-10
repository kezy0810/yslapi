package com.qkl.tfcc.api.service.acc.api;


import java.util.List;
import java.util.Map;

import com.qkl.tfcc.api.entity.Page;
import com.qkl.util.help.pager.PageData;



public interface ComAccMyService {

	
	/**
	 * 查询推荐会员所得奖励的列表
	 * @param page
	 * @return
	 */
	
	public List<PageData> findAll(Page page);
	
	/**
	 * 查询TFCC数量
	 * @param userCode
	 * @return
	 */
	public Map<String, Object> findNum(String userCode);
	/**
	 * @describe:查询可用余额，冻结余额，总额
	 * @author: zhangchunming
	 * @date: 2016年9月23日上午10:43:42
	 * @param pd
	 * @return: PageData
	 */
	public PageData getAmnt(PageData pd);
	/**
	 * @describe:普通会员查询我的账户余额，累计奖励
	 * @author: zhangchunming
	 * @date: 2016年9月24日上午1:17:54
	 * @param userCode
	 * @return: Map<String,Object>
	 */
	public Map<String, Object> findMyAcc(String userCode);
	
	/**
	 * 保存转帐信息
	 * @param pd
	 * @return
	 */
	public int saveOutAcc(PageData pd);
}
