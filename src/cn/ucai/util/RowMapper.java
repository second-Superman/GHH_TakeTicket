package cn.ucai.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 实体映射类接口
 */
public interface RowMapper {
	public Object getEntity(ResultSet rs) throws SQLException;
}
