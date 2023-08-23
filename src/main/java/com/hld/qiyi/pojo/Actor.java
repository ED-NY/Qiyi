package com.hld.qiyi.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class Actor {
    int id;
    String name;
    Date birthday;
    String sex;
    String description;
    String pic;
    //演员的其他属性使用redis管理，例如粉丝属性，主页访问流量等
}
