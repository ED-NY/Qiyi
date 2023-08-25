package com.hld.qiyi.keys;

import lombok.Data;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-16:06
 * @Description: 此对象用redis存储便于操控广告投放时间已经切换
 */
@Data
public class Ads {
    private int id;
    private String name;  //广告名
    private Double time;  //失效时间
    private String pic;   //广告地址
}
