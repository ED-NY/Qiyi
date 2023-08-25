package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:18
 * @Description:演员管理dao
 */
@Mapper
public interface ActorMapper {
    List<Actor> queryActorList(@Param("name") String name,
                               @Param("sex")String sex,
                               @Param("rname")String rname,
                               @Param("mname")String mname);

    int delActor(@Param("id")int id);

    int delActorAndRegion(@Param("actorid")int actorid);

    int delActorAndMovie(@Param("actorid")int actorid);

    int addActor(@Param("name")String name,
                 @Param("birthday")String birthday,
                 @Param("sex")String sex,
                 @Param("description")String description,
                 @Param("pic") String pic);
    int addActorWithRegion(@Param("actorid") int actorid,@Param("regionid") int regionid);

    int addActorMovieUnion(@Param("actorid")int actorid);

    int alterActor(@Param("id")int id,
                   @Param("name")String name,
                   @Param("birthday")String birthday,
                   @Param("sex")String sex,
                   @Param("description")String description,
                   @Param("pic") String pic);

    int alterActorRegion(@Param("actorid") int actorid,@Param("regionid") int regionid);

    int getActorId(@Param("name")String name);

}
