package com.example.skydog.dao;

import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.entity.Product;

public interface CollectDao {
    void add(Product product);

    void delete(Integer productId);
}
