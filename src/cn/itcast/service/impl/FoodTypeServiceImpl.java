package cn.itcast.service.impl;

import cn.itcast.dao.FoodTypeDao;
import cn.itcast.entity.FoodType;
import cn.itcast.factory.BeanFactory;
import cn.itcast.service.FoodTypeService;

import java.util.List;

/**
 * 菜系业务逻辑层实现
 */

public class FoodTypeServiceImpl implements FoodTypeService {
    //调用dao
    //private FoodTypeDao foodTypeDao = new FoodTypeDaoImpl();//对象的创建,不能写死
    //工厂创建对象
    private FoodTypeDao foodTypeDao = BeanFactory.getInstance("foodTypeDao", FoodTypeDao.class);

    public void save(FoodType foodType) {
        try {
            foodTypeDao.save(foodType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void update(FoodType foodType) {
        try {
            foodTypeDao.update(foodType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        try {
            foodTypeDao.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<FoodType> getAll() {
        try {
            return foodTypeDao.getAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<FoodType> getAll(String typeName) {
        try {
            return foodTypeDao.getAll(typeName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public FoodType findById(int id) {
        try {
            return foodTypeDao.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
