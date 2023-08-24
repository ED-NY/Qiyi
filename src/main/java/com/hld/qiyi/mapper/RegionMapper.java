package com.hld.qiyi.mapper;

import com.hld.qiyi.pojo.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Liuchunxin
 * @Date: 2023-08-23-16:25
 * @Description:地区修改操作dao
 */
@Mapper
public interface RegionMapper {
    List<Region> getRegionList();

    int delRegion(@Param("id")int id);

    int addRegion(@Param("name")String name);

    Region queryRegionById(@Param("id")int id);
}
