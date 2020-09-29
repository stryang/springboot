package com.springframework.sf.validated.util;

import lombok.Data;

/**
 * @ Author     ：yq
 * @ Date       ：Created in 15:20 2020/9/29
 * @ Description：
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public static <T> Result<T> success() {
        return restResult(null, 1, "");
    }

    public static <T> Result<T> success(String msg) {
        return restResult(null, 1, msg);
    }

    public static <T> Result<T> error() {
        return restResult(null, 0, "");
    }

    public static <T> Result<T> error(String msg) {
        return restResult(null, 0, msg);
    }

    private static <T> Result<T> restResult(T data, int code, String msg) {
        Result<T> apiResult = new Result<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
