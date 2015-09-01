package com.kunbao.weixin.sdk.message.domain.send.xml;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;
import com.kunbao.weixin.sdk.message.domain.constant.WXMessageType;
import com.kunbao.weixin.sdk.util.xml.XMLCDataAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Created by lemon_bar on 15/7/17.
 */
@XmlRootElement(name = "xml")
public class WXSendText extends WXMessageBase {
    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "Content")
    private String content;

    public WXSendText() {
    }

    public WXSendText(String fromUser, String toUser, String content) {
        super(fromUser, toUser, WXMessageType.text.toString());
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WXSendText [content=" + content + ", toUserName=" + getToUserName() + ", fromUserName="
                + getFromUserName() + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
