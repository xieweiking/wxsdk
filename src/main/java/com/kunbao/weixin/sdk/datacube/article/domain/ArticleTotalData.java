package com.kunbao.weixin.sdk.datacube.article.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * "ref_date": "2014-12-14",
 * "msgid": "202457380_1",
 * "title": "马航丢画记",
 * "details": [
 * {
 * Created by lemon_bar on 15/7/29.
 */
public class ArticleTotalData {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("msgid")
    private String msgId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("details")
    private List<ArticleTotalDataDetail> details;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ArticleTotalDataDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ArticleTotalDataDetail> details) {
        this.details = details;
    }

}
