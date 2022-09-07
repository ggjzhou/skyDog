package com.example.skydog.service;

import com.example.skydog.module.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Service
public interface CategoryService {

   Boolean add(Category category);

   Boolean delete(Integer categoryId);

   Boolean update(Category category);

   Category queryId(Integer categoryId);

   List<Category> queryCondition(Category category);

}