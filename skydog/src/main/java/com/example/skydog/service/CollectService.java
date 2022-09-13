package com.example.skydog.service;

import com.example.skydog.module.entity.Collect;
import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.ResultVO;

import java.util.List;


public interface CollectService {

    ResultVO add(Collect collect);

    ResultVO delete(Integer userId, Integer productId);

    ResultVO getMyCollect(Integer userId);

    ResultVO queryCondition(Collect collect);

    ResultVO queryId(Integer collectId);

    ResultVO batchDelete(Integer userId, List list);


}
