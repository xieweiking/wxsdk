package com.kunbao.weixin.sdk.management.menu.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/7.
 */
public class ButtonRes {
    @JsonProperty("name")
    protected String name;
    @JsonProperty("type")
    protected String type;
    @JsonProperty("key")
    private String key;
    @JsonProperty("url")
    private String url;
    @JsonProperty("sub_button")
    private List<ButtonRes> subButtons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ButtonRes> getSubButtons() {
        return subButtons;
    }

    public void setSubButtons(List<ButtonRes> subButtons) {
        this.subButtons = subButtons;
    }

}
