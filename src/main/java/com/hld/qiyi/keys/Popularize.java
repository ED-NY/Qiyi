package com.hld.qiyi.keys;

import lombok.Data;

import java.sql.Date;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-16:03
 * @Description: 此对象使用redis存储便于获取编辑推广页面（轮播图）过期时间
 */
@Data
public class Popularize {
    private int id;
    private int movieid;  //推广电影名
    private Date date;   //时间
    private Double time;   //失效时间
    private String pic;    //图片路径
}
