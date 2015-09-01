package com.kunbao.weixin.sdk.message.domain.send.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.message.domain.send.json.metadata.MusicContent;

/**
 * Created by lemon_bar on 15/7/23.
 */
public class WXCustomMusic extends WXCustomMessage {
    @JsonProperty("music")
    private MusicContent musicContent;

    public WXCustomMusic(String toUser, MusicContent musicContent) {
        super(toUser, WXCustomMessageType.music);
        this.musicContent = musicContent;
    }

    public MusicContent getMusicContent() {
        return musicContent;
    }

    public void setMusicContent(MusicContent musicContent) {
        this.musicContent = musicContent;
    }

}
