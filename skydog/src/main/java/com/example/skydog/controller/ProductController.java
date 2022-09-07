package com.example.skydog.controller;

import com.example.skydog.module.entity.Product;
import com.example.skydog.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

/**
 * Author:甘舟
 * Data:2022/9/7
 */

@RestController
@RequestMapping("/product")
@Api(tags = "商品管理控制器")
public class ProductController {
    @Autowired
    ProductService productService;

    /**
     * 根据Id查询
     * @param productId
     * @return
     */
    @GetMapping("/queryById/{productId}")
    @ApiOperation("id查询房源")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "产品id", dataType = "Int"),
    })
    public Product queryById(@PathVariable Integer productId) {
        Product product =productService.queryId(productId);
        return product;
    }
}
