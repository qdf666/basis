package com.peacebird.connection.xyf.service.impl;

import com.peacebird.connection.xyf.entity.Call;
import com.peacebird.connection.xyf.entity.TestUser;
import com.peacebird.connection.xyf.mapper.TestUserMapper;
import com.peacebird.connection.xyf.service.ITestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xyf
 * @since 2021-03-06
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements ITestUserService {

    @Autowired
    TestUserMapper testUserMapper;

    @Override
    public TestUser getTestUserById(int id) {
        return  testUserMapper.queryById(id);

    }

    /**
    * @Description:
    * @Param:
    * @return:
    * @Author: xyf
    * @Date: 2021/3/11
    */
    @Override
    public int getTestCallID(Call call) {
        return testUserMapper.testcall(call);
    }
}
