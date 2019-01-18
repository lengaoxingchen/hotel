package cn.itcast.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import cn.itcast.entity.TableStatus;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ��װ���õĲ���
 * @author Jie.Yuan
 *
 */
public class JdbcUtils {

	// ��ʼ�����ӳ�
	private static DataSource dataSource;
	static {
		dataSource = new ComboPooledDataSource();
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	/**
	 * ����DbUtils���ù��������
	 */
	public static QueryRunner getQueryRunner() {

		return new QueryRunner(dataSource);
	}
	

}








