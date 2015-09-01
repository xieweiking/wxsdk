package com.kunbao.weixin.sdk.jsapiticket.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * {
 * "errcode":0,
 * "errmsg":"ok",
 * "ticket":"bxLdikRXVbTPdHSM05e5u5sUoXNKd8-41ZO3MhKoyN5OfkWITDGgnr2fwJ0m9E8NYzWKVZvdVtaUgWvsdshFKA",
 * "expires_in":7200
 * }
 * Created by lemon_bar on 15/8/30.
 */
public class WXJsapiTicketResponse extends WXJsonResponse {
    @JsonProperty("ticket")
    private String ticket;

    @JsonProperty("expires_in")
    private long expires;

    public WXJsapiTicketResponse() {
        super();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public long getExpires() {
        return expires;
    }

    public void setExpires(long expires) {
        this.expires = expires;
    }

}
