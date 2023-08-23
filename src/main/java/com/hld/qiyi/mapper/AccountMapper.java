package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-9:53
 * @Description:用户账户数据库操作
 */
@Mapper
public interface AccountMapper {
    List<Account> getAccountList();

    Account getALoginByPass(@Param("name")String name,@Param("password")String password);

    Account getALoginByPhone(@Param("phone")String phone,@Param("password")String password);

    int addAccount(@Param("name")String name,@Param("password")String password,@Param("phone")String phone);

    int delAccount(@Param("id")int id);

    int changeAccountName(@Param("name")String name,@Param("id")int id);

    int changeAccountPassword(@Param("password")String password,@Param("id")int id);

    int changeAccountPhone(@Param("phone")String phone,@Param("id")int id);
}
