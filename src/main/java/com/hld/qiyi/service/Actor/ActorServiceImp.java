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
 * @Description:
 */
@Service
public class ActorServiceImp implements ActorService{
    @Autowired
    private ActorMapper actorMapper;
//    @Autowired
//    private RegionMapper regionMapper;

    @Override
    public List<Actor> queryActorList() {
//        List<Actor> actors_temp = actorMapper.queryActorList();
//        List<Actor> actors = null;
//        for(Actor actor : actors_temp){
//            if(actor.getRegion().getId() == regionMapper.queryRegionById(actor.getRegion().getId()).getId()){
//                actor.setRegion(regionMapper.queryRegionById(actor.getRegion().getId()));
//            }
//            actors.add(actor);
//        }
//        return actors;
        return actorMapper.queryActorList();
    }
}
