package com.example.skydog.dao;

import com.example.skydog.module.entity.Evaluate;

import java.util.*;


public interface EvaluateDao {

   void add(Evaluate evaluate);

   void delete(int evaluateId);

   Evaluate queryId(int evaluateId);

   List<Evaluate> queryCondition();

   void update(Evaluate evaluate);

   void batchAdd(List<Evaluate> evaluateList);

   void batchDelete(List list);

   List<Evaluate> pageQuery();

}