package com.nva.persistence.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 19/12/2014.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.nva.persistence.mongodb.repositories.*")
public interface MongoRepositoryConfiguration {
}
