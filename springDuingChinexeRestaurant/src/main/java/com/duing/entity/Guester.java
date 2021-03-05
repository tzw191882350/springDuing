package com.duing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 员工
 */
@Data
@AllArgsConstructor
public class Guester {

    /**
     * 姓名
     */
    private String name;

    /**
     * 职位
     */
    private String position;
}
