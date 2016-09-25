package com.qkl.tfcc.api.po.user;

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
	 * 用户编码
	 */
	private java.lang.String userCode;
	
	/**
	 * 手机
	 */
	private java.lang.String phone;
	
	/**
	 * 登陆账号
	 */
	private java.lang.String userName;
  /**
	 * 姓名
	 */
	private java.lang.String realName;
	
	/**
	 * 身份证号
	 */
	private java.lang.String idno;
	
	/**
	 * 公司名称
	 */
	private java.lang.String cropName;
	
	/**
	 * 公司法人
	 */
	private java.lang.String cropPerson;
	
	/**
	 * 网点名称
	 */
	private java.lang.String branchName;
	
	
	/**
	 * 微信号
	 */
	private java.lang.String wxnum;
	
	/**
	 * 支付宝账户
	 */
	private java.lang.String bankaccno;
	
	
	/**
	 * 通讯地址
	 */
	private java.lang.String mailAddrss;
	
	/**
	 * 邮编
	 */
	private java.lang.String zipCode;
	
	/**
	 * 推荐人手机号
	 */
	private java.lang.String refPhone;
	
	/**
	 * 二维码
	 */
	private java.lang.String qrCode;
	
	
	/**
	 * 二维码
	 */
	private java.lang.String imgAddrss;
		
	
	/**
	 * 用户类型
	 */
	private java.lang.String userType;
	
	/**
	 * 实名状态
	 * 
	 */
	private java.lang.String realStat;
	
	/**
	 * TFCC冻结标识
	 * 
	 */
	private java.lang.String freezeFlag;
	/**
	 * TFCC冻结标识
	 * 
	 */
	private java.lang.String buyFlag;
	
	
	
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
	
	
	
	
	
	
	public java.lang.String getBuyFlag() {
		return buyFlag;
	}

	public void setBuyFlag(java.lang.String buyFlag) {
		this.buyFlag = buyFlag;
	}

	public java.lang.String getFreezeFlag() {
		return freezeFlag;
	}

	public void setFreezeFlag(java.lang.String freezeFlag) {
		this.freezeFlag = freezeFlag;
	}

	public java.lang.String getUserName() {
        return userName;
    }

    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

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

	public java.lang.String getCropName() {
		return cropName;
	}

	public void setCropName(java.lang.String cropName) {
		this.cropName = cropName;
	}

	public java.lang.String getCropPerson() {
		return cropPerson;
	}

	public void setCropPerson(java.lang.String cropPerson) {
		this.cropPerson = cropPerson;
	}

	public java.lang.String getBranchName() {
		return branchName;
	}

	public void setBranchName(java.lang.String branchName) {
		this.branchName = branchName;
	}

	public java.lang.String getWxnum() {
		return wxnum;
	}

	public void setWxnum(java.lang.String wxnum) {
		this.wxnum = wxnum;
	}

	public java.lang.String getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(java.lang.String bankaccno) {
		this.bankaccno = bankaccno;
	}

	public java.lang.String getMailAddrss() {
		return mailAddrss;
	}

	public void setMailAddrss(java.lang.String mailAddrss) {
		this.mailAddrss = mailAddrss;
	}

	public java.lang.String getZipCode() {
		return zipCode;
	}

	public void setZipCode(java.lang.String zipCode) {
		this.zipCode = zipCode;
	}

	public java.lang.String getRefPhone() {
		return refPhone;
	}

	public void setRefPhone(java.lang.String refPhone) {
		this.refPhone = refPhone;
	}

	public java.lang.String getQrCode() {
		return qrCode;
	}

	public void setQrCode(java.lang.String qrCode) {
		this.qrCode = qrCode;
	}

	public java.lang.String getImgAddrss() {
		return imgAddrss;
	}

	public void setImgAddrss(java.lang.String imgAddrss) {
		this.imgAddrss = imgAddrss;
	}

	public java.lang.String getUserType() {
		return userType;
	}

	public void setUserType(java.lang.String userType) {
		this.userType = userType;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bankaccno == null) ? 0 : bankaccno.hashCode());
		result = prime * result
				+ ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((buyFlag == null) ? 0 : buyFlag.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((cropName == null) ? 0 : cropName.hashCode());
		result = prime * result
				+ ((cropPerson == null) ? 0 : cropPerson.hashCode());
		result = prime * result
				+ ((freezeFlag == null) ? 0 : freezeFlag.hashCode());
		result = prime * result + ((idno == null) ? 0 : idno.hashCode());
		result = prime * result
				+ ((imgAddrss == null) ? 0 : imgAddrss.hashCode());
		result = prime * result
				+ ((mailAddrss == null) ? 0 : mailAddrss.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((qrCode == null) ? 0 : qrCode.hashCode());
		result = prime * result
				+ ((realName == null) ? 0 : realName.hashCode());
		result = prime * result
				+ ((realStat == null) ? 0 : realStat.hashCode());
		result = prime * result
				+ ((refPhone == null) ? 0 : refPhone.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((wxnum == null) ? 0 : wxnum.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		if (bankaccno == null) {
			if (other.bankaccno != null)
				return false;
		} else if (!bankaccno.equals(other.bankaccno))
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (buyFlag == null) {
			if (other.buyFlag != null)
				return false;
		} else if (!buyFlag.equals(other.buyFlag))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (cropName == null) {
			if (other.cropName != null)
				return false;
		} else if (!cropName.equals(other.cropName))
			return false;
		if (cropPerson == null) {
			if (other.cropPerson != null)
				return false;
		} else if (!cropPerson.equals(other.cropPerson))
			return false;
		if (freezeFlag == null) {
			if (other.freezeFlag != null)
				return false;
		} else if (!freezeFlag.equals(other.freezeFlag))
			return false;
		if (idno == null) {
			if (other.idno != null)
				return false;
		} else if (!idno.equals(other.idno))
			return false;
		if (imgAddrss == null) {
			if (other.imgAddrss != null)
				return false;
		} else if (!imgAddrss.equals(other.imgAddrss))
			return false;
		if (mailAddrss == null) {
			if (other.mailAddrss != null)
				return false;
		} else if (!mailAddrss.equals(other.mailAddrss))
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
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (qrCode == null) {
			if (other.qrCode != null)
				return false;
		} else if (!qrCode.equals(other.qrCode))
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
		if (refPhone == null) {
			if (other.refPhone != null)
				return false;
		} else if (!refPhone.equals(other.refPhone))
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
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (wxnum == null) {
			if (other.wxnum != null)
				return false;
		} else if (!wxnum.equals(other.wxnum))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDetail [userCode=");
		builder.append(userCode);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", realName=");
		builder.append(realName);
		builder.append(", idno=");
		builder.append(idno);
		builder.append(", cropName=");
		builder.append(cropName);
		builder.append(", cropPerson=");
		builder.append(cropPerson);
		builder.append(", branchName=");
		builder.append(branchName);
		builder.append(", wxnum=");
		builder.append(wxnum);
		builder.append(", bankaccno=");
		builder.append(bankaccno);
		builder.append(", mailAddrss=");
		builder.append(mailAddrss);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", refPhone=");
		builder.append(refPhone);
		builder.append(", qrCode=");
		builder.append(qrCode);
		builder.append(", imgAddrss=");
		builder.append(imgAddrss);
		builder.append(", userType=");
		builder.append(userType);
		builder.append(", realStat=");
		builder.append(realStat);
		builder.append(", freezeFlag=");
		builder.append(freezeFlag);
		builder.append(", buyFlag=");
		builder.append(buyFlag);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", modifyTime=");
		builder.append(modifyTime);
		builder.append(", operator=");
		builder.append(operator);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
