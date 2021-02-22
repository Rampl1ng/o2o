package com.rampling.o2o.entity;

import java.util.Date;

/**
 * @Description : 用户信息类
 * @Author : Rampling
 * @Date : Created in 14:06 2021/02/21
 **/
public class PersonInfo {
    // ID
    private Long userId;
    // 名称
    private String name;
    // 头像
    private String profileImg;
    // 邮箱
    private String email;
    // 性别
    private String gender;
    // 状态
    private Integer enableStatus;
    // 身份标识 1.顾客 2.店家 3.超级管理员
    private Integer userType;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date lastEditTime;

}
