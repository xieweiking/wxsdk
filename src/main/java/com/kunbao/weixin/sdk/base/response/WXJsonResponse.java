package com.kunbao.weixin.sdk.base.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {"errcode":40013,"errmsg":"invalid appid"}
 * Created by lemon_bar on 15/7/7.
 */
public class WXJsonResponse extends WXResponse {

    @JsonProperty("errcode")
    private long code;

    @JsonProperty("errmsg")
    private String msg;

    public WXJsonResponse() {
        this.code = 0l;
    }

    public boolean isSuccess() {
        return this.code == 0l;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
