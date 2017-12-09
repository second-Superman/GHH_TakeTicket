package cn.ucai.server.dao.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

import cn.ucai.entity.Business;
import cn.ucai.entity.BusinessRowMapper;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.util.JdbcUtils;

public class BusinessDaoImpl implements BusinessDao {

	@Override
	public List<Business> selectList(Business t) {
		Connection conn = null;
		List<Business> businesslist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "Select * from business where 1=1 ";
			List pList=new ArrayList();
			if(t.getDisabled()!=null){
				sql+="and disabled=?";
				pList.add(t.getDisabled());
			}
			
			Object[] parms=pList.toArray();
			businesslist = JdbcUtils.executeQuery(conn, sql, parms, new BusinessRowMapper());
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return businesslist;
	}

	
	
	@Override
	public Business selectById(Integer id) {
		Connection conn = null;
		List businesslist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from business where id=?";
			Integer[] params = { id };
			businesslist = JdbcUtils.executeQuery(conn, sql, params, new BusinessRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (businesslist.size() != 0) {
			return (Business) businesslist.get(0);
		}
		return null;
	}

	@Override
	public boolean insert(Business t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into business(code,name,description,maxcount,start_time,end_time,disabled) values (?,?,?,?,?,?,?)";
			Object[] params = new Object[7];
			params[0] = t.getCode();
			params[1] = t.getName();
			params[2] = t.getDescription();
			params[3] = t.getMaxcount();
			params[4] = t.getStart_time();
			params[5] = t.getEnd_time();
			params[6] = t.getDisabled();
			row = JdbcUtils.executeUpdate(conn, sql, params);
			System.out.println(row);
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
	public boolean update(Business t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update business set code=?,name=?,description=?,maxcount=?,start_time=?,end_time=?,disabled=? where id=?";
			Object[] params = new Object[8];
			params[0] = t.getCode();
			params[1] = t.getName();
			params[2] = t.getDescription();
			params[3] = t.getMaxcount();
			params[4] = t.getStart_time();
			params[5] = t.getEnd_time();
			params[6] = t.getDisabled();
			params[7] = t.getId();
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (Exception e) {
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
			String sql = "delete from business where id=?";
			Integer[] params = { id };
			JdbcUtils.executeUpdate(conn, sql, params);
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
	public boolean DisabledById(Integer disabled, Integer id) {
		
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update business set disabled=? where id=?";
			Object[] params = {disabled,id};
			
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (Exception e) {
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
	public boolean DisByCode(Integer disabled, String code) {
		
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update business set disabled=? where code=?";
			Object[] params = {disabled,code};
			
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (Exception e) {
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
	public boolean DisByName(Integer disabled, String name) {
		
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update business set disabled=? where name=?";
			Object[] params = {disabled,name};
			
			row = JdbcUtils.executeUpdate(conn, sql, params);
		} catch (Exception e) {
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
	public Business selectByCode(String code) {
		
		Connection conn = null;
		List businesslist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from business where code=?";
			String[] params = { code };
			businesslist = JdbcUtils.executeQuery(conn, sql, params, new BusinessRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (businesslist.size() != 0) {
			return (Business) businesslist.get(0);
		}
		return null;
	}




	@Override
	public Business selectByName(String name) {
		
		Connection conn = null;
		List businesslist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from business where name=?";
			String[] params = { name };
			businesslist = JdbcUtils.executeQuery(conn, sql, params, new BusinessRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (businesslist.size() != 0) {
			return (Business) businesslist.get(0);
		}
		return null;
	}
	
}
