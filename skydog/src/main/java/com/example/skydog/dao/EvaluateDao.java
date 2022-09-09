package com.example.skydog.dao;

import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.vo.ResultVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface EvaluateDao {

   ResultVO add(Evaluate evaluate);

   ResultVO delete(Integer evaluateId);

   Evaluate queryId(Integer evaluateId);

   List<Evaluate> queryCondition();

   ResultVO update(Evaluate evaluate);

   void batchAdd(List<Evaluate> evaluateList);

   void batchDelete(List list);

   List<Evaluate> pageQuery();

}