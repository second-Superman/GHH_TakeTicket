package cn.ucai.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.ucai.util.RowMapper;

public class SystemlogRowMapper implements RowMapper{

	@Override
	public Object getEntity(ResultSet rs) throws SQLException {
		Systemlog systemlog=new Systemlog();
		systemlog.setId(rs.getInt("id"));
		systemlog.setUsername(rs.getString("username"));
		systemlog.setCreatetime(rs.getString("createtime"));
		systemlog.setContent(rs.getString("content"));
		systemlog.setIp(rs.getString("ip"));
		return systemlog;
	}

}
