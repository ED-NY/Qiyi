package com.hld.qiyi.controller;

import com.hld.qiyi.pojo.Category;
import com.hld.qiyi.service.Category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:30
 * @Description:电影类型管理控制层
 */
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     *获取电影类型列表
     * @return
     */
    @PostMapping("/category/getcategorylist")
    public List<Category> getCategoryList(){
        return categoryService.getCategoryList();
    }

    /**
     *根据所给id删除指定电影分类
     * @param id
     * @return
     */
    @PostMapping("/category/categorydel")
    public boolean delCategory(int id){
        return categoryService.delCategory(id);
    }

    /**
     *创建新的电影类型
     * @param catname
     * @return
     */
    @PostMapping("/category/categoryadd")
    public boolean addCategory(String catname){
        return categoryService.addCategory(catname);
    }
}
