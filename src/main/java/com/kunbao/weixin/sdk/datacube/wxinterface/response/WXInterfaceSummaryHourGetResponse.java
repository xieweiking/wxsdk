package com.kunbao.weixin.sdk.datacube.wxinterface.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.wxinterface.domain.InterfaceHourData;

import java.util.List;

/**
 * "ref_hour": 0,
 * Created by lemon_bar on 15/7/29.
 */
public class WXInterfaceSummaryHourGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<InterfaceHourData> interfaceHourData;

    public List<InterfaceHourData> getInterfaceHourData() {
        return interfaceHourData;
    }

    public void setInterfaceHourData(List<InterfaceHourData> interfaceHourData) {
        this.interfaceHourData = interfaceHourData;
    }

}
