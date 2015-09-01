package com.kunbao.weixin.sdk.management.material.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.management.material.domain.CommonMaterialItem;

import java.util.List;

/**
 * {
 * "total_count": TOTAL_COUNT,
 * "item_count": ITEM_COUNT,
 * "item": [{
 * "media_id": MEDIA_ID,
 * "name": NAME,
 * "update_time": UPDATE_TIME,
 * "url":URL
 * },
 * //可能会有多个素材
 * ]
 * }
 * Created by lemon_bar on 15/7/12.
 */
public class WXGetCommonMaterialListResponse extends WXJsonResponse {
    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("item_count")
    private int itemCount;
    @JsonProperty("item")
    private List<CommonMaterialItem> items;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public List<CommonMaterialItem> getItems() {
        return items;
    }

    public void setItems(List<CommonMaterialItem> items) {
        this.items = items;
    }

}
