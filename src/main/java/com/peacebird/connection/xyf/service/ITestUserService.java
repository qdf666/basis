package com.peacebird.connection.xyf.service;

import com.peacebird.connection.xyf.entity.Call;
import com.peacebird.connection.xyf.entity.TestUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.peacebird.connection.xyf.mapper.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xyf
 * @since 2021-03-06
 */
@Service
public interface ITestUserService extends IService<TestUser> {

    TestUser getTestUserById(int id);

//    测试调用存储过程
    int getTestCallID(Call call);


}
