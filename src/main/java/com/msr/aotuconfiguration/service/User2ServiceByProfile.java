package com.msr.aotuconfiguration.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 16:07
 */
@Profile("user2")
@Service("user2ServiceByProfile")
public class User2ServiceByProfile {
    public void print(){
        System.out.println("profile is user2: "+this.getClass().getName());
    }
}
