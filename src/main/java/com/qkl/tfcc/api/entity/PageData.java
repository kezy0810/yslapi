package com.qkl.tfcc.api.entity;

import java.util.List;

import com.qkl.util.help.Page;

/**
 * 带分页、list页面数据的对象
 * <p>
 * Description：带分页、list页面数据的对象
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name PageData.java
 * @author weigangpeng
 * @date 2015年4月18日
 * @version v1.0
 */
public class PageData extends Page {

	/**
	 * 列表需要显示的数据
	 */
	private List data = null;
	
	public PageData() {
		
	}

	/**
	 * @param data
	 *            列表需要显示的数据
	 * @param count
	 *            记录总数
	 * @param currentPage
	 *            当前页
	 * @param pageSize
	 *            页大小
	 */
	public PageData(List data, int count, int currentPage, int pageSize) {
		super(count, currentPage, pageSize);
		this.data = data;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

}
