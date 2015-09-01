package com.kunbao.weixin.sdk.datacube.article.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.article.domain.ArticleData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXArticleSummaryGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<ArticleData> articleDataSummary;

    public List<ArticleData> getArticleDataSummary() {
        return articleDataSummary;
    }

    public void setArticleDataSummary(List<ArticleData> articleDataSummary) {
        this.articleDataSummary = articleDataSummary;
    }

}
