package com.hld.qiyi.service.User;

import com.hld.qiyi.controller.UserController;
import com.hld.qiyi.mapper.UserMapper;
import com.hld.qiyi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-19:33
 * @Description:管理员账户服务层实现
 */
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        User user = userMapper.getLogin(name,password);
        if(user != null){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public List<User> userList() {
        return userMapper.queryUserList();
    }

    @Override
    public Boolean addUser(String name,String password) {
        boolean is_add = false;
        if(userMapper.insertUser(name,password)>0){
            is_add = true;
        }
        return is_add;
    }
}
