package com.hld.qiyi.service.User;

import com.hld.qiyi.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-19:33
 * @Description:管理员账户服务层接口
 */
public interface UserService {
    User login(String name,String password);
    List<User> userList();

    Boolean addUser(String name,String password);

    Boolean deleteUser(int uid);
}
