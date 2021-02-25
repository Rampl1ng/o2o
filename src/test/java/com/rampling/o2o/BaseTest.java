package com.rampling.o2o;

/**
 * @Description : 配置spring和junit整合，junit启动时加载springIOC容器
 * @Author : Rampling
 * @Date : Created in 13:42 2021/02/23
 **/

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseTest {
}
