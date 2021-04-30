package com.qkl.ztysl.api.po;

import java.io.Serializable;

/** 测试用户
 * <p> Description：测试用户的实体  </p>
 * @project_Name yc_udrs_api
 * @class_Name TestUser.java
 * @author liuyang
 * @date 2015年4月15日
 * @version v1.0
 */
public class TestUser implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long test_user_id;// 测试用户主键
	
	private String name; //用户名称
	
	public long getTest_user_id() {
		return test_user_id;
	}
	public void setTest_user_id(long test_user_id) {
		this.test_user_id = test_user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
