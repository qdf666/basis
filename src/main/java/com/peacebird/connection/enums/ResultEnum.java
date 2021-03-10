package com.peacebird.connection.enums;

import lombok.Getter;

/**
 * @Package: com.peacebird.connection.enums
 * @ClassName: ResultEnum
 * @Author: xyf
 * @CreateTime: 2021/3/6  16:49
 * @Description: todo
 */
@Getter
public enum ResultEnum {


    SUCCESS(true,0,"成功"),


    SYSTEM_ERROR(false,40000,"系统异常")

    ;
    private boolean success;

    private Integer code;

    private String msg;

    ResultEnum(boolean success, Integer code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

}
