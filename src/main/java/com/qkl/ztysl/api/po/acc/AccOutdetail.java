package com.qkl.ztysl.api.po.acc;

import java.io.Serializable;

public class AccOutdetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4737930201825534310L;

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
	 * 转出数量
	 */
	private java.math.BigDecimal outamnt;
	
	/**
	 * 转出日期
	 */
	private java.util.Date outdate;
	
	/**
	 * 统计标识
	 */
	private java.lang.String cntflag;
	/**
	 * 转出至目标业务系统
	 */
	private java.lang.String targetSystem;
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

	public java.lang.String getSubAccno() {
		return subAccno;
	}

	public void setSubAccno(java.lang.String subAccno) {
		this.subAccno = subAccno;
	}

	public java.math.BigDecimal getOutamnt() {
		return outamnt;
	}

	public void setOutamnt(java.math.BigDecimal outamnt) {
		this.outamnt = outamnt;
	}

	public java.util.Date getOutdate() {
		return outdate;
	}

	public void setOutdate(java.util.Date outdate) {
		this.outdate = outdate;
	}

	public java.lang.String getCntflag() {
		return cntflag;
	}

	public void setCntflag(java.lang.String cntflag) {
		this.cntflag = cntflag;
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
		result = prime * result + ((cntflag == null) ? 0 : cntflag.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((outamnt == null) ? 0 : outamnt.hashCode());
		result = prime * result + ((outdate == null) ? 0 : outdate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((subAccno == null) ? 0 : subAccno.hashCode());
		result = prime * result
				+ ((targetSystem == null) ? 0 : targetSystem.hashCode());
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
		AccOutdetail other = (AccOutdetail) obj;
		if (cntflag == null) {
			if (other.cntflag != null)
				return false;
		} else if (!cntflag.equals(other.cntflag))
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
		if (outamnt == null) {
			if (other.outamnt != null)
				return false;
		} else if (!outamnt.equals(other.outamnt))
			return false;
		if (outdate == null) {
			if (other.outdate != null)
				return false;
		} else if (!outdate.equals(other.outdate))
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
		if (targetSystem == null) {
			if (other.targetSystem != null)
				return false;
		} else if (!targetSystem.equals(other.targetSystem))
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
		builder.append("AccOutdetail [userCode=");
		builder.append(userCode);
		builder.append(", subAccno=");
		builder.append(subAccno);
		builder.append(", outamnt=");
		builder.append(outamnt);
		builder.append(", outdate=");
		builder.append(outdate);
		builder.append(", cntflag=");
		builder.append(cntflag);
		builder.append(", targetSystem=");
		builder.append(targetSystem);
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
