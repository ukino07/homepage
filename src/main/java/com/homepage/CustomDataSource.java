package com.homepage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Created by u_kino07 on 2018. 6. 4..
 */
public class CustomDataSource extends BasicDataSource {
    public CustomDataSource(String prefix) {
        Properties props = new Properties();
        InputStream reader = this.getClass()
                .getClassLoader()
                .getResourceAsStream("rdb/mysql.properties");

        try {
            props.load(reader);
        } catch (IOException e) {
            throw new IllegalStateException("Current state is not load property: mysql.properties");
        }

        setDriverClassName(props.getProperty(prefix + "." + "driverClassName"));
        setUrl(props.getProperty(prefix + "." + "url"));
        setUsername(props.getProperty(prefix + "." + "username"));
        setPassword(props.getProperty(prefix + "." + "password"));
        setInitialSize(Integer.parseInt(props.getProperty(prefix + "." + "initialSize")));
        setMaxWaitMillis(Long.parseLong(props.getProperty(prefix + "." + "maxWaitMillis")));
        setMaxTotal(Integer.parseInt(props.getProperty(prefix + "." + "maxTotal")));
        setValidationQuery(props.getProperty(prefix + "." + "validationQuery"));
        setTestOnBorrow(Boolean.parseBoolean(props.getProperty(prefix + "." + "testOnBorrow")));
        setTestOnReturn(Boolean.parseBoolean(props.getProperty(prefix + "." + "testOnReturn")));
        setTestWhileIdle(Boolean.parseBoolean(props.getProperty(prefix + "." + "testWhileIdle")));
        setMaxIdle(Integer.parseInt(props.getProperty(prefix + "." + "maxIdle")));
        setMinIdle(Integer.parseInt(props.getProperty(prefix + "." + "minIdle")));
        setTimeBetweenEvictionRunsMillis(Long.parseLong(props.getProperty(prefix + "." + "timeBetweenEvictionRunsMillis")));
    }

}
