package com.qkl.ztysl.api.po.user;

import java.io.Serializable;




public class LoginErr implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4917891122130353881L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.String userCode;
	
	/**
	 * 密码连续错误次数
	 */
	private java.lang.Integer pwdErrorCount;
		
	/**
	 * 锁定时间
	 */
	private java.util.Date lockedTime;

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getUserCode() {
		return userCode;
	}

	public void setUserCode(java.lang.String userCode) {
		this.userCode = userCode;
	}

	public java.lang.Integer getPwdErrorCount() {
		return pwdErrorCount;
	}

	public void setPwdErrorCount(java.lang.Integer pwdErrorCount) {
		this.pwdErrorCount = pwdErrorCount;
	}

	public java.util.Date getLockedTime() {
		return lockedTime;
	}

	public void setLockedTime(java.util.Date lockedTime) {
		this.lockedTime = lockedTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((lockedTime == null) ? 0 : lockedTime.hashCode());
		result = prime * result
				+ ((pwdErrorCount == null) ? 0 : pwdErrorCount.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
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
		LoginErr other = (LoginErr) obj;
		if (lockedTime == null) {
			if (other.lockedTime != null)
				return false;
		} else if (!lockedTime.equals(other.lockedTime))
			return false;
		if (pwdErrorCount == null) {
			if (other.pwdErrorCount != null)
				return false;
		} else if (!pwdErrorCount.equals(other.pwdErrorCount))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginErr [userCode=");
		builder.append(userCode);
		builder.append(", pwdErrorCount=");
		builder.append(pwdErrorCount);
		builder.append(", lockedTime=");
		builder.append(lockedTime);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}
