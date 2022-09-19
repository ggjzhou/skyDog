package com.example.skydog.controller;

import com.alipay.api.AlipayApiException;
import com.example.skydog.module.vo.AlipayBean;
import com.example.skydog.service.AliPayService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 沙箱支付
 * @author: 张振彬
 * @create: 2022-09-17
 * @version: 1.0
 */
@RestController
@RequestMapping(value = "/alipay", produces = {"text/html;charset=UTF-8"})
public class AliPayController {


    @Autowired
    private AliPayService aliPayService;



    @PostMapping(value = "/orderPay", produces = "text/html;charset=utf-8")
    @ApiOperation("支付订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "outTradeNo", value = "订单编号", dataType = "String"),
            @ApiImplicitParam(name = "subject", value = "商品名称", dataType = "String"),
            @ApiImplicitParam(name = "totalAmount", value = "付款金额", dataType = "String"),
            @ApiImplicitParam(name = "body", value = "商品描述（可为空）", dataType = "String"),
    })
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        System.out.println(outTradeNo);
        System.out.println(subject);
        System.out.println(totalAmount);
        System.out.println(body);
        return aliPayService.aliPay(alipayBean);
    }
}



