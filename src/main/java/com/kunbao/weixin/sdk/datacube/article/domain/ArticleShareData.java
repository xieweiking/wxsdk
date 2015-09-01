package com.kunbao.weixin.sdk.datacube.article.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "ref_date": "2014-12-07",
 * "share_scene": 1,
 * "share_count": 207,
 * "share_user": 11
 * },
 * Created by lemon_bar on 15/7/29.
 */
public class ArticleShareData {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("share_scene")
    private int shareScene;
    @JsonProperty("share_count")
    private int shareCount;
    @JsonProperty("share_user")
    private int shareUser;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public int getShareScene() {
        return shareScene;
    }

    public void setShareScene(int shareScene) {
        this.shareScene = shareScene;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getShareUser() {
        return shareUser;
    }

    public void setShareUser(int shareUser) {
        this.shareUser = shareUser;
    }

}
