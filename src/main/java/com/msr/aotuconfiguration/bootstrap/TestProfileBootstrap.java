package com.msr.aotuconfiguration.bootstrap;

import com.msr.aotuconfiguration.service.User1ServiceByProfile;
import com.msr.aotuconfiguration.service.User2ServiceByProfile;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 16:10
 */
@SpringBootApplication(scanBasePackages = "com.msr.aotuconfiguration.service")
public class TestProfileBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestProfileBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("user1")
                .run(args);

        User1ServiceByProfile user1 = context.getBean("user1ServiceByProfile", User1ServiceByProfile.class);
        user1.print();
        User2ServiceByProfile user2 = context.getBean("user2ServiceByProfile",User2ServiceByProfile.class);
        if (user2==null){
            System.out.println("user2ServiceByProfile can not be load...");
        }
    }
}
