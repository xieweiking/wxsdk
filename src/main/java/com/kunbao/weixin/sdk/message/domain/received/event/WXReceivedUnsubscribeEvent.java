package com.kunbao.weixin.sdk.message.domain.received.event;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[FromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime>
 * <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[subscribe]]></Event>
 * </xml>
 * Created by lemon_bar on 15/7/3.
 */
@XmlRootElement(name = "xml")
public class WXReceivedUnsubscribeEvent extends WXReceivedEvent {

}
