package com.example.skydog.dao;

import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.vo.ResultVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface EvaluateDao {

    void add(Evaluate evaluate);

    void delete(Integer evaluateId);

    Evaluate queryId(Integer evaluateId);

    List<Evaluate> queryCondition();

//    void update(Evaluate evaluate);


//    void batchDelete(List list);
//
//    List<Evaluate> pageQuery();

}