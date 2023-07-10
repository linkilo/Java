package com.carlease.carlease.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * 分页类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {
    private Long total;
    private List<?> rows;
}
