package com.kunbao.weixin.sdk.datacube.article.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.article.domain.ArticleShareData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXArticleUserShareGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<ArticleShareData> articleShareData;

    public List<ArticleShareData> getArticleShareData() {
        return articleShareData;
    }

    public void setArticleShareData(List<ArticleShareData> articleShareData) {
        this.articleShareData = articleShareData;
    }

}
