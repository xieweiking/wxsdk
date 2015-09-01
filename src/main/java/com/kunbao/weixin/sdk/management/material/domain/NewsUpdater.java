package com.kunbao.weixin.sdk.management.material.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "media_id":MEDIA_ID,
 * "index":INDEX,
 * "articles": {
 * "title": TITLE,
 * "thumb_media_id": THUMB_MEDIA_ID,
 * "author": AUTHOR,
 * "digest": DIGEST,
 * "show_cover_pic": SHOW_COVER_PIC(0 / 1),
 * "content": CONTENT,
 * "content_source_url": CONTENT_SOURCE_URL
 * }
 * }
 * Created by lemon_bar on 15/7/24.
 */
public class NewsUpdater {
    @JsonProperty("media_id")
    private String mediaId;
    @JsonProperty("index")
    private int index;
    @JsonProperty("articles")
    private NewsItem item;

    public NewsUpdater(String mediaId, int index, NewsItem item) {
        this.mediaId = mediaId;
        this.index = index;
        this.item = item;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public NewsItem getItem() {
        return item;
    }

    public void setItem(NewsItem item) {
        this.item = item;
    }

}
