package com.tjy.springcloud.controller;

import com.tjy.springcloud.entities.Product;
import com.tjy.springcloud.service.ProductClientService;
import javafx.beans.DefaultProperty;
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
public class ProductController_Consumer_Feign {

    @Autowired
    ProductClientService service;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product){
        return service.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> add(){
        return service.list();
    }
}
