package com.kunbao.weixin.sdk.management.account.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 参数	是否必须	说明
 * access_token	是	调用接口凭证
 * action	是	此处填long2short，代表长链接转短链接
 * long_url	是	需要转换的长链接，支持http://、https://、weixin://wxpay 格式的url
 * Created by lemon_bar on 15/7/10.
 */
public class Long2ShortAction {
    @JsonProperty("action")
    protected String action;
    @JsonProperty("long_url")
    protected String longUrl;

    public Long2ShortAction(String longUrl) {
        this.action = "long2short";
        this.longUrl = longUrl;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

}
