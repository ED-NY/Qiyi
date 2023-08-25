package com.hld.qiyi.service.Movie;

import com.hld.qiyi.pojo.Movie;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:29
 * @Description:
 */
public interface MovieService {
    List<Movie> queryMovieList(String name,String director,Double rating,Date pub_date,String aname,String cname);

    boolean addMovie(Movie movie);
    boolean addMovieActor(int movieid,int actorid);

    boolean addMovieCategory(int movieid,int categoryid);

    int getIdByName(String name);

    boolean altMovieActor(int movieid,int actorid);

    boolean altMovieCategory(int movieid,int categoryid);

    boolean altMovieBase(Movie movie);

    boolean delMovieBase(int id);

    boolean delMovieAndActor(int movieid);

    boolean delMovieAndCategory(int movieid);
}
