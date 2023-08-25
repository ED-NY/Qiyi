package com.hld.qiyi.controller;

import com.hld.qiyi.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-17:53
 * @Description: 测试redis用的接口
 */
@Component
@RestController
public class RedisController {
//    @Resource
//    RedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;

    @GetMapping("/redis/test")
    public String testRedis(){
//        redisUtil.setKey("name2","mark");
        return redisUtil.getKey("name2");
    }
}
