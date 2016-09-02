package com.qkl.tfcc.api.service.sys.api;

import java.util.List;
import java.util.Map;
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
	public List<Map<String, Object>> findByGroupCode(String groupCode,String versionNo);
	
	
}
