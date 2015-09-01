package com.kunbao.weixin.sdk.message.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * {
 * "errcode":0,
 * "errmsg":"ok",
 * "msgid":200228332
 * }
 * Created by lemon_bar on 15/7/30.
 */
public class WXTemplateSendResponse extends WXJsonResponse {
    @JsonProperty("msgid")
    private String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

}
