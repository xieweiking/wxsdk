package com.kunbao.weixin.sdk.message.domain.send.xml;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;
import com.kunbao.weixin.sdk.message.domain.constant.WXMessageType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lemon_bar on 15/7/23.
 */
@XmlRootElement(name = "xml")
public class WXSendVoice extends WXMessageBase {
    @XmlElement(name = "Voice")
    private WXSendMedia voice;

    public WXSendVoice() {
    }

    public WXSendVoice(String fromUser, String toUser, String mediaId) {
        super(fromUser, toUser, WXMessageType.voice.toString());
        this.voice = new WXSendMedia(mediaId);
    }

    public WXSendMedia getVoice() {
        return voice;
    }

    public void setVoice(WXSendMedia voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "WXSendVoice [voice=" + voice + ", toUserName=" + getToUserName() + ", fromUserName="
                + getFromUserName() + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
