package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:27
 * @Description:
 */
@Mapper
public interface MovieMapper {
    List<Movie> queryMovieList(@Param("name") String name,
                               @Param("director") String director,
                               @Param("rating")Double rating,
                               @Param("pub_date")Date pub_date,
                               @Param("aname")String aname,
                               @Param("cname")String cname);

    int addMovie(Movie movie);

    int addMovieActor(@Param("movieid") int movieid,@Param("actorid") int actorid);

    int addMovieCategory(@Param("movieid") int movieid,@Param("categoryid") int categoryid);

    int getIdByName(@Param("name")String name);

    int altMovieActor(@Param("movieid") int movieid,@Param("actorid") int actorid);

    int altMovieCategory(@Param("movieid") int movieid,@Param("categoryid") int categoryid);

    int altMovieBase(Movie movie);

    int delMovieBase(@Param("id")int id);

    int delMovieAndActor(@Param("movieid")int movieid);

    int delMovieAndCategory(@Param("movieid")int movieid);
}
