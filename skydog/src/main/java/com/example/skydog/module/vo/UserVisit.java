package com.example.skydog.module.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVisit {
    private String time;//时间搓
    private String province;//省份
    private String city;//城市
    private String UID;//用户ID
    private String adID;//广告ID

}
