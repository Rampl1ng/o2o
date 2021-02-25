package com.rampling.o2o.service;

import com.rampling.o2o.BaseTest;
import com.rampling.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("东苑", areaList.get(0).getAreaName());
    }
}