package com.qkl.tfcc.api.service.acc.api;

import com.qkl.util.help.pager.PageData;

/**TFCC转出接口
 * <p>DescriptionTFCC转出接口 </p>
 * @project_Name qkl_tfcc_api
 * @class_Name AccOutdetailService.java
 * @author kezhiyi
 * @date 2016年9月13日
 * @version v1.0
 */
public interface AccOutdetailService {

	/** 添加转出信息
	 * @Title: addAccOutdetail 
	 * @param PageData pd 
	 * @return boolean
	 * @create author kezhiyi
	 * @create date  2016年9月13日
	 */ 
	public boolean addAccOutdetail(PageData pd,String versionNo);
	
	/** 更新转出状态
	 * @Title: modifyAccOutdetailStatus 
	 * @param PageData pd 
	 * @return boolean
	 * @create author kezhiyi
	 * @create date  2016年9月13日
	 */ 
	public boolean modifyAccOutdetailStatus(PageData pd,String versionNo);
	
	
	
	
}
