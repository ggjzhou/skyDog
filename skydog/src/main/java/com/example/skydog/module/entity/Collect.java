package com.example.skydog.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collect {
    private Integer collectId;
    private Integer userId;
    private Integer productId;
    private Date collectTime;

}
