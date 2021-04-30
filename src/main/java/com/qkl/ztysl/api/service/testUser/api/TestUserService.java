package com.qkl.ztysl.api.service.testUser.api;

import java.util.List;

import com.qkl.ztysl.api.entity.Page;
import com.qkl.ztysl.api.po.TestUser;
import com.qkl.util.help.pager.PageData;


/**测试用户的接口
 * <p>Description： 测试用户所有的接口 </p>
 * @project_Name yc_udrs_api
 * @class_Name TestUserService.java
 * @author liuyang
 * @date 2015年4月15日
 * @version v1.0
 */
public interface TestUserService {

	/** 获取用户信息
	 * <p> (根据用户的主键获取用户信息) </p>
	 * @Title: getTestUserByUserId 
	 * @param testUserId long 用户主键
	 * @return TestUser 用户对象
	 * @create author liuyang
	 * @create date 2015年4月15日
	 */ 
	public TestUser queryTestUserByUserId(long testUserId);
	
	public List<PageData> queryTestUserList(Page page);
}
