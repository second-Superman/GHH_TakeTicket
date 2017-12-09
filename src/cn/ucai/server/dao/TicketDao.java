package cn.ucai.server.dao;

import java.util.List;

import cn.ucai.entity.Ticket;

/**
 * Ticket的Dao接口
 * @author Administrator
 *
 */
public interface TicketDao extends BaseDao<Ticket>{
	public int selectCount(Ticket t);
	public Ticket selectByIsCalled(Integer iscalled,String b_code,String createtime);
	public boolean UpdateByIscalled(Integer iscalled,Integer caller_id ,Integer id);
	public boolean UpdateByState(Integer state,Integer id);
}
