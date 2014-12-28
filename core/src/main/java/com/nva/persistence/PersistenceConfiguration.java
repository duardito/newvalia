package com.nva.persistence;

import com.nva.persistence.mongodb.MongoConfigurations;
import com.nva.persistence.mysql.MysqlConfigurations;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 * Created by edu on 07/12/2014.
 */
@ComponentScan(basePackages={"com.nva.persistence"})
@Profile("${active.profile}")
@Import({MysqlConfigurations.class, MongoConfigurations.class})
@Configuration
public class PersistenceConfiguration {


}
