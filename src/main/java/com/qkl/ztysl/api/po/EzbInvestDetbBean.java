package com.qkl.ztysl.api.po;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

 /**
 * e租宝客户赎回明细数据对象
 * <p>Description：  </p>
 * @project_Name yc_udrs_api
 * @class_Name EzbInvestDetb.java
 * @author weigangpeng
 * @date 2015年4月20日
 * @version v1.0
 */
public class EzbInvestDetbBean implements java.io.Serializable{


	/**
	* id
	*/
	private java.lang.Integer id;
	/**
	* 客户id
	*/
	private java.lang.Long cust_id;
	/**
	* 客户姓名
	*/
	private java.lang.String realname;
	/**
	* 客户e祖宝账号
	*/
	private java.lang.String e_username;
	/**
	* 投资产品
	*/
	private java.lang.String borrow_model;
	/**
	* 赎回金额
	*/
	private Long detb_money;
	/**
	* 赎回时间
	*/
	private java.util.Date detb_time;
	/**
	* 理财师e祖宝账号
	*/
	private java.lang.String channel_username;
	/**
	* 理财师姓名
	*/
	private java.lang.String channel_realname;
	/**
	* 所属分公司
	*/
	private java.lang.String customer_flrm;
	/**
	* 所属区域管理部
	*/
	private java.lang.String customer_section;
	/**
	* 投资编号
	*/
	private java.lang.Long invest_id;
	/**
	* 手机号码
	*/
	private java.lang.String call_phone;
	/**
	* 分公司编码
	*/
	private java.lang.String dep_code;
	/**
	* 区域管理部编码
	*/
	private java.lang.String section_code;
	/**
	* 到期时间
	*/
	private java.util.Date due_time;
	/**
	* 审核通过时间
	*/
	private java.util.Date valid_time;
	/**
	* 合同编码
	*/
	private java.lang.String contract_num;


