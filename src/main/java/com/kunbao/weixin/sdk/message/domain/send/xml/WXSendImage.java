package com.kunbao.weixin.sdk.message.domain.send.xml;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;
import com.kunbao.weixin.sdk.message.domain.constant.WXMessageType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lemon_bar on 15/7/17.
 */
@XmlRootElement(name = "xml")
public class WXSendImage extends WXMessageBase {
    @XmlElement(name = "Image")
    private WXSendMedia image;

    public WXSendImage() {
    }

    public WXSendImage(String fromUser, String toUser, String mediaId) {
        super(fromUser, toUser, WXMessageType.image.toString());
        this.image = new WXSendMedia(mediaId);
    }

    public WXSendMedia getImage() {
        return image;
    }

    public void setImage(WXSendMedia image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "WXSendImage [image=" + image + ", toUserName=" + getToUserName() + ", fromUserName="
                + getFromUserName() + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
