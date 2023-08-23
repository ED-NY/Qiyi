package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-19:33
 * @Description:管理员账户xml操作接口
 */
@Mapper
public interface UserMapper {
    User getLogin(@Param("name")String name,@Param("password") String password);
    List<User> queryUserList();

    int insertUser(@Param("name")String name,@Param("password")String password);

    int deleteUser(@Param("uid")int uid);

    int changeAdmin(@Param("uid")int uid,@Param("name") String name,@Param("password")String password);
}
