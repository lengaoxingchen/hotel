package cn.itcast.dao;

import cn.itcast.entity.DinnerTable;
import cn.itcast.entity.TableStatus;

import java.util.List;


public interface DinnerTableDao {
    /**
     * 根据预定状态查询
     */
    List<DinnerTable> findByStatus(TableStatus tableStatus);

    /**
     * 主键查询
     */
    DinnerTable findById(int id);
}
