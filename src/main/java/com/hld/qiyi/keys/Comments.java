package com.hld.qiyi.keys;

import lombok.Data;

import java.sql.Date;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-16:31
 * @Description:
 */
@Data
public class Comments {
    private int id;
    private int movieid;  //评论电影
    private int accountid;  //评论人
    private int inaccountid; //嵌套评论人id
    private Date date;      //评论时间
    private String comment;  //评论语句
}
