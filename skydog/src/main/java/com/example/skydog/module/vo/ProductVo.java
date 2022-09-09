package com.example.skydog.module.vo;

import com.example.skydog.module.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:甘舟
 * Data:2022/9/7
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVo extends Product {
    private Double lowPrice;
    private Double highPrice;
    private Integer currentPage;
    private Integer pageSize;
}
