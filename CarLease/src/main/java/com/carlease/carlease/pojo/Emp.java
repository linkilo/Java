package com.carlease.carlease.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 员工信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String sex;
    private String url;
    private LocalDateTime createTime;
}
