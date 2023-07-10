package com.carlease.carlease.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 车辆信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {
    private Integer id;
    private String name;
    private String url;
    private String msg;
    private String VehicleType;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
