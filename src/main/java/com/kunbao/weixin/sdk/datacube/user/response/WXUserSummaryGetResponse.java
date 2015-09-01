package com.kunbao.weixin.sdk.datacube.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.user.domain.UserSummaryItem;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/27.
 */
public class WXUserSummaryGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<UserSummaryItem> userSummary;

    public List<UserSummaryItem> getUserSummary() {
        return userSummary;
    }

    public void setUserSummary(List<UserSummaryItem> userSummary) {
        this.userSummary = userSummary;
    }

}
