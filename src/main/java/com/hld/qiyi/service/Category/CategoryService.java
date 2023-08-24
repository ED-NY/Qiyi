package com.hld.qiyi.service.Category;

import com.hld.qiyi.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:20
 * @Description:电影类型管理服务层接口
 */
public interface CategoryService {
    List<Category> getCategoryList();

    boolean delCategory(@Param("id")int id);

    boolean addCategory(@Param("catname")String catname);
}
