package com.kunbao.weixin.sdk.datacube.message.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "ref_hour": 0,
 * Created by lemon_bar on 15/7/29.
 */
public class UpstreamMsgHourData extends UpstreamMsgData {
    @JsonProperty("ref_hour")
    private int refHour;

    public int getRefHour() {
        return refHour;
    }

    public void setRefHour(int refHour) {
        this.refHour = refHour;
    }

}
