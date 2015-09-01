package com.kunbao.weixin.sdk.management.menu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.exception.WXException;
import com.kunbao.weixin.sdk.util.WXJsonUtil;

/**
 * Created by lemon_bar on 15/7/7.
 */
public class ViewButton extends Button {
    @JsonProperty("url")
    private String url;

    public ViewButton(String name, String url) {
        super(name, "view");
        this.url = url;
    }

    @Override
    public String toJson() throws WXException {
        return WXJsonUtil.beanToJson(this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
