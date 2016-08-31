package com.qkl.tfcc.api.po.user;

import java.io.Serializable;




public class Sendsms implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1004218409778823250L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.String userCode;
	
	/**
	 * 手机
	 */
	private java.lang.String phone;
	
	/**
	 * 短信连续发送次数
	 */
	private java.lang.Integer sendsmsCount;
	
	
	/**
	 * 发送时间
	 */
	private java.util.Date sendTime;
	
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

	public java.lang.String getPhone() {
		return phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.Integer getSendsmsCount() {
		return sendsmsCount;
	}

	public void setSendsmsCount(java.lang.Integer sendsmsCount) {
		this.sendsmsCount = sendsmsCount;
	}

	public java.util.Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(java.util.Date sendTime) {
		this.sendTime = sendTime;
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
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((sendTime == null) ? 0 : sendTime.hashCode());
		result = prime * result
				+ ((sendsmsCount == null) ? 0 : sendsmsCount.hashCode());
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
		Sendsms other = (Sendsms) obj;
		if (lockedTime == null) {
			if (other.lockedTime != null)
				return false;
		} else if (!lockedTime.equals(other.lockedTime))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (sendTime == null) {
			if (other.sendTime != null)
				return false;
		} else if (!sendTime.equals(other.sendTime))
			return false;
		if (sendsmsCount == null) {
			if (other.sendsmsCount != null)
				return false;
		} else if (!sendsmsCount.equals(other.sendsmsCount))
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
		builder.append("Sendsms [userCode=");
		builder.append(userCode);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", sendsmsCount=");
		builder.append(sendsmsCount);
		builder.append(", sendTime=");
		builder.append(sendTime);
		builder.append(", lockedTime=");
		builder.append(lockedTime);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}
