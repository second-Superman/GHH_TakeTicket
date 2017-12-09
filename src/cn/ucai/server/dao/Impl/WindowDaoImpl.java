package cn.ucai.server.dao.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.entity.Business;
import cn.ucai.entity.User;
import cn.ucai.entity.UserRowMapper;
import cn.ucai.entity.Window;
import cn.ucai.entity.WindowRowMapper;
import cn.ucai.server.dao.WindowDao;
import cn.ucai.util.JdbcUtils;

public class WindowDaoImpl implements WindowDao {

	@Override
	public List<Window> selectList(Window t) {
		Connection conn = null;
		List<Window> windowlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from window where 1=1 ";
			List pList=new ArrayList();
			if(t.getDisabled() != null){
				sql+="and disabled=?";
				pList.add(t.getDisabled());
			}
			
			Object[] parms=pList.toArray();
			windowlist = JdbcUtils.executeQuery(conn, sql, parms, new WindowRowMapper());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}

		return windowlist;
	}

	@Override
	public Window selectById(Integer id) {

		Connection conn = null;
		List windowlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from window where id=?";
			Integer[] params = { id };
			windowlist = JdbcUtils.executeQuery(conn, sql, params, new WindowRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (windowlist.size() != 0) {
			return (Window) windowlist.get(0);
		}
		return null;
	}
	@Override
	public Window selectByNo(int no) {

		Connection conn = null;
		List windowlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from window where no=?";
			Integer[] params = { no };
			windowlist = JdbcUtils.executeQuery(conn, sql, params, new WindowRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (windowlist.size() != 0) {
			return (Window) windowlist.get(0);
		}
		return null;
	}

	

	@Override
	public boolean insert(Window t) {
		Connection conn = null;

		int row = 0;

		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into window (no,b_id,disabled) values (?,?,?)";
			Object[] params = new Object[3];
			params[0] = t.getNo();
			params[1] = t.getB_id();
			params[2] = t.getDisabled();

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
	public boolean update(Window t) {

		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update window set no=?,b_id=?,disabled=? where id=?";
			Object[] params = new Object[4];
			params[0] = t.getNo();
			params[1] = t.getB_id();
			params[2] = t.getDisabled();
			params[3] = t.getId();

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
			String sql = "delete from window where id=?";
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


	@Override
	public boolean UpdateByNo(int disabled,int no) {
		
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update window set disabled=? where no=?";
			Object[] params = {disabled,no};
			
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
