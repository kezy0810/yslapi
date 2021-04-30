package com.qkl.ztysl.api.service.sys.api;

import java.util.Map;

import com.qkl.ztysl.api.po.sys.SysMaxnum;

public interface SysMaxnumService {

	
	/**
	 * 查询最大号码
	 * @param notype
	 */
	public Long findMaxNo(String notype,String versionNo);
	
	/**
	 * 修改最大号码
	 * @param notype
	 */
	public boolean modifyMaxNo(SysMaxnum sysMaxnum,String versionNo);
	
	
}
