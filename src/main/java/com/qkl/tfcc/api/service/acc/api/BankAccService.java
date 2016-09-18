package com.qkl.tfcc.api.service.acc.api;
import com.qkl.tfcc.api.po.acc.BankAccInfo;


public interface BankAccService {

	
	
	
	/**
	 * 新建银行账户表信息
	 * @param findBankAccInfo
	 * @param BankAccInfo
	 */
	public BankAccInfo findBankAccInfo(String orgName,String versionNo);
	
	
	
	public BankAccInfo findBankInfo(String versionNo);
	
	
}
