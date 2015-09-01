package com.kunbao.weixin.sdk.management.menu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.base.exception.WXException;
import com.kunbao.weixin.sdk.util.WXJsonUtil;

/**
 * Created by lemon_bar on 15/7/7.
 */
public class ClickButton extends Button {
    @JsonProperty("key")
    private String key;

    public ClickButton(String name, String key) {
        super(name, "click");
        this.key = key;
    }

    @Override
    public String toJson() throws WXException {
        return WXJsonUtil.beanToJson(this);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
