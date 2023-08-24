package com.hld.qiyi.service.Region;

import com.hld.qiyi.pojo.Region;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:24
 * @Description:地区操作服务层接口
 */
public interface RegionService {
    List<Region> getRegionList();

    boolean delRegion(int id);

    boolean addRegion(String name);

    Region queryRegionById(int id);
}
