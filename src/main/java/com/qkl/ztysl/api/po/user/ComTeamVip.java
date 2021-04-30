package com.qkl.ztysl.api.po.user;

import java.io.Serializable;
import java.util.Date;

public class ComTeamVip implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long rNum;//推荐会员数量
	private long aNum;//A级会员数量
	private long bNum;//B级会员数量
	private long cNum;//C级会员数量
	private long rOutlets;//推荐网点数量
	private String memberLevel;//会员级别
	private Date regTime;//会员注册时间
	private String memberAcc;//会员账号
	private String referee;//推荐人
	private long purchaseNum;//购买量
	
	
	
	
	public ComTeamVip() {
		super();
	}
	public ComTeamVip(long rNum, long aNum, long bNum, long cNum,
			long rOutlets, String memberLevel, Date regTime, String memberAcc,
			String referee, long purchaseNum) {
		super();
		this.rNum = rNum;
		this.aNum = aNum;
		this.bNum = bNum;
		this.cNum = cNum;
		this.rOutlets = rOutlets;
		this.memberLevel = memberLevel;
		this.regTime = regTime;
		this.memberAcc = memberAcc;
		this.referee = referee;
		this.purchaseNum = purchaseNum;
	}
	public long getrNum() {
		return rNum;
	}
	public void setrNum(long rNum) {
		this.rNum = rNum;
	}
	public long getaNum() {
		return aNum;
	}
	public void setaNum(long aNum) {
		this.aNum = aNum;
	}
	public long getbNum() {
		return bNum;
	}
	public void setbNum(long bNum) {
		this.bNum = bNum;
	}
	public long getcNum() {
		return cNum;
	}
	public void setcNum(long cNum) {
		this.cNum = cNum;
	}
	public long getrOutlets() {
		return rOutlets;
	}
	public void setrOutlets(long rOutlets) {
		this.rOutlets = rOutlets;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String getMemberAcc() {
		return memberAcc;
	}
	public void setMemberAcc(String memberAcc) {
		this.memberAcc = memberAcc;
	}
	public String getReferee() {
		return referee;
	}
	public void setReferee(String referee) {
		this.referee = referee;
	}
	public long getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(long purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aNum ^ (aNum >>> 32));
		result = prime * result + (int) (bNum ^ (bNum >>> 32));
		result = prime * result + (int) (cNum ^ (cNum >>> 32));
		result = prime * result
				+ ((memberAcc == null) ? 0 : memberAcc.hashCode());
		result = prime * result
				+ ((memberLevel == null) ? 0 : memberLevel.hashCode());
		result = prime * result + (int) (purchaseNum ^ (purchaseNum >>> 32));
		result = prime * result + (int) (rNum ^ (rNum >>> 32));
		result = prime * result + (int) (rOutlets ^ (rOutlets >>> 32));
		result = prime * result + ((referee == null) ? 0 : referee.hashCode());
		result = prime * result + ((regTime == null) ? 0 : regTime.hashCode());
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
		ComTeamVip other = (ComTeamVip) obj;
		if (aNum != other.aNum)
			return false;
		if (bNum != other.bNum)
			return false;
		if (cNum != other.cNum)
			return false;
		if (memberAcc == null) {
			if (other.memberAcc != null)
				return false;
		} else if (!memberAcc.equals(other.memberAcc))
			return false;
		if (memberLevel == null) {
			if (other.memberLevel != null)
				return false;
		} else if (!memberLevel.equals(other.memberLevel))
			return false;
		if (purchaseNum != other.purchaseNum)
			return false;
		if (rNum != other.rNum)
			return false;
		if (rOutlets != other.rOutlets)
			return false;
		if (referee == null) {
			if (other.referee != null)
				return false;
		} else if (!referee.equals(other.referee))
			return false;
		if (regTime == null) {
			if (other.regTime != null)
				return false;
		} else if (!regTime.equals(other.regTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ComTeamVip [rNum=" + rNum + ", aNum=" + aNum + ", bNum=" + bNum
				+ ", cNum=" + cNum + ", rOutlets=" + rOutlets
				+ ", memberLevel=" + memberLevel + ", regTime=" + regTime
				+ ", memberAcc=" + memberAcc + ", referee=" + referee
				+ ", purchaseNum=" + purchaseNum + "]";
	}
	
	
	
}
