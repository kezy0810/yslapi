package com.qkl.ztysl.api.po.user;

import java.io.Serializable;




public class SendsmsDetail implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8610264549726572839L;

	/**
	 * id
	 */
	private java.lang.Integer id;	
	
	/**
	 * 手机
	 */
	private java.lang.String phone;
	
	/**
	 * 验证码
	 */
	private java.lang.String vcode;
	
	/**
	 * 系统模块
	 */
	private  java.lang.String sysCode;
	
	/**
	 * 发送时间
	 */
	private java.util.Date sendTime;

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getPhone() {
		return phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.String getVcode() {
		return vcode;
	}

	public void setVcode(java.lang.String vcode) {
		this.vcode = vcode;
	}

	public java.lang.String getSysCode() {
		return sysCode;
	}

	public void setSysCode(java.lang.String sysCode) {
		this.sysCode = sysCode;
	}

	public java.util.Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(java.util.Date sendTime) {
		this.sendTime = sendTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((sendTime == null) ? 0 : sendTime.hashCode());
		result = prime * result + ((sysCode == null) ? 0 : sysCode.hashCode());
		result = prime * result + ((vcode == null) ? 0 : vcode.hashCode());
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
		SendsmsDetail other = (SendsmsDetail) obj;
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
		if (sysCode == null) {
			if (other.sysCode != null)
				return false;
		} else if (!sysCode.equals(other.sysCode))
			return false;
		if (vcode == null) {
			if (other.vcode != null)
				return false;
		} else if (!vcode.equals(other.vcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SendsmsDetail [phone=");
		builder.append(phone);
		builder.append(", vcode=");
		builder.append(vcode);
		builder.append(", sysCode=");
		builder.append(sysCode);
		builder.append(", sendTime=");
		builder.append(sendTime);
		builder.append("]");
		return builder.toString();
	}

	
	

	
	
	
	

}
