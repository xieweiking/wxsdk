package com.kunbao.weixin.sdk.management.account.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * {"ticket":"gQH47joAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL2taZ2Z3TVRtNzJXV1Brb3ZhYmJJAAIEZ23sUwMEmm3sUw==",
 * "expire_seconds":60,
 * "url":"http:\/\/weixin.qq.com\/q\/kZgfwMTm72WWPkovabbI"}
 * Created by lemon_bar on 15/7/10.
 */
public class WXQrCodeResponse extends WXJsonResponse {
    @JsonProperty("ticket")
    private String ticket;

    @JsonProperty("expire_seconds")
    private long expireSeconds;

    @JsonProperty("url")
    private String url;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public long getExpireSeconds() {
        return expireSeconds;
    }

    public void setExpireSeconds(long expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
