package com.example.skydog.service;


import com.example.skydog.module.entity.Evaluate;

import java.util.*;


public interface EvaluateService {

   void add(Evaluate evaluate);

   void delete(int evaluateId);

   List<Evaluate> queryId(int evaluateId);


   List<Evaluate> queryCondition();

   void update(Evaluate evaluate);

   void batchAdd(List<Evaluate> evaluateList);

   void batchDelete(List list);

   List<Evaluate> pageQuery();

   List<Evaluate> queryByGrade(String grade);

   List<Evaluate> queryByImg();

   List<Evaluate> queryByVideo();

}