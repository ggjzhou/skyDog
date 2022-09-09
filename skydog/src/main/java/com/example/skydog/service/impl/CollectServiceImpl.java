package com.example.skydog.service.impl;

import com.example.skydog.dao.CollectDao;
import com.example.skydog.dao.UserDao;
import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Address;
import com.example.skydog.module.entity.Admin;
import com.example.skydog.module.entity.Collect;
import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.enterprise.inject.New;
import java.util.List;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@Service
@Transactional
public class CollectServiceImpl implements CollectService {


    @Autowired
    private CollectDao collectDao;

    @Override
    public ResultVO add(Collect collect) {
        Collect collect1 = new Collect();
        collect1.setUserId(collect.getUserId());
        collect1.setProductId(collect.getProductId());
        collect1.setCollectTime(collect.getCollectTime()); /**时间*/
        List<Collect> list = collectDao.queryCondition(collect1);
        if (list.isEmpty()) {
            collectDao.add(collect);
            return new ResultVO(ResultEnum.ADD_SUCCESS);
        } else {
            return new ResultVO(ResultEnum.ADD_FAIL, "该商品已收藏");
        }
    }

    @Override
    public ResultVO delete(Integer userId, Integer productId) {
        Collect collect1 = new Collect();
        collect1.setUserId(userId);
        collect1.setProductId(productId);
        List<Collect> list = collectDao.queryCondition(collect1);
        if (list.isEmpty()) {
            return new ResultVO(ResultEnum.DELETE_FAIL, "该商品不存在收藏列表中");
        } else {
            collectDao.delete(userId, productId);
            return new ResultVO(ResultEnum.DELETE_SUCCESS);
        }

    }

    @Override
    public ResultVO queryAll(Integer userId) {
        return new ResultVO(collectDao.queryAll(userId));
    }

    @Override
    public ResultVO queryCondition(Collect collect) {
        return new ResultVO(collectDao.queryCondition(collect));
    }

}
