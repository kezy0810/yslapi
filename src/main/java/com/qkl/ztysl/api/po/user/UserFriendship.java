package com.qkl.ztysl.api.po.user;

import java.io.Serializable;




public class UserFriendship implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3176664603432455131L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 用户编码
	 */
	private java.lang.Integer userId;
	
	/**
	 * 被推荐人用户编码
	 */
	private java.lang.Integer recomuserId;
	
	/**
	 * 关系级别
	 */
	private java.lang.String relaLevel;
		
	/**
	 * 用户类型
	 */
	private java.lang.String userType;
	/**
	 * 用户类型
	 */
	private java.lang.String calflag;
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
	public java.lang.Integer getUserId() {
		return userId;
	}
	public void setUserId(java.lang.Integer userId) {
		this.userId = userId;
	}
	public java.lang.Integer getRecomuserId() {
		return recomuserId;
	}
	public void setRecomuserId(java.lang.Integer recomuserId) {
		this.recomuserId = recomuserId;
	}
	public java.lang.String getRelaLevel() {
		return relaLevel;
	}
	public void setRelaLevel(java.lang.String relaLevel) {
		this.relaLevel = relaLevel;
	}
	public java.lang.String getUserType() {
		return userType;
	}
	public void setUserType(java.lang.String userType) {
		this.userType = userType;
	}
	public java.lang.String getCalflag() {
		return calflag;
	}
	public void setCalflag(java.lang.String calflag) {
		this.calflag = calflag;
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
		result = prime * result + ((calflag == null) ? 0 : calflag.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((recomuserId == null) ? 0 : recomuserId.hashCode());
		result = prime * result + ((relaLevel == null) ? 0 : relaLevel.hashCode());
		result = prime * result + ((syscode == null) ? 0 : syscode.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		UserFriendship other = (UserFriendship) obj;
		if (calflag == null) {
			if (other.calflag != null)
				return false;
		} else if (!calflag.equals(other.calflag))
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
		if (recomuserId == null) {
			if (other.recomuserId != null)
				return false;
		} else if (!recomuserId.equals(other.recomuserId))
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "UserFriendship [id=" + id + ", userId=" + userId + ", recomuserId=" + recomuserId + ", relaLevel="
				+ relaLevel + ", userType=" + userType + ", calflag=" + calflag + ", syscode=" + syscode
				+ ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", operator=" + operator + "]";
	}
	

}
