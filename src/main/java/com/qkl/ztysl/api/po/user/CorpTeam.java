package com.qkl.ztysl.api.po.user;

import java.io.Serializable;
import java.util.Date;

public class CorpTeam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long lpNum;
	private String userName;
	private String userCode;
	private Date regTime;
	private long rewardNum;
	
	
	public long getLpNum() {
		return lpNum;
	}
	public void setLpNum(long lpNum) {
		this.lpNum = lpNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public long getRewardNum() {
		return rewardNum;
	}
	public void setRewardNum(long rewardNum) {
		this.rewardNum = rewardNum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (lpNum ^ (lpNum >>> 32));
		result = prime * result + ((regTime == null) ? 0 : regTime.hashCode());
		result = prime * result + (int) (rewardNum ^ (rewardNum >>> 32));
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CorpTeam other = (CorpTeam) obj;
		if (lpNum != other.lpNum)
			return false;
		if (regTime == null) {
			if (other.regTime != null)
				return false;
		} else if (!regTime.equals(other.regTime))
			return false;
		if (rewardNum != other.rewardNum)
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CorpTeam [lpNum=" + lpNum + ", userName=" + userName
				+ ", userCode=" + userCode + ", regTime=" + regTime
				+ ", rewardNum=" + rewardNum + "]";
	}
	
	
	
	
	
	

}
