package com.kunbao.weixin.sdk.management.material.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "item": [{
 * "media_id": MEDIA_ID,
 * "name": NAME,
 * "update_time": UPDATE_TIME,
 * "url":URL
 * },
 * //可能会有多个素材
 * ]
 * Created by lemon_bar on 15/7/12.
 */
public class CommonMaterialItem {
    @JsonProperty("media_id")
    private String mediaId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("update_time")
    private String updateTime;
    @JsonProperty("url")
    private String url;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
