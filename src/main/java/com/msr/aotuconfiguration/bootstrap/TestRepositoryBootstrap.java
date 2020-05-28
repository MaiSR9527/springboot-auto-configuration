package com.msr.aotuconfiguration.bootstrap;

import com.msr.aotuconfiguration.repository.UserRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 14:42
 */
@ComponentScan(basePackages = "com.msr.aotuconfiguration.repository")
public class TestRepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestRepositoryBootstrap.class)
                // 非web模式运行
                .web(WebApplicationType.NONE)
                .run(args);
        UserRepository repository = context.getBean(UserRepository.class);
        System.out.println("repository bean: " + repository);
        context.close();
    }
}
