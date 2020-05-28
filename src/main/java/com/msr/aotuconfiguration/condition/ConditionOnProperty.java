package com.msr.aotuconfiguration.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 16:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnPropertyCondition.class)
public @interface ConditionOnProperty {

    /**
     * 姓名
     *
     * @return 用户姓名
     */
    String name();

    /**
     * 地址
     *
     * @return 用户地址
     */
    String address();
}
