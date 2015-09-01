package com.kunbao.weixin.sdk.management.material.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;

/**
 * {
 * "voice_count":COUNT,
 * "video_count":COUNT,
 * "image_count":COUNT,
 * "news_count":COUNT
 * }
 * Created by lemon_bar on 15/7/12.
 */
public class WXGetMaterialCountResponse extends WXJsonResponse {
    @JsonProperty("voice_count")
    private int voiceCount;
    @JsonProperty("video_count")
    private int videoCount;
    @JsonProperty("image_count")
    private int imageCount;
    @JsonProperty("news_count")
    private int newsCount;

    public int getVoiceCount() {
        return voiceCount;
    }

    public void setVoiceCount(int voiceCount) {
        this.voiceCount = voiceCount;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public int getImageCount() {
        return imageCount;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

    public int getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(int newsCount) {
        this.newsCount = newsCount;
    }

}
