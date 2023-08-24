package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:21
 * @Description:电影类型管理dao层接口
 */
@Mapper
public interface CategoryMapper {
    List<Category> getCategoryList();

    int delCategory(@Param("id")int id);

    int addCategory(@Param("catname")String catname);
}
