package cn.ucai.server.dao;

import cn.ucai.entity.Window;

/**
 * Window的Dao接口
 * @author Administrator
 *
 */
public interface WindowDao extends BaseDao<Window>{
	public Window selectByNo(int no);
	public boolean UpdateByNo(int no,int disabled);
}
