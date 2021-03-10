package com.peacebird.connection.exception;

import com.peacebird.connection.enums.ResultEnum;
import lombok.Data;

/**
 * @Author: xu.yunfeng01
 * @Date: 2021/3/9
 * @Description:
 */
@Data
public class MyException extends RuntimeException {

    private Integer code;
    private boolean success;
    private String msg;

    public void MyExpection(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.success = resultEnum.isSuccess();
    }
}
