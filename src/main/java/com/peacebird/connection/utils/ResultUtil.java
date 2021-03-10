package com.peacebird.connection.utils;

import com.peacebird.connection.domain.Result;
import com.peacebird.connection.enums.ResultEnum;

/**
 * @Package: com.peacebird.connection.utils
 * @ClassName: ResultUtil
 * @Author: xyf
 * @CreateTime: 2021/3/6 16:41
 * @Description: todo
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result successNoData(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

    public static Result cussuccess(Integer code, Object object) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setData(resultEnum.getMsg());
        return result;
    }

    public static Result error(Integer code, String msg, boolean issuccess) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(issuccess);
        return result;
    }

    public static Result errorWithData(Integer code, String msg, Object object) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

}