	public EzbInvestDetbBean(){
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
	* 获取 客户id
	* @return java.lang.Long 客户id
	*/
	public java.lang.Long getCust_id() {
		return this.cust_id;
	}

	/**
	 * 设置 客户id
	 * @param java.lang.Long 客户id  
	 */
	public void setCust_id(java.lang.Long value) {
		this.cust_id = value;
	}

	/**
	* 获取 客户姓名
	* @return java.lang.String 客户姓名
	*/
	public java.lang.String getRealname() {
		return this.realname;
	}

	/**
	 * 设置 客户姓名
	 * @param java.lang.String 客户姓名  
	 */
	public void setRealname(java.lang.String value) {
		this.realname = value;
	}

	/**
	* 获取 客户e祖宝账号
	* @return java.lang.String 客户e祖宝账号
	*/
	public java.lang.String getE_username() {
		return this.e_username;
	}

	/**
	 * 设置 客户e祖宝账号
	 * @param java.lang.String 客户e祖宝账号  
	 */
	public void setE_username(java.lang.String value) {
		this.e_username = value;
	}

	/**
	* 获取 投资产品
	* @return java.lang.String 投资产品
	*/
	public java.lang.String getBorrow_model() {
		return this.borrow_model;
	}

	/**
	 * 设置 投资产品
	 * @param java.lang.String 投资产品  
	 */
	public void setBorrow_model(java.lang.String value) {
		this.borrow_model = value;
	}

	/**
	* 获取 赎回金额
	* @return Long 赎回金额
	*/
	public Long getDetb_money() {
		return this.detb_money;
	}

	/**
	 * 设置 赎回金额
	 * @param Long 赎回金额  
	 */
	public void setDetb_money(Long value) {
		this.detb_money = value;
	}

	/**
	* 获取 赎回时间
	* @return java.util.Date 赎回时间
	*/
	public java.util.Date getDetb_time() {
		return this.detb_time;
	}

	/**
	 * 设置 赎回时间
	 * @param java.util.Date 赎回时间  
	 */
	public void setDetb_time(java.util.Date value) {
		this.detb_time = value;
	}

	/**
	* 获取 理财师e祖宝账号
	* @return java.lang.String 理财师e祖宝账号
	*/
	public java.lang.String getChannel_username() {
		return this.channel_username;
	}

	/**
	 * 设置 理财师e祖宝账号
	 * @param java.lang.String 理财师e祖宝账号  
	 */
	public void setChannel_username(java.lang.String value) {
		this.channel_username = value;
	}

	/**
	* 获取 理财师姓名
	* @return java.lang.String 理财师姓名
	*/
	public java.lang.String getChannel_realname() {
		return this.channel_realname;
	}

	/**
	 * 设置 理财师姓名
	 * @param java.lang.String 理财师姓名  
	 */
	public void setChannel_realname(java.lang.String value) {
		this.channel_realname = value;
	}

	/**
	* 获取 所属分公司
	* @return java.lang.String 所属分公司
	*/
	public java.lang.String getCustomer_flrm() {
		return this.customer_flrm;
	}

	/**
	 * 设置 所属分公司
	 * @param java.lang.String 所属分公司  
	 */
	public void setCustomer_flrm(java.lang.String value) {
		this.customer_flrm = value;
	}

	/**
	* 获取 所属区域管理部
	* @return java.lang.String 所属区域管理部
	*/
	public java.lang.String getCustomer_section() {
		return this.customer_section;
	}

	/**
	 * 设置 所属区域管理部
	 * @param java.lang.String 所属区域管理部  
	 */
	public void setCustomer_section(java.lang.String value) {
		this.customer_section = value;
	}

	/**
	* 获取 投资编号
	* @return java.lang.Long 投资编号
	*/
	public java.lang.Long getInvest_id() {
		return this.invest_id;
	}

	/**
	 * 设置 投资编号
	 * @param java.lang.Long 投资编号  
	 */
	public void setInvest_id(java.lang.Long value) {
		this.invest_id = value;
	}

	/**
	* 获取 手机号码
	* @return java.lang.String 手机号码
	*/
	public java.lang.String getCall_phone() {
		return this.call_phone;
	}

	/**
	 * 设置 手机号码
	 * @param java.lang.String 手机号码  
	 */
	public void setCall_phone(java.lang.String value) {
		this.call_phone = value;
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
	* 获取 区域管理部编码
	* @return java.lang.String 区域管理部编码
	*/
	public java.lang.String getSection_code() {
		return this.section_code;
	}

	/**
	 * 设置 区域管理部编码
	 * @param java.lang.String 区域管理部编码  
	 */
	public void setSection_code(java.lang.String value) {
		this.section_code = value;
	}

	/**
	* 获取 到期时间
	* @return java.util.Date 到期时间
	*/
	public java.util.Date getDue_time() {
		return this.due_time;
	}

	/**
	 * 设置 到期时间
	 * @param java.util.Date 到期时间  
	 */
	public void setDue_time(java.util.Date value) {
		this.due_time = value;
	}

	/**
	* 获取 审核通过时间
	* @return java.util.Date 审核通过时间
	*/
	public java.util.Date getValid_time() {
		return this.valid_time;
	}

	/**
	 * 设置 审核通过时间
	 * @param java.util.Date 审核通过时间  
	 */
	public void setValid_time(java.util.Date value) {
		this.valid_time = value;
	}

	/**
	* 获取 合同编码
	* @return java.lang.String 合同编码
	*/
	public java.lang.String getContract_num() {
		return this.contract_num;
	}

	/**
	 * 设置 合同编码
	 * @param java.lang.String 合同编码  
	 */
	public void setContract_num(java.lang.String value) {
		this.contract_num = value;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("id",getId())
			.append("cust_id",getCust_id())
			.append("realname",getRealname())
			.append("e_username",getE_username())
			.append("borrow_model",getBorrow_model())
			.append("detb_money",getDetb_money())
			.append("detb_time",getDetb_time())
			.append("channel_username",getChannel_username())
			.append("channel_realname",getChannel_realname())
			.append("customer_flrm",getCustomer_flrm())
			.append("customer_section",getCustomer_section())
			.append("invest_id",getInvest_id())
			.append("call_phone",getCall_phone())
			.append("dep_code",getDep_code())
			.append("section_code",getSection_code())
			.append("due_time",getDue_time())
			.append("valid_time",getValid_time())
			.append("contract_num",getContract_num())
			.toString();
	}
	
}
