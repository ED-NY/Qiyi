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
}
