package com.qkl.tfcc.api.service.acc.api;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.qkl.tfcc.api.entity.Page;
import com.qkl.tfcc.api.po.acc.Acc;
import com.qkl.tfcc.api.po.acc.AccDetail;
import com.qkl.util.help.pager.PageData;


public interface AccService {

	/**
	 * 新建用户账户明细信息
	 * @param accDetail
	 * @param addAccDetail
	 */
	public boolean addAccDetail(AccDetail accDetail,String versionNo);
	
	/**
	 * 新建用户账户信息
	 * @param addAcc
	 * @param PageData
	 */
	public boolean addAcc(Acc acc,String versionNo);
	
	/**
	 * 修改用户账户信息
	 * @param modifyAcc
	 * @param Page
	 */
	public boolean modifyAcc(Acc acc,String versionNo);
	/**
	 * 修改用户账户信息
	 * @param modifyAcc
	 * @param Page
	 */
	public boolean modifyAccDetail(AccDetail accDetail,String versionNo);
	
	/**
	 * 查询用户账户信息
	 * @param addAcc
	 * @param acc
	 */
	public Acc findAcc(Acc acc,String versionNo);
	
	/**
	 * 分页查询用户账户明细信息列表
	 * @param findAccDetailList
	 * @param Page
	 */
	public List<PageData> findAccDetailPage(Page page,String versionNo);
	
	/**
     * @describe:查询用户账户可用tfcc余额
     * @author: zhangchunming
     * @date: 2016年9月9日上午10:07:59
     * @param acc
     * @return: Integer
     */
    public Integer getAvailableBalance(Acc acc,String versionNo);
    /**
     * @describe:收入
     * @author: zhangchunming
     * @date: 2016年9月9日上午10:08:48
     * @param acc
     * @return: void
     */
    public boolean updateIn(Acc acc,String versionNo);
    /**
     * @describe:支出
     * @author: zhangchunming
     * @date: 2016年9月9日上午10:09:52
     * @param acc
     * @return: void
     */
    public boolean updateOut(Acc acc,String versionNo);
    
    /**
     * @describe:查询符合条件的所有账户明细信息
     * @author: zhangchunming
     * @date: 2016年9月9日上午10:33:19
     * @param pd
     * @return
     * @return: List<PageData>
     */
    public List<PageData> findAccDetailList(PageData pd,String versionNo);
    /**
     * @describe:投资机构发放tfcc奖励
     * @author: zhangchunming
     * @date: 2016年9月9日上午11:37:43
     * @param jsonArray 要发放的LP会员构成的json数组
     * @param userCode 用户编码
     * @param versionNo 版本号
     * @return: void
     */
    public Map<String,String> rewardTfcc(JSONArray jsonArray,String userCode,BigDecimal avbAmnt,String versionNo);
    /**
     * @describe:查询账户明细
     * @author: zhangchunming
     * @date: 2016年9月9日下午3:12:47
     * @param accDetail
     * @param versionNo
     * @return
     * @return: AccDetail
     */
    public AccDetail findAccDetail(AccDetail accDetail,String versionNo);
}
