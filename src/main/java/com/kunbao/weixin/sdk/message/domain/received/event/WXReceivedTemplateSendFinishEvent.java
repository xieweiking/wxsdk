package com.kunbao.weixin.sdk.message.domain.received.event;

import com.kunbao.weixin.sdk.util.xml.XMLCDataAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <xml>
 * <ToUserName><![CDATA[gh_7f083739789a]]></ToUserName>
 * <FromUserName><![CDATA[oia2TjuEGTNoeX76QEjQNrcURxG8]]></FromUserName>
 * <CreateTime>1395658920</CreateTime>
 * <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[TEMPLATESENDJOBFINISH]]></Event>
 * <MsgID>200163836</MsgID>
 * <Status><![CDATA[success]]></Status>
 * </xml>
 * Created by lemon_bar on 15/7/30.
 */
@XmlRootElement(name = "xml")
public class WXReceivedTemplateSendFinishEvent extends WXReceivedEvent {
    @XmlElement(name = "MsgID")
    private String msgId;

    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "Status")
    private String status;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WXReceivedTemplateSendFinishEvent [msgId=" + msgId
                + ", status=" + status + ", event=" + getEvent() + ", parsedType=" + getParsedType() + ", toUserName="
                + getToUserName() + ", fromUserName=" + getFromUserName()
                + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
