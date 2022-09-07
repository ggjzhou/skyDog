package com.example.skydog.service;

import com.example.skydog.module.entity.Product;

public interface CollectService {
    void add(Product product);

    void delete(Integer productId);
}
