package com.example.skydog.controller;

import com.example.skydog.module.entity.Category;
import com.example.skydog.module.entity.Product;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public ResultVO queryById(@PathVariable Integer productId) {
        return productService.queryId(productId);
    }

    /**
     * 添加商品
     * @param product
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("添加商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "product", value = "产品", dataType = "Product"),
    })
    public ResultVO add(@RequestBody Product product) {
        return productService.add(product);
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
    public ResultVO delete(@PathVariable Integer productId) {
        return productService.delete(productId);
    }

    /**
     * 修改商品
     * @param product
     * @return
     */
    @PostMapping("/update")
    @ApiOperation("修改商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "product", value = "产品", dataType = "Product"),
    })
    public ResultVO update(@RequestBody Product product) {
        return productService.update(product);
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
    public ResultVO queryById(@RequestBody Product product) {
        return productService.queryCondition(product);
    }

    /**
     * 商品名查询
     * @param productName
     * @return
     */
    @GetMapping("/queryByName/{productName}")
    @ApiOperation("商品名查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productName", value = "商品名", dataType = "String"),
    })
    public ResultVO queryByName(@PathVariable String productName) {
        return productService.queryByName(productName);
    }

    @GetMapping("/queryByCategory")
    @ApiOperation("商品种类查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "category", value = "商品种类", dataType = "Category"),
    })
    public ResultVO queryByCategory(@RequestBody Category category) {
        return productService.queryByCategory(category);
    }
    @GetMapping("/queryByPrice")
    @ApiOperation("商品种类查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "category", value = "商品种类", dataType = "Category"),
    })
    public ResultVO queryByPrice(@RequestBody Category category) {
        return productService.queryByCategory(category);
    }
}
