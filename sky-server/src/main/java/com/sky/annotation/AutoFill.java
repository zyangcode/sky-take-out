package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识需要自动填充的字段
 */
@Target(ElementType.METHOD)//表示只使用在方法上
@Retention(RetentionPolicy.RUNTIME)//表示注解保留到运行时
public @interface AutoFill {
    /**
     * 数据库操作类型
     * @return
     */
    //注解的属性，类型是OperationType枚举类，可以赋给这个属性两个值，INSERT和UPDATE
    OperationType value();
}
