package com.qkl.ztysl.api.po.acc;

import java.io.Serializable;
import java.util.Date;

public class ComAccMy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long tfcc;//我的tfcc余额
	private long jfcc;//我的jfcc余额
	private long ttfcc;//总累计奖励的tfcc
	private long mtfcc;//累计推荐会员奖励的tfcc
	private long wtfcc;//累计推荐网点奖励的tfcc
    private Date rewardDate;//奖励的时间；
    private long aReward;//推荐A级会员奖励；
    private long bReward;//推荐B级会员奖励；
    private long cReward;//推荐C级会员奖励；
    private long wReward;//推荐网点会员奖励；
    
	public ComAccMy() {
		super();
	}
	public ComAccMy(long tfcc, long jfcc, long ttfcc, long mtfcc, long wtfcc,
			Date rewardDate, long aReward, long bReward, long cReward,
			long wReward) {
		super();
		this.tfcc = tfcc;
		this.jfcc = jfcc;
		this.ttfcc = ttfcc;
		this.mtfcc = mtfcc;
		this.wtfcc = wtfcc;
		this.rewardDate = rewardDate;
		this.aReward = aReward;
		this.bReward = bReward;
		this.cReward = cReward;
		this.wReward = wReward;
	}
	public long getTfcc() {
		return tfcc;
	}
	public void setTfcc(long tfcc) {
		this.tfcc = tfcc;
	}
	public long getJfcc() {
		return jfcc;
	}
	public void setJfcc(long jfcc) {
		this.jfcc = jfcc;
	}
	public long getTtfcc() {
		return ttfcc;
	}
	public void setTtfcc(long ttfcc) {
		this.ttfcc = ttfcc;
	}
	public long getMtfcc() {
		return mtfcc;
	}
	public void setMtfcc(long mtfcc) {
		this.mtfcc = mtfcc;
	}
	public long getWtfcc() {
		return wtfcc;
	}
	public void setWtfcc(long wtfcc) {
		this.wtfcc = wtfcc;
	}
	public Date getRewardDate() {
		return rewardDate;
	}
	public void setRewardDate(Date rewardDate) {
		this.rewardDate = rewardDate;
	}
	public long getaReward() {
		return aReward;
	}
	public void setaReward(long aReward) {
		this.aReward = aReward;
	}
	public long getbReward() {
		return bReward;
	}
	public void setbReward(long bReward) {
		this.bReward = bReward;
	}
	public long getcReward() {
		return cReward;
	}
	public void setcReward(long cReward) {
		this.cReward = cReward;
	}
	public long getwReward() {
		return wReward;
	}
	public void setwReward(long wReward) {
		this.wReward = wReward;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aReward ^ (aReward >>> 32));
		result = prime * result + (int) (bReward ^ (bReward >>> 32));
		result = prime * result + (int) (cReward ^ (cReward >>> 32));
		result = prime * result + (int) (jfcc ^ (jfcc >>> 32));
		result = prime * result + (int) (mtfcc ^ (mtfcc >>> 32));
		result = prime * result
				+ ((rewardDate == null) ? 0 : rewardDate.hashCode());
		result = prime * result + (int) (tfcc ^ (tfcc >>> 32));
		result = prime * result + (int) (ttfcc ^ (ttfcc >>> 32));
		result = prime * result + (int) (wReward ^ (wReward >>> 32));
		result = prime * result + (int) (wtfcc ^ (wtfcc >>> 32));
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
		ComAccMy other = (ComAccMy) obj;
		if (aReward != other.aReward)
			return false;
		if (bReward != other.bReward)
			return false;
		if (cReward != other.cReward)
			return false;
		if (jfcc != other.jfcc)
			return false;
		if (mtfcc != other.mtfcc)
			return false;
		if (rewardDate == null) {
			if (other.rewardDate != null)
				return false;
		} else if (!rewardDate.equals(other.rewardDate))
			return false;
		if (tfcc != other.tfcc)
			return false;
		if (ttfcc != other.ttfcc)
			return false;
		if (wReward != other.wReward)
			return false;
		if (wtfcc != other.wtfcc)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ComAccMy [tfcc=" + tfcc + ", jfcc=" + jfcc + ", ttfcc=" + ttfcc
				+ ", mtfcc=" + mtfcc + ", wtfcc=" + wtfcc + ", rewardDate="
				+ rewardDate + ", aReward=" + aReward + ", bReward=" + bReward
				+ ", cReward=" + cReward + ", wReward=" + wReward + "]";
	}
    
    
    
    
    
}
