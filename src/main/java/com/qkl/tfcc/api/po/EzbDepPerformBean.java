package com.qkl.tfcc.api.po;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * e租宝钰申分公司绩效对象
 * <p>
 * Description：
 * </p>
 * 
 * @project_Name yc_udrs_api
 * @class_Name EzbDepPerform.java
 * @author weigangpeng
 * @date 2015年4月20日
 * @version v1.0
 */
public class EzbDepPerformBean implements java.io.Serializable {

	/**
	 * 分公司名称
	 */
	private java.lang.String dep_name;
	/**
	 * 分公司编码
	 */
	private java.lang.String dep_code;
	/**
	 * 绩效业绩
	 */
	private Double dep_score;

	/**
	 * 人均绩效
	 */
	private Double avg_dep_score;

	public EzbDepPerformBean() {
	}

	/**
	 * 获取 分公司名称
	 * 
	 * @return java.lang.String 分公司名称
	 */
	public java.lang.String getDep_name() {
		return this.dep_name;
	}

	/**
	 * 设置 分公司名称
	 * 
	 * @param java
	 *            .lang.String 分公司名称
	 */
	public void setDep_name(java.lang.String value) {
		this.dep_name = value;
	}

	/**
	 * 获取 分公司编码
	 * 
	 * @return java.lang.String 分公司编码
	 */
	public java.lang.String getDep_code() {
		return this.dep_code;
	}

	/**
	 * 设置 分公司编码
	 * 
	 * @param java
	 *            .lang.String 分公司编码
	 */
	public void setDep_code(java.lang.String value) {
		this.dep_code = value;
	}

	/**
	 * 获取 绩效业绩
	 * 
	 * @return Double 绩效业绩
	 */
	public Double getDep_score() {
		return this.dep_score;
	}

	/**
	 * 设置 绩效业绩
	 * 
	 * @param Double
	 *            绩效业绩
	 */
	public void setDep_score(Double value) {
		this.dep_score = value;
	}

	public Double getAvg_dep_score() {
		return avg_dep_score;
	}

	public void setAvg_dep_score(Double avg_dep_score) {
		this.avg_dep_score = avg_dep_score;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("dep_name", getDep_name())
				.append("dep_code", getDep_code())
				.append("dep_score", getDep_score())
			    .append("avg_dep_score",getAvg_dep_score())
				.toString();
	}

}
