package com.kunbao.weixin.sdk.datacube.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "ref_date": "2014-12-07",
 * "cumulate_user": 1217056
 * },
 * Created by lemon_bar on 15/7/29.
 */
public class UserCumulateItem {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("cumulate_user")
    private long userCount;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }

}
