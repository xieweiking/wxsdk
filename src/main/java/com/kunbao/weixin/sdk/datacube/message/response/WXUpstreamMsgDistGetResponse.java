package com.kunbao.weixin.sdk.datacube.message.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.datacube.message.domain.UpstreamMsgDistData;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/29.
 */
public class WXUpstreamMsgDistGetResponse extends WXJsonResponse {
    @JsonProperty("list")
    private List<UpstreamMsgDistData> upstreamMsgDistData;

    public List<UpstreamMsgDistData> getUpstreamMsgDistData() {
        return upstreamMsgDistData;
    }

    public void setUpstreamMsgDistData(List<UpstreamMsgDistData> upstreamMsgDistData) {
        this.upstreamMsgDistData = upstreamMsgDistData;
    }

}
