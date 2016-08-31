package com.qkl.tfcc.api.po.acc;

import java.io.Serializable;




public class AccLimitdef implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = -1498364729603650211L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	
	/**
	 * 账户编码
	 */
	private java.lang.String accNo;
	
	/**
	 * 账户名称
	 */
	private java.lang.String accName;
	
	
	/**
	 * 账户类型
	 */
	private java.math.BigDecimal amnt;
	

	
	
	/**
	 * 描述
	 */
	private java.lang.String description;
	
	
	
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

	public java.lang.String getAccName() {
		return accName;
	}

	public void setAccName(java.lang.String accName) {
		this.accName = accName;
	}

	public java.math.BigDecimal getAmnt() {
		return amnt;
	}

	public void setAmnt(java.math.BigDecimal amnt) {
		this.amnt = amnt;
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
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result + ((amnt == null) ? 0 : amnt.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
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
		AccLimitdef other = (AccLimitdef) obj;
		if (accName == null) {
			if (other.accName != null)
				return false;
		} else if (!accName.equals(other.accName))
			return false;
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		if (amnt == null) {
			if (other.amnt != null)
				return false;
		} else if (!amnt.equals(other.amnt))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
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
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccLimitdef [accNo=");
		builder.append(accNo);
		builder.append(", accName=");
		builder.append(accName);
		builder.append(", amnt=");
		builder.append(amnt);
		builder.append(", description=");
		builder.append(description);
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
