package com.msr.aotuconfiguration.annotation;

import com.msr.aotuconfiguration.configuration.UserConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 15:29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(UserConfiguration.class)
public @interface EnableUserByConfiguration {
}
