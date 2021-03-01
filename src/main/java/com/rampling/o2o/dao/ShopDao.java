package com.rampling.o2o.dao;

import com.rampling.o2o.entity.Shop;

public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return 新增数量
     */
    int insertShop(Shop shop);
}
