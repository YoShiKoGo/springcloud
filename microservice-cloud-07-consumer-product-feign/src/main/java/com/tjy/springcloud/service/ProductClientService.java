package com.tjy.springcloud.service;

import com.tjy.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author tjy
 * @ClassName ProductClientService
 * @Description TODO
 * @Date 2020/3/12 10:07
 * @Version 1.0
 **/
//fallback,指定熔断处理类
@FeignClient(value = "microservice-product",fallback = ProductClientServiceFallBack.class) //指定调用的微服务名称
public interface ProductClientService {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();
}
