package com.nva.log;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 08/12/2014.
 */
@ComponentScan
@EnableMongoRepositories(basePackages = "com.nva.log.persistence")
@EnableAspectJAutoProxy
@Configuration
public class InitLogger {

    @DependsOn(value = "propertyLoader")
    @Bean
    public InstanceObject InstanceObject() {
        return new InstanceObject();
    }

    @Bean(name = "propertyLoader")
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("init.properties"));
        return ppc;
    }

}
