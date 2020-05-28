package com.msr.aotuconfiguration.bootstrap;

import com.msr.aotuconfiguration.condition.ConditionOnProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 16:33
 */

public class TestConditionBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String user = context.getBean("maishuren", String.class);
        System.out.println(user);
        context.close();
    }

    @Bean("maishuren")
    @ConditionOnProperty(name = "vip", address = "China")
    public String user() {
        return "user bean is name:msr address:China";
    }
}
