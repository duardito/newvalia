package com.nva.persistence.mongodb;

import com.nva.persistence.mongodb.config.MongoConnection;
import com.nva.support.CommonConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 * Created by edu on 07/12/2014.
 */

@ComponentScan(basePackages = "com.nva.persistence.mongodb")
@Profile("mongodb")
@Import({MongoConnection.class, CommonConfiguration.class, MongoRepositoryConfiguration.class})
@Configuration
public interface MongoConfigurations {
}
