package com.qkl.ztysl.api.po.acc;

import java.io.Serializable;
import java.util.Date;

public class LPTeam implements Serializable {

	/**
	 *   
	 */
	private static final long serialVersionUID = 1L;

	private long lpNum;//累计推荐LP会员的人数
	private String  lpAcc;//会员账号
	private Date startTime;//查询选择的开始时间
	private Date endTime;//查询选择的结束时间
	private Date regTime;//注册时间
	private long purchaseNum;//购买量
	
	
	public LPTeam() {
		super();
	}


	public LPTeam(long lpNum, String lpAcc, Date startTime, Date endTime,
			Date regTime, long purchaseNum) {
		super();
		this.lpNum = lpNum;
		this.lpAcc = lpAcc;
		this.startTime = startTime;
		this.endTime = endTime;
		this.regTime = regTime;
		this.purchaseNum = purchaseNum;
	}


	public long getLpNum() {
		return lpNum;
	}


	public void setLpNum(long lpNum) {
		this.lpNum = lpNum;
	}


	public String getLpAcc() {
		return lpAcc;
	}


	public void setLpAcc(String lpAcc) {
		this.lpAcc = lpAcc;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public Date getRegTime() {
		return regTime;
	}


	public void setRegTime(Date regTime) {
		this.regTime = regTime;
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
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((lpAcc == null) ? 0 : lpAcc.hashCode());
		result = prime * result + (int) (lpNum ^ (lpNum >>> 32));
		result = prime * result + (int) (purchaseNum ^ (purchaseNum >>> 32));
		result = prime * result + ((regTime == null) ? 0 : regTime.hashCode());
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
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
		LPTeam other = (LPTeam) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (lpAcc == null) {
			if (other.lpAcc != null)
				return false;
		} else if (!lpAcc.equals(other.lpAcc))
			return false;
		if (lpNum != other.lpNum)
			return false;
		if (purchaseNum != other.purchaseNum)
			return false;
		if (regTime == null) {
			if (other.regTime != null)
				return false;
		} else if (!regTime.equals(other.regTime))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "LPTeam [lpNum=" + lpNum + ", lpAcc=" + lpAcc + ", startTime="
				+ startTime + ", endTime=" + endTime + ", regTime=" + regTime
				+ ", purchaseNum=" + purchaseNum + "]";
	}
	
	

}
