package com.kunbao.weixin.sdk.message.domain.send.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "touser":"OPENID",
 * "msgtype":"text",
 * Created by lemon_bar on 15/7/23.
 */
public class WXCustomMessage {
    @JsonProperty("touser")
    private String toUser;

    @JsonProperty("msgtype")
    private WXCustomMessageType type;

    public WXCustomMessage(String toUser, WXCustomMessageType type) {
        this.toUser = toUser;
        this.type = type;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public WXCustomMessageType getType() {
        return type;
    }

    public void setType(WXCustomMessageType type) {
        this.type = type;
    }

}
