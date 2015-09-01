package com.kunbao.weixin.sdk.datacube.article.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.article.domain.UserReadHourData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXArticleUserReadHourGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<UserReadHourData> userReadHourData;

    public List<UserReadHourData> getUserReadHourData() {
        return userReadHourData;
    }

    public void setUserReadHourData(List<UserReadHourData> userReadHourData) {
        this.userReadHourData = userReadHourData;
    }

}
