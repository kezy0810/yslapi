package com.qkl.tfcc.api.entity;

import java.io.Serializable;

/**
 * 列对象
 * <p>
 * Description： 列对象
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name Column.java
 * @author weigangpeng
 * @date 2015年4月22日
 * @version v1.0
 */
public class Column implements Serializable {

	/**
	 * 字段
	 */
	private String field;
	/**
	 * 显示标题
	 */
	private String title;
	
	/**
	 * 字段类型
	 */
	private String type;
	
	/**
	 * 格式化类型
	 */
	private String format;
	/**
	 * 宽度
	 */
	private int width;

	/**
	 * 去除敏感标识
	 */
	private String sensitive;
	
	
	public String getSensitive() {
		return sensitive;
	}

	public void setSensitive(String sensitive) {
		this.sensitive = sensitive;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Column() {

	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Column(String field, String title) {
		super();
		this.field = field;
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Column(String field, String title, String type, String format,int width,String sensitive) {
		super();
		this.field = field;
		this.title = title;
		this.type = type;
		this.format = format;
		this.width = width;
		this.sensitive =sensitive;
	}
	
	

}
