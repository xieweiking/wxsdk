package com.kunbao.weixin.sdk.management.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.management.user.domain.WXUserGroup;

/**
 * Created by lemon_bar on 15/7/23.
 */
public class WXUserGroupCreateResponse extends WXJsonResponse {
    @JsonProperty("group")
    private WXUserGroup userGroup;

    public WXUserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(WXUserGroup userGroup) {
        this.userGroup = userGroup;
    }

}
