package com.peacebird.connection.xyf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xu.yunfeng01
 * @Date: 2021/3/11
 * @Description: 测试存储过程
 */
@Data
public class Call implements Serializable {

    private Integer out_id;

    private String username;

    private String password;


}
