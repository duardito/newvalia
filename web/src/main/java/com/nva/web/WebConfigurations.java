package com.nva.web;

import com.nva.persistence.Props;
import com.nva.persistence.mongodb.MongoConfigurations;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by edu on 07/12/2014.
 */
@EnableTransactionManagement
@EnableMongoRepositories(basePackageClasses = {MongoConfigurations.class})
@PropertySource("classpath:config/init.properties")
@ComponentScan(basePackages = {
        "com.nva.web.config",
        "com.nva.integration.*",
        "com.nva.support.*",
        "com.nva.persistence.*",
        "com.nva.service.*",
        "com.nva.log.*"
        ,"com.nva.security"} )
@Import({Props.class})
@Configuration
public interface WebConfigurations {
}
