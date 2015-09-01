package com.kunbao.weixin.sdk.datacube.article.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "ref_hour": 1200,
 * Created by lemon_bar on 15/7/29.
 */
public class ArticleShareHourData extends ArticleShareData {
    @JsonProperty("ref_hour")
    private int refHour;

    public int getRefHour() {
        return refHour;
    }

    public void setRefHour(int refHour) {
        this.refHour = refHour;
    }
}
