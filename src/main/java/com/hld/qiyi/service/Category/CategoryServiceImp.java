package com.hld.qiyi.service.Category;

import com.hld.qiyi.mapper.CategoryMapper;
import com.hld.qiyi.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:20
 * @Description:电影类型管理服务层实现
 */
@Service
public class CategoryServiceImp implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }

    @Override
    public boolean delCategory(int id) {
        return categoryMapper.delCategory(id)>0;
    }

    @Override
    public boolean addCategory(String catname) {
        return categoryMapper.addCategory(catname)>0;
    }
}
