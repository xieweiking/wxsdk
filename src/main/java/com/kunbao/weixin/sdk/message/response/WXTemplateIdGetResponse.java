package com.kunbao.weixin.sdk.message.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * {
 * "errcode":0,
 * "errmsg":"ok",
 * "template_id":"Doclyl5uP7Aciu-qZ7mJNPtWkbkYnWBWVja26EGbNyk"
 * }
 * Created by lemon_bar on 15/7/30.
 */
public class WXTemplateIdGetResponse extends WXJsonResponse {
    @JsonProperty("template_id")
    private String templateId;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
