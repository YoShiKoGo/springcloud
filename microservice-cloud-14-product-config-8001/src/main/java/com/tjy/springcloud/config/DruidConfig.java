package com.tjy.springcloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author tjy
 * @ClassName DruidConfig
 * @Description TODO
 * @Date 2020/3/15 20:53
 * @Version 1.0
 **/

@Configuration
public class DruidConfig {

    @RefreshScope
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
}
