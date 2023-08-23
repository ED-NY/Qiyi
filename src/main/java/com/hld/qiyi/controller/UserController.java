package com.hld.qiyi.controller;

import com.hld.qiyi.mapper.UserMapper;
import com.hld.qiyi.pojo.User;
import com.hld.qiyi.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-18:10
 * @Description:管理员账户控制层
 * */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     *登录，通过post请求传入两个参数，登录成功返回user对象
     * 否则返回null
     * @param name
     * @param password
     * @return
     */
    @PostMapping("/admin/login")
    public User adminLogin(String name,String password){
        return userService.login(name,password);
    }

    @PostMapping("/admin/userlist")
    public List<User> userList(){
        return userService.userList();
    }

    /**
     * 注册，返回true注册成功，false注册失败
     * @param name
     * @param password
     * @return
     */
    @PostMapping("/admin/adduser")
    public boolean addUser(String name,String password){
        return userService.addUser(name,password);
    }

}
