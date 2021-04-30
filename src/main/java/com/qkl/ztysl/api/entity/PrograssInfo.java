package com.qkl.ztysl.api.entity;

import java.io.Serializable;

/**  
 * <p></p>
 * @项目名称：yc-udrs-api
 * 文件名称：PrograssInfo.java 
 * @author kezhiyi  
 * 创建时间：2015年7月14日   
 * @version 1.0   
 */
public class PrograssInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2541048081343288619L;

	/**
	 * 校验通过数
	 */
	private long passCnt;
	/**
	 * 校验不通过数
	 */
	private long unpassCnt;
	/**
	 * 校验通过数入临时库数量
	 */
	private long intempCnt;
	/**
	 * 临时库入目标库数量
	 */
	private long successCnt;
	/**
	 * excel导入已处理条数
	 */
	private long dealCnt;
	/**
	 * 导入数据总数
	 */
	private long totalCnt;
	
	
	public long getPassCnt() {
		return passCnt;
	}
	public void setPassCnt(long passCnt) {
		this.passCnt = passCnt;
	}
	public long getUnpassCnt() {
		return unpassCnt;
	}
	public void setUnpassCnt(long unpassCnt) {
		this.unpassCnt = unpassCnt;
	}
	public long getIntempCnt() {
		return intempCnt;
	}
	public void setIntempCnt(long intempCnt) {
		this.intempCnt = intempCnt;
	}
	public long getSuccessCnt() {
		return successCnt;
	}
	public void setSuccessCnt(long successCnt) {
		this.successCnt = successCnt;
	}

	public long getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(long totalCnt) {
		this.totalCnt = totalCnt;
	}

	public long getDealCnt() {
		return dealCnt;
	}
	public void setDealCnt(long dealCnt) {
		this.dealCnt = dealCnt;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PrograssInfo [passCnt=");
		builder.append(passCnt);
		builder.append(", unpassCnt=");
		builder.append(unpassCnt);
		builder.append(", intempCnt=");
		builder.append(intempCnt);
		builder.append(", successCnt=");
		builder.append(successCnt);
		builder.append(", dealCnt=");
		builder.append(dealCnt);
		builder.append(", totalCnt=");
		builder.append(totalCnt);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
	
}
