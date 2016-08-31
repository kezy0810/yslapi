package com.qkl.tfcc.api.po.acc;

import java.io.Serializable;

public class AccDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5556883430023874861L;

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
	 * 奖励来源(一级)
	 */
	private java.lang.String bounsSource1;
	
	/**
	 * 奖励来源(二级)
	 */
	private java.lang.String bounsSource2;
	/**
	 * 关联用户编码
	 */
	private java.lang.String relaUsercode;
	
	/**
	 * 关联用户级别
	 */
	private java.lang.String relaUserlevel;
	
	
	/**
	 *数量
	 */
	private java.math.BigDecimal amnt;
	
	/**
	 * 计算日期
	 */
	private java.util.Date caldate;
	
	/**
	 * 统计标识
	 */
	private java.lang.String cntflag;
		
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

	public java.lang.String getBounsSource1() {
		return bounsSource1;
	}

	public void setBounsSource1(java.lang.String bounsSource1) {
		this.bounsSource1 = bounsSource1;
	}

	public java.lang.String getBounsSource2() {
		return bounsSource2;
	}

	public void setBounsSource2(java.lang.String bounsSource2) {
		this.bounsSource2 = bounsSource2;
	}

	public java.lang.String getRelaUsercode() {
		return relaUsercode;
	}

	public void setRelaUsercode(java.lang.String relaUsercode) {
		this.relaUsercode = relaUsercode;
	}

	public java.lang.String getRelaUserlevel() {
		return relaUserlevel;
	}

	public void setRelaUserlevel(java.lang.String relaUserlevel) {
		this.relaUserlevel = relaUserlevel;
	}

	public java.math.BigDecimal getAmnt() {
		return amnt;
	}

	public void setAmnt(java.math.BigDecimal amnt) {
		this.amnt = amnt;
	}

	public java.util.Date getCaldate() {
		return caldate;
	}

	public void setCaldate(java.util.Date caldate) {
		this.caldate = caldate;
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

	public java.lang.String getCntflag() {
		return cntflag;
	}

	public void setCntflag(java.lang.String cntflag) {
		this.cntflag = cntflag;
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
		result = prime * result + ((amnt == null) ? 0 : amnt.hashCode());
		result = prime * result
				+ ((bounsSource1 == null) ? 0 : bounsSource1.hashCode());
		result = prime * result
				+ ((bounsSource2 == null) ? 0 : bounsSource2.hashCode());
		result = prime * result + ((caldate == null) ? 0 : caldate.hashCode());
		result = prime * result + ((cntflag == null) ? 0 : cntflag.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result
				+ ((relaUsercode == null) ? 0 : relaUsercode.hashCode());
		result = prime * result
				+ ((relaUserlevel == null) ? 0 : relaUserlevel.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((subAccno == null) ? 0 : subAccno.hashCode());
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
		AccDetail other = (AccDetail) obj;
		if (amnt == null) {
			if (other.amnt != null)
				return false;
		} else if (!amnt.equals(other.amnt))
			return false;
		if (bounsSource1 == null) {
			if (other.bounsSource1 != null)
				return false;
		} else if (!bounsSource1.equals(other.bounsSource1))
			return false;
		if (bounsSource2 == null) {
			if (other.bounsSource2 != null)
				return false;
		} else if (!bounsSource2.equals(other.bounsSource2))
			return false;
		if (caldate == null) {
			if (other.caldate != null)
				return false;
		} else if (!caldate.equals(other.caldate))
			return false;
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
		if (relaUsercode == null) {
			if (other.relaUsercode != null)
				return false;
		} else if (!relaUsercode.equals(other.relaUsercode))
			return false;
		if (relaUserlevel == null) {
			if (other.relaUserlevel != null)
				return false;
		} else if (!relaUserlevel.equals(other.relaUserlevel))
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
		builder.append("AccDetail [userCode=");
		builder.append(userCode);
		builder.append(", subAccno=");
		builder.append(subAccno);
		builder.append(", bounsSource1=");
		builder.append(bounsSource1);
		builder.append(", bounsSource2=");
		builder.append(bounsSource2);
		builder.append(", relaUsercode=");
		builder.append(relaUsercode);
		builder.append(", relaUserlevel=");
		builder.append(relaUserlevel);
		builder.append(", amnt=");
		builder.append(amnt);
		builder.append(", caldate=");
		builder.append(caldate);
		builder.append(", cntflag=");
		builder.append(cntflag);
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
