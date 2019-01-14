package cn.itcast.dao;

import cn.itcast.entity.FoodType;

import java.util.List;

/**
 * 菜系数据访问层封装
 */

public interface FoodTypeDao {
    /**
     * 保存
     * @param foodType
     */
    void save(FoodType foodType);

    /**
     * 更新
     * @param foodType
     */
    void update(FoodType foodType);

    /**
     * 删除
     * @param id
     */
    void delete(int id);

    /**
     * 查询所有
     * @return List
     */

    List<FoodType> getAll();

    /**
     * 根据菜类查询
     * @param typeName
     * @return
     */
    List<FoodType> getAll(String typeName);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    FoodType findById(int id);
}
