package com.qkl.ztysl.api.service.acc.api;

import com.qkl.ztysl.api.po.acc.MemberLimit;

public interface MemberLimitService {

	
	/**
	 * 新建用户额度
	 * @param addMemberLimit
	 * @param MemberLimit
	 */
	public boolean addMemberLimit(MemberLimit memberLimit,String versionNo);
	
	
	/**
	 * 修改用户额度
	 * @param modifyMemberLimit 
	 * @param MemberLimit
	 */
	public boolean modifyMemberLimit(MemberLimit memberLimit,String versionNo);
	
	/**
	 * 查询用户额度
	 * @param findMemberLimit
	 * @param userCode
	 */
	public MemberLimit findMemberLimit(String userCode,String versionNo);
	
}
