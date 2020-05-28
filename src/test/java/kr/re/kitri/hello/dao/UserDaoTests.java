package kr.re.kitri.hello.dao;

import static org.junit.jupiter.api.Assertions.*;

import kr.re.kitri.hello.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.List;

@SpringBootTest
public class UserDaoTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser(){
        User user = new User("kwon", "아고매",30);
        userDao.insertUser(user);
    }

    @Test
    public void testSelectAllUsers(){
        List<User> users = userDao.selectAllUsers();
        assertTrue(users.size() > 0);

    }
    @Test
    public void testSelectUserByUserId(){
        String userId = "kim";
        User user = userDao.selectUserByUserId(userId);
        assertEquals("soongon", user.getName());
    }
}
