package com.msr.aotuconfiguration.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 17:03
 */
@EnableAutoConfiguration
public class TestAutoConfigurationBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String user = context.getBean("user", String.class);
        System.out.println("user Bean : " + user);
        context.close();

    }
}
