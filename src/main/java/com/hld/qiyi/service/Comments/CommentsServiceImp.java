package com.hld.qiyi.service.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-17:13
 * @Description: 评论服务层实现
 */
@Service
public class CommentsServiceImp implements CommentsService{

    @Override
    public boolean setMovieComment(int movieid, int value) {
        return false;
    }

    @Override
    public boolean setCommentComment(int actorid, int value) {
        return false;
    }
}
