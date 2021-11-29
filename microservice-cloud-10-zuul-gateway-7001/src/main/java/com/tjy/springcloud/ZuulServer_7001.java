package com.tjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author tjy
 * @ClassName ZuulServer_7001
 * @Description TODO
 * @Date 2020/3/13 17:50
 * @Version 1.0
 **/

@EnableZuulProxy
@SpringBootApplication
public class ZuulServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer_7001.class, args);
    }
}
