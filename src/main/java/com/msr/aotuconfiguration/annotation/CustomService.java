package com.msr.aotuconfiguration.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 14:55
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface CustomService {
    String value() default "";
}


