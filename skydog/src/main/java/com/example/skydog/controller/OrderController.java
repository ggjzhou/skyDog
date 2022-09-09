package com.example.skydog.controller;

import com.example.skydog.dao.OrderDao;
import com.example.skydog.module.entity.Admin;
import com.example.skydog.module.entity.Order;
import com.example.skydog.service.OrderService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/add")
    @ApiOperation("添加订单")
    public Order add(@RequestBody Order order) {
        orderService.add(order);
        return order;
    }
    @GetMapping("/delete/{orderId}")
    @ApiOperation("删除订单")
    public Object delete(@PathVariable Integer orderId) {
        orderService.delete(orderId);
        return true;
    }
    @GetMapping("/update")
    @ApiOperation("修改订单信息")
    public Order update(@RequestBody Order order) {
        orderService.update(order);
        return order;
    }

    @GetMapping("/queryById/{orderId}")
    @ApiOperation("按id查询订单")
    public List<Order> queryById(@PathVariable Integer orderId) {
        return orderService.queryId(orderId);

    }

}
