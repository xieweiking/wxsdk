package com.kunbao.weixin.sdk.message.domain.received.common;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;

import javax.xml.bind.annotation.XmlElement;

/**
 * 对应微信中普通消息
 * Created by lemon_bar on 15/7/3.
 */
public class WXReceivedMessage extends WXMessageBase {
    //消息id，64位整型
    @XmlElement(name = "MsgId")
    private long msgId;

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    @Override
    public String toString() {
        return "WXReceivedMessage [msgId=" + msgId + ", parsedType=" + getParsedType() + ", toUserName="
                + getToUserName() + ", fromUserName=" + getFromUserName()
                + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
