package com.kunbao.weixin.sdk.message.domain.send.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.message.domain.send.json.metadata.MediaContent;

/**
 * Created by lemon_bar on 15/7/23.
 */
public class WXCustomImage extends WXCustomMessage {

    @JsonProperty("image")
    private MediaContent mediaContent;

    public WXCustomImage(String toUser, String mediaId) {
        super(toUser, WXCustomMessageType.image);
        this.mediaContent = new MediaContent(mediaId);
    }

    public MediaContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.mediaContent = mediaContent;
    }

}
