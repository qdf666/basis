package com.peacebird.connection.xyf.controller;


import com.peacebird.connection.domain.Result;
import com.peacebird.connection.utils.ResultUtil;
import com.peacebird.connection.xyf.entity.TestUser;
import com.peacebird.connection.xyf.service.ITestUserService;
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
public class TestUserController {

    //xyf
    @Autowired
    private ITestUserService testUserService;


    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public Result getUserInfo(HttpServletRequest request) {

        TestUser testUser = testUserService.getById(1);

        return ResultUtil.success(testUser);

    }


}
