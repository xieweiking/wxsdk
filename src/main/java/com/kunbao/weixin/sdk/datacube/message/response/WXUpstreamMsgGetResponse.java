package com.kunbao.weixin.sdk.datacube.message.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.message.domain.UpstreamMsgData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXUpstreamMsgGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<UpstreamMsgData> upstreamMsgData;

    public List<UpstreamMsgData> getUpstreamMsgData() {
        return upstreamMsgData;
    }

    public void setUpstreamMsgData(List<UpstreamMsgData> upstreamMsgData) {
        this.upstreamMsgData = upstreamMsgData;
    }

}
