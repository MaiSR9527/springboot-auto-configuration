package com.msr.aotuconfiguration.annotation;

import com.msr.aotuconfiguration.configuration.UserConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 15:42
 */

public class UserConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{UserConfiguration.class.getName()};
    }
}
