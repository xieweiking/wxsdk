package com.kunbao.weixin.sdk.message.domain.send.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.message.domain.send.json.metadata.NewsContent;
import com.kunbao.weixin.sdk.message.domain.send.json.metadata.NewsItemContent;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/23.
 */
public class WXCustomNews extends WXCustomMessage {
    @JsonProperty("news")
    private NewsContent newsContent;

    public WXCustomNews(String toUser, List<NewsItemContent> articles) {
        super(toUser, WXCustomMessageType.news);
        this.newsContent = new NewsContent(articles);
    }

    public NewsContent getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(NewsContent newsContent) {
        this.newsContent = newsContent;
    }

}
