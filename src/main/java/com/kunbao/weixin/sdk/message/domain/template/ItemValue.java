package com.kunbao.weixin.sdk.message.domain.template;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "value":"恭喜你购买成功！",
 * "color":"#173177"
 * Created by lemon_bar on 15/7/30.
 */
public class ItemValue {
    @JsonProperty("value")
    private String value;
    @JsonProperty("color")
    private String color;

    public ItemValue(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
