package com.qkl.tfcc.api.po.user;

import java.io.Serializable;




public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4233631757961132833L;
	
	
	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.String userCode;
	/**
	 * 用户名
	 */
	private java.lang.String userName;
	/**
	 * 手机
	 */
	private java.lang.String phone;
	
	/**
	 * 密码
	 */
	private java.lang.String pwdhash;
	
	
	/**
	 * 开始日期
	 */
	private java.util.Date startDate;
	
	/**
	 * 结束日期
	 */
	private java.util.Date endDate;
	
	/**
	 * 是否登陆锁定
	 */
	private java.lang.String isLoginlocked;
	
	/**
	 * 登陆锁定日期
	 */
	private java.util.Date loginlockTime;
	
	/**
	 * 是否短信锁定
	 */
	private java.lang.String isSmslocked;
	
	/**
	 * 短信锁定日期
	 */
	private java.util.Date smslockTime;
	
	/**
	 * 用户类型
	 */
	private java.lang.String userType;
	
	/**
	 * 注册时间 
	 * reg_time
	 */
	private java.util.Date regTime;
	/**
	 * 状态
	 * status
	 */
	private java.lang.String status;
	
	/**
	 * 创建时间
	 */
	private java.util.Date createTime;
	
	/**
	 * 修改时间
	 */
	private java.util.Date modifyTime;

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

	public java.lang.String getPhone() {
		return phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.String getPwdhash() {
		return pwdhash;
	}

	public void setPwdhash(java.lang.String pwdhash) {
		this.pwdhash = pwdhash;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}

	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}

	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public java.lang.String getIsLoginlocked() {
		return isLoginlocked;
	}

	public void setIsLoginlocked(java.lang.String isLoginlocked) {
		this.isLoginlocked = isLoginlocked;
	}

	public java.util.Date getLoginlockTime() {
		return loginlockTime;
	}

	public void setLoginlockTime(java.util.Date loginlockTime) {
		this.loginlockTime = loginlockTime;
	}

	public java.lang.String getIsSmslocked() {
		return isSmslocked;
	}

	public void setIsSmslocked(java.lang.String isSmslocked) {
		this.isSmslocked = isSmslocked;
	}

	public java.util.Date getSmslockTime() {
		return smslockTime;
	}

	public void setSmslockTime(java.util.Date smslockTime) {
		this.smslockTime = smslockTime;
	}

	public java.lang.String getUserType() {
		return userType;
	}

	public void setUserType(java.lang.String userType) {
		this.userType = userType;
	}

	public java.util.Date getRegTime() {
		return regTime;
	}

	public void setRegTime(java.util.Date regTime) {
		this.regTime = regTime;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.util.Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((isLoginlocked == null) ? 0 : isLoginlocked.hashCode());
		result = prime * result
				+ ((isSmslocked == null) ? 0 : isSmslocked.hashCode());
		result = prime * result
				+ ((loginlockTime == null) ? 0 : loginlockTime.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((pwdhash == null) ? 0 : pwdhash.hashCode());
		result = prime * result + ((regTime == null) ? 0 : regTime.hashCode());
		result = prime * result
				+ ((smslockTime == null) ? 0 : smslockTime.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
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
		User other = (User) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (isLoginlocked == null) {
			if (other.isLoginlocked != null)
				return false;
		} else if (!isLoginlocked.equals(other.isLoginlocked))
			return false;
		if (isSmslocked == null) {
			if (other.isSmslocked != null)
				return false;
		} else if (!isSmslocked.equals(other.isSmslocked))
			return false;
		if (loginlockTime == null) {
			if (other.loginlockTime != null)
				return false;
		} else if (!loginlockTime.equals(other.loginlockTime))
			return false;
		if (modifyTime == null) {
			if (other.modifyTime != null)
				return false;
		} else if (!modifyTime.equals(other.modifyTime))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (pwdhash == null) {
			if (other.pwdhash != null)
				return false;
		} else if (!pwdhash.equals(other.pwdhash))
			return false;
		if (regTime == null) {
			if (other.regTime != null)
				return false;
		} else if (!regTime.equals(other.regTime))
			return false;
		if (smslockTime == null) {
			if (other.smslockTime != null)
				return false;
		} else if (!smslockTime.equals(other.smslockTime))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userCode=");
		builder.append(userCode);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", pwdhash=");
		builder.append(pwdhash);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", isLoginlocked=");
		builder.append(isLoginlocked);
		builder.append(", loginlockTime=");
		builder.append(loginlockTime);
		builder.append(", isSmslocked=");
		builder.append(isSmslocked);
		builder.append(", smslockTime=");
		builder.append(smslockTime);
		builder.append(", userType=");
		builder.append(userType);
		builder.append(", regTime=");
		builder.append(regTime);
		builder.append(", status=");
		builder.append(status);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", modifyTime=");
		builder.append(modifyTime);
		builder.append("]");
		return builder.toString();
	}

	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
	
	
	

	
	
	
	
	

}
