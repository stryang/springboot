package com.springframework.sf.validated.config;

import com.springframework.sf.validated.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

/**
 * @ Author     ：yq
 * @ Date       ：Created in 15:16 2020/9/29
 * @ Description：
 */
@Slf4j
@RestControllerAdvice
public class ControllerAdvice {

    /**
     * 拦截表单参数校验
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({BindException.class})
    public Result bindException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        String msg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
        log.error("参数校验异常拦截：{}", msg);
        return Result.error(msg);
    }

    /**
     * 拦截JSON参数校验
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result bindException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String msg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
        log.error("参数校验异常拦截：{}", msg);
        return Result.error(msg);
    }

}
