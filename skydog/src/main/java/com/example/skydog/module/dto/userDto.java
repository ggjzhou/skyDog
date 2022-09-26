package com.example.skydog.module.dto;

import com.example.skydog.module.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:zhangzhengbin
 * Data:2022/9/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class userDto extends User {
    private String search;
    private String browse;

}
