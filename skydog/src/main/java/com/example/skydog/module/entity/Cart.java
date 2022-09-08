package com.example.skydog.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Author:甘舟
 * Data:2022/9/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Integer cartId;
    private Integer userId;
    private Integer productId;
    private Integer scaleId;
    private Integer featureId;
    private Integer productCount;
    private Date joinTime;
}
