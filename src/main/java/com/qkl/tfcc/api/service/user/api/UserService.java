package com.qkl.tfcc.api.service.user.api;

import java.util.Date;
import java.util.Map;

import com.qkl.tfcc.api.po.user.User;
import com.qkl.tfcc.api.po.user.UserDetail;
import com.qkl.tfcc.api.po.user.UserFriendship;
import com.qkl.tfcc.api.po.user.UserLevelcnt;

public interface UserService {

	/**
	 * 用户登录
	 * @param phone
	 * @param password
	 * @param systemCode
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> login(String phone, String password, String systemCode,String versionNo);
	/**
	 * 查询锁定登录标识符
	 * @param userCode
	 */
	public Map<String, Object> findLockLoginStatus(String phone,long second,String versionNo);
	
	/**
	 * 查询锁定短信发送标识符
	 * @param userCode
	 */
	public Map<String, Object> findLockSmsStatus(String phone,long second,String versionNo);
	/**
	 * 根据手机号查询用户
	 * @param phone
	 */
	public User findbyPhone(String phone,String versionNo);
	
	/**
     * 根据用户编码查询用户
     * @param userCode
     */
	public User findUserByUserCode(String userCode);
	
	/**
	 * 根据手机号查询用户
	 * @param userCode
	 */
	public boolean findIsExist(String phone,String versionNo);
	
	/**
	 * 根据手机号查询是否存在上级会员
	 * @param phone
	 */
	public boolean findIsExistUpFriendship(String recomusercode,String versionNo);
	
	/**
	 * 根据手机号查询上级会员
	 * @param phone
	 */
	public UserFriendship findUpFriendship(String recomusercode,String versionNo);
	
	/**
	 * 新建用户
	 * @param user
	 * @param userDetail
	 */
	public boolean addUser(User user,UserDetail userDetail,String versionNo);
	
	
	/**
	 * 新建用户关系
	 * @param userFriendship
	 * 
	 */
	public boolean addUserFriendShip(UserFriendship userFriendship,String versionNo);
	
	/**
	 * 实名用户
	 * @param userCode
	 * @param realName
	 * @param idNo
	 */
	public boolean realUser(String phone,String realName,String idNo,String versionNo);
	
	/**
	 * 修改密码
	 * @param phone
	 * @param password
	 */
	public boolean modifyPwd(String phone,String password,String versionNo);
	
	/**
     * 修改密码
     * @param userCode
     * @param password
     */
    public boolean modifypwdByUserCode(String userCode,String password,String versionNo);
	
	/**
	 * 修改手机
	 * @param userCode
	 * @param password
	 */
	public boolean modifyPhone(String userCode,String phone,String versionNo);
	
	/**
	 * 修改用户资料
	 * @param userDetail
	 */
	public boolean modifyUserDetail(UserDetail userDetail,String versionNo);
		
	/**
	 * 修改锁定登录标识符
	 * @param userCode
	 */
	public boolean modifyLockLoginStatus(String  userCode,String status,Date locktime,String versionNo);
	
	/**
	 * 修改锁定短信发送标识符
	 * @param userCode
	 */
	public boolean modifyLockSmsStatus(String  phone,String status,Date locktime,String versionNo);
	
	/**
     * @author: zhangchunming
     * @date: 2016年9月1日下午7:56:37
     * @param: userCode
     * @param: img_addrss
     * @return boolean
     */
    public boolean modifyUserHeadPic(String userCode,String imgAddrss, String versionNo);
    /**
     * @describe:查询用户详细信息
     * @author: zhangchunming
     * @date: 2016年9月2日上午9:56:51
     * @params: @param userCode
     * @params: @param versionNo
     * @params: @return
     * @return: UserDetail
     */
	public UserDetail findUserDetailByUserCode(String userCode,String versionNo);
	
	/**
	 * 新建用户级别数量表
	 * @param userLevelcnt
	 * 
	 *//*
	public boolean addUserLevCnt(UserLevelcnt userLevelcnt,String versionNo);
	*//**
	 * 修改用户级别数量表
	 * @param userLevelcnt
	 * 
	 *//*
	public boolean modifyUserLevCnt(UserLevelcnt userLevelcnt,String versionNo);*/
	
}
