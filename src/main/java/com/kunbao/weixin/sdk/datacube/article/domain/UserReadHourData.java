package com.kunbao.weixin.sdk.datacube.article.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class UserReadHourData extends UserReadData {
    @JsonProperty("ref_hour")
    private int refHour;
    @JsonProperty("user_source")
    private int userSource;

    public int getRefHour() {
        return refHour;
    }

    public void setRefHour(int refHour) {
        this.refHour = refHour;
    }

    public int getUserSource() {
        return userSource;
    }

    public void setUserSource(int userSource) {
        this.userSource = userSource;
    }

}
