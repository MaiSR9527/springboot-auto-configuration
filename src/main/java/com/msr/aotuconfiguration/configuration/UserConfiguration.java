package com.msr.aotuconfiguration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 15:31
 */
@Configuration
public class UserConfiguration {
    @Bean
    public String user(){
        return "user configuration";
    }
}
