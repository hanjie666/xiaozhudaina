package cn.gpnu.xiaozhudaina.service;

import cn.gpnu.xiaozhudaina.entity.User;

public interface UserService {
    User login(String username, String phoneNumber);
}
