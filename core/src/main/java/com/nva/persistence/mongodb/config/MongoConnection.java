package com.nva.persistence.mongodb.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by edu on 07/12/2014.
 */
@PropertySource("classpath:config/init.properties")
@Configuration
public class MongoConnection {


    private @Value("${db.user}") String user;
    private @Value("${db.password}") String passwd;
    private @Value("${db.host}") String host;
    private @Value("${db.port}") int port;
    private @Value("${db.name}") String dbName;



    @DependsOn("propertyPlaceholderConfigurer")
    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {

        final UserCredentials userCredentials = new UserCredentials(user,passwd);
        final MongoClient client = new MongoClient(host,port);
        return new SimpleMongoDbFactory(client, dbName, userCredentials);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(this.mongoDbFactory());
    }
}
