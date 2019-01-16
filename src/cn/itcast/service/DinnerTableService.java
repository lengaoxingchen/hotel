package cn.itcast.service;

import cn.itcast.entity.DinnerTable;

import java.util.List;

public interface DinnerTableService {
    /**
     * 查询所有未预定的餐桌
     */
    List<DinnerTable> findNoUse();

    /**
     * 主键查询
     */
    DinnerTable findById(int id);
}
