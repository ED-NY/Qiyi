package com.hld.qiyi.service.Movie;

import com.hld.qiyi.mapper.MovieMapper;
import com.hld.qiyi.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:28
 * @Description:
 */
@Service
public class MovieServiceImp implements MovieService {
    @Autowired
    private MovieMapper movieMapper;
    @Override
    public List<Movie> queryMovieList(String name, String director,Double rating,Date pub_date, String aname, String cname) {
        return movieMapper.queryMovieList(name,director,rating,pub_date,aname,cname);
    }

    @Override
    public boolean addMovie(Movie movie) {
        return movieMapper.addMovie(movie)>0;
    }

    @Override
    public boolean addMovieActor(int movieid, int actorid) {
        return movieMapper.addMovieActor(movieid,actorid)>0;
    }

    @Override
    public boolean addMovieCategory(int movieid, int categoryid) {
        return movieMapper.addMovieCategory(movieid,categoryid)>0;
    }

    @Override
    public int getIdByName(String name) {
        return movieMapper.getIdByName(name);
    }

    @Override
    public boolean altMovieActor(int movieid, int actorid) {
        return movieMapper.altMovieActor(movieid,actorid)>0;
    }

    @Override
    public boolean altMovieCategory(int movieid, int categoryid) {
        return movieMapper.altMovieCategory(movieid,categoryid)>0;
    }

    @Override
    public boolean altMovieBase(Movie movie) {
        return movieMapper.altMovieBase(movie)>0;
    }

    @Override
    public boolean delMovieBase(int id) {
        return movieMapper.delMovieBase(id)>0;
    }

    @Override
    public boolean delMovieAndActor(int movieid) {
        return movieMapper.delMovieAndActor(movieid)>0;
    }

    @Override
    public boolean delMovieAndCategory(int movieid) {
        return movieMapper.delMovieAndCategory(movieid)>0;
    }

}
