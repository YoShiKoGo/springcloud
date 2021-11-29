package com.tjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author tjy
 * @ClassName HystrixDashboard_9001
 * @Description TODO
 * @Date 2020/3/13 13:32
 * @Version 1.0
 **/

@EnableHystrixDashboard//开启服务监控
@SpringBootApplication
public class HystrixDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_9001.class, args);
    }
}
