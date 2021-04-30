package com.qkl.ztysl.api.service.acc.api;

import com.qkl.util.help.pager.PageData;
/**
 * 账户限额接口
 * @author zhangchunming
 * @date: 2016年9月21日上午9:27:07
 */
public interface AccLimitService {
    
    /**
     * @describe:查询账户限额
     * @author: zhangchunming
     * @date: 2016年9月21日上午9:27:07
     * @param pd
     * @param versionNo
     * @return: boolean
     */
	public PageData getAccLimit(PageData pd,String versionNo);
	
}
