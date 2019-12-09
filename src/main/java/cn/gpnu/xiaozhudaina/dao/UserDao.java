package cn.gpnu.xiaozhudaina.dao;

import cn.gpnu.xiaozhudaina.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * 通过Id查询用户
     * @param userId
     * @return
     */
    User findUserById(@Param("userId") Integer userId);

    User findUserByUsername(@Param("username") String username);

}
