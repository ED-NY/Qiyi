package com.hld.qiyi.controller;

import com.hld.qiyi.pojo.Account;
import com.hld.qiyi.service.Account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-19:33
 * @Description:用户账户管理控制层
 */

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 查询用户账户列表
     * 验证成功
     * @return
     */
    @PostMapping("/user/accountlist")
    public List<Account> getAccountList(){
        return accountService.getAccountList();
    }

    /**
     * 用户通过账号密码登录
     * 验证通过
     * @param name
     * @param password
     * @return
     */
    @PostMapping("/user/accountloginpass")
    public Account getALoginByPass(String name,String password){
        return accountService.getALoginByPass(name,password);
    }

    /**
     * 用户通过手机号码登录
     * 验证通过
     * @param phone
     * @param password
     * @return
     */
    @PostMapping("/user/accountloginphone")
    public Account getALoginByPhone(String phone,String password){
        return accountService.getALoginByPhone(phone,password);
    }

    /**
     * 添加用户账户，金额设置为0
     * 验证通过
     * @param name
     * @param password
     * @param phone
     * @return
     */
    @PostMapping("/user/accountadd")
    public boolean addAccount(String name,String password,String phone){
        return accountService.addAccount(name,password,phone);
    }

    /**
     * 删除用户通过id
     * 验证通过
     * @param id
     * @return
     */
    @PostMapping("/user/accountdel")
    public boolean delAccount(int id){
        return accountService.delAccount(id);
    }

    /**
     * 更改用户名通过id
     * 测试通过
     * @param name
     * @param id
     * @return
     */
    @PostMapping("/user/accountchangename")
    public boolean changeAccountName(String name,int id){
        return accountService.changeAccountName(name,id);
    }

    /**
     * 更改用户密码通过id
     * 验证通过
     * @param password
     * @param id
     * @return
     */
    @PostMapping("/user/accountchangepass")
    public boolean changeAccountPassword(String password,int id){
        return accountService.changeAccountPassword(password,id);
    }

    /**
     * 更改用户手机号通过id
     * 验证通过
     * @param phone
     * @param id
     * @return
     */
    @PostMapping("/user/accountchangephone")
    public boolean changeAccountPhone(String phone,int id){
        return accountService.changeAccountPhone(phone,id);
    }

}
