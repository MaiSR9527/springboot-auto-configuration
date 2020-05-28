package com.msr.aotuconfiguration.bootstrap;

import com.msr.aotuconfiguration.service.UserService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 15:01
 */
@ComponentScan(basePackages = "com.msr.aotuconfiguration.service")
public class TestCustomAnnotationBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestCustomAnnotationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        UserService userService = context.getBean(UserService.class);
        System.out.println("userService bean:"+userService.get());
    }
}
