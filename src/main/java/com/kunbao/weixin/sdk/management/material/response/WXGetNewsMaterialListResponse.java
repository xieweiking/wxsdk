package com.kunbao.weixin.sdk.management.material.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.management.material.domain.NewsMaterialItem;

import java.util.List;

/**
 * {
 * "total_count": TOTAL_COUNT,
 * "item_count": ITEM_COUNT,
 * "item": [{
 * "media_id": ME
 * Created by lemon_bar on 15/7/12.
 */
public class WXGetNewsMaterialListResponse extends WXJsonResponse {
    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("item_count")
    private int itemCount;
    @JsonProperty("item")
    private List<NewsMaterialItem> items;

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

    public List<NewsMaterialItem> getItems() {
        return items;
    }

    public void setItems(List<NewsMaterialItem> items) {
        this.items = items;
    }

}
