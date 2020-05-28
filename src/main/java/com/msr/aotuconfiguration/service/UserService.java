package com.msr.aotuconfiguration.service;

import com.msr.aotuconfiguration.annotation.CustomService;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 14:57
 */
@CustomService
public class UserService {

    public String get() {
        return "custom annotation";
    }
}
