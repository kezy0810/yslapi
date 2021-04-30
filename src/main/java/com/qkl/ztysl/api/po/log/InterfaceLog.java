package com.qkl.ztysl.api.po.log;

import java.io.Serializable;
import java.util.Date;

public class InterfaceLog implements Serializable{
    private static final long serialVersionUID = -1171755303777884551L;

    private Long id;

    private String logTitile;

    private String logContent;

    private String syscode;

    private Date createTime;

    private Date updateTime;

    private Date modifyTime;

    private String logType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogTitile() {
        return logTitile;
    }

    public void setLogTitile(String logTitile) {
        this.logTitile = logTitile == null ? null : logTitile.trim();
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode == null ? null : syscode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }
}