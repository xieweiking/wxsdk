package com.kunbao.weixin.sdk.message.domain.received.common;

import com.kunbao.weixin.sdk.util.xml.XMLCDataAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1357290913</CreateTime>
 * <MsgType><![CDATA[voice]]></MsgType>
 * <MediaId><![CDATA[media_id]]></MediaId>
 * <Format><![CDATA[Format]]></Format>
 * <Recognition><![CDATA[腾讯微信团队]]></Recognition>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 * 开通语音识别后，用户每次发送语音给公众号时，微信会在推送的语音消息XML数据包中，
 * 增加一个Recongnition字段（注：由于客户端缓存，开发者开启或者关闭语音识别功能，
 * 对新关注者立刻生效，对已关注用户需要24小时生效。开发者可以重新关注此帐号进行测试）
 * Created by lemon_bar on 15/7/6.
 */
@XmlRootElement(name = "xml")
public class WXReceivedVoice extends WXReceivedMessage {
    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "MediaId")
    private String mediaId;

    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "Format")
    private String format;

    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "Recognition")
    private String recognition;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRecognition() {
        return recognition;
    }

    public void setRecognition(String recognition) {
        this.recognition = recognition;
    }

    @Override
    public String toString() {
        return "WXReceivedVoice [mediaId=" + mediaId + ", format=" + format
                + ", recognition=" + recognition + ", parsedType=" + getParsedType() + ", toUserName="
                + getToUserName() + ", fromUserName=" + getFromUserName()
                + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
