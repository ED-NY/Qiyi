package com.hld.qiyi.service.Comments;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-25-17:12
 * @Description: 评论服务层
 */
public interface CommentsService {
    boolean setMovieComment(int movieid,int value);
    boolean setCommentComment(int actorid,int value);
}
