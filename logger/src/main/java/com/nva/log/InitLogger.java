package com.nva.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by edu on 08/12/2014.
 */
@EnableAspectJAutoProxy
@Configuration
public class InitLogger {

    @Bean
    public InstanceObject InstanceObject() {
        return new InstanceObject();
    }
}
