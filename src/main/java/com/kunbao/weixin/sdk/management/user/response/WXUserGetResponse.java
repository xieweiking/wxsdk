package com.kunbao.weixin.sdk.management.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.management.user.domain.WXOpenIdList;

/**
 * {"total":2,"count":2,"data":{"openid":["","OPENID1","OPENID2"]},"next_openid":"NEXT_OPENID"}
 * Created by lemon_bar on 15/7/22.
 */
public class WXUserGetResponse extends WXJsonResponse {
    @JsonProperty("total")
    private long total;

    @JsonProperty("count")
    private int count;

    @JsonProperty("data")
    private WXOpenIdList openIdList;

    @JsonProperty("next_openid")
    private String nextOpenId;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public WXOpenIdList getOpenIdList() {
        return openIdList;
    }

    public void setOpenIdList(WXOpenIdList openIdList) {
        this.openIdList = openIdList;
    }

    public String getNextOpenId() {
        return nextOpenId;
    }

    public void setNextOpenId(String nextOpenId) {
        this.nextOpenId = nextOpenId;
    }

}
