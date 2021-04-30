package com.qkl.ztysl.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 表配置对象
 * <p>
 * Description： 表配置对象
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name Table.java
 * @author weigangpeng
 * @date 2015年4月22日
 * @version v1.0
 */
public class Table implements Serializable {
	/**
	 * 表id
	 */
	private String id;
	/**
	 * 表名
	 */
	private String text;
	/**
	 * 来源
	 */
	private String source;
	/**
	 * 表列
	 */
	private List<Column> config;

	public Table() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Column> getConfig() {
		return config;
	}

	public void setConfig(List<Column> config) {
		this.config = config;
	}

	public Table(String id, String text, String source, List<Column> config) {
		super();
		this.id = id;
		this.text = text;
		this.source = source;
		this.config = config;
	}

}
