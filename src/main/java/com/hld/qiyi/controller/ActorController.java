package com.hld.qiyi.controller;

import com.hld.qiyi.pojo.Actor;
import com.hld.qiyi.service.Actor.ActorService;
import com.hld.qiyi.service.Actor.ActorServiceImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-22-19:34
 * @Description: 演员管理控制层
 */
@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;

    /**
     * 兼并各种演员信息的查询
     * 验证通过
     * @param name 演员姓名（name）
     * @param sex 性别（sex）
     * @param rname 地区名（rname）
     * @param mname 电影名（mname）
     * @return 包括actor（base and region（id,name），movie(id,name)）对象
     */
    @PostMapping("/actor/queryactorlist")
    public List<Actor> queryActorList(String name,String sex,String rname,String mname){
        return actorService.queryActorList(name,sex,rname,mname);
    }

    /**
     * 删除演员操作，同步删除两个连接表中的信息
     * @param id 演员id
     * @return bool删除情况
     */
    @PostMapping("/actor/delactor")
    public boolean delActor(int id){
        actorService.delActorAndRegion(id);
        actorService.delActorAndMovie(id);
        return actorService.delActor(id);
    }

    /**
     * 添加演员，包含地址信息，自动填写电影信息为未知
     * @param name 姓名
     * @param birthday yyyy-mm-dd
     * @param sex 男||女
     * @param description 描述
     * @param pic 图片存储位置
     * @param regionid 地址信息id,传入的时候默认是4
     * @return bool
     */
    @PostMapping("/actor/addactor")
    public boolean addActor(String name,String birthday,String sex,String description,String pic,int regionid){
        if(actorService.addActor(name, birthday, sex, description, pic)) {
            int actorid = actorService.getActorId(name);
            actorService.addActorWithRegion(actorid,regionid);
            actorService.addActorMovieUnion(actorid);
            return true;
        }
        return false;
    }

    /**
     * 添加演员后，可以选择演员所属地信息
     * @param actorid 演员id通过行获取
     * @param regionid 地址信息可以通过调用region相关方法获取id
     * @return bool
     */
    @PostMapping("/actor/addactorregion")
    public boolean addActorRegion(int actorid, int regionid){
        return actorService.addActorWithRegion(actorid,regionid);
    }

    /**
     *修改演员信息，包含地址信息
     * @param id 传入演员id可通过queryList获得
     * @param name 姓名
     * @param birthday yyyy-mm-dd
     * @param sex 性别
     * @param description 描述
     * @param pic 图片位置
     * @param regionid 地址信息id,传入的时候默认是4或者原值
     * @return bool
     */
    @PostMapping("/actor/updateactor")
    public boolean alterActor(int id, String name, String birthday, String sex, String description, String pic,int regionid) {
        boolean al1 = actorService.alterActorRegion(id,regionid);
        boolean al2 = actorService.alterActor(id,name,birthday,sex,description,pic);
        return al1 && al2;
    }

    /**
     *修改演员地址信息，单独存储
     * @param actorid 演员id
     * @param regionid 地址信息id
     * @return bool
     */
    @PostMapping("/actor/updateactorregion")
    public boolean alterActorRegion(int actorid, int regionid) {
        return actorService.alterActorRegion(actorid,regionid);
    }


}
