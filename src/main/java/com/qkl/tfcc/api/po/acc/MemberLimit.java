package com.qkl.tfcc.api.po.acc;

import java.io.Serializable;




public class MemberLimit implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3633169138064083845L;


	/**
	 * id
	 */
	private java.lang.Integer id;

	/**
	 * 用户名
	 */
	private java.lang.String userCode;
	

	/**
	 * 关联用户名
	 */
	private java.lang.String rela_usercode;
	
	/**
	 * 账户编码
	 */
	private java.lang.String accNo;
	
	
	/**
	 * 账户类型
	 */
	private java.lang.String cuyType;
	/**
	 * 账户类型
	 */
	private java.math.BigDecimal creditLimit;
	

	
	
	/**
	 * 描述
	 */
	private java.lang.String description;
	
	/**
	 * 状态
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
	
	/**
	 * 操作员
	 */
	private java.lang.String operator;
	
	
	

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getAccNo() {
		return accNo;
	}

	public void setAccNo(java.lang.String accNo) {
		this.accNo = accNo;
	}

	

	public java.lang.String getRela_usercode() {
		return rela_usercode;
	}

	public void setRela_usercode(java.lang.String rela_usercode) {
		this.rela_usercode = rela_usercode;
	}

	public java.lang.String getUserCode() {
		return userCode;
	}

	public void setUserCode(java.lang.String userCode) {
		this.userCode = userCode;
	}

	public java.lang.String getCuyType() {
		return cuyType;
	}

	public void setCuyType(java.lang.String cuyType) {
		this.cuyType = cuyType;
	}

	public java.math.BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(java.math.BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
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
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((creditLimit == null) ? 0 : creditLimit.hashCode());
		result = prime * result + ((cuyType == null) ? 0 : cuyType.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result
				+ ((rela_usercode == null) ? 0 : rela_usercode.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		MemberLimit other = (MemberLimit) obj;
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (creditLimit == null) {
			if (other.creditLimit != null)
				return false;
		} else if (!creditLimit.equals(other.creditLimit))
			return false;
		if (cuyType == null) {
			if (other.cuyType != null)
				return false;
		} else if (!cuyType.equals(other.cuyType))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
		if (rela_usercode == null) {
			if (other.rela_usercode != null)
				return false;
		} else if (!rela_usercode.equals(other.rela_usercode))
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
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberLimit [userCode=");
		builder.append(userCode);
		builder.append(", rela_usercode=");
		builder.append(rela_usercode);
		builder.append(", accNo=");
		builder.append(accNo);
		builder.append(", cuyType=");
		builder.append(cuyType);
		builder.append(", creditLimit=");
		builder.append(creditLimit);
		builder.append(", description=");
		builder.append(description);
		builder.append(", status=");
		builder.append(status);
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
