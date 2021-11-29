package com.tjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tjy
 * @ClassName EurekaServer_Config_6001
 * @Description TODO
 * @Date 2020/3/14 23:51
 * @Version 1.0
 **/

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class, args);
    }
}
