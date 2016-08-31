package com.qkl.tfcc.api.service.acc.api;

import com.qkl.tfcc.api.po.acc.AccDetail;


public interface AccService {

	
	
	
	/**
	 * 新建用户账户明细信息
	 * @param accDetail
	 * @param addAccDetail
	 */
	public boolean addAccDetail(AccDetail accDetail,String versionNo);
	
	
	
	
	
	
}
