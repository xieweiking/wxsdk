package com.kunbao.weixin.sdk.management.account.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * Created by lemon_bar on 15/7/10.
 */
public class WXShortUrlResponse extends WXJsonResponse {
    @JsonProperty("short_url")
    private String shortUrl;

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

}
