package com.kunbao.weixin.sdk.management.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.management.user.domain.WXUserGroup;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/23.
 */
public class WXUserGroupGetResponse extends WXJsonResponse {
    @JsonProperty("groups")
    private List<WXUserGroup> userGroups;

    public List<WXUserGroup> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(List<WXUserGroup> userGroups) {
        this.userGroups = userGroups;
    }

}
