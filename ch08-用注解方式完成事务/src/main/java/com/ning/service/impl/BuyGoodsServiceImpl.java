package com.ning.service.impl;

import com.ning.dao.GoodsDao;
import com.ning.dao.SaleDao;
import com.ning.domain.Goods;
import com.ning.domain.Sale;
import com.ning.excep.NotEnoughException;
import com.ning.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author XUN~MLF
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {

     GoodsDao goodsDao;

     SaleDao saleDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("======buy方法的开始====");
        /**记录销售信息，向sale表添加信息*/
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        /**更新库存*/
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            //商品不存在
            throw new NullPointerException("编号为:" + goodsId + ",商品不存在");
        } else if (goods.getAmount() < nums) {
             //商品不存在
            throw new NotEnoughException("编号为:" + goodsId + ",商品库存不足");
        }

        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("======buy方法的结束====");
    }
}
