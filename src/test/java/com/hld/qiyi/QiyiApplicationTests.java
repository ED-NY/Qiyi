package com.hld.qiyi;

import com.hld.qiyi.mapper.UserMapper;
import com.hld.qiyi.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QiyiApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<User> userlist =  userMapper.queryUserList();
        for(User user: userlist){
            System.out.println(user);
        }
    }

}

