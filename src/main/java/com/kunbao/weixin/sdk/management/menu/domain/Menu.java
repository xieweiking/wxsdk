package com.kunbao.weixin.sdk.management.menu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by lemon_bar on 15/7/7.
 */
public class Menu {
    @JsonProperty("button")
    private List<Button> buttons;

    public Menu() {
        this.buttons = Lists.newArrayList();
    }

    public void addButton(Button button) {
        this.buttons.add(button);
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

}
