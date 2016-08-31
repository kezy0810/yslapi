package com.qkl.tfcc.api.service.sys.api;

import java.util.List;

import com.qkl.tfcc.api.po.sys.SysGencode;

public interface SysGenCodeService {

	/**
	 * 查询所有代码
	 * @param 
	 */
	public List<SysGencode> findAll();
	
	/**
	 * 根据groupCode查询代码
	 * @param groupId
	 */
	public List<SysGencode> findByGroupCode(String groupCode,String versionNo);
	
	
}
