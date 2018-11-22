package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("666");
        orderDetail.setOrderId("555");
        orderDetail.setProductIcon("http://000.jpg");
        orderDetail.setProductId("333");
        orderDetail.setProductName("NMSL");
        orderDetail.setProductPrice(new BigDecimal(77.1));
        orderDetail.setProductQuantity(12);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotEquals(0,result);


    }
    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("444");
        Assert.assertNotEquals(0,orderDetailList);
    }
}