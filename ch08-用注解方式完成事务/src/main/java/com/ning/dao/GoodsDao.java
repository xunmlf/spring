package com.ning.dao;

import com.ning.domain.Goods;

/**
 * @author XUN~MLF
 */
public interface GoodsDao {

    /**更新库存*/
    int updateGoods(Goods goods);

    /**查询商品信息*/
    Goods selectGoods(Integer id);
}
