package cn.ucai.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.ucai.util.RowMapper;

public class BusinessRowMapper implements RowMapper{

	@Override
	public Object getEntity(ResultSet rs) throws SQLException {
		Business business= new Business();
		business.setId(rs.getInt("id"));
		business.setCode(rs.getString("code"));
		business.setName(rs.getString("name"));
		business.setDescription(rs.getString("description"));
		business.setMaxcount(rs.getInt("maxcount"));
		business.setStart_time(rs.getString("start_time"));
		business.setEnd_time(rs.getString("end_time"));
		business.setDisabled(rs.getInt("disabled"));
		return business;
	}

}
