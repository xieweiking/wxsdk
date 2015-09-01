package com.kunbao.weixin.sdk.management.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "openid":"oDF3iY9ffA-hqb2vVvbr7qxf6A0Q",
 * "remark":"pangzi"
 * }
 * Created by lemon_bar on 15/7/24.
 */
public class WXRemarkUser {
    @JsonProperty("openid")
    private String openId;
    @JsonProperty("remark")
    private String remark;

    public WXRemarkUser(String openId, String remark) {
        this.openId = openId;
        this.remark = remark;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
