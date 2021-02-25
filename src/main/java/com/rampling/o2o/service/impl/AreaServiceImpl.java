package com.rampling.o2o.service.impl;

import com.rampling.o2o.dao.AreaDao;
import com.rampling.o2o.entity.Area;
import com.rampling.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description : Area service 实现类
 * @Author : Rampling
 * @Date : Created in 15:24 2021/02/25
 **/
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
