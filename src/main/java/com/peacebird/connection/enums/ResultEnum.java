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

    SUCCESS(0, "成功"),

    SYSTEM_ERROR(1, "执行失败"),

    PARAM_IS_NULL(2, "参数为空"),

    USERCODE_IS_NULL(3, "参数 userCode 不允许为空"),

    STORECODE_IS_NULL(4, "参数 storeCode 不允许为空"),

    RESULT_IS_NULL(5, "查询结果为空");


    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
