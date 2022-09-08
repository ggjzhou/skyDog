package com.example.skydog.controller;

import com.example.skydog.module.entity.Cart;
import com.example.skydog.module.entity.Category;
import com.example.skydog.service.CartService;
import com.example.skydog.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@RestController
@RequestMapping("/cart")
@Api(tags = "购物车管理控制器")
public class CartController {
    @Autowired
    CartService cartService;

    /**
     * 根据Id查询
     * @param cartId
     * @return
     */
    @GetMapping("/queryById/{categoryId}")
    @ApiOperation("id查询购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "商品种类id", dataType = "Int"),
    })
    public Cart queryById(@PathVariable Integer cartId) {
        Cart cart =cartService.queryId(cartId);
        return cart;
    }

    /**
     * 添加商品
     * @param cart
     * @return
     */
    @GetMapping("/add")
    @ApiOperation("添加购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "category", value = "商品种类", dataType = "Category"),
    })
    public Cart add(@RequestBody Cart cart) {
        cartService.add(cart);
        return cart;
    }
    /**
     * 删除商品
     * @param cartId
     * @return
     */
    @GetMapping("/delete/{categoryId}")
    @ApiOperation("删除购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "商品种类id", dataType = "Int"),
    })
    public Object delete(@PathVariable Integer cartId) {
        cartService.delete(cartId);
        return null;
    }

//    /**
//     * 修改购物车
//     * @param cart
//     * @return
//     */
//    @GetMapping("/add")
//    @ApiOperation("修改购物车")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "product", value = "产品", dataType = "Product"),
//    })
//    public Cart update(@RequestBody Cart cart) {
//        cartService.update(cart);
//        return cart;
//    }
//    /**
//     * 模糊查询商品种类
//     * @param cart
//     * @return
//     */
//    @GetMapping("/queryCondition")
//    @ApiOperation("模糊查询购物车")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "cart", value = "商品种类", dataType = "Category"),
//    })
//    public Object queryById(@RequestBody Cart cart) {
//        List<Cart> carts =cartService.queryCondition(cart);
//        return carts;
//    }
}