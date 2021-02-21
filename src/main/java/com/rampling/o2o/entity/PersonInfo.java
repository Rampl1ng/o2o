package com.rampling.o2o.entity;

import java.util.Date;

/**
 * @Description : 用户信息类
 * @Author : Rampling
 * @Date : Created in 14:06 2021/02/21
 **/
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    private Integer enableStatus;
    // 1.顾客 2.店家 3.超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;

}
