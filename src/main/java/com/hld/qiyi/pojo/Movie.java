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
}
