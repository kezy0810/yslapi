package com.qkl.tfcc.api.po.trade;

import java.io.Serializable;

public class UnfreezeDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7206759783545424258L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.String userCode;
	/**
	 * 账户子类编码
	 */
	private java.lang.String subAccno;
	/**
	 * 解冻前数量
	 */
	private java.math.BigDecimal beforeufNum;
	
	/**
	 * 解冻数量
	 */
	private java.math.BigDecimal unfreezeNum;
	/**
	 * 交易金额
	 */
	private java.math.BigDecimal afterufNum;
	/**
	 * 解冻比例
	 */
	private java.math.BigDecimal unfreezeRatio;	
	/**
	 * 解冻日期
	 */
	private java.util.Date unfreezeDate;
	/**
	 * 统计标识
	 */
	private java.lang.String targetSystem;
		
	/**
	 * 状态
	 */
	private java.lang.String status;
	/**
	 * 系统标识
	 */
	private java.lang.String syscode;
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
	
	
	
	

	public java.lang.String getSyscode() {
		return syscode;
	}

	public void setSyscode(java.lang.String syscode) {
		this.syscode = syscode;
	}

	public java.lang.String getSubAccno() {
		return subAccno;
	}

	public void setSubAccno(java.lang.String subAccno) {
		this.subAccno = subAccno;
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

	public java.math.BigDecimal getBeforeufNum() {
		return beforeufNum;
	}

	public void setBeforeufNum(java.math.BigDecimal beforeufNum) {
		this.beforeufNum = beforeufNum;
	}

	public java.math.BigDecimal getUnfreezeNum() {
		return unfreezeNum;
	}

	public void setUnfreezeNum(java.math.BigDecimal unfreezeNum) {
		this.unfreezeNum = unfreezeNum;
	}

	public java.math.BigDecimal getAfterufNum() {
		return afterufNum;
	}

	public void setAfterufNum(java.math.BigDecimal afterufNum) {
		this.afterufNum = afterufNum;
	}

	public java.math.BigDecimal getUnfreezeRatio() {
		return unfreezeRatio;
	}

	public void setUnfreezeRatio(java.math.BigDecimal unfreezeRatio) {
		this.unfreezeRatio = unfreezeRatio;
	}

	public java.util.Date getUnfreezeDate() {
		return unfreezeDate;
	}

	public void setUnfreezeDate(java.util.Date unfreezeDate) {
		this.unfreezeDate = unfreezeDate;
	}

	public java.lang.String getTargetSystem() {
		return targetSystem;
	}

	public void setTargetSystem(java.lang.String targetSystem) {
		this.targetSystem = targetSystem;
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
				+ ((afterufNum == null) ? 0 : afterufNum.hashCode());
		result = prime * result
				+ ((beforeufNum == null) ? 0 : beforeufNum.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((subAccno == null) ? 0 : subAccno.hashCode());
		result = prime * result + ((syscode == null) ? 0 : syscode.hashCode());
		result = prime * result
				+ ((targetSystem == null) ? 0 : targetSystem.hashCode());
		result = prime * result
				+ ((unfreezeDate == null) ? 0 : unfreezeDate.hashCode());
		result = prime * result
				+ ((unfreezeNum == null) ? 0 : unfreezeNum.hashCode());
		result = prime * result
				+ ((unfreezeRatio == null) ? 0 : unfreezeRatio.hashCode());
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
		UnfreezeDetail other = (UnfreezeDetail) obj;
		if (afterufNum == null) {
			if (other.afterufNum != null)
				return false;
		} else if (!afterufNum.equals(other.afterufNum))
			return false;
		if (beforeufNum == null) {
			if (other.beforeufNum != null)
				return false;
		} else if (!beforeufNum.equals(other.beforeufNum))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
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
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (subAccno == null) {
			if (other.subAccno != null)
				return false;
		} else if (!subAccno.equals(other.subAccno))
			return false;
		if (syscode == null) {
			if (other.syscode != null)
				return false;
		} else if (!syscode.equals(other.syscode))
			return false;
		if (targetSystem == null) {
			if (other.targetSystem != null)
				return false;
		} else if (!targetSystem.equals(other.targetSystem))
			return false;
		if (unfreezeDate == null) {
			if (other.unfreezeDate != null)
				return false;
		} else if (!unfreezeDate.equals(other.unfreezeDate))
			return false;
		if (unfreezeNum == null) {
			if (other.unfreezeNum != null)
				return false;
		} else if (!unfreezeNum.equals(other.unfreezeNum))
			return false;
		if (unfreezeRatio == null) {
			if (other.unfreezeRatio != null)
				return false;
		} else if (!unfreezeRatio.equals(other.unfreezeRatio))
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
		builder.append("UnfreezeDetail [userCode=");
		builder.append(userCode);
		builder.append(", subAccno=");
		builder.append(subAccno);
		builder.append(", beforeufNum=");
		builder.append(beforeufNum);
		builder.append(", unfreezeNum=");
		builder.append(unfreezeNum);
		builder.append(", afterufNum=");
		builder.append(afterufNum);
		builder.append(", unfreezeRatio=");
		builder.append(unfreezeRatio);
		builder.append(", unfreezeDate=");
		builder.append(unfreezeDate);
		builder.append(", targetSystem=");
		builder.append(targetSystem);
		builder.append(", status=");
		builder.append(status);
		builder.append(", syscode=");
		builder.append(syscode);
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
