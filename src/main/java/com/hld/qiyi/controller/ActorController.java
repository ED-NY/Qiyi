package com.hld.qiyi.controller;

import com.hld.qiyi.pojo.Actor;
import com.hld.qiyi.service.Actor.ActorService;
import com.hld.qiyi.service.Actor.ActorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-19:34
 * @Description:演员接口
 */
@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;

    /**
     * 本接口返回演员的信息联合地址表，并且添加
     * 了一个电影信息，返回值包括一个电影用于举例
     * @return
     */
    @PostMapping("/actor/queryactorlist")
    public List<Actor> queryActorList(){
        return actorService.queryActorList();
    }
}
