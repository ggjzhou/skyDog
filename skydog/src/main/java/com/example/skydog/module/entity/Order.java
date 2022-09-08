package com.example.skydog.module.entity;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data//含有set,get方法
@AllArgsConstructor//含有参构造方法
@NoArgsConstructor//含无参构造方法
public class Order {
    private Integer orderId;
    private Integer cartId;
    private Integer addressId;
    private String orderStatus;
    private Date   createTime;
    private Date   payTime;
    private Date   endTime;

}
