package com.hld.qiyi.service.Account;

import com.hld.qiyi.mapper.AccountMapper;
import com.hld.qiyi.pojo.Account;
import com.hld.qiyi.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-9:54
 * @Description:用户账户管理服务层
 */
@Service
public class AccountServiceImp implements AccountService{
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private RedisUtils redisUtils;

    @Override
    public List<Account> getAccountList() {
        return accountMapper.getAccountList();
    }

    @Override
    public Account getALoginByPass(String name, String password) {
        return accountMapper.getALoginByPass(name,password)!=null ? accountMapper.getALoginByPass(name,password) : null;
    }

    @Override
    public Account getALoginByPhone(String phone, String password) {
        return accountMapper.getALoginByPhone(phone,password)!=null ? accountMapper.getALoginByPhone(phone,password) : null;
    }

    @Override
    public boolean addAccount(String name, String password, String phone) {
        return accountMapper.addAccount(name,password,phone)>0;
    }

    @Override
    public boolean delAccount(int id) {
        return accountMapper.delAccount(id)>0;
    }

    @Override
    public boolean changeAccountName(String name, int id) {
        return accountMapper.changeAccountName(name,id)>0;
    }

    @Override
    public boolean changeAccountPassword(String password, int id) {
        return accountMapper.changeAccountPassword(password,id)>0;
    }

    @Override
    public boolean changeAccountPhone(String phone, int id) {
        return accountMapper.changeAccountPhone(phone,id)>0;
    }
}
