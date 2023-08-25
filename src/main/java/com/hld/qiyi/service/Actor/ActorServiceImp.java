package com.hld.qiyi.service.Actor;

import com.hld.qiyi.mapper.ActorMapper;
import com.hld.qiyi.mapper.RegionMapper;
import com.hld.qiyi.pojo.Actor;
import com.hld.qiyi.pojo.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:16
 * @Description:演员管理服务层实现
 */
@Service
public class ActorServiceImp implements ActorService{
    @Autowired
    private ActorMapper actorMapper;

    @Override
    public List<Actor> queryActorList(String name,String sex,String rname,String mname) {
        return actorMapper.queryActorList(name,sex,rname,mname);
    }

    @Override
    public boolean delActor(int id) {
        return actorMapper.delActor(id)>0;
    }

    @Override
    public boolean delActorAndRegion(int actorid) {
        return actorMapper.delActorAndRegion(actorid)>0;
    }

    @Override
    public boolean delActorAndMovie(int actorid) {
        return actorMapper.delActorAndMovie(actorid)>0;
    }

    @Override
    public boolean addActor(String name, String birthday, String sex, String description, String pic) {
        return actorMapper.addActor(name,birthday,sex,description,pic)>0;
    }

    @Override
    public boolean addActorWithRegion(int actorid, int regionid) {
        return actorMapper.addActorWithRegion(actorid,regionid)>0;
    }

    @Override
    public boolean addActorMovieUnion(int actorid) {
        return actorMapper.addActorMovieUnion(actorid)>0;
    }

    @Override
    public boolean alterActor(int id, String name, String birthday, String sex, String description, String pic) {
        return actorMapper.alterActor(id,name,birthday,sex,description,pic)>0;
    }

    @Override
    public boolean alterActorRegion(int actorid, int regionid) {
        return actorMapper.alterActorRegion(actorid,regionid)>0;
    }

    @Override
    public int getActorId(String name) {
        return actorMapper.getActorId(name);
    }

}
