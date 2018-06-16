package com.homepage;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by u_kino07 on 2018. 6. 4..
 */
@Configuration
public class RdbmsConfig {
    @Bean(destroyMethod = "close")
    public BasicDataSource masterDataSource() {
        return new CustomDataSource("master");
    }

    @Bean(destroyMethod = "close")
    public BasicDataSource slaveDataSource() {
        return new CustomDataSource("slave");
    }
}
