package com.hld.qiyi.service.Actor;

import com.hld.qiyi.pojo.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:16
 * @Description:
 */
public interface ActorService {
    List<Actor> queryActorList();
}
