package com.example.skydog.service.impl;

import com.alipay.api.AlipayApiException;
import com.example.skydog.module.vo.AlipayBean;
import com.example.skydog.service.AliPayService;
import com.example.skydog.utils.AlipayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-19
 * @version: 1.0
 */
@Service
public class AliPayServiceImpl implements AliPayService {

    @Autowired
    private AlipayUtil alipayUtil;

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {

        return alipayUtil.pay(alipayBean);
    }
}
