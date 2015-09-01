package com.kunbao.weixin.sdk.datacube.wxinterface.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "ref_date": "2014-12-07",
 * "callback_count": 36974,
 * "fail_count": 67,
 * "total_time_cost": 14994291,
 * "max_time_cost": 5044
 * }
 * Created by lemon_bar on 15/7/29.
 */
public class InterfaceData {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("callback_count")
    private long callbackCount;
    @JsonProperty("fail_count")
    private long failCount;
    @JsonProperty("total_time_cost")
    private long totalTimeCost;
    @JsonProperty("max_time_cost")
    private long maxTimeCost;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public long getCallbackCount() {
        return callbackCount;
    }

    public void setCallbackCount(long callbackCount) {
        this.callbackCount = callbackCount;
    }

    public long getFailCount() {
        return failCount;
    }

    public void setFailCount(long failCount) {
        this.failCount = failCount;
    }

    public long getTotalTimeCost() {
        return totalTimeCost;
    }

    public void setTotalTimeCost(long totalTimeCost) {
        this.totalTimeCost = totalTimeCost;
    }

    public long getMaxTimeCost() {
        return maxTimeCost;
    }

    public void setMaxTimeCost(long maxTimeCost) {
        this.maxTimeCost = maxTimeCost;
    }

}
