package com.tjy.springcloud.service;

import com.tjy.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tjy
 * @ClassName ProductClientServiceFallBack
 * @Description TODO
 * @Date 2020/3/12 18:30
 * @Version 1.0
 **/
@Component //将他纳入容器当中
public class ProductClientServiceFallBack implements ProductClientService{

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"ID="+id+"无效@HystrixCommand","无法找到数据");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
