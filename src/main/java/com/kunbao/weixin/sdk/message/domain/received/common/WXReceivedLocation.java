package com.kunbao.weixin.sdk.message.domain.received.common;

import com.kunbao.weixin.sdk.util.xml.XMLCDataAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1351776360</CreateTime>
 * <MsgType><![CDATA[location]]></MsgType>
 * <Location_X>23.134521</Location_X>
 * <Location_Y>113.358803</Location_Y>
 * <Scale>20</Scale>
 * <Label><![CDATA[位置信息]]></Label>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 * Created by lemon_bar on 15/7/6.
 */
@XmlRootElement(name = "xml")
public class WXReceivedLocation extends WXReceivedMessage {
    @XmlElement(name = "Location_X")
    private double locationX;

    @XmlElement(name = "Location_Y")
    private double locationY;

    @XmlElement(name = "Scale")
    private double scale;

    @XmlJavaTypeAdapter(XMLCDataAdapter.class)
    @XmlElement(name = "Label")
    private String lable;

    public double getLocationX() {
        return locationX;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "WXReceivedLocation [locationX=" + locationX + ", locationY="
                + locationY + ", scale=" + scale + ", lable=" + lable + ", parsedType=" + getParsedType() + ", toUserName="
                + getToUserName() + ", fromUserName=" + getFromUserName()
                + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }
    
    
}
