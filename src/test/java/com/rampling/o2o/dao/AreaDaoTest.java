package com.rampling.o2o.dao;

import com.rampling.o2o.BaseTest;
import com.rampling.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;


public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        // 如果size=2就运行
        assertEquals(2, areaList.size());
    }
}