package cn.ucai.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.ucai.util.RowMapper;

public class WindowRowMapper implements RowMapper{

	@Override
	public Object getEntity(ResultSet rs) throws SQLException {
		Window window=new Window();
		window.setId(rs.getInt("id"));
		window.setNo(rs.getInt("no"));
		window.setB_id(rs.getInt("b_id"));
		
		window.setDisabled(rs.getInt("disabled"));
		return window;
	}

}
