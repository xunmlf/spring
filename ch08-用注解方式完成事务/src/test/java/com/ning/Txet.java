package com.ning;

import com.ning.service.BuyGoodsService;
import com.ning.service.impl.BuyGoodsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Txet {
    @Test
    public void Text01() {
        String config = "applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) act.getBean("buyService");

        System.out.println("service是代理："+service);
        service.buy(1002, 2);
    }
}
