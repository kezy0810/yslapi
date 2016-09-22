package com.qkl.tfcc.api.service.trade.api;

import com.qkl.util.help.pager.PageData;


/**解冻接口
 * <p>Description解冻接口 </p>
 * @project_Name qkl_tfcc_api
 * @class_Name UnfreezeService.java
 * @author kezhiyi
 * @date 2016年9月13日
 * @version v1.0
 */
public interface UnfreezeService {

	
	/** 添加解冻信息
	 * @Title: addUnfreezeDetail 
	 * @param PageData pd 
	 * @return boolean
	 * @create author kezhiyi
	 * @create date  2016年9月13日
	 */ 
	public boolean addUnfreezeDetail(PageData pd,String versionNo)throws Exception;
	
	
	
}
