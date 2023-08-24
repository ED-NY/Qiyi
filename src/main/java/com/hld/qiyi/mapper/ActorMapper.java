package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.Actor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:18
 * @Description:
 */
@Mapper
public interface ActorMapper {
    List<Actor> queryActorList();
}
