package com.hld.qiyi.service.Account;

import com.hld.qiyi.mapper.AccountMapper;
import com.hld.qiyi.pojo.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-9:54
 * @Description:用户账户管理服务层接口
 */
public interface AccountService {
    List<Account> getAccountList();

    Account getALoginByPass(String name,String password);

    Account getALoginByPhone(String phone,String password);

    boolean addAccount(String name,String password,String phone);

    boolean delAccount(int id);

    boolean changeAccountName(String name,int id);

    boolean changeAccountPassword(String password,int id);

    boolean changeAccountPhone(String phone,int id);

}
