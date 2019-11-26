package com.springframework.sf.dysource.annotion;

import com.springframework.sf.dysource.datasource.DataSourceConstant;

import java.lang.annotation.*;

/**
 * @author: yq
 * @date: 2019/11/26 15:30
 * @description:
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DyDataSource {
    String name() default DataSourceConstant.DATA_SOURCE_CORE;
}
