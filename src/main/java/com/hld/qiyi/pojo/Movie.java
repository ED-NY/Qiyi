package com.hld.qiyi.pojo;

import lombok.Data;
import java.sql.Date;
import java.util.List;

@Data
public class Movie {
    int id;
    String name;
    String director;
    int time_length;
    Date pub_date;
    String description;
    Double rating;
    String pic;
    List<Actor> actors;    //演员信息用于联合查询
    List<Category> categorys;  //电影分类信息用于联合查询
}
