package com.qkl.tfcc.api.po.sms;

import java.util.Date;

public class LogSms {
    private Integer logSmsId;

    private String lsPhone;

    private String lsResponseCode;

    private String lsResponseMsg;

    private Date lsCreateDatetime;

    private Integer lsIsResend;

    private String lsSmsCommercial;

    private String lsSmsSource;

    private Boolean lsIsSend;

    private String lsContent;

    public Integer getLogSmsId() {
        return logSmsId;
    }

    public void setLogSmsId(Integer logSmsId) {
        this.logSmsId = logSmsId;
    }

    public String getLsPhone() {
        return lsPhone;
    }

    public void setLsPhone(String lsPhone) {
        this.lsPhone = lsPhone == null ? null : lsPhone.trim();
    }

    public String getLsResponseCode() {
        return lsResponseCode;
    }

    public void setLsResponseCode(String lsResponseCode) {
        this.lsResponseCode = lsResponseCode == null ? null : lsResponseCode.trim();
    }

    public String getLsResponseMsg() {
        return lsResponseMsg;
    }

    public void setLsResponseMsg(String lsResponseMsg) {
        this.lsResponseMsg = lsResponseMsg == null ? null : lsResponseMsg.trim();
    }

    public Date getLsCreateDatetime() {
        return lsCreateDatetime;
    }

    public void setLsCreateDatetime(Date lsCreateDatetime) {
        this.lsCreateDatetime = lsCreateDatetime;
    }

    public Integer getLsIsResend() {
        return lsIsResend;
    }

    public void setLsIsResend(Integer lsIsResend) {
        this.lsIsResend = lsIsResend;
    }

    public String getLsSmsCommercial() {
        return lsSmsCommercial;
    }

    public void setLsSmsCommercial(String lsSmsCommercial) {
        this.lsSmsCommercial = lsSmsCommercial == null ? null : lsSmsCommercial.trim();
    }

    public String getLsSmsSource() {
        return lsSmsSource;
    }

    public void setLsSmsSource(String lsSmsSource) {
        this.lsSmsSource = lsSmsSource == null ? null : lsSmsSource.trim();
    }

    public Boolean getLsIsSend() {
        return lsIsSend;
    }

    public void setLsIsSend(Boolean lsIsSend) {
        this.lsIsSend = lsIsSend;
    }

    public String getLsContent() {
        return lsContent;
    }

    public void setLsContent(String lsContent) {
        this.lsContent = lsContent == null ? null : lsContent.trim();
    }
}