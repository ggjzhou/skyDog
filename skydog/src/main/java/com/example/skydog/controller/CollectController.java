package com.example.skydog.controller;

import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Address;
import com.example.skydog.module.entity.Collect;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.CollectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@RestController
@RequestMapping("/collect")
@Api(tags = "收藏管理控制器")
public class CollectController {

    @Autowired
    private CollectService collectService;


    /**
     * 添加收藏
     *
     * @param collect
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("添加收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "collect", value = "收藏对象", dataType = "Collect"),
    })
    public ResultVO addProduct(@RequestBody Collect collect) {

        return collectService.add(collect);
    }


    @GetMapping("/delete/{userId}&&{productId}")
    @ApiOperation("删除收藏商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户Id", dataType = "Integer"),
            @ApiImplicitParam(name = "productId", value = "商品Id", dataType = "Integer"),
    })
    public ResultVO deleteProduct(@PathVariable Integer userId, @PathVariable Integer productId) {
        return collectService.delete(userId, productId);
    }

    /**
     * 根据Id查询
     * @param userId
     * @return
     */
    @GetMapping("/queryAll/{userId}")
    @ApiOperation("查询用户收藏列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户Id", dataType = "Integer"),
    })
    public ResultVO queryAll(@PathVariable Integer userId) {
        return collectService.queryAll((userId));
    }


    /**
     * 动态查询列表商品
     * @param collect
     * @return
     */
    @GetMapping("/queryCondition")
    @ApiOperation("动态查询列表商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "collect", value = "收藏对象", dataType = "Collect"),
    })
    public ResultVO queryCondition(@RequestBody Collect collect) {
        collectService.queryCondition(collect);
        return new ResultVO(collectService.queryCondition(collect));
    }
}
