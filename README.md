微信服务号 SDK for Java
=====

###如何使用？

在maven工程的pom.xml，添加下面的引用。

`<dependency>`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;`<groupId>com.kunbao.weixin</groupId>`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;`<artifactId>sdk</artifactId>`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;`<version>1.0</version>`<br/>
`</dependency>`<br/>

====
###初始化

推荐使用下面的单例模式进行初始化。

`private WXApi wxApi;`<br/>
`public synchronized WXApi getWxApi() {`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;`if (wxApi == null) {`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`wxApi = new WXApi(WXConstant.APP_ID, WXConstant.APP_SECRET, WXConstant.TOKEN, WXConstant.EncodingAESKey);`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;`}`<br/>
&nbsp;&nbsp;&nbsp;&nbsp;`return wxApi;`<br/>
`}`<br/>

====
###接口介绍

所有的方法都通过wxApi进行调用，简单易用。<br/>
开发者不需要关心token，相关的刷新逻辑已经封装在代码中。

#####安全相关的接口
1. 验证服务器地址有效性<br/>
`boolean checkSignature(String signature, String timestamp, String nonce)`<br/>

2. 解密消息<br/>
`String decryptContent(String encryptType, String msgSignature, String timestamp, String nonce, String content) throws AesException`<br/>

3. 加密消息<br/>
`String encryptContent(String encryptType, String timestamp, String nonce, String content) throws AesException`<br/>

4. 获得微信服务器IP地址列表<br/>
`List<String> getCallbackIpList() throws WXException`<br/>

#####消息相关的接口
1. 解析接受的消息<br/>
`WXMessageBase consumeMessage(String messageStr) throws WXException`<br/>

2. 产生被动回复消息<br/>
`String produceText(String fromUser, String toUser, String content) throws WXException`<br/>
`String produceImage(String fromUser, String toUser, String mediaId) throws WXException`<br/>
`String produceVoice(String fromUser, String toUser, String mediaId) throws WXException`<br/>
`String produceVideo(String fromUser, String toUser, WXSendVideoMedia videoMedia) throws WXException`<br/>
`String produceMusic(String fromUser, String toUser, WXSendMusicMedia musicMedia) throws WXException`<br/>
`String produceNews(String fromUser, String toUser, List<WXSendNewsItem> newsItems) throws WXException`<br/>

3. 发送客服消息<br/>
`boolean sendCustomText(String toUser, String content) throws WXException`<br/>
`boolean sendCustomImage(String toUser, String mediaId) throws WXException`<br/>
`boolean sendCustomVoice(String toUser, String mediaId) throws WXException`<br/>
`boolean sendCustomVideo(String toUser, VideoContent videoContent) throws WXException`<br/>
`boolean sendCustomMusic(String toUser, MusicContent musicContent) throws WXException`<br/>
`boolean sendCustomNews(String toUser, List<NewsItemContent> articles) throws WXException`<br/>
