package com.qkl.tfcc.api.service.sms.api;

import java.util.List;

import com.qkl.tfcc.api.po.user.Sendsms;
import com.qkl.tfcc.api.po.user.SendsmsDetail;
import com.qkl.util.help.pager.PageData;

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
	
	
	
	/**
     * @describe:查询未发送的短信
     * @author: zhangchunming
     * @date: 2016年9月19日下午7:08:53
     * @param pd
     * @return: List<PageData>
     */
    public List<PageData> getSmsNoSend(PageData pd);
    /**
     * @describe:更新短信内容
     * @author: zhangchunming
     * @date: 2016年9月19日下午7:08:17
     * @param pd
     * @return: void
     */
    public boolean updateSms(PageData pd);
	
	
}
