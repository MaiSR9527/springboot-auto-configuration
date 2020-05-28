package com.msr.aotuconfiguration.bootstrap;

import com.msr.aotuconfiguration.annotation.EnableUserByImportSelector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 15:56
 */
@EnableUserByImportSelector
public class TestEnableImportSelectorBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestEnableImportSelectorBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String user = context.getBean("user", String.class);
        System.out.println("user Bean : " + user);
        context.close();
    }
}
