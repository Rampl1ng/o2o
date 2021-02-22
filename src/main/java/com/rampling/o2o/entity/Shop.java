package com.rampling.o2o.entity;

import java.util.Date;

/**
 * @Description : 店铺实体类
 * @Author : Rampling
 * @Date : Created in 01:04 2021/02/22
 **/
public class Shop {
    // ID
    private Long shopId;
    // 店名
    private String shopName;
    // 描述
    private String shopDesc;
    // 地址
    private String shopAddr;
    // 联系方式
    private String phone;
    // 门牌照
    private String shopImg;
    // 权重
    private Integer priority;
    // 状态 -1.不可用 0.审核中 1.可用
    private Integer enableStatus;
    // 建议
    private String advice;
    // 区域ID
    private Area area;
    // 用户ID
    private PersonInfo owner;
    // 类别ID
    private ShopCategory shopCategory;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date lastEditTime;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public PersonInfo getOwner() {
        return owner;
    }

    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(ShopCategory shopCategory) {
        this.shopCategory = shopCategory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
