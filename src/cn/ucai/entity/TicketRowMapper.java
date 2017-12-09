package cn.ucai.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.ucai.util.RowMapper;

public class TicketRowMapper implements RowMapper{

	@Override
	public Object getEntity(ResultSet rs) throws SQLException {
		Ticket ticket=new Ticket();
		ticket.setId(rs.getInt("id"));
		ticket.setB_code(rs.getString("b_code"));
		ticket.setNumber(rs.getString("number"));
		ticket.setCount(rs.getInt("count"));
		ticket.setCreatetime(rs.getString("createtime"));
		ticket.setIscalled(rs.getInt("iscalled"));
		ticket.setCalledtime(rs.getString("calledtime"));
		ticket.setState(rs.getInt("state"));
		ticket.setFinishtime(rs.getString("finishtime"));
		ticket.setCaller_id(rs.getInt("caller_id"));
		ticket.setIstransact(rs.getInt("istransact"));
		return ticket;
	}

}
