package com.kunbao.weixin.sdk.datacube.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.user.domain.UserCumulateItem;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXUserCumulateGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<UserCumulateItem> userCumulate;

    public List<UserCumulateItem> getUserCumulate() {
        return userCumulate;
    }

    public void setUserCumulate(List<UserCumulateItem> userCumulate) {
        this.userCumulate = userCumulate;
    }

}
