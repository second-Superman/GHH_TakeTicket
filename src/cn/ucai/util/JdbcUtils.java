package cn.ucai.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class JdbcUtils {
	/**
	 * 获得连接
	 * @return
	 * @throws SQLException
	 */
	private static String classname;
	private static String url;
	private static String user;
	private static String password;
	static{
		InputStream in= JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties ps= new Properties();
		try {
			ps.load(in);
			password=ps.getProperty("password");
			classname=ps.getProperty("classname");
			url=ps.getProperty("url");
			user=ps.getProperty("user");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		// 注册驱动
		try {
			Class.forName(classname);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	/**
	 * 更新，可以执行DDL,DML
	 * 
	 */
	public static int executeUpdate(Connection conn,String sql) throws SQLException{
		Statement stmt = conn.createStatement();
		int rows = stmt.executeUpdate(sql);
		close(stmt);
		return rows;
		
	}
	/**
	 * 更新，可以执行DDL,DML
	 * 
	 */
	public static int executeUpdate(Connection conn,String sql,Object[] params) throws SQLException{
		PreparedStatement stmt = conn.prepareStatement(sql);
		if(null!=params && params.length>0){
			for(int i=1;i<=params.length;i++){
				stmt.setObject(i, params[i-1]);
			}
		}
		int rows = stmt.executeUpdate();
		close(stmt);
		return rows;
	}
	
	/**
	 * 查询
	 * @param conn
	 * @param sql
	 * @param params
	 * @param rm
	 * @return
	 * @throws SQLException
	 */
	public static List executeQuery(Connection conn,
			String sql,Object[] params,RowMapper rm) throws SQLException{
		PreparedStatement stmt = conn.prepareStatement(sql);
		if(null!=params && params.length>0){
			for(int i=1;i<=params.length;i++){
				stmt.setObject(i, params[i-1]);
			}
		}
		List list = new ArrayList();
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			Object o = rm.getEntity(rs);//从结果集中的一行返回一个实体对象
			list.add(o);
		}
		close(rs);
		close(stmt);
		return list;
	}

	/**
	 * 关闭结果集
	 * 
	 * @param rs
	 */
	public static void close(ResultSet rs) {
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭语句对象
	 * 
	 * @param rs
	 */
	public static void close(Statement stmt) {
		if (null != stmt) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭连接对象
	 * 
	 * @param rs
	 */
	public static void close(Connection conn) {
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭连接对象
	 * 
	 * @param rs
	 */
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		close(rs);
		close(stmt);
		close(conn);
	}
}
