package com.kfhstu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类，实行序列化,用于设置查询结果
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member implements Serializable {
    private Long id;
    private String name;
    private String pwd;
    private String mobile;
    private String email;
    private Integer gender;
}
