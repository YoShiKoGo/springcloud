package com.tjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tjy
 * @ClassName EurekaServer_6002
 * @Description TODO
 * @Date 2020/2/2 22:28
 * @Version 1.0
 **/
@EnableEurekaServer//标识一个Eureka Server 服务注册中心
@SpringBootApplication
public class EurekaServer_6001 {
     public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6001.class, args);
     }
}
