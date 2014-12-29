package com.nva.web;

import com.nva.integration.ApplicationIntegrationConfig;
import com.nva.log.InitLogger;
import com.nva.persistence.PersistenceConfiguration;
import com.nva.persistence.mongodb.repositories.products.ProductsRepository;
import com.nva.persistence.mongodb.repositories.shops.ShopRepository;
import com.nva.persistence.mongodb.repositories.users.UsersRepository;
import com.nva.security.SecurityFilter;
import com.nva.service.ApplicationConfig;
import com.nva.support.CommonConfiguration;
import com.nva.support.dozer.DozerConversion;
import com.nva.web.config.WebMvcConfig;
import com.nva.web.config.WebSecurity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by edu on 07/12/2014.
 */

@PropertySource("classpath:config/init.properties")
@ComponentScan(basePackages = {"com.nva.web.config",
        "com.nva.integration.*",
        "com.nva.support.*",
        "com.nva.persistence.mongodb.repositories.*"})
@Import(
        {  InitLogger.class,
                WebSecurity.class,
                WebMvcConfig.class,
                ApplicationConfig.class,
                ApplicationIntegrationConfig.class,
                PersistenceConfiguration.class,
                SecurityFilter.class,CommonConfiguration.class, ProductsRepository.class, DozerConversion.class, ShopRepository.class, UsersRepository.class})
@Configuration
public interface WebConfigurations {
}
