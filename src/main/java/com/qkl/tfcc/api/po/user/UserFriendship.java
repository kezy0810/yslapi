package com.qkl.tfcc.api.po.user;

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
	private java.lang.String userCode;
	
	/**
	 * 被推荐人用户编码
	 */
	private java.lang.String recomuserCode;
	
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
	 * 创建时间
	 */
	private java.util.Date createTime;
	
	/**
	 * 修改时间
	 */
	private java.util.Date modifyTime;
	
	
	

	public java.lang.String getCalflag() {
		return calflag;
	}

	public void setCalflag(java.lang.String calflag) {
		this.calflag = calflag;
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

	public java.lang.String getRecomuserCode() {
		return recomuserCode;
	}

	public void setRecomuserCode(java.lang.String recomuserCode) {
		this.recomuserCode = recomuserCode;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calflag == null) ? 0 : calflag.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((recomuserCode == null) ? 0 : recomuserCode.hashCode());
		result = prime * result
				+ ((relaLevel == null) ? 0 : relaLevel.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
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
		if (modifyTime == null) {
			if (other.modifyTime != null)
				return false;
		} else if (!modifyTime.equals(other.modifyTime))
			return false;
		if (recomuserCode == null) {
			if (other.recomuserCode != null)
				return false;
		} else if (!recomuserCode.equals(other.recomuserCode))
			return false;
		if (relaLevel == null) {
			if (other.relaLevel != null)
				return false;
		} else if (!relaLevel.equals(other.relaLevel))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
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
		StringBuilder builder = new StringBuilder();
		builder.append("UserFriendship [userCode=");
		builder.append(userCode);
		builder.append(", recomuserCode=");
		builder.append(recomuserCode);
		builder.append(", relaLevel=");
		builder.append(relaLevel);
		builder.append(", userType=");
		builder.append(userType);
		builder.append(", calflag=");
		builder.append(calflag);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", modifyTime=");
		builder.append(modifyTime);
		builder.append("]");
		return builder.toString();
	}

	
	

}
