package cn.itcast.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class orderDetailTest {
    OrderDetailDao orderDetailDao = new OrderDetailDao();

    @Test
    void findByOrderId() {
        int orderId = 1;
        List<OrderDetail> orderDetailList = orderDetailDao.findByOrderId(orderId);
        Assert.assertNotNull(orderDetailList);
    }

    @Test
    void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(3);
        orderDetail.setOrderId(1);
        orderDetail.setFoodId(3);
        orderDetail.setFoodCount(2);
        orderDetailDao.save(orderDetail);
        Assert.assertNotNull(orderDetailDao.findByOrderId(orderDetail.getId()));

    }
}