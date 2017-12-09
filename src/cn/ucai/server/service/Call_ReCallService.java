package cn.ucai.server.service;

import cn.ucai.entity.Ticket;

/**
 * 重复叫号的处理接口
 * @author Administrator
 *
 */
public interface Call_ReCallService {
	/**
	 * 重复叫号
	 */
	
	public Ticket ReCall(Integer id);
	
}
