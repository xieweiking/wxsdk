package com.kunbao.weixin.sdk.message.domain.send.json.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "media_id":"MEDIA_ID",
 * "thumb_media_id":"MEDIA_ID",
 * "title":"TITLE",
 * "description":"DESCRIPTION"
 * Created by lemon_bar on 15/7/23.
 */
public class VideoContent extends MediaContent {

    @JsonProperty("thumb_media_id")
    private String thumbMediaId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    public VideoContent(String mediaId, String thumbMediaId, String title, String description) {
        super(mediaId);
        this.thumbMediaId = thumbMediaId;
        this.title = title;
        this.description = description;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
