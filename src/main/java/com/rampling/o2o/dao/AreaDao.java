package com.rampling.o2o.dao;

import com.rampling.o2o.entity.Area;

import java.util.List;

/**
 * @Description : Area dao 接口
 * @Author : Rampling
 * @Date : Created in 13:18 2021/02/23
 **/
public interface AreaDao {

    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();
}
