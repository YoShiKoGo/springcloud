package com.tjy.springcloud.controller;

import com.tjy.springcloud.entities.Product;
import com.tjy.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tjy
 * @ClassName ProductController
 * @Description TODO
 * @Date 2020/2/2 16:09
 * @Version 1.0
 **/
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
