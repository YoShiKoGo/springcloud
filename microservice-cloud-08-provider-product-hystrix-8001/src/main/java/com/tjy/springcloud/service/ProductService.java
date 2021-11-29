package com.tjy.springcloud.service;


import com.tjy.springcloud.entities.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
