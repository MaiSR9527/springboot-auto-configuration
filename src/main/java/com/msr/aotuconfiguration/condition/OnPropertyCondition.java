package com.msr.aotuconfiguration.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author MaiShuRen
 * @version v1.0
 * @description des
 * @date 2020/5/28 16:24
 */

public class OnPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionOnProperty.class.getName());
        String name = String.valueOf(attributes.get("name"));
        String address = String.valueOf(attributes.get("address"));
        return "vip".equalsIgnoreCase(name) && "China".equalsIgnoreCase(address);
    }
}
