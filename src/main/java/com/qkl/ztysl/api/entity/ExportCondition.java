package com.qkl.ztysl.api.entity;

import java.io.Serializable;
import java.util.Date;


/**  
 * <p></p>
 * @项目名称：yc-udrs-api
 * 文件名称：ExportCondition.java 
 * @author kezhiyi  
 * 创建时间：2015年7月27日   
 * @version 1.0   
 */
public class ExportCondition implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4156007635910195523L;

	private int startindex;
	
	private int commsize;
	
	private String batchno;
	
	
	public ExportCondition(int startindex, int commsize,String batchno) {
		super();
		this.startindex = startindex;
		this.commsize = commsize;
		this.batchno = batchno;

	}
	

	public int getStartindex() {
		return startindex;
	}

	public void setStartindex(int startindex) {
		this.startindex = startindex;
	}

	public int getCommsize() {
		return commsize;
	}

	public void setCommsize(int commsize) {
		this.commsize = commsize;
	}

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	
	
	
	
}
