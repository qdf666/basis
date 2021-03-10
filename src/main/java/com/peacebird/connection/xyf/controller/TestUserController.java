package com.peacebird.connection.xyf.controller;


import com.peacebird.connection.domain.Result;
import com.peacebird.connection.utils.ResultUtil;
import com.peacebird.connection.xyf.entity.TestUser;
import com.peacebird.connection.xyf.service.ITestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xyf
 * @since 2021-03-06
 */
@RestController
@RequestMapping("/xyf/test-user")
@Api(tags = "用户操作")
public class TestUserController {

    //xyf
    @Autowired
    private ITestUserService testUserService;


    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public Result getUserInfo(HttpServletRequest request) {

        TestUser testUser = testUserService.getById(1);

        return ResultUtil.success(testUser);
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public Result getUserById(HttpServletRequest request) {

        TestUser testUser = testUserService.getTestUserById(2);

        return ResultUtil.success(testUser);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Result insert(HttpServletRequest request) {

        TestUser testUser = testUserService.getTestUserById(2);

        return ResultUtil.success(testUser);
    }



}
