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


    /**
     * 添加收藏
     *
     * @param collect
     * @return
     */
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

    /**
     * 删除收藏
     *
     * @param userId
     * @param productId
     * @return ResultVO
     */
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

    /**
     * 个人收藏查询
     *
     * @param userId
     * @return
     */
    @Override
    public ResultVO getMyCollect(Integer userId) {
        return new ResultVO(collectDao.getMyCollect(userId));
    }


    /**
     * 动态查询列表商品
     *
     * @param collect
     * @return
     */
    @Override
    public ResultVO queryCondition(Collect collect) {
        return new ResultVO(collectDao.queryCondition(collect));
    }


    /**
     * id查询
     *
     * @param collectId
     * @return
     */
    @Override
    public ResultVO queryId(Integer collectId) {
        return new ResultVO(collectDao.queryId(collectId));
    }


    /**
     * 批量删除
     *
     * @param userId
     * @param list
     * @return
     */
    @Override
    public ResultVO batchDelete(Integer userId, List list) {
        collectDao.batchDelete(userId, list);
        return new ResultVO(ResultEnum.DELETE_SUCCESS);
    }

}
