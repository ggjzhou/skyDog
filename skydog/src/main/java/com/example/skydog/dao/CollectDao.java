package com.example.skydog.dao;

import com.example.skydog.module.entity.Collect;
import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@Mapper
public interface CollectDao {

    void add(Collect collect);

    void delete(Integer userId,Integer productId);

    List<Collect> queryAll (Integer userId);

    Collect queryId(Integer collectId);

    List<Collect> queryCondition(Collect collect);

}
