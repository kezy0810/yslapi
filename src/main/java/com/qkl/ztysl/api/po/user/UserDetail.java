package com.qkl.ztysl.api.po.user;

import java.io.Serializable;

public class UserDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6000353851778442371L;

	/**
	 * id
	 */
	private java.lang.Integer id;	
	/**
	 * 登陆账号
	 */
	private java.lang.String userName;
	/**
	 * 用户类型
	 */
	private java.lang.String userType;
	/**
	 * 密码
	 */
	private java.lang.String transPassword;
	
	/**
	 * 注册时间 
	 * reg_time
	 */
	private java.util.Date regTime;
	
	/**
	 * 手机
	 */
	private java.lang.String mobilePhone;
	
	
  /**
	 * 姓名
	 */
	private java.lang.String realName;
	
	/**
	 * 身份证号
	 */
	private java.lang.String idno;
	
		
	/**
	 * 微信号
	 */
	private java.lang.String wxAccno;
	
	/**
	 * 支付宝账户
	 */
	private java.lang.String alipayAccno;
	
	
	/**
	 * 通讯地址
	 */
	private java.lang.String addressMsg;
	
	/**
	 * 自己推荐码
	 */
	private java.lang.String refCode;
	
	/**
	 * 推荐人的推荐码
	 */
	private java.lang.String parentRefcode;
	
	/**
	 * 推荐人的姓名
	 */
	private java.lang.String  parentUsername;
	
	/**
	 * 二维码
	 */
	private java.lang.String qrCode;
	
	
	/**
	 * 状态
	 */
	private java.lang.String status;
		
	
	
	/**
	 * 实名状态
	 * 
	 */
	private java.lang.String realStat;
	
	/**
	 * 创建时间
	 */
	private java.util.Date createTime;
	
	/**
	 * 修改时间
	 */
	private java.util.Date modifyTime;
	
	/**
	 * 操作员
	 */
	private java.lang.String operator;
	
	
	/**
	 * 备注1
	 */
	private java.lang.String r1;
	
	/**
	 * 备注2
	 */
	private java.lang.String r2;
	
	/**
	 * 备注3
	 */
	private java.lang.String r3;
	
	/**
	 * 备注4
	 */
	private java.lang.String r4;
	
	/**
	 * 备注5
	 */
	private java.lang.String r5;

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getUserType() {
		return userType;
	}

	public void setUserType(java.lang.String userType) {
		this.userType = userType;
	}

	public java.lang.String getTransPassword() {
		return transPassword;
	}

	public void setTransPassword(java.lang.String transPassword) {
		this.transPassword = transPassword;
	}

	public java.util.Date getRegTime() {
		return regTime;
	}

	public void setRegTime(java.util.Date regTime) {
		this.regTime = regTime;
	}

	public java.lang.String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(java.lang.String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public java.lang.String getRealName() {
		return realName;
	}

	public void setRealName(java.lang.String realName) {
		this.realName = realName;
	}

	public java.lang.String getIdno() {
		return idno;
	}

	public void setIdno(java.lang.String idno) {
		this.idno = idno;
	}

	public java.lang.String getWxAccno() {
		return wxAccno;
	}

	public void setWxAccno(java.lang.String wxAccno) {
		this.wxAccno = wxAccno;
	}

	public java.lang.String getAlipayAccno() {
		return alipayAccno;
	}

	public void setAlipayAccno(java.lang.String alipayAccno) {
		this.alipayAccno = alipayAccno;
	}

	public java.lang.String getAddressMsg() {
		return addressMsg;
	}

	public void setAddressMsg(java.lang.String addressMsg) {
		this.addressMsg = addressMsg;
	}

	public java.lang.String getRefCode() {
		return refCode;
	}

	public void setRefCode(java.lang.String refCode) {
		this.refCode = refCode;
	}

	public java.lang.String getParentRefcode() {
		return parentRefcode;
	}

	public void setParentRefcode(java.lang.String parentRefcode) {
		this.parentRefcode = parentRefcode;
	}

	public java.lang.String getParentUsername() {
		return parentUsername;
	}

	public void setParentUsername(java.lang.String parentUsername) {
		this.parentUsername = parentUsername;
	}

	public java.lang.String getQrCode() {
		return qrCode;
	}

	public void setQrCode(java.lang.String qrCode) {
		this.qrCode = qrCode;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getRealStat() {
		return realStat;
	}

	public void setRealStat(java.lang.String realStat) {
		this.realStat = realStat;
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

	public java.lang.String getOperator() {
		return operator;
	}

	public void setOperator(java.lang.String operator) {
		this.operator = operator;
	}

	public java.lang.String getR1() {
		return r1;
	}

	public void setR1(java.lang.String r1) {
		this.r1 = r1;
	}

	public java.lang.String getR2() {
		return r2;
	}

	public void setR2(java.lang.String r2) {
		this.r2 = r2;
	}

	public java.lang.String getR3() {
		return r3;
	}

	public void setR3(java.lang.String r3) {
		this.r3 = r3;
	}

	public java.lang.String getR4() {
		return r4;
	}

	public void setR4(java.lang.String r4) {
		this.r4 = r4;
	}

	public java.lang.String getR5() {
		return r5;
	}

	public void setR5(java.lang.String r5) {
		this.r5 = r5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressMsg == null) ? 0 : addressMsg.hashCode());
		result = prime * result + ((alipayAccno == null) ? 0 : alipayAccno.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idno == null) ? 0 : idno.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		result = prime * result + ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((parentRefcode == null) ? 0 : parentRefcode.hashCode());
		result = prime * result + ((parentUsername == null) ? 0 : parentUsername.hashCode());
		result = prime * result + ((qrCode == null) ? 0 : qrCode.hashCode());
		result = prime * result + ((r1 == null) ? 0 : r1.hashCode());
		result = prime * result + ((r2 == null) ? 0 : r2.hashCode());
		result = prime * result + ((r3 == null) ? 0 : r3.hashCode());
		result = prime * result + ((r4 == null) ? 0 : r4.hashCode());
		result = prime * result + ((r5 == null) ? 0 : r5.hashCode());
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((realStat == null) ? 0 : realStat.hashCode());
		result = prime * result + ((refCode == null) ? 0 : refCode.hashCode());
		result = prime * result + ((regTime == null) ? 0 : regTime.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transPassword == null) ? 0 : transPassword.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((wxAccno == null) ? 0 : wxAccno.hashCode());
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
		UserDetail other = (UserDetail) obj;
		if (addressMsg == null) {
			if (other.addressMsg != null)
				return false;
		} else if (!addressMsg.equals(other.addressMsg))
			return false;
		if (alipayAccno == null) {
			if (other.alipayAccno != null)
				return false;
		} else if (!alipayAccno.equals(other.alipayAccno))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idno == null) {
			if (other.idno != null)
				return false;
		} else if (!idno.equals(other.idno))
			return false;
		if (mobilePhone == null) {
			if (other.mobilePhone != null)
				return false;
		} else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		if (modifyTime == null) {
			if (other.modifyTime != null)
				return false;
		} else if (!modifyTime.equals(other.modifyTime))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		if (parentRefcode == null) {
			if (other.parentRefcode != null)
				return false;
		} else if (!parentRefcode.equals(other.parentRefcode))
			return false;
		if (parentUsername == null) {
			if (other.parentUsername != null)
				return false;
		} else if (!parentUsername.equals(other.parentUsername))
			return false;
		if (qrCode == null) {
			if (other.qrCode != null)
				return false;
		} else if (!qrCode.equals(other.qrCode))
			return false;
		if (r1 == null) {
			if (other.r1 != null)
				return false;
		} else if (!r1.equals(other.r1))
			return false;
		if (r2 == null) {
			if (other.r2 != null)
				return false;
		} else if (!r2.equals(other.r2))
			return false;
		if (r3 == null) {
			if (other.r3 != null)
				return false;
		} else if (!r3.equals(other.r3))
			return false;
		if (r4 == null) {
			if (other.r4 != null)
				return false;
		} else if (!r4.equals(other.r4))
			return false;
		if (r5 == null) {
			if (other.r5 != null)
				return false;
		} else if (!r5.equals(other.r5))
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (realStat == null) {
			if (other.realStat != null)
				return false;
		} else if (!realStat.equals(other.realStat))
			return false;
		if (refCode == null) {
			if (other.refCode != null)
				return false;
		} else if (!refCode.equals(other.refCode))
			return false;
		if (regTime == null) {
			if (other.regTime != null)
				return false;
		} else if (!regTime.equals(other.regTime))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (transPassword == null) {
			if (other.transPassword != null)
				return false;
		} else if (!transPassword.equals(other.transPassword))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (wxAccno == null) {
			if (other.wxAccno != null)
				return false;
		} else if (!wxAccno.equals(other.wxAccno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", userName=" + userName + ", userType=" + userType + ", transPassword="
				+ transPassword + ", regTime=" + regTime + ", mobilePhone=" + mobilePhone + ", realName=" + realName
				+ ", idno=" + idno + ", wxAccno=" + wxAccno + ", alipayAccno=" + alipayAccno + ", addressMsg="
				+ addressMsg + ", refCode=" + refCode + ", parentRefcode=" + parentRefcode + ", parentUsername="
				+ parentUsername + ", qrCode=" + qrCode + ", status=" + status + ", realStat=" + realStat
				+ ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", operator=" + operator + ", r1=" + r1
				+ ", r2=" + r2 + ", r3=" + r3 + ", r4=" + r4 + ", r5=" + r5 + "]";
	}

	
}
