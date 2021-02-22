package com.rampling.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * @Description : 商品实体类
 * @Author : Rampling
 * @Date : Created in 01:20 2021/02/22
 **/
public class Product {
    // ID
    private Long productId;
    // 商品名
    private String productName;
    // 描述
    private String productDesc;
    // 缩略图
    private String imgAddr;
    // 原价
    private String normalPrice;
    // 折扣价
    private String promotionPrice;
    // 权重
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date lastEditTime;
    // 状态 -1.不可用 0.下架 1.在前端展示系统展示
    private Integer enableStatus;
    // 商品详情图片列表
    private List<ProductImg> productImgList;
    // 类别ID
    private ProductCategory productCategory;
    // 店铺ID
    private Shop shop;
}
