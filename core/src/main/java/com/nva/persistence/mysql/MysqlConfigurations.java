package com.nva.persistence.mysql;

import com.nva.persistence.mysql.config.MysqlConnection;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 * Created by edu on 07/12/2014.
 */
@Profile("mysql")
@Import({MysqlConnection.class})
@Configuration
public interface MysqlConfigurations {
}
