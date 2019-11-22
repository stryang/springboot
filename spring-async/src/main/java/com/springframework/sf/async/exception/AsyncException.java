package com.springframework.sf.async.exception;

/**
 * @author: yq
 * @date: 2019/11/22 14:25
 * @description:
 */
public class AsyncException extends RuntimeException {
    public AsyncException() {
        super();
    }

    public AsyncException(String msg) {
        super(msg);
    }

    public AsyncException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    /**
     * 错误代码
     */
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
