package com.qkl.ztysl.api.po;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 数据表对象
 * <p>
 * Description：数据表对象
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name DataListBean.java
 * @author weigangpeng
 * @date 2015年4月20日
 * @version v1.0
 */
public class DataListBean implements java.io.Serializable {

	/**
	 * 数据项id
	 */
	private java.lang.Integer id;
	/**
	 * 来源表名
	 */
	private String table_name;
	/**
	 * 数据来源id
	 */
	private java.lang.Integer source_id;
	/**
	 * 数据列表名称
	 */
	private java.lang.String data_name;

	/**
	 * 表的配置
	 */
	private Object config;

	public Object getConfig() {
		return config;
	}

	public void setConfig(Object config) {
		this.config = config;
	}

	public DataListBean() {
	}

	/**
	 * 获取 数据项id
	 * 
	 * @return java.lang.Integer 数据项id
	 */
	public java.lang.Integer getId() {
		return this.id;
	}

	/**
	 * 设置 数据项id
	 * 
	 * @param java
	 *            .lang.Integer 数据项id
	 */
	public void setId(java.lang.Integer value) {
		this.id = value;
	}

	/**
	 * 获取 来源表名
	 * 
	 * @return String 来源表名
	 */
	public String getTable_name() {
		return this.table_name;
	}

	/**
	 * 设置 来源表名
	 * 
	 * @param String
	 *            来源表名
	 */
	public void setTable_name(String value) {
		this.table_name = value;
	}

	/**
	 * 获取 数据来源id
	 * 
	 * @return java.lang.Integer 数据来源id
	 */
	public java.lang.Integer getSource_id() {
		return this.source_id;
	}

	/**
	 * 设置 数据来源id
	 * 
	 * @param java
	 *            .lang.Integer 数据来源id
	 */
	public void setSource_id(java.lang.Integer value) {
		this.source_id = value;
	}

	/**
	 * 获取 数据列表名称
	 * 
	 * @return java.lang.String 数据列表名称
	 */
	public java.lang.String getData_name() {
		return this.data_name;
	}

	/**
	 * 设置 数据列表名称
	 * 
	 * @param java
	 *            .lang.String 数据列表名称
	 */
	public void setData_name(java.lang.String value) {
		this.data_name = value;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("id", getId()).append("table_name", getTable_name())
				.append("source_id", getSource_id())
				.append("data_name", getData_name()).toString();
	}

}
