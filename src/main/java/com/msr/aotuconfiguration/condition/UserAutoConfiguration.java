package com.msr.aotuconfiguration.condition;

import com.msr.aotuconfiguration.annotation.EnableUserByConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * {@link Configuration} spring模式注解
 * {@link EnableUserByConfiguration} Enable模块
 * {@link ConditionOnProperty} 条件装配
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/28 17:05
 */
@Configuration
@EnableUserByConfiguration
@ConditionOnProperty(name = "vip", address = "China")
public class UserAutoConfiguration {
}
