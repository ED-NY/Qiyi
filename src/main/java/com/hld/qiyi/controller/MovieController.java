package com.hld.qiyi.controller;

import com.hld.qiyi.pojo.Movie;
import com.hld.qiyi.service.Movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-15:16
 * @Description:
 */
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/movie/querymovielist")
    public List<Movie> queryMovieList(String name, String director, Double rating, Date pub_date, String aname, String cname){
        return movieService.queryMovieList(name,director,rating,pub_date,aname,cname);
    }

    /**
     * 新增电影，其余信息涉及到
     * 两个中间表,设置默认内容为空
     * 实际添加信息（name,director,time_length,pub_date,description,rating,pic）
     * @param movie 传入的movie对象仅传入movie相关信息不包含演员等信息
     * @return bool
     */
    @PostMapping("/movie/addmovie")
    public boolean addMovie(Movie movie){
        boolean in = movieService.addMovie(movie);
        int id = movieService.getIdByName(movie.getName());
        movieService.addMovieActor(id,10);
        movieService.addMovieCategory(id,8);
        return in;
    }

    /**
     * 添加电影基本信息时同时调用设置初始值，否则联合查询查不到
     * @param movieid 电影id行内获取
     * @param actorid 演员id添加演员后通过连接表获取
     * @return bool
     */
    @PostMapping("/movie/addmovieactor")
    public boolean addMovieActor(int movieid, int actorid){
        return movieService.addMovieActor(movieid,actorid);
    }

    /**
     * 添加电影基本信息时同时调用设置初始值，否则联合查询查不到
     * @param movieid 电影id行内获取
     * @param categoryid 分类id添加演员后通过连接表获取
     * @return bool
     */
    @PostMapping("/movie/addmoviecategory")
    public boolean addMovieCategory(int movieid, int categoryid){
        return movieService.addMovieCategory(movieid,categoryid);
    }

    /**
     *修改电影演员信息接口，用于操作其中间表
     * @param movieid 电影id行内获取
     * @param actorid 演员id调用其他接口获取
     * @return bool
     */
    @PostMapping("/movie/altmovieactor")
    public boolean altMovieActor(int movieid, int actorid){
        return movieService.altMovieActor(movieid,actorid);
    }

    /**
     *修改电影与地址信息中间表
     * @param movieid 电影id行内获取
     * @param categoryid 地区id调用其他接口获取
     * @return bool
     */
    @PostMapping("/movie/altmoviecategory")
    public boolean altMovieCategory(int movieid, int categoryid){
        return movieService.altMovieCategory(movieid,categoryid);
    }

    /**
     * 修改电影基本信息表，仅传递电影基本信息不要操作其他
     * @param movie 传递电影对象
     * @return bool
     */
    @PostMapping("/movie/altmoviebase")
    public boolean  altMovieBase(Movie movie){
        return movieService.altMovieBase(movie);
    }

    /**
     * 删除电影方法，调用多个服务删除选中电影以及电影的连接表
     * @param id 电影id
     * @return bool
     */
    @PostMapping("/movie/delmovie")
    public boolean delMovie(int id){
        movieService.delMovieAndActor(id);
        movieService.delMovieAndCategory(id);
        return movieService.delMovieBase(id);
    }

}
