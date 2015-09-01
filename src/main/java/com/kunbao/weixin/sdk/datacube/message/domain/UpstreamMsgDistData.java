package com.kunbao.weixin.sdk.datacube.message.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "ref_date": "2014-12-07",
 * "count_interval": 1,
 * "msg_user": 246
 * }
 * Created by lemon_bar on 15/7/29.
 */
public class UpstreamMsgDistData {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("count_interval")
    private int countInterval;
    @JsonProperty("msg_user")
    private int msgUser;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public int getCountInterval() {
        return countInterval;
    }

    public void setCountInterval(int countInterval) {
        this.countInterval = countInterval;
    }

    public int getMsgUser() {
        return msgUser;
    }

    public void setMsgUser(int msgUser) {
        this.msgUser = msgUser;
    }

}
