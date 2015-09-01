package com.kunbao.weixin.sdk.datacube.article.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.article.domain.UserReadData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXArticleUserReadGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<UserReadData> userReadData;

    public List<UserReadData> getUserReadData() {
        return userReadData;
    }

    public void setUserReadData(List<UserReadData> userReadData) {
        this.userReadData = userReadData;
    }

}
