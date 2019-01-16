package cn.itcast.service.impl;

import cn.itcast.dao.DinnerTableDao;
import cn.itcast.entity.DinnerTable;
import cn.itcast.entity.TableStatus;
import cn.itcast.factory.BeanFactory;
import cn.itcast.service.DinnerTableService;

import java.util.List;

public class DinnerTableServiceImpl implements DinnerTableService {
    //调用的dao层.通常工厂创建实例
    private DinnerTableDao dinnerTableDao = BeanFactory.getInstance("dinnerTableDao", DinnerTableDao.class);

    public List<DinnerTable> findNoUse() {

        try {
            //调用dao层根据状态查询没有预定的餐桌
            return dinnerTableDao.findByStatus(TableStatus.FREE);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DinnerTable findById(int id) {
        try {
            return dinnerTableDao.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
