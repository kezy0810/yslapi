package com.qkl.tfcc.api.po;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

 /**
 * 钰申员工明细数据对象
 * <p>Description：钰申员工明细数据对象  </p>
 * @project_Name yc_udrs_api
 * @class_Name YsEmployee.java
 * @author weigangpeng
 * @date 2015年4月20日
 * @version v1.0
 */
public class YsEmployeeBean implements java.io.Serializable{


	/**
	* 员工id
	*/
	private java.lang.Long user_id;
	/**
	* 姓名
	*/
	private java.lang.String user_name;
	/**
	* 性别
	*/
	private Integer sex;
	/**
	* 籍贯
	*/
	private java.lang.String nativeplace;
	/**
	* 年龄
	*/
	private Integer age;
	/**
	* 学历
	*/
	private java.lang.String education;
	/**
	* 毕业院校
	*/
	private java.lang.String college;
	/**
	* 身份证号
	*/
	private java.lang.String idcard;
	/**
	* 手机号
	*/
	private java.lang.String call_phone;
	/**
	* e租宝账号
	*/
	private java.lang.String channel_username;
	/**
	* 职务
	*/
	private java.lang.String post;
	/**
	* 职级
	*/
	private java.lang.String rank;
	/**
	* 区域编码
	*/
	private java.lang.String section_code;
	/**
	* 分公司编码
	*/
	private java.lang.String dep_code;
	/**
	* 所属公司
	*/
	private java.lang.String dep_name;
	/**
	* 一级部门
	*/
	private java.lang.String dep1_name;
	/**
	* 二级部门
	*/
	private java.lang.String dep2_name;
	/**
	* 三级部门
	*/
	private java.lang.String dep3_name;
	/**
	* 直接上级
	*/
	private java.lang.String upper_name;
	/**
	* 入职时间
	*/
	private java.util.Date inter_time;
	/**
	* 入职时间
	*/
	private java.util.Date reg_time;
	/**
	* 区域管理部名称
	*/
	private java.lang.String section_name;


	public YsEmployeeBean(){
	}
	
	
	/**
	* 获取 员工id
	* @return java.lang.Long 员工id
	*/
	public java.lang.Long getUser_id() {
		return this.user_id;
	}

	/**
	 * 设置 员工id
	 * @param java.lang.Long 员工id  
	 */
	public void setUser_id(java.lang.Long value) {
		this.user_id = value;
	}

	/**
	* 获取 姓名
	* @return java.lang.String 姓名
	*/
	public java.lang.String getUser_name() {
		return this.user_name;
	}

	/**
	 * 设置 姓名
	 * @param java.lang.String 姓名  
	 */
	public void setUser_name(java.lang.String value) {
		this.user_name = value;
	}

	/**
	* 获取 性别
	* @return Integer 性别
	*/
	public Integer getSex() {
		return this.sex;
	}

	/**
	 * 设置 性别
	 * @param Integer 性别  
	 */
	public void setSex(Integer value) {
		this.sex = value;
	}

	/**
	* 获取 籍贯
	* @return java.lang.String 籍贯
	*/
	public java.lang.String getNativeplace() {
		return this.nativeplace;
	}

	/**
	 * 设置 籍贯
	 * @param java.lang.String 籍贯  
	 */
	public void setNativeplace(java.lang.String value) {
		this.nativeplace = value;
	}

	/**
	* 获取 年龄
	* @return Integer 年龄
	*/
	public Integer getAge() {
		return this.age;
	}

	/**
	 * 设置 年龄
	 * @param Integer 年龄  
	 */
	public void setAge(Integer value) {
		this.age = value;
	}

	/**
	* 获取 学历
	* @return java.lang.String 学历
	*/
	public java.lang.String getEducation() {
		return this.education;
	}

	/**
	 * 设置 学历
	 * @param java.lang.String 学历  
	 */
	public void setEducation(java.lang.String value) {
		this.education = value;
	}

	/**
	* 获取 毕业院校
	* @return java.lang.String 毕业院校
	*/
	public java.lang.String getCollege() {
		return this.college;
	}

	/**
	 * 设置 毕业院校
	 * @param java.lang.String 毕业院校  
	 */
	public void setCollege(java.lang.String value) {
		this.college = value;
	}

	/**
	* 获取 身份证号
	* @return java.lang.String 身份证号
	*/
	public java.lang.String getIdcard() {
		return this.idcard;
	}

	/**
	 * 设置 身份证号
	 * @param java.lang.String 身份证号  
	 */
	public void setIdcard(java.lang.String value) {
		this.idcard = value;
	}

	/**
	* 获取 手机号
	* @return java.lang.String 手机号
	*/
	public java.lang.String getCall_phone() {
		return this.call_phone;
	}

	/**
	 * 设置 手机号
	 * @param java.lang.String 手机号  
	 */
	public void setCall_phone(java.lang.String value) {
		this.call_phone = value;
	}

	/**
	* 获取 e租宝账号
	* @return java.lang.String e租宝账号
	*/
	public java.lang.String getChannel_username() {
		return this.channel_username;
	}

	/**
	 * 设置 e租宝账号
	 * @param java.lang.String e租宝账号  
	 */
	public void setChannel_username(java.lang.String value) {
		this.channel_username = value;
	}

	/**
	* 获取 职务
	* @return java.lang.String 职务
	*/
	public java.lang.String getPost() {
		return this.post;
	}

	/**
	 * 设置 职务
	 * @param java.lang.String 职务  
	 */
	public void setPost(java.lang.String value) {
		this.post = value;
	}

	/**
	* 获取 职级
	* @return java.lang.String 职级
	*/
	public java.lang.String getRank() {
		return this.rank;
	}

	/**
	 * 设置 职级
	 * @param java.lang.String 职级  
	 */
	public void setRank(java.lang.String value) {
		this.rank = value;
	}

	/**
	* 获取 区域编码
	* @return java.lang.String 区域编码
	*/
	public java.lang.String getSection_code() {
		return this.section_code;
	}

	/**
	 * 设置 区域编码
	 * @param java.lang.String 区域编码  
	 */
	public void setSection_code(java.lang.String value) {
		this.section_code = value;
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
	* 获取 所属公司
	* @return java.lang.String 所属公司
	*/
	public java.lang.String getDep_name() {
		return this.dep_name;
	}

	/**
	 * 设置 所属公司
	 * @param java.lang.String 所属公司  
	 */
	public void setDep_name(java.lang.String value) {
		this.dep_name = value;
	}

	/**
	* 获取 一级部门
	* @return java.lang.String 一级部门
	*/
	public java.lang.String getDep1_name() {
		return this.dep1_name;
	}

	/**
	 * 设置 一级部门
	 * @param java.lang.String 一级部门  
	 */
	public void setDep1_name(java.lang.String value) {
		this.dep1_name = value;
	}

	/**
	* 获取 二级部门
	* @return java.lang.String 二级部门
	*/
	public java.lang.String getDep2_name() {
		return this.dep2_name;
	}

	/**
	 * 设置 二级部门
	 * @param java.lang.String 二级部门  
	 */
	public void setDep2_name(java.lang.String value) {
		this.dep2_name = value;
	}

	/**
	* 获取 三级部门
	* @return java.lang.String 三级部门
	*/
	public java.lang.String getDep3_name() {
		return this.dep3_name;
	}

	/**
	 * 设置 三级部门
	 * @param java.lang.String 三级部门  
	 */
	public void setDep3_name(java.lang.String value) {
		this.dep3_name = value;
	}

	/**
	* 获取 直接上级
	* @return java.lang.String 直接上级
	*/
	public java.lang.String getUpper_name() {
		return this.upper_name;
	}

	/**
	 * 设置 直接上级
	 * @param java.lang.String 直接上级  
	 */
	public void setUpper_name(java.lang.String value) {
		this.upper_name = value;
	}

	/**
	* 获取 入职时间
	* @return java.util.Date 入职时间
	*/
	public java.util.Date getInter_time() {
		return this.inter_time;
	}

	/**
	 * 设置 入职时间
	 * @param java.util.Date 入职时间  
	 */
	public void setInter_time(java.util.Date value) {
		this.inter_time = value;
	}

	/**
	* 获取 入职时间
	* @return java.util.Date 入职时间
	*/
	public java.util.Date getReg_time() {
		return this.reg_time;
	}

	/**
	 * 设置 入职时间
	 * @param java.util.Date 入职时间  
	 */
	public void setReg_time(java.util.Date value) {
		this.reg_time = value;
	}

	/**
	* 获取 区域管理部名称
	* @return java.lang.String 区域管理部名称
	*/
	public java.lang.String getSection_name() {
		return this.section_name;
	}

	/**
	 * 设置 区域管理部名称
	 * @param java.lang.String 区域管理部名称  
	 */
	public void setSection_name(java.lang.String value) {
		this.section_name = value;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("user_id",getUser_id())
			.append("user_name",getUser_name())
			.append("sex",getSex())
			.append("nativeplace",getNativeplace())
			.append("age",getAge())
			.append("education",getEducation())
			.append("college",getCollege())
			.append("idcard",getIdcard())
			.append("call_phone",getCall_phone())
			.append("channel_username",getChannel_username())
			.append("post",getPost())
			.append("rank",getRank())
			.append("section_code",getSection_code())
			.append("dep_code",getDep_code())
			.append("dep_name",getDep_name())
			.append("dep1_name",getDep1_name())
			.append("dep2_name",getDep2_name())
			.append("dep3_name",getDep3_name())
			.append("upper_name",getUpper_name())
			.append("inter_time",getInter_time())
			.append("reg_time",getReg_time())
			.append("section_name",getSection_name())
			.toString();
	}
	
}
