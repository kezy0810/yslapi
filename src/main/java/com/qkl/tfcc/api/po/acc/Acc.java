package com.qkl.tfcc.api.po.acc;

import java.io.Serializable;

public class Acc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3600304293890729395L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.String userCode;
	
	/**
	 * 账户编码
	 */
	private java.lang.String accNo;
	
	/**
	 * 可用数量
	 */
	private java.math.BigDecimal avbAmnt;
	
	/**
	 * 冻结数量
	 */
	private java.math.BigDecimal frozeAmnt;
	/**
	 * 总数量
	 */
	private java.math.BigDecimal totalAmnt;
	
	/**
	 * 最近一次计算日期
	 */
	private java.util.Date lastCaldate;
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
	
	
	private java.lang.Integer versionId; 
	
	
	

	public java.lang.String getSyscode() {
		return syscode;
	}

	public void setSyscode(java.lang.String syscode) {
		this.syscode = syscode;
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

	

	public java.lang.String getAccNo() {
		return accNo;
	}

	public void setAccNo(java.lang.String accNo) {
		this.accNo = accNo;
	}

	public java.math.BigDecimal getAvbAmnt() {
		return avbAmnt;
	}

	public void setAvbAmnt(java.math.BigDecimal avbAmnt) {
		this.avbAmnt = avbAmnt;
	}

	public java.math.BigDecimal getFrozeAmnt() {
		return frozeAmnt;
	}

	public void setFrozeAmnt(java.math.BigDecimal frozeAmnt) {
		this.frozeAmnt = frozeAmnt;
	}

	public java.math.BigDecimal getTotalAmnt() {
		return totalAmnt;
	}

	public void setTotalAmnt(java.math.BigDecimal totalAmnt) {
		this.totalAmnt = totalAmnt;
	}

	public java.util.Date getLastCaldate() {
		return lastCaldate;
	}

	public void setLastCaldate(java.util.Date lastCaldate) {
		this.lastCaldate = lastCaldate;
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
	
	

	public java.lang.Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(java.lang.Integer versionId) {
		this.versionId = versionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avbAmnt == null) ? 0 : avbAmnt.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((frozeAmnt == null) ? 0 : frozeAmnt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastCaldate == null) ? 0 : lastCaldate.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result
				+ ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result + ((syscode == null) ? 0 : syscode.hashCode());
		result = prime * result
				+ ((totalAmnt == null) ? 0 : totalAmnt.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((versionId == null) ? 0 : versionId.hashCode());
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
		Acc other = (Acc) obj;
		if (avbAmnt == null) {
			if (other.avbAmnt != null)
				return false;
		} else if (!avbAmnt.equals(other.avbAmnt))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (frozeAmnt == null) {
			if (other.frozeAmnt != null)
				return false;
		} else if (!frozeAmnt.equals(other.frozeAmnt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastCaldate == null) {
			if (other.lastCaldate != null)
				return false;
		} else if (!lastCaldate.equals(other.lastCaldate))
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
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		if (syscode == null) {
			if (other.syscode != null)
				return false;
		} else if (!syscode.equals(other.syscode))
			return false;
		if (totalAmnt == null) {
			if (other.totalAmnt != null)
				return false;
		} else if (!totalAmnt.equals(other.totalAmnt))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		if (versionId == null) {
			if (other.versionId != null)
				return false;
		} else if (!versionId.equals(other.versionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Acc [userCode=");
		builder.append(userCode);
		builder.append(", accNo=");
		builder.append(accNo);
		builder.append(", avbAmnt=");
		builder.append(avbAmnt);
		builder.append(", frozeAmnt=");
		builder.append(frozeAmnt);
		builder.append(", totalAmnt=");
		builder.append(totalAmnt);
		builder.append(", lastCaldate=");
		builder.append(lastCaldate);
		builder.append(", syscode=");
		builder.append(syscode);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", modifyTime=");
		builder.append(modifyTime);
		builder.append(", operator=");
		builder.append(operator);
		builder.append(", versionId=");
		builder.append(versionId);
		builder.append("]");
		return builder.toString();
	}


	
	
	
	
}
