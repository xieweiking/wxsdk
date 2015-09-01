package com.kunbao.weixin.sdk.base.request;

import com.kunbao.weixin.sdk.base.domain.constant.WXBaseUrl;
import com.kunbao.weixin.sdk.base.domain.constant.WXHTTPMethod;
import com.kunbao.weixin.sdk.base.exception.WXException;
import com.kunbao.weixin.sdk.base.response.WXResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lemon_bar on 15/7/7.
 */
public abstract class WXRequest<T extends WXResponse> {
    protected WXHTTPMethod method = WXHTTPMethod.GET;
    protected Map<String, String> parameters;
    protected String path;
    protected String body;
    protected String baseUrl;
    protected String filePath;

    public WXRequest() {
        this(WXBaseUrl.COMMON);
    }

    public WXRequest(String baseUrl) {
        this.baseUrl = baseUrl;
        this.parameters = new HashMap<String, String>();
    }

    public String getUrl() {
        return baseUrl + path;
    }

    public void addParameter(String key, String value) {
        this.parameters.put(key, value);
    }

    public abstract T createResponse(String body) throws WXException;

    public WXHTTPMethod getMethod() {
        return method;
    }

    public void setMethod(WXHTTPMethod method) {
        this.method = method;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
