package com.kunbao.weixin.sdk.management.menu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.response.WXJsonResponse;
import com.kunbao.weixin.sdk.management.menu.domain.response.MenuRes;

/**
 * Created by lemon_bar on 15/7/7.
 */
public class WXMenuGetResponse extends WXJsonResponse {
    @JsonProperty("menu")
    private MenuRes menu;

    public MenuRes getMenu() {
        return menu;
    }

    public void setMenu(MenuRes menu) {
        this.menu = menu;
    }

}
