package com.qkl.ztysl.api.service.acc.api;

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
	
	/**
	 * @describe:转账回调
	 * @author: zhangchunming
	 * @date: 2016年10月10日上午10:56:06
	 * @param pd
	 * @param versionNo
	 * @return: boolean
	 */
	public boolean transferCallBack(PageData pd,String versionNo);
	/**
	 * @describe:根据订单号查询相关转账信息
	 * @author: zhangchunming
	 * @date: 2016年10月14日下午2:53:40
	 * @param orderId
	 * @param versionNo
	 * @return: PageData
	 */
	public PageData getTurnOutInfo(String orderId,String versionNo);
	/**
	 * @describe:转出失败回滚数据
	 * @author: zhangchunming
	 * @date: 2016年10月14日下午11:16:25
	 * @param orderId
	 * @param versionNo
	 * @return: boolean
	 */
	public boolean turnOutBack(PageData pd ,String versionNo);
	/**
	 * @describe:转出成功，更新转出记录状态
	 * @author: zhangchunming
	 * @date: 2016年10月14日下午11:25:33
	 * @param pd
	 * @param versionNo
	 * @return: boolean
	 */
	public boolean turnOutUpdate(PageData pd ,String versionNo);
	/**
	 * @describe:查询是否有转账中
	 * @author: zhangchunming
	 * @date: 2016年10月15日上午11:37:16
	 * @param userCode
	 * @param versionNo
	 * @return: boolean
	 */
	public boolean findIsExistTransfering(String userCode,String versionNo);
	
}
