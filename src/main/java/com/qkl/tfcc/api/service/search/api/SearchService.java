package com.qkl.tfcc.api.service.search.api;

import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.qkl.tfcc.api.entity.PageDataYC;
import com.qkl.tfcc.api.entity.SearchCondition;
import com.qkl.tfcc.api.entity.Table;
import com.qkl.tfcc.api.po.SourceBean;

/**
 * 统一查询Service接口
 * <p>
 * Description：统一查询接口
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name SearchService.java
 * @author weigangpeng
 * @date 2015年4月17日
 * @version v1.0
 */
public interface SearchService {

	/**
	 * 根据查询条件查询记录集合和分页
	 * <p>
	 * (根据查询条件查询记录集合和分页)
	 * </p>
	 * 
	 * @Title: queryData
	 * @param condition
	 *            查询条件对象
	 * @return 带分页的数据对象
	 * @throws
	 * @create author weigangpeng
	 * @create date 2015年4月18日
	 */
	PageDataYC queryData(SearchCondition condition);



}
