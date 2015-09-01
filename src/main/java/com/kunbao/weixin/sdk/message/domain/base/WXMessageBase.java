package com.kunbao.weixin.sdk.message.domain.base;

import com.kunbao.weixin.sdk.message.domain.constant.WXMessageType;
import com.kunbao.weixin.sdk.util.xml.XMLCDataAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by lemon_bar on 15/7/1.
 */
public class WXMessageBase {
    //开发者微信号
    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "ToUserName")
    private String toUserName;
    //发送方帐号（一个OpenID）
    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "FromUserName")
    private String fromUserName;
    //消息创建时间（整型）
    @XmlElement(name = "CreateTime")
    private long createTime;
    //消息类型
    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "MsgType")
    private String msgType;

    public WXMessageType getParsedType() {
        return WXMessageType.valueOf(msgType);
    }

    protected WXMessageBase() {
    }

    public WXMessageBase(String fromUser, String toUser, String msgType) {
        this.toUserName = toUser;
        this.fromUserName = fromUser;
        this.msgType = msgType;
        this.createTime = (new Date()).getTime() / 1000l;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @Override
    public String toString() {
        return "WXMessageBase [toUserName=" + toUserName + ", fromUserName="
                + fromUserName + ", createTime=" + createTime + ", msgType="
                + msgType + "]";
    }

}
