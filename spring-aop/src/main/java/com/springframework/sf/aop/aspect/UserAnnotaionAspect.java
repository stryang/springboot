package com.springframework.sf.aop.aspect;

import com.springframework.sf.aop.annotation.UserAnnotaion;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: yq
 * @date: 2019/11/21 10:04
 * @description:
 */
@Component
@Aspect
public class UserAnnotaionAspect {

    @Pointcut(value = "@annotation(com.springframework.sf.aop.annotation.UserAnnotaion)")
    public void access() {

    }

    @Before("access()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("second before");
    }

    @Around("@annotation(userAnnotaion)")
    public Object around(ProceedingJoinPoint pjp, UserAnnotaion userAnnotaion) {
        //获取注解里的值
        System.out.println("second around:" + userAnnotaion.desc());
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
