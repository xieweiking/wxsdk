package com.kunbao.weixin.sdk.message.domain.send.xml;

import com.kunbao.weixin.sdk.message.domain.base.WXMessageBase;
import com.kunbao.weixin.sdk.message.domain.constant.WXMessageType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime>
 * <MsgType><![CDATA[news]]></MsgType>
 * <ArticleCount>2</ArticleCount>
 * <Articles>
 * <item>
 * Created by lemon_bar on 15/7/23.
 */
@XmlRootElement(name = "xml")
public class WXSendNews extends WXMessageBase {
    @XmlElement(name = "ArticleCount")
    private int articleCount;

    @XmlElement(name = "Articles")
    private List<WXSendNewsItem> articles;

    protected WXSendNews() {
        super();
    }

    public WXSendNews(String fromUser, String toUser, List<WXSendNewsItem> articles) {
        super(fromUser, toUser, WXMessageType.news.toString());
        this.articleCount = articles.size();
        this.articles = articles;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public List<WXSendNewsItem> getArticles() {
        return articles;
    }

    public void setArticles(List<WXSendNewsItem> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "WXSendNews [articleCount=" + articleCount + ", articles="
                + articles + ", toUserName=" + getToUserName() + ", fromUserName="
                + getFromUserName() + ", createTime=" + getCreateTime() + ", msgType="
                + getMsgType() + "]";
    }

}
