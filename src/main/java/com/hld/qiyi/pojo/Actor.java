package com.hld.qiyi.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Actor {
    private int id;
    private String name;
    private Date birthday;
    private String sex;
    private String description;
    private String pic;
    private Region region;  //演员区域信息用于联合查询
    private Movie movie;   //主演电影，分数最高
}
