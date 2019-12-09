package cn.gpnu.xiaozhudaina.dao;


import cn.gpnu.xiaozhudaina.BaseTest;
import cn.gpnu.xiaozhudaina.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    public UserDao userDao;

    @Test
    public void testFindUserById(){
        System.out.println("123");
        User user = userDao.findUserById(1);
        System.out.println(user.username);
        System.out.println(user.password);
        System.out.println(user.phoneNumber);
        System.out.println(user.dormAddr);
    }
    @Test
    public void testFindUserByUsername(){
        User user = userDao.findUserByUsername("Cr");
        System.out.println(user.username);
        System.out.println(user.password);
        System.out.println(user.phoneNumber);
        System.out.println(user.dormAddr);
    }
}
