package com.example.skydog.service.impl;

import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class EvaluateServiceImpl implements EvaluateService {


   @Autowired
   private EvaluateService evaluateService;

   public ResultVO add(Evaluate evaluate) {
//      evaluateService.add(evaluate);
//      return new ResultVO(ResultEnum.ADD_SUCCESS);
      return null;
   }
   

   public ResultVO delete(Integer evaluateId) {
      // TODO: implement
      return null;
   }
   

   public Evaluate queryId(Integer evaluateId) {
      // TODO: implement
      return null;
   }
   

   public List<Evaluate> queryCondition() {
      // TODO: implement
      return null;
   }
   

   public ResultVO update(Evaluate evaluate) {
      // TODO: implement
      return null;
   }
   

   public void batchAdd(List<Evaluate> evaluateList) {
      // TODO: implement
   }
   

   public void batchDelete(List list) {
      // TODO: implement
   }
   

   public List<Evaluate> pageQuery() {
      // TODO: implement
      return null;
   }
   

   public List<Evaluate> queryByGrade(String grade) {
      // TODO: implement
      return null;
   }
   

   public List<Evaluate> queryByImg() {
      // TODO: implement
      return null;
   }
   

   public List<Evaluate> queryByVideo() {
      // TODO: implement
      return null;
   }

}