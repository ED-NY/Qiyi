package com.hld.qiyi.service.Actor;

import com.hld.qiyi.pojo.Actor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:16
 * @Description:演员管理服务层接口
 */
public interface ActorService {
    List<Actor> queryActorList(String name,String sex,String rname,String mname);

    boolean delActor(int id);
    boolean delActorAndRegion(int actorid);
    boolean delActorAndMovie(int actorid);

    boolean addActor(String name, String birthday, String sex, String description, String pic);
    boolean addActorWithRegion(int actorid,int regionid);

    boolean addActorMovieUnion(int actorid);

    boolean alterActor(int id,String name, String birthday, String sex, String description, String pic);

    boolean alterActorRegion(int actorid,int regionid);

    int getActorId(String name);
}
