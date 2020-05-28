package com.msr.aotuconfiguration.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 15:41
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(UserConfigurationSelector.class)
public @interface EnableUserByImportSelector {
}
