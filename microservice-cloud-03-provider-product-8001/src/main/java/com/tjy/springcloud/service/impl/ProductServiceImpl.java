package com.tjy.springcloud.service.impl;

import com.tjy.springcloud.entities.Product;
import com.tjy.springcloud.mapper.ProductMapper;
import com.tjy.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tjy
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Date 2020/2/2 16:06
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
