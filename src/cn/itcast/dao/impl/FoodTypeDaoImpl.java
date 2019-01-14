package cn.itcast.dao.impl;

import cn.itcast.dao.FoodTypeDao;
import cn.itcast.entity.FoodType;
import cn.itcast.utils.JdbcUtils;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * 菜系数据访问层接口实现类
 */

public class FoodTypeDaoImpl implements FoodTypeDao {
    public void save(FoodType foodType) {
        String sql = "INSERT INTO foodType(typeName) VALUES(?)";
        try {
            JdbcUtils.getQueryRunner().update(sql, foodType.getTypeName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void update(FoodType foodType) {
        String sql = "update  foodType set typeName=? where id=?";
        try {
            JdbcUtils.getQueryRunner().update(sql, foodType.getId(),foodType.getTypeName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        String sql = "delete from foodType where id=?";

        try {
            JdbcUtils.getQueryRunner().update(sql, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<FoodType> getAll() {
        String sql = "select * from foodType";
        try {
            return JdbcUtils.getQueryRunner().query(sql, new BeanListHandler<FoodType>(FoodType.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<FoodType> getAll(String typeName) {
        String sql = "select * from foodType where typeName like ?";
        try {
            return JdbcUtils.getQueryRunner().query(sql, new BeanListHandler<FoodType>(FoodType.class), "%"+typeName+"%");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public FoodType findById(int id) {
        String sql = "select * from foodType where id=?";
        try {
            return JdbcUtils.getQueryRunner().query(sql, new BeanHandler<FoodType>(FoodType.class), id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
