package com.kunbao.weixin.sdk.message.domain.send.xml;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;
import com.kunbao.weixin.sdk.message.domain.constant.WXMessageType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lemon_bar on 15/7/23.
 */
@XmlRootElement(name = "xml")
public class WXSendVideo extends WXMessageBase {
    @XmlElement(name = "Video")
    private WXSendVideoMedia video;

    protected WXSendVideo() {
        super();
    }

    public WXSendVideo(String fromUser, String toUser, WXSendVideoMedia videoMedia) {
        super(fromUser, toUser, WXMessageType.video.toString());
        this.video = videoMedia;
    }

    public WXSendVideoMedia getVideo() {
        return video;
    }

    public void setVideo(WXSendVideoMedia video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "WXSendVideo [video=" + video + ", toUserName=" + getToUserName() + ", fromUserName="
                + getFromUserName() + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
