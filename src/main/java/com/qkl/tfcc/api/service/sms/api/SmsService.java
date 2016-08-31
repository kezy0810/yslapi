package com.qkl.tfcc.api.service.sms.api;

import com.qkl.tfcc.api.po.user.Sendsms;
import com.qkl.tfcc.api.po.user.SendsmsDetail;

public interface SmsService {

	
	/**
	 * 查询用户短信发送次数信息
	 * @param userCode
	 */
	public Sendsms findSendsmsInfo(String userCode);
	
	/**
	 * 查询用户短信发送次数信息
	 * @param userCode
	 */
	public int findSendCntByPhone(String phone,long second);
	/**
	 * 查询短信内容
	 * @param Phone
	 * @param sysCode
	 */
	public String findSendsmsDetail(String  phone,String sysCode);
	/**
	 * 发送短信内容
	 * @param smsDetail
	 */
	public boolean addSendsmsDetail(SendsmsDetail smsDetail);
	/**
	 * 添加用户短信发送次数信息
	 * @param SendsmsInfo
	 */
	public boolean addSendsmsInfo(Sendsms SendsmsInfo);
	/**
	 * 编辑用户短信发送次数信息
	 * @param SendsmsInfo
	 */
	public boolean modifySendsmsInfo(Sendsms SendsmsInfo);
	
	
	
	
}
