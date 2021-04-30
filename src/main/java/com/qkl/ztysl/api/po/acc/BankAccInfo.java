package com.qkl.ztysl.api.po.acc;

import java.io.Serializable;

public class BankAccInfo implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 7770712013516277339L;

	/**
	 * id
	 */
	private java.lang.Integer id;
	
	/**
	 * 公司名称
	 */
	private java.lang.String orgName;
	
	/**
	 * 
	 */
	private java.lang.String payeeName;
	/**
	 * 银行账户
	 */
	private java.lang.String bankaccno;
	/**
	 *开户行名称
	 */
	private java.lang.String depositBankname;
	/**
	 *开户时间
	 */
	private java.util.Date depositTime;
	
	/**
	 *财务对账电话
	 */
	private java.lang.String checkphone;
		
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

	public java.lang.String getOrgName() {
		return orgName;
	}

	public void setOrgName(java.lang.String orgName) {
		this.orgName = orgName;
	}

	public java.lang.String getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(java.lang.String bankaccno) {
		this.bankaccno = bankaccno;
	}

	public java.lang.String getDepositBankname() {
		return depositBankname;
	}

	public void setDepositBankname(java.lang.String depositBankname) {
		this.depositBankname = depositBankname;
	}

	public java.lang.String getCheckphone() {
		return checkphone;
	}

	public void setCheckphone(java.lang.String checkphone) {
		this.checkphone = checkphone;
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

	
	
	public java.util.Date getDepositTime() {
		return depositTime;
	}

	public void setDepositTime(java.util.Date depositTime) {
		this.depositTime = depositTime;
	}
	
	

	public java.lang.String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(java.lang.String payeeName) {
		this.payeeName = payeeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bankaccno == null) ? 0 : bankaccno.hashCode());
		result = prime * result
				+ ((checkphone == null) ? 0 : checkphone.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((depositBankname == null) ? 0 : depositBankname.hashCode());
		result = prime * result
				+ ((depositTime == null) ? 0 : depositTime.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((orgName == null) ? 0 : orgName.hashCode());
		result = prime * result + ((payeeName == null) ? 0 : payeeName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		BankAccInfo other = (BankAccInfo) obj;
		if (bankaccno == null) {
			if (other.bankaccno != null)
				return false;
		} else if (!bankaccno.equals(other.bankaccno))
			return false;
		if (checkphone == null) {
			if (other.checkphone != null)
				return false;
		} else if (!checkphone.equals(other.checkphone))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (depositBankname == null) {
			if (other.depositBankname != null)
				return false;
		} else if (!depositBankname.equals(other.depositBankname))
			return false;
		if (depositTime == null) {
			if (other.depositTime != null)
				return false;
		} else if (!depositTime.equals(other.depositTime))
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
		if (orgName == null) {
			if (other.orgName != null)
				return false;
		} else if (!orgName.equals(other.orgName))
			return false;

		
		if (payeeName == null) {
			if (other.payeeName != null)
				return false;
		} else if (!payeeName.equals(other.payeeName))
			return false;
		

		
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankaccInfo [orgName=");
		builder.append(orgName);
		builder.append(", payeeName=");
		builder.append(payeeName);
		builder.append(", bankaccno=");
		builder.append(bankaccno);
		builder.append(", depositBankname=");
		builder.append(depositBankname);
		builder.append(", depositTime=");
		builder.append(depositTime);
		builder.append(", checkphone=");
		builder.append(checkphone);
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
