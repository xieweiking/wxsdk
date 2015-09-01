package com.kunbao.weixin.sdk.datacube.article.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "ref_date": "2014-12-08",
 * "msgid": "10000050_1",
 * "title": "12月27日 DiLi日报",
 * "int_page_read_user": 23676,
 * "int_page_read_count": 25615,
 * "ori_page_read_user": 29,
 * "ori_page_read_count": 34,
 * "share_user": 122,
 * "share_count": 994,
 * "add_to_fav_user": 1,
 * "add_to_fav_count": 3
 * }
 * Created by lemon_bar on 15/7/29.
 */
public class ArticleData {
    @JsonProperty("ref_date")
    private String refDate;
    @JsonProperty("msgid")
    private String msgId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("int_page_read_user")
    private long readUserCount;
    @JsonProperty("int_page_read_count")
    private long readCount;
    @JsonProperty("ori_page_read_user")
    private long readOriUserCount;
    @JsonProperty("ori_page_read_count")
    private long readOriCount;
    @JsonProperty("share_user")
    private long shareUserCount;
    @JsonProperty("share_count")
    private long shareCount;
    @JsonProperty("add_to_fav_user")
    private long favUserCount;
    @JsonProperty("add_to_fav_count")
    private long favCount;

    public String getRefDate() {
        return refDate;
    }

    public void setRefDate(String refDate) {
        this.refDate = refDate;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getReadUserCount() {
        return readUserCount;
    }

    public void setReadUserCount(long readUserCount) {
        this.readUserCount = readUserCount;
    }

    public long getReadCount() {
        return readCount;
    }

    public void setReadCount(long readCount) {
        this.readCount = readCount;
    }

    public long getReadOriUserCount() {
        return readOriUserCount;
    }

    public void setReadOriUserCount(long readOriUserCount) {
        this.readOriUserCount = readOriUserCount;
    }

    public long getReadOriCount() {
        return readOriCount;
    }

    public void setReadOriCount(long readOriCount) {
        this.readOriCount = readOriCount;
    }

    public long getShareUserCount() {
        return shareUserCount;
    }

    public void setShareUserCount(long shareUserCount) {
        this.shareUserCount = shareUserCount;
    }

    public long getShareCount() {
        return shareCount;
    }

    public void setShareCount(long shareCount) {
        this.shareCount = shareCount;
    }

    public long getFavUserCount() {
        return favUserCount;
    }

    public void setFavUserCount(long favUserCount) {
        this.favUserCount = favUserCount;
    }

    public long getFavCount() {
        return favCount;
    }

    public void setFavCount(long favCount) {
        this.favCount = favCount;
    }

}
