package com.example.skydog.dao;


import com.example.skydog.module.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Mapper
public interface CategoryDao {

   void add(Category category);

   void delete(Integer categoryId);

   void update(Category category);

   List queryCondition(Category category);

   Category queryId(Integer categoryId);

}