package com.qkl.tfcc.api.service.acc.api;

import java.util.List;

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
	public boolean addAcc(PageData pd,String versionNo);
	
	/**
	 * 修改用户账户信息
	 * @param modifyAcc
	 * @param Page
	 */
	public boolean modifyAcc(PageData pd,String versionNo);
	
	/**
	 * 查询用户账户信息
	 * @param addAcc
	 * @param acc
	 */
	public Acc findAcc(Acc acc,String versionNo);
	
	/**
	 * 查询用户账户明细信息列表
	 * @param findAccDetailList
	 * @param Page
	 */
	public List<PageData> findAccDetailList(Page page,String versionNo);
	
	
}
