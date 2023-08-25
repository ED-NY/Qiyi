package com.hld.qiyi.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-18:11
 * @Description: 工具类方便redis使用
 */

@Component
public class RedisUtil {
    @Resource
    RedisTemplate<String, String> redisTemplate;

    //报错也没办法，能跑
    public RedisUtil(RedisTemplate<String, String> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    /**
     * 设置key
     * @param key key
     * @param value value
     * @return bool
     */
    public boolean setKey(String key,String value){
        this.redisTemplate.opsForValue().set(key,value);
        return true;
    }

    /**
     * 获取key
     * @param key key
     * @return bool
     */
    public String getKey(String key){
        return this.redisTemplate.opsForValue().get(key);
    }
}
