package com.tjy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tjy
 * @ClassName ProductProvider_Config_8001
 * @Description TODO
 * @Date 2020/3/14 23:59
 * @Version 1.0
 **/

@MapperScan("com.tjy.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class, args);
    }
}
