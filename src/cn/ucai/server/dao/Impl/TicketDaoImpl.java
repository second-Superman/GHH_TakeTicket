package cn.ucai.server.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.entity.Business;
import cn.ucai.entity.BusinessRowMapper;
import cn.ucai.entity.Ticket;
import cn.ucai.entity.TicketRowMapper;
import cn.ucai.server.dao.TicketDao;

import cn.ucai.util.JdbcUtils;

public class TicketDaoImpl implements TicketDao {

	@Override
	public List<Ticket> selectList(Ticket t) {
		Connection conn = null;
		List ticketlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from ticket";
			ticketlist = JdbcUtils.executeQuery(conn, sql, null, new TicketRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		return ticketlist;
	}
	
	
	
	

	@Override
	public Ticket selectById(Integer id) {
		Connection conn = null;
		List ticketlist = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select * from ticket where id=?";
			Integer[] params = { id };
			ticketlist = JdbcUtils.executeQuery(conn, sql, params, new TicketRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		if (ticketlist.size() != 0) {
			return (Ticket) ticketlist.get(0);
		}
		return null;
	}

	@Override
	public Ticket selectByIsCalled(Integer iscalled,String b_code,String createtime) {
		Connection conn = null;
		List ticketlist = null;
		try {
			conn = JdbcUtils.getConnection();
			
			String sql = "select * from ticket t where iscalled=? and b_code=? and SUBSTR(t.createtime,1,10) =? order by id asc";
			Object[] params = { iscalled,b_code,createtime };
			ticketlist = JdbcUtils.executeQuery(conn, sql, params, new TicketRowMapper());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		
		if (ticketlist.size() != 0) {
			return (Ticket) ticketlist.get(0);
		}
		return null;
	}
	@Override
	public boolean insert(Ticket t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "insert into ticket (b_code,number,count,createtime,iscalled,calledtime,state,finishtime,caller_id,istransact) values (?,?,?,?,?,?,?,?,?,?)";
			Object[] params = new Object[10];
			params[0] = t.getB_code();
			params[1] = t.getNumber();
			params[2] = t.getCount();
			params[3] = t.getCreatetime();
			params[4] = t.getIscalled();
			params[5] = t.getCalledtime();
			params[6] = t.getState();
			params[7] = t.getFinishtime();
			params[8] = t.getCaller_id();
			params[9] = t.getIstransact();
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
	public boolean update(Ticket t) {
		Connection conn = null;
		int row = 0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update ticket set b_code=?,number=?,count=?,createtime=?,iscalled=?,calledtime=?,state=?,finishtime=?,called_id=?,istransact=? where id=?";
			Object[] params = new Object[11];
			params[0] = t.getB_code();
			params[1] = t.getNumber();
			params[2] = t.getCount();
			params[3] = t.getCreatetime();
			params[4] = t.getIscalled();
			params[5] = t.getCalledtime();
			params[6] = t.getState();
			params[7] = t.getFinishtime();
			params[8] = t.getCaller_id();
			params[9] = t.getIstransact();
			params[10] = t.getId();
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
			String sql = "delete from ticket where id=?";
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
	

	@Override
	public int selectCount(Ticket t) {
		Connection conn = null;
		
		try {
			conn = JdbcUtils.getConnection();
			String sql = "select count(*) from ticket t where 1=1 ";
			List pList = new ArrayList();
			//判断是否有b_code条件
			if(t.getB_code()!=null) {
				sql += "and b_code=? ";
				pList.add(t.getB_code());
			}
			//判断时间是否是今天的条件
			if(t.getCreatetime()!=null) {
				sql += "and SUBSTR(t.createtime,1,10) = CURRENT_DATE()";
			}
			//判断为被叫的条件
			if(t.getCalledtime()!=null) {
				sql += "and t.isCalled=? ";
				pList.add(t.getIscalled());
			}
			Object[] params = pList.toArray();
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			System.out.println(stmt);
			if(null!=params && params.length>0){
				for(int i=1;i<=params.length;i++){
					stmt.setObject(i, params[i-1]);
				}
			}
			ResultSet rs = stmt.executeQuery();
			rs.next();
			
			return rs.getInt(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}





	@Override
	public boolean UpdateByIscalled(Integer iscalled,Integer caller_id ,Integer id) {
		
		Connection conn = null;
		int row=0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update ticket set iscalled=? ,calledtime=now(),caller_id=?  where id=?";
			
			Object[] params={iscalled,caller_id,id};
			
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
	public boolean UpdateByState(Integer state, Integer id) {
		

		Connection conn = null;
		int row=0;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update ticket set state=?,finishtime=now() where id=?";
			
			Object[] params={state,id};
			
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
