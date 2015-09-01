package com.kunbao.weixin.sdk.management.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by lemon_bar on 15/7/24.
 */
public class WXUserMove {
    @JsonProperty("openid")
    private String openId;
    @JsonProperty("to_groupid")
    private int groupId;

    public WXUserMove(String openId, int groupId) {
        this.openId = openId;
        this.groupId = groupId;
    }

    protected WXUserMove() {
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

}
