package com.github.wx.ccs.exception;

public class ServiceException extends RuntimeException {

    private  Integer code;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}