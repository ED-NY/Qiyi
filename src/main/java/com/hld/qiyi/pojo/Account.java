package com.hld.qiyi.pojo;

import lombok.Data;

@Data
public class Account {
    int id;
    String name;
    double money;   //在这里money表示账户金额，由于并发属性，这里只能对金额进行查看，真正的管理使用redis
    String phone;
}
