package com.qkl.tfcc.api.po;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

 /**
 * e租宝钰申区域管理部绩效对象
 * <p>Description：  </p>
 * @project_Name yc_udrs_api
 * @class_Name EzbDepScore.java
 * @author weigangpeng
 * @date 2015年4月20日
 * @version v1.0
 */
public class EzbDepScoreBean implements java.io.Serializable{


	/**
	* id
	*/
	private java.lang.Integer id;
	/**
	* 分公司id
	*/
	private java.lang.Long dep_id;
	/**
	* 分公司名称
	*/
	private java.lang.String dep_name;
	/**
	* 分公司编码
	*/
	private java.lang.String dep_code;
	/**
	* 投资金额
	*/
	private Double invest_money;
	/**
	* 赎回金额
	*/
	private Double detb_money;
	/**
	* 净投资额
	*/
	private Double score_money;
	/**
	* 日期
	*/
	private java.util.Date invest_date;


	public EzbDepScoreBean(){
	}
	
	
	/**
	* 获取 id
	* @return java.lang.Integer id
	*/
	public java.lang.Integer getId() {
		return this.id;
	}

	/**
	 * 设置 id
	 * @param java.lang.Integer id  
	 */
	public void setId(java.lang.Integer value) {
		this.id = value;
	}

	/**
	* 获取 分公司id
	* @return java.lang.Long 分公司id
	*/
	public java.lang.Long getDep_id() {
		return this.dep_id;
	}

	/**
	 * 设置 分公司id
	 * @param java.lang.Long 分公司id  
	 */
	public void setDep_id(java.lang.Long value) {
		this.dep_id = value;
	}

	/**
	* 获取 分公司名称
	* @return java.lang.String 分公司名称
	*/
	public java.lang.String getDep_name() {
		return this.dep_name;
	}

	/**
	 * 设置 分公司名称
	 * @param java.lang.String 分公司名称  
	 */
	public void setDep_name(java.lang.String value) {
		this.dep_name = value;
	}

	/**
	* 获取 分公司编码
	* @return java.lang.String 分公司编码
	*/
	public java.lang.String getDep_code() {
		return this.dep_code;
	}

	/**
	 * 设置 分公司编码
	 * @param java.lang.String 分公司编码  
	 */
	public void setDep_code(java.lang.String value) {
		this.dep_code = value;
	}

	/**
	* 获取 投资金额
	* @return Long 投资金额
	*/
	public Double getInvest_money() {
		return this.invest_money;
	}

	/**
	 * 设置 投资金额
	 * @param Long 投资金额  
	 */
	public void setInvest_money(Double value) {
		this.invest_money = value;
	}

	/**
	* 获取 赎回金额
	* @return Long 赎回金额
	*/
	public Double getDetb_money() {
		return this.detb_money;
	}

	/**
	 * 设置 赎回金额
	 * @param Long 赎回金额  
	 */
	public void setDetb_money(Double value) {
		this.detb_money = value;
	}

	/**
	* 获取 净投资额
	* @return Double 净投资额
	*/
	public Double getScore_money() {
		return this.score_money;
	}

	/**
	 * 设置 净投资额
	 * @param Double 净投资额  
	 */
	public void setScore_money(Double value) {
		this.score_money = value;
	}

	/**
	* 获取 日期
	* @return java.util.Date 日期
	*/
	public java.util.Date getInvest_date() {
		return this.invest_date;
	}

	/**
	 * 设置 日期
	 * @param java.util.Date 日期  
	 */
	public void setInvest_date(java.util.Date value) {
		this.invest_date = value;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("dep_id",getDep_id())
			.append("dep_name",getDep_name())
			.append("dep_code",getDep_code())
			.append("invest_money",getInvest_money())
			.append("detb_money",getDetb_money())
			.append("score_money",getScore_money())
			.append("invest_date",getInvest_date())
			.toString();
	}
	
}
