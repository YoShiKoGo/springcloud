package com.tjy.springcloud.controller;

import com.sun.xml.internal.ws.api.FeatureListValidatorAnnotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tjy
 * @ClassName ConfigClient
 * @Description TODO
 * @Date 2020/3/14 23:02
 * @Version 1.0
 **/
@RestController
public class ConfigClient {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/config")
    public String config() {
        String content = "applicationName: " + applicationName + ", port: " + port;
        System.out.println(content);
        return content;
    }
}
