package com.qkl.ztysl.api.po.acc;

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
	 * 用户id
	 */
	private java.lang.Integer userId;
	/**
	 * 用户类型
	 */
	private java.lang.String userType;
	
	/**
	 * 账户编码
	 */
	private java.lang.String accNo;
	
	/**
	 * 奖励来源
	 */
	private java.lang.String bounsSource;
	
	/**
	 * 关联用户id
	 */
	private java.lang.Integer relaUserid;
	
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
	 * 系统标识
	 */
	private java.lang.String syscode;
	
	
	/**
	 * otherno
	 */
	private java.lang.String otherno;
	
	/**
	 *关联数量
	 */
	private java.math.BigDecimal otherAmnt;
	
	/**
	 * 关联描述
	 */
	private java.lang.String otherSource;
	
	/**
	 *奖励比例
	 */
	private java.math.BigDecimal bsrate;
	
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
	/**
	 * 备注1
	 */
	private java.lang.String r1;
	/**
	 * 备注2
	 */
	private java.lang.String r2;
	/**
	 * 备注3
	 */
	private java.lang.String r3;
	/**
	 * 备注4
	 */
	private java.lang.String r4;
	/**
	 * 备注5
	 */
	private java.lang.String r5;
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
	public java.lang.String getUserType() {
		return userType;
	}
	public void setUserType(java.lang.String userType) {
		this.userType = userType;
	}
	public java.lang.String getAccNo() {
		return accNo;
	}
	public void setAccNo(java.lang.String accNo) {
		this.accNo = accNo;
	}
	public java.lang.String getBounsSource() {
		return bounsSource;
	}
	public void setBounsSource(java.lang.String bounsSource) {
		this.bounsSource = bounsSource;
	}
	public java.lang.Integer getRelaUserid() {
		return relaUserid;
	}
	public void setRelaUserid(java.lang.Integer relaUserid) {
		this.relaUserid = relaUserid;
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
	public java.lang.String getCntflag() {
		return cntflag;
	}
	public void setCntflag(java.lang.String cntflag) {
		this.cntflag = cntflag;
	}
	public java.lang.String getStatus() {
		return status;
	}
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	public java.lang.String getSyscode() {
		return syscode;
	}
	public void setSyscode(java.lang.String syscode) {
		this.syscode = syscode;
	}
	public java.lang.String getOtherno() {
		return otherno;
	}
	public void setOtherno(java.lang.String otherno) {
		this.otherno = otherno;
	}
	public java.math.BigDecimal getOtherAmnt() {
		return otherAmnt;
	}
	public void setOtherAmnt(java.math.BigDecimal otherAmnt) {
		this.otherAmnt = otherAmnt;
	}
	public java.lang.String getOtherSource() {
		return otherSource;
	}
	public void setOtherSource(java.lang.String otherSource) {
		this.otherSource = otherSource;
	}
	public java.math.BigDecimal getBsrate() {
		return bsrate;
	}
	public void setBsrate(java.math.BigDecimal bsrate) {
		this.bsrate = bsrate;
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
	public java.lang.String getR1() {
		return r1;
	}
	public void setR1(java.lang.String r1) {
		this.r1 = r1;
	}
	public java.lang.String getR2() {
		return r2;
	}
	public void setR2(java.lang.String r2) {
		this.r2 = r2;
	}
	public java.lang.String getR3() {
		return r3;
	}
	public void setR3(java.lang.String r3) {
		this.r3 = r3;
	}
	public java.lang.String getR4() {
		return r4;
	}
	public void setR4(java.lang.String r4) {
		this.r4 = r4;
	}
	public java.lang.String getR5() {
		return r5;
	}
	public void setR5(java.lang.String r5) {
		this.r5 = r5;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result + ((amnt == null) ? 0 : amnt.hashCode());
		result = prime * result + ((bounsSource == null) ? 0 : bounsSource.hashCode());
		result = prime * result + ((bsrate == null) ? 0 : bsrate.hashCode());
		result = prime * result + ((caldate == null) ? 0 : caldate.hashCode());
		result = prime * result + ((cntflag == null) ? 0 : cntflag.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((otherAmnt == null) ? 0 : otherAmnt.hashCode());
		result = prime * result + ((otherSource == null) ? 0 : otherSource.hashCode());
		result = prime * result + ((otherno == null) ? 0 : otherno.hashCode());
		result = prime * result + ((r1 == null) ? 0 : r1.hashCode());
		result = prime * result + ((r2 == null) ? 0 : r2.hashCode());
		result = prime * result + ((r3 == null) ? 0 : r3.hashCode());
		result = prime * result + ((r4 == null) ? 0 : r4.hashCode());
		result = prime * result + ((r5 == null) ? 0 : r5.hashCode());
		result = prime * result + ((relaUserid == null) ? 0 : relaUserid.hashCode());
		result = prime * result + ((relaUserlevel == null) ? 0 : relaUserlevel.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		AccDetail other = (AccDetail) obj;
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
		if (bounsSource == null) {
			if (other.bounsSource != null)
				return false;
		} else if (!bounsSource.equals(other.bounsSource))
			return false;
		if (bsrate == null) {
			if (other.bsrate != null)
				return false;
		} else if (!bsrate.equals(other.bsrate))
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
		if (otherAmnt == null) {
			if (other.otherAmnt != null)
				return false;
		} else if (!otherAmnt.equals(other.otherAmnt))
			return false;
		if (otherSource == null) {
			if (other.otherSource != null)
				return false;
		} else if (!otherSource.equals(other.otherSource))
			return false;
		if (otherno == null) {
			if (other.otherno != null)
				return false;
		} else if (!otherno.equals(other.otherno))
			return false;
		if (r1 == null) {
			if (other.r1 != null)
				return false;
		} else if (!r1.equals(other.r1))
			return false;
		if (r2 == null) {
			if (other.r2 != null)
				return false;
		} else if (!r2.equals(other.r2))
			return false;
		if (r3 == null) {
			if (other.r3 != null)
				return false;
		} else if (!r3.equals(other.r3))
			return false;
		if (r4 == null) {
			if (other.r4 != null)
				return false;
		} else if (!r4.equals(other.r4))
			return false;
		if (r5 == null) {
			if (other.r5 != null)
				return false;
		} else if (!r5.equals(other.r5))
			return false;
		if (relaUserid == null) {
			if (other.relaUserid != null)
				return false;
		} else if (!relaUserid.equals(other.relaUserid))
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
		return "AccDetail [id=" + id + ", userId=" + userId + ", userType=" + userType + ", accNo=" + accNo
				+ ", bounsSource=" + bounsSource + ", relaUserid=" + relaUserid + ", relaUserlevel=" + relaUserlevel
				+ ", amnt=" + amnt + ", caldate=" + caldate + ", cntflag=" + cntflag + ", status=" + status
				+ ", syscode=" + syscode + ", otherno=" + otherno + ", otherAmnt=" + otherAmnt + ", otherSource="
				+ otherSource + ", bsrate=" + bsrate + ", createTime=" + createTime + ", modifyTime=" + modifyTime
				+ ", operator=" + operator + ", r1=" + r1 + ", r2=" + r2 + ", r3=" + r3 + ", r4=" + r4 + ", r5=" + r5
				+ "]";
	}
	
	

	
	
}
