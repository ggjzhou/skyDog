package com.example.skydog.controller;

import com.example.skydog.module.entity.Product;
import com.example.skydog.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;
import java.util.Objects;

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
    @ApiOperation("id查询商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "产品id", dataType = "Int"),
    })
    public Product queryById(@PathVariable Integer productId) {
        Product product =productService.queryId(productId);
        return product;
    }

    /**
     * 添加商品
     * @param product
     * @return
     */
    @GetMapping("/add")
    @ApiOperation("添加商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "product", value = "产品", dataType = "Product"),
    })
    public Product add(@RequestBody Product product) {
        productService.add(product);
        return product;
    }
    /**
     * 删除商品
     * @param productId
     * @return
     */
    @GetMapping("/delete/{productId}")
    @ApiOperation("删除商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "产品id", dataType = "Int"),
    })
    public Object delete(@PathVariable Integer productId) {
        productService.delete(productId);
        return true;
    }

    /**
     * 修改商品
     * @param product
     * @return
     */
    @GetMapping("/add")
    @ApiOperation("修改商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "product", value = "产品", dataType = "Product"),
    })
    public Product update(@RequestBody Product product) {
        productService.update(product);
        return product;
    }

    /**
     * 模糊查询商品
     * @param product
     * @return
     */
    @GetMapping("/queryCondition")
    @ApiOperation("id查询商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "产品id", dataType = "Int"),
    })
    public Object queryById(@RequestBody Product product) {
        List<Product> products =productService.queryCondition(product);
        return products;
    }

}
