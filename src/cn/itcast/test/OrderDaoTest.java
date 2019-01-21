package cn.itcast.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

class OrderDaoTest {

    OrderDao orderDao = new OrderDao();

    @Test
    void getAll() {
        List<Order> orderList = orderDao.getAll();
        Assert.assertNotNull(orderList);
    }

    @Test
    void findByTableId() {
        Order order = new Order();
        order.setTable_id(1);
        List<Order> orderList = orderDao.findByTableId(order.getTable_id());
        Assert.assertNotNull(orderList);
    }

    @Test
    void findById() {
        int id =2;
        Order order = orderDao.findById(id);
        System.out.println(order);
        Assert.assertNotNull(order);
    }
    @Test
    void save(){
        Order order = new Order();
        order.setId(3);
        order.setTable_id(3);
        order.setOrderDate(new Date());
        order.setTotalPrice(52.0);
        order.setOrderStatus(0);
        orderDao.save(order);
        Order order1 = orderDao.findById(order.getId());
        Assert.assertNotNull(order1);
    }
}