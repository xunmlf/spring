package com.ning.service;

/**
 * @author XUN~MLF
 */
public interface BuyGoodsService {

    /**
     * goodsId:购买商品的编号
     * nums:购买商品的数量
     * */
    void buy(Integer goodsId,Integer nums);
}
