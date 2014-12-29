package com.nva.web;

import com.nva.integration.ApplicationIntegrationConfig;
import com.nva.persistence.PersistenceConfiguration;
import com.nva.security.SecurityFilter;
import com.nva.service.ApplicationConfig;
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
@ComponentScan(basePackages = "com.nva.web.config")
@Import({WebSecurity.class, WebMvcConfig.class, ApplicationConfig.class, ApplicationIntegrationConfig.class, PersistenceConfiguration.class, SecurityFilter.class})
@Configuration
public interface WebConfigurations {
}
