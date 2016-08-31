package com.qkl.tfcc.api.po;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

 /**
 * 数据来源对象
 * <p>Description：数据来源对象  </p>
 * @project_Name yc_udrs_api
 * @class_Name SourceBean.java
 * @author weigangpeng
 * @date 2015年4月20日
 * @version v1.0
 */
public class SourceBean implements java.io.Serializable{


	/**
	* 数据来源ID
	*/
	private java.lang.Integer source_id;
	/**
	* 数据来源名称
	*/
	private java.lang.String source_name;

	/**
	 * 数据表集合
	 */
	private List<DataListBean> dataList;
	
	public SourceBean(){
	}
	
	
	/**
	* 获取 数据来源ID
	* @return java.lang.Integer 数据来源ID
	*/
	public java.lang.Integer getSource_id() {
		return this.source_id;
	}

	/**
	 * 设置 数据来源ID
	 * @param java.lang.Integer 数据来源ID  
	 */
	public void setSource_id(java.lang.Integer value) {
		this.source_id = value;
	}

	/**
	* 获取 数据来源名称
	* @return java.lang.String 数据来源名称
	*/
	public java.lang.String getSource_name() {
		return this.source_name;
	}

	/**
	 * 设置 数据来源名称
	 * @param java.lang.String 数据来源名称  
	 */
	public void setSource_name(java.lang.String value) {
		this.source_name = value;
	}


	public List<DataListBean> getDataList() {
		return dataList;
	}


	public void setDataList(List<DataListBean> dataList) {
		this.dataList = dataList;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("source_id",getSource_id())
			.append("source_name",getSource_name())
			.append("dataList",getDataList())
			.toString();
	}
	
}
