package com.tjy.springcloud.controller;

import com.tjy.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author tjy
 * @ClassName ProductController
 * @Description TODO
 * @Date 2020/2/2 17:25
 * @Version 1.0
 **/
@RestController
public class ProductController_Consumer {

//    static final String REST_URL_PREFIX = "http://localhost:8001";
    //ip修改为服务名
    static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product){
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add",product,boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id, Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> add(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list",List.class);
    }
}
