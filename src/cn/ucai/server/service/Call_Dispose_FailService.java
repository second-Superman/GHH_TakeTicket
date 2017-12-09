package cn.ucai.server.service;

import cn.ucai.entity.Ticket;

/**
 * 办理失败的处理接口
 * @author Administrator
 *
 */
public interface Call_Dispose_FailService {
/**
 * 办理失败
 * @param id
 * @return
 */
	public Ticket DisposeFail(Integer id,String username);
}
