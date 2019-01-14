package cn.itcast.service;

import cn.itcast.entity.FoodType;

import java.util.List;

/**
 * 菜系业务逻辑类封装
 */
public interface FoodTypeService {
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


