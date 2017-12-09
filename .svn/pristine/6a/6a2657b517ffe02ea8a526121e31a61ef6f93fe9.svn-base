package cn.ucai.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.ucai.util.RowMapper;

public class UserRowMapper implements RowMapper{

	@Override
	public Object getEntity(ResultSet rs) throws SQLException {
		User user=new User();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setTruename(rs.getString("truename"));
		user.setSex(rs.getInt("sex"));
		user.setPhone(rs.getString("phone"));
		user.setRole(rs.getInt("role"));
		return user;
	}

}
