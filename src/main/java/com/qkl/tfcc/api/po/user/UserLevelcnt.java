package com.qkl.tfcc.api.po.user;

import java.io.Serializable;




public class UserLevelcnt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7551709365715821530L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.String userCode;
	
	
	/**
	 * 关系级别
	 */
	private java.lang.String relaLevel;
		
	/**
	 * 级别数量
	 */
	private int levcnt;

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
	public java.lang.String getRelaLevel() {
		return relaLevel;
	}
	public void setRelaLevel(java.lang.String relaLevel) {
		this.relaLevel = relaLevel;
	}
	public int getLevcnt() {
		return levcnt;
	}
	public void setLevcnt(int levcnt) {
		this.levcnt = levcnt;
	}
	public java.lang.String getSyscode() {
		return syscode;
	}
	public void setSyscode(java.lang.String syscode) {
		this.syscode = syscode;
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
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + levcnt;
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result
				+ ((relaLevel == null) ? 0 : relaLevel.hashCode());
		result = prime * result + ((syscode == null) ? 0 : syscode.hashCode());
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
		UserLevelcnt other = (UserLevelcnt) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (levcnt != other.levcnt)
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
		if (relaLevel == null) {
			if (other.relaLevel != null)
				return false;
		} else if (!relaLevel.equals(other.relaLevel))
			return false;
		if (syscode == null) {
			if (other.syscode != null)
				return false;
		} else if (!syscode.equals(other.syscode))
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
		builder.append("UserLevelcnt [userCode=");
		builder.append(userCode);
		builder.append(", relaLevel=");
		builder.append(relaLevel);
		builder.append(", levcnt=");
		builder.append(levcnt);
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
