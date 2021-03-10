package com.peacebird.connection.exception;

import com.baomidou.mybatisplus.extension.api.IErrorCode;
import com.peacebird.connection.domain.Result;
import com.peacebird.connection.enums.ResultEnum;
import com.peacebird.connection.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: xu.yunfeng01
 * @Date: 2021/3/9
 * @Description:
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handel(Exception e){
        if (e instanceof MyException){
            MyException myException = (MyException) e;
            return ResultUtil.error(myException.getCode(), myException.getMsg(), myException.isSuccess());
        } else {
            return ResultUtil.error(ResultEnum.SYSTEM_ERROR);
        }
    }
}
