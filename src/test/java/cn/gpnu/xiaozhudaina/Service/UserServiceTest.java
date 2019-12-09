package cn.gpnu.xiaozhudaina.Service;

import cn.gpnu.xiaozhudaina.BaseTest;
import cn.gpnu.xiaozhudaina.entity.User;
import cn.gpnu.xiaozhudaina.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserServiceTest extends BaseTest {
    @Autowired
    public UserService userService;

    @Test
    public void testLogin(){
        String username = "Cr";
        String password = "123";
        User user = userService.login(username, password);
        assertEquals("13192700591".equals(user.phoneNumber),true);
    }
}
