package com.kunbao.weixin.sdk.management.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "openid": "otvxTs4dckWG7imySrJd6jSi0CWE",
 * "lang": "zh-CN"
 * },
 * Created by lemon_bar on 15/7/24.
 */
public class WXUser {
    @JsonProperty("openid")
    private String openId;
    @JsonProperty("lang")
    private WXLang lang;

    public WXUser(String openId, WXLang lang) {
        this.openId = openId;
        this.lang = lang;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public WXLang getLang() {
        return lang;
    }

    public void setLang(WXLang lang) {
        this.lang = lang;
    }

}
