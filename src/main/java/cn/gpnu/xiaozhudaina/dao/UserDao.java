package cn.gpnu.xiaozhudaina.dao;

import cn.gpnu.xiaozhudaina.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public User findUserById(@Param("userId") Integer userId);
}
