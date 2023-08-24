package com.hld.qiyi.service.Region;

import com.hld.qiyi.mapper.RegionMapper;
import com.hld.qiyi.pojo.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:24
 * @Description:地区管理服务层实现
 */
@Service
public class RegionServiceImp implements RegionService{
    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<Region> getRegionList() {
        return regionMapper.getRegionList();
    }

    @Override
    public boolean delRegion(int id) {
        return regionMapper.delRegion(id)>0;
    }

    @Override
    public boolean addRegion(String name) {
        return regionMapper.addRegion(name)>0;
    }

    @Override
    public Region queryRegionById(int id) {
        return regionMapper.queryRegionById(id);
    }


}
