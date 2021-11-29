package com.tjy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tjy
 * @ClassName ConfigBean
 * @Description TODO
 * @Date 2020/2/2 17:21
 * @Version 1.0
 **/
@Configuration//配置类
public class ConfigBean {

    @LoadBalanced//实现负载均衡，调用地址可以变为服务名称
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
