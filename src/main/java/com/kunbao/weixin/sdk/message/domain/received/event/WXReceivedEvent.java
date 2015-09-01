package com.kunbao.weixin.sdk.message.domain.received.event;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;
import com.kunbao.weixin.sdk.util.xml.XMLCDataAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 微信中的事件
 * Created by lemon_bar on 15/7/3.
 */
public class WXReceivedEvent extends WXMessageBase {
    //事件类型
    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "Event")
    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "WXReceivedEvent [event=" + event + ", parsedType=" + getParsedType() + ", toUserName="
                + getToUserName() + ", fromUserName=" + getFromUserName()
                + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }
    
    
}
