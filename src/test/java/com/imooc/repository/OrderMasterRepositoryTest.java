package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by protean
 * 2019-05-08-19:50.
 */
@RunWith(SpringRunner.class)//
@SpringBootTest//这两个注解不加，OrderMaster save = repository.save(orderMaster);为空，导致空指针异常
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "微信号";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234568");
        orderMaster.setBuyerName("你爸爸");
        orderMaster.setBuyerPhone("17255454555");
        orderMaster.setBuyerAddress("7楼");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(4.9));

        OrderMaster save = repository.save(orderMaster);
        Assert.assertNotNull(save);
    }
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request = new PageRequest(0, 10);

        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, request);

        Assert.assertNotEquals(0, result.getTotalElements());
    }

}