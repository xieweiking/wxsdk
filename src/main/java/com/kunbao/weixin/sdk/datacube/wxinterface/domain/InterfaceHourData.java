package com.kunbao.weixin.sdk.datacube.wxinterface.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class InterfaceHourData extends InterfaceData {
    @JsonProperty("ref_hour")
    private int refHour;

    public int getRefHour() {
        return refHour;
    }

    public void setRefHour(int refHour) {
        this.refHour = refHour;
    }

}
