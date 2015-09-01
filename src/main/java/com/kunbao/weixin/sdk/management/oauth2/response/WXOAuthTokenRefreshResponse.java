package com.kunbao.weixin.sdk.management.oauth2.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * Created by baylor on 15/7/25.
 */

/**
 * {
 * "access_token":"ACCESS_TOKEN",
 * "expires_in":7200,
 * "refresh_token":"REFRESH_TOKEN",
 * "openid":"OPENID",
 * "scope":"SCOPE"
 * }
 * <p/>
 * access_token	网页授权接口调用凭证,注意：此access_token与基础支持的access_token不同
 * expires_in	access_token接口调用凭证超时时间，单位（秒）
 * refresh_token	用户刷新access_token
 * openid	用户唯一标识
 * scope	用户授权的作用域，使用逗号（,）分隔
 * <p/>
 * {"errcode":40029,"errmsg":"invalid code"}
 */
public class WXOAuthTokenRefreshResponse extends WXJsonResponse {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private long expires;

    @JsonProperty("openid")
    private String openId;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("scope")
    private String scope;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public long getExpires() {
        return expires;
    }

    public void setExpires(long expires) {
        this.expires = expires;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
