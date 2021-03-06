package cn.ucai.server.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import cn.ucai.entity.User;
import cn.ucai.entity.UserRowMapper;
import cn.ucai.server.dao.UserDao;
import cn.ucai.util.JdbcUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> selectList(User t) {
		Connection conn = null;
		List userlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from user";
			userlist = JdbcUtils.executeQuery(conn, sql, null, new UserRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}

		return userlist;
	}

	@Override
	public User selectById(Integer id) {
		Connection conn = null;
		List userlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from user where id=?";
			Integer[] params = { id };
			userlist = JdbcUtils.executeQuery(conn, sql, params, new UserRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (userlist.size() != 0) {
			return (User) userlist.get(0);
		}
		return null;
	}

	public User selectByUsername(String username) {
		Connection conn = null;
		List userlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from user where username=?";
			String[] params = { username };
			userlist = JdbcUtils.executeQuery(conn, sql, params, new UserRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (userlist.size() != 0) {
			return (User)userlist.get(0);
		}
		return null;
	}
	public User selectByTruename(String truename) {
		Connection conn = null;
		List userlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from user where truename=?";
			String[] params = { truename };
			userlist = JdbcUtils.executeQuery(conn, sql, params, new UserRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (userlist.size() != 0) {
			return (User)userlist.get(0);
		}
		return null;
	}
	@Override
	public boolean insert(User t) {
		Connection conn = null;

		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into user (username,password,truename,sex,phone,role) values (?,?,?,?,?,?)";
			Object[] params = new Object[6];

			params[0] = t.getUsername();
			params[1] = t.getPassword();
			params[2] = t.getTruename();
			params[3] = t.getSex();
			params[4] = t.getPhone();
			params[5] = t.getRole();

			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (row == 1) {
			return true;
		}
		return false;

	}

	@Override
	public boolean update(User t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update user set username=?,password=?,truename=?,sex=?,phone=?,role=? where id=?";
			Object[] params = new Object[7];

			params[0] = t.getUsername();
			params[1] = t.getPassword();
			params[2] = t.getTruename();
			params[3] = t.getSex();
			params[4] = t.getPhone();
			params[5] = t.getRole();
			params[6] = t.getId();
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(null, null, conn);
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
			String sql = "delete from user where id=?";
			Integer[] params = { id };
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(null, null, conn);
		}
		if (row == 1) {
			return true;
		}
		return false;
	}

	public boolean deleteByUsername(String username) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "delete from user where username=?";
			String[] params = { username };
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(null, null, conn);
		}
		if (row == 1) {
			return true;
		}
		return false;
	}
	public boolean deleteByTruename(String truename) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "delete from user where truename=?";
			String[] params = { truename };
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(null, null, conn);
		}
		if (row == 1) {
			return true;
		}
		return false;
	}
}
