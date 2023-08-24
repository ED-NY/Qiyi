package com.hld.qiyi.controller;

import com.hld.qiyi.pojo.Region;
import com.hld.qiyi.service.Region.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:25
 * @Description:地区管理控制层
 */
@RestController
public class RegionController {
    @Autowired
    private RegionService regionService;

    /**
     * 查询地区列表
     * 测试成功
     * @return
     */
    @PostMapping("/region/getregionlist")
    public List<Region> getRegionList(){
        return regionService.getRegionList();
    }

    /**
     * 根据id删除指定地址信息
     * 测试成功
     * @param id
     * @return
     */
    @PostMapping("/region/regiondelbyid")
    public boolean delRegion(int id){
        return regionService.delRegion(id);
    }

    /**
     * 添加新的地址信息
     * 测试成功
     * @param name
     * @return
     */
    @PostMapping("/region/regionadd")
    public boolean addRegion(String name){
        return regionService.addRegion(name);
    }

    @PostMapping("/region/queryregionbyid")
    public Region queryRegionById(int id){return regionService.queryRegionById(id);}

}
