package com.rampling.o2o.entity;

import java.util.Date;

/**
 * @Description : 区域实体类
 * @Author : Rampling
 * @Date : Created in 13:24 2021/02/21
 **/
public class Area {
    // ID
    private Integer areaId;
    // 名称
    private String areaName;
    // 权重
    private Integer priority;
    // 创建时间
    private Date createTIme;
    // 更新时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTIme() {
        return createTIme;
    }

    public void setCreateTIme(Date createTIme) {
        this.createTIme = createTIme;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
