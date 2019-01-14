package cn.itcast.utils;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;

/**
 * 封装常用的操作
 */
public class JdbcUtils {

    //初始化连接池
    private static DataSource dataSource;

    static {
        dataSource = new ComboPooledDataSource();
    }

    /**
     * 创建DbUtils常用工具类
     * @return
     */
    public static QueryRunner getQueryRunner() {
        return new QueryRunner(dataSource);
    }

}
