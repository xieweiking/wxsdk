package com.kunbao.weixin.sdk.base.exception;

/**
 * Created by lemon_bar on 15/7/23.
 */
public class WXException extends Exception {
    private long code;
    private String message;

    public WXException(long code, String message) {
        super(String.format("%d: %s", code, message));
    }

    public WXException(String message) {
        this(-1, message);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}