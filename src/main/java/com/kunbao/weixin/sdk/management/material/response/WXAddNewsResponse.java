package com.kunbao.weixin.sdk.management.material.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * {
 * "media_id":MEDIA_ID
 * }
 * Created by lemon_bar on 15/7/12.
 */
public class WXAddNewsResponse extends WXJsonResponse {
    @JsonProperty("media_id")
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

}
