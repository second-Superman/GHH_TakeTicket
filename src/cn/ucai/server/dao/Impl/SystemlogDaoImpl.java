package cn.ucai.server.dao.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import cn.ucai.entity.Systemlog;
import cn.ucai.entity.SystemlogRowMapper;
import cn.ucai.server.dao.SystemlogDao;
import cn.ucai.util.JdbcUtils;

public class SystemlogDaoImpl implements SystemlogDao {

	@Override
	public List<Systemlog> selectList(Systemlog t) {
		Connection conn = null;
		List systemloglist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from systemlog";

			systemloglist = JdbcUtils.executeQuery(conn, sql, null, new SystemlogRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		return systemloglist;
	}

	@Override
	public Systemlog selectById(Integer id) {
		Connection conn = null;
		List systemloglist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from systemlog where id=?";
			Integer[] params = { id };
			systemloglist = JdbcUtils.executeQuery(conn, sql, params, new SystemlogRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (systemloglist.size() != 0) {
			return (Systemlog) systemloglist.get(0);
		}
		return null;
	}

	@Override
	public boolean insert(Systemlog t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into systemlog (username,createtime,content,ip) values (?,?,?,?)";
			Object[] params = new Object[4];
			params[0] = t.getUsername();
			params[1] = t.getCreatetime();
			params[2] = t.getContent();
			params[3] = t.getIp();
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (row == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Systemlog t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update systemlog set username=?,createname=?,content=?,ip=? where id=?";
			Object[] params = new Object[5];
			params[0] = t.getUsername();
			params[1] = t.getCreatetime();
			params[2] = t.getContent();
			params[3] = t.getIp();
			params[4] = t.getId();
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (row == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "delete from systemlog where id=?";
			Integer[] params = { id };
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (row == 1) {
			return true;
		}
		return false;
	}

}
