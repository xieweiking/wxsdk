package com.kunbao.weixin.sdk.datacube.article.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.article.domain.ArticleShareHourData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXArticleUserShareHourGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<ArticleShareHourData> articleShareHourData;

    public List<ArticleShareHourData> getArticleShareHourData() {
        return articleShareHourData;
    }

    public void setArticleShareHourData(
            List<ArticleShareHourData> articleShareHourData) {
        this.articleShareHourData = articleShareHourData;
    }

}
