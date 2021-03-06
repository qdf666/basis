package com.peacebird.connection.domain;

import lombok.Data;

/**
 * @Package: com.peacebird.connection.domain
 * @ClassName: Result
 * @Author: xyf
 * @CreateTime: 2021/3/6  16:54
 * @Description: todo
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

}
