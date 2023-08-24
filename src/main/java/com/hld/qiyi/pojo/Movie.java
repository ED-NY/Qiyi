package com.hld.qiyi.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Movie {
    int id;
    String name;
    String director;
    int time_length;
    Date pub_data;
    String description;
    double rating;
    int actor;    //演员信息用于联合查询
    int category;  //电影分类信息用于联合查询
}
