package com.kunbao.weixin.sdk.management.menu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.kunbao.weixin.sdk.base.exception.WXException;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/7.
 */
public abstract class Button {
    @JsonProperty("name")
    protected String name;
    @JsonProperty("type")
    protected String type;
    @JsonProperty("sub_button")
    private List<Button> subButtons;

    public Button(String name, String type) {
        this.name = name;
        this.type = type;
        this.subButtons = Lists.newArrayList();
    }

    public abstract String toJson() throws WXException;

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

    public List<Button> getSubButtons() {
        return subButtons;
    }

    public void setSubButtons(List<Button> subButtons) {
        this.subButtons = subButtons;
    }

}
