package com.peacebird.connection.xyf.mapper;

import com.peacebird.connection.xyf.entity.Call;
import com.peacebird.connection.xyf.entity.TestUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xyf
 * @since 2021-03-06
 */
@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {

    public TestUser queryById(int id);

    public void testinsert(@Param("testUser") TestUser testUser);

    public int testcall(Call call);

}
