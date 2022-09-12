package com.example.skydog.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Author:甘舟
 * Data:2022/9/7
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private Integer productId;
    private Integer userId;
    private Integer adminId;
    private Integer categoryId;
    private String productName;
    private Double productPrice;
    private String productDec;//商品描述
    private String productStatus;//商品状态
    private Long productSale;//商品销量
    private Double productGrade;//商品评分
}
