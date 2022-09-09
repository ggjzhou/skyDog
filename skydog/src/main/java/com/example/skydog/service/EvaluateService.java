package com.example.skydog.service;


import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.vo.ResultVO;

import java.util.*;


public interface EvaluateService {

    ResultVO add(Evaluate evaluate);

    ResultVO delete(Integer evaluateId);

    Evaluate queryId(Integer evaluateId);

    List<Evaluate> queryCondition();

    ResultVO update(Evaluate evaluate);

    void batchAdd(List<Evaluate> evaluateList);

    void batchDelete(List list);

    List<Evaluate> pageQuery();

    List<Evaluate> queryByGrade(String grade);

    List<Evaluate> queryByImg();

    List<Evaluate> queryByVideo();

}