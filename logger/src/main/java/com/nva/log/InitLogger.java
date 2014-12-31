package com.nva.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 08/12/2014.
 */
@ComponentScan
@EnableMongoRepositories(basePackages = "com.nva.log.persistence")
@EnableAspectJAutoProxy
@Configuration
public class InitLogger {

    @Bean
    public InstanceObject InstanceObject() {
        return new InstanceObject();
    }

}
