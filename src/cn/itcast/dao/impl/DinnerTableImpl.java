package cn.itcast.dao.impl;

import cn.itcast.dao.DinnerTableDao;
import cn.itcast.entity.DinnerTable;
import cn.itcast.entity.TableStatus;
import cn.itcast.utils.JdbcUtils;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class DinnerTableImpl implements DinnerTableDao {
    public List<DinnerTable> findByStatus(TableStatus tableStatus) {
        String sql = "select * from dinnerTable where tableStatus=?";
//        int status = -1;
//        //判断
//        if (tableStatus.equals(TableStatus.FREE))
//            status = 0; //未预定
//        else {
//            status = 1; //已预定
//        }
        try {
            //优化判断:ordinal()获取枚举值的索引
            return JdbcUtils.getQueryRunner().query(sql, new BeanListHandler<DinnerTable>(DinnerTable.class), tableStatus.ordinal());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DinnerTable findById(int id) {
        String sql = "select * from dinnerTable where id = ?";

        try {
            return JdbcUtils.getQueryRunner().query(sql, new BeanHandler<DinnerTable>(DinnerTable.class), id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
