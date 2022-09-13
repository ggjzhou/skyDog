package com.example.skydog.controller;

import com.example.skydog.module.entity.Collect;
import com.example.skydog.module.entity.Evaluate;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.EvaluateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@RestController
@RequestMapping("/evaluate")
@Api(tags = "评价管理控制器")
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;


    @PostMapping("/add")
    @ApiOperation("发布评论")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "evaluate", value = "评论", dataType = "Evaluate"),
    })
    public ResultVO addEvaluate(@RequestBody Evaluate evaluate) {

        return evaluateService.add(evaluate);
    }


    @GetMapping("/delete/{userId}&&{productId}")
    @ApiOperation("删除评论")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户Id", dataType = "Integer"),
            @ApiImplicitParam(name = "evaluate", value = "评论d", dataType = "Integer"),
    })
    public ResultVO deleteEvaluate(@PathVariable Integer userId, @PathVariable Integer productId) {
        return evaluateService.delete(userId, productId);
    }

    @GetMapping("/queryAll/{evaluateId}")
    @ApiOperation("查询用户评价列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "evaluateId", value = "评论Id", dataType = "Integer"),
    })
    public ResultVO queryId(@PathVariable Integer evaluateId) {

        return new ResultVO(evaluateService.queryId((evaluateId)));
    }

}
