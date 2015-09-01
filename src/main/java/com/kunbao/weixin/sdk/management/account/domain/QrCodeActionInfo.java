package com.kunbao.weixin.sdk.management.account.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by lemon_bar on 15/7/10.
 */
public class QrCodeActionInfo {
    @JsonProperty("scene")
    private QrScene scene;

    public QrCodeActionInfo(QrScene scene) {
        this.scene = scene;
    }

    public QrScene getScene() {
        return scene;
    }

    public void setScene(QrScene scene) {
        this.scene = scene;
    }

}
