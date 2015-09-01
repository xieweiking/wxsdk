package com.kunbao.weixin.sdk.datacube.message.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "ref_date": "2014-12-07",
 * "msg_type": 1,
 * "msg_user": 282,
 * "msg_count": 817
 * }
 * Created by lemon_bar on 15/7/29.
 */
public class UpstreamMsgData {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("msg_type")
    private int msgType;
    @JsonProperty("msg_user")
    private long msgUserCount;
    @JsonProperty("msg_count")
    private long msgCount;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public long getMsgUserCount() {
        return msgUserCount;
    }

    public void setMsgUserCount(long msgUserCount) {
        this.msgUserCount = msgUserCount;
    }

    public long getMsgCount() {
        return msgCount;
    }

    public void setMsgCount(long msgCount) {
        this.msgCount = msgCount;
    }

}
