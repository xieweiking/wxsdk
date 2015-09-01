package com.kunbao.weixin.sdk.message.domain.send.json.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "title":"MUSIC_TITLE",
 * "description":"MUSIC_DESCRIPTION",
 * "musicurl":"MUSIC_URL",
 * "hqmusicurl":"HQ_MUSIC_URL",
 * "thumb_media_id":"THUMB_MEDIA_ID"
 * Created by lemon_bar on 15/7/23.
 */
public class MusicContent {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("musicurl")
    private String musicUrl;
    @JsonProperty("hqmusicurl")
    private String hqMusicUrl;
    @JsonProperty("thumb_media_id")
    private String thumbMediaId;

    public MusicContent(String title, String description, String musicUrl, String hqMusicUrl, String thumbMediaId) {
        this.title = title;
        this.description = description;
        this.musicUrl = musicUrl;
        this.hqMusicUrl = hqMusicUrl;
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

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public String getHqMusicUrl() {
        return hqMusicUrl;
    }

    public void setHqMusicUrl(String hqMusicUrl) {
        this.hqMusicUrl = hqMusicUrl;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

}
