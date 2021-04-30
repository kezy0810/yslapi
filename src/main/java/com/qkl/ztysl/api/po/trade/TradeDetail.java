package com.qkl.ztysl.api.po.trade;

import java.io.Serializable;

public class TradeDetail implements Serializable {

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
	 * 交易类型
	 */
	private java.lang.String txtype;
	
	/**
	 * 交易币种
	 */
	private java.lang.String cuyType;
	
	/**
	 * 交易数量
	 */
	private java.math.BigDecimal txnum;
	/**
	 * 交易金额
	 */
	private java.math.BigDecimal txamnt;
	/**
	 * 交易时间
	 */
	private java.util.Date txdate;
		
	
	/**
	 * 计算日期
	 */
	private java.util.Date caldate;
	
	/**
	 * 统计标识
	 */
	private java.lang.String cntflag;
	
	/**
	 * 来源系统
	 */
	private java.lang.String source_system;
		
	/**
	 * 状态
	 */
	private java.lang.String status;
	
	/**
	 * 收款公司名称
	 */
	private java.lang.String revorgname;
	/**
	 * 收款公司银行账户
	 */
	private java.lang.String revbankaccno;
	/**
	 * 收款公司开户行
	 */
	private java.lang.String revbankdepname;
	
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

	public java.lang.String getTxtype() {
		return txtype;
	}

	public void setTxtype(java.lang.String txtype) {
		this.txtype = txtype;
	}

	public java.lang.String getCuyType() {
		return cuyType;
	}

	public void setCuyType(java.lang.String cuyType) {
		this.cuyType = cuyType;
	}

	public java.math.BigDecimal getTxnum() {
		return txnum;
	}

	public void setTxnum(java.math.BigDecimal txnum) {
		this.txnum = txnum;
	}

	public java.math.BigDecimal getTxamnt() {
		return txamnt;
	}

	public void setTxamnt(java.math.BigDecimal txamnt) {
		this.txamnt = txamnt;
	}

	public java.util.Date getTxdate() {
		return txdate;
	}

	public void setTxdate(java.util.Date txdate) {
		this.txdate = txdate;
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

	public java.lang.String getSource_system() {
		return source_system;
	}

	public void setSource_system(java.lang.String source_system) {
		this.source_system = source_system;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getRevorgname() {
		return revorgname;
	}

	public void setRevorgname(java.lang.String revorgname) {
		this.revorgname = revorgname;
	}

	public java.lang.String getRevbankaccno() {
		return revbankaccno;
	}

	public void setRevbankaccno(java.lang.String revbankaccno) {
		this.revbankaccno = revbankaccno;
	}

	public java.lang.String getRevbankdepname() {
		return revbankdepname;
	}

	public void setRevbankdepname(java.lang.String revbankdepname) {
		this.revbankdepname = revbankdepname;
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
		result = prime * result + ((caldate == null) ? 0 : caldate.hashCode());
		result = prime * result + ((cntflag == null) ? 0 : cntflag.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((cuyType == null) ? 0 : cuyType.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result
				+ ((revbankaccno == null) ? 0 : revbankaccno.hashCode());
		result = prime * result
				+ ((revbankdepname == null) ? 0 : revbankdepname.hashCode());
		result = prime * result
				+ ((revorgname == null) ? 0 : revorgname.hashCode());
		result = prime * result
				+ ((source_system == null) ? 0 : source_system.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((txamnt == null) ? 0 : txamnt.hashCode());
		result = prime * result + ((txdate == null) ? 0 : txdate.hashCode());
		result = prime * result + ((txnum == null) ? 0 : txnum.hashCode());
		result = prime * result + ((txtype == null) ? 0 : txtype.hashCode());
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
		TradeDetail other = (TradeDetail) obj;
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
		if (cuyType == null) {
			if (other.cuyType != null)
				return false;
		} else if (!cuyType.equals(other.cuyType))
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
		if (revbankaccno == null) {
			if (other.revbankaccno != null)
				return false;
		} else if (!revbankaccno.equals(other.revbankaccno))
			return false;
		if (revbankdepname == null) {
			if (other.revbankdepname != null)
				return false;
		} else if (!revbankdepname.equals(other.revbankdepname))
			return false;
		if (revorgname == null) {
			if (other.revorgname != null)
				return false;
		} else if (!revorgname.equals(other.revorgname))
			return false;
		if (source_system == null) {
			if (other.source_system != null)
				return false;
		} else if (!source_system.equals(other.source_system))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (txamnt == null) {
			if (other.txamnt != null)
				return false;
		} else if (!txamnt.equals(other.txamnt))
			return false;
		if (txdate == null) {
			if (other.txdate != null)
				return false;
		} else if (!txdate.equals(other.txdate))
			return false;
		if (txnum == null) {
			if (other.txnum != null)
				return false;
		} else if (!txnum.equals(other.txnum))
			return false;
		if (txtype == null) {
			if (other.txtype != null)
				return false;
		} else if (!txtype.equals(other.txtype))
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
		builder.append("TrancationDetail [userCode=");
		builder.append(userCode);
		builder.append(", txtype=");
		builder.append(txtype);
		builder.append(", cuyType=");
		builder.append(cuyType);
		builder.append(", txnum=");
		builder.append(txnum);
		builder.append(", txamnt=");
		builder.append(txamnt);
		builder.append(", txdate=");
		builder.append(txdate);
		builder.append(", caldate=");
		builder.append(caldate);
		builder.append(", cntflag=");
		builder.append(cntflag);
		builder.append(", source_system=");
		builder.append(source_system);
		builder.append(", status=");
		builder.append(status);
		builder.append(", revorgname=");
		builder.append(revorgname);
		builder.append(", revbankaccno=");
		builder.append(revbankaccno);
		builder.append(", revbankdepname=");
		builder.append(revbankdepname);
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
