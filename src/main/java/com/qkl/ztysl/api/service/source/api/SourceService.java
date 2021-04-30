package com.qkl.ztysl.api.service.source.api;

import java.util.List;

import com.qkl.ztysl.api.po.SourceBean;

/**
 * 数据来源Service接口
 * <p>
 * Description：
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name SourceService.java
 * @author weigangpeng
 * @date 2015年4月21日
 * @version v1.0
 */
public interface SourceService {
	
	/** 
	 * 查询数据来源
	 * <p> (查询数据来源)  </p>
	 * @Title: querySource 
	 * @return 查询数据来源集合
	 * @throws 
	 * @create author weigangpeng
	 * @create date 2015年4月21日
	 */ 
	List<SourceBean> querySource();
	
}
