package com.example.skydog.controller;

import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Address;
import com.example.skydog.module.entity.Collect;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.CollectService;
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
public class CollectController {

    @Autowired
    private CollectService collectService;


    @PostMapping("/add")
    public ResultVO addProduct(@RequestBody Collect collect) {
        return collectService.add(collect);
    }

    @GetMapping("/delete/{userId}&&{productId}")
    public ResultVO deleteProduct(@PathVariable Integer userId, @PathVariable Integer productId) {
        return collectService.delete(userId, productId);
    }

    @GetMapping("/queryAll/{userId}")
    public ResultVO queryAll(@PathVariable Integer userId) {
        return collectService.queryAll((userId));
    }


    @GetMapping("/queryCondition")
    public ResultVO queryId(@RequestBody Collect collect) {
        collectService.queryCondition(collect);
        return new ResultVO(collectService.queryCondition(collect));
    }
}
