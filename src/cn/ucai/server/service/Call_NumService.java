package cn.ucai.server.service;



import java.util.List;

import cn.ucai.entity.Ticket;
import cn.ucai.entity.User;

/**
 * 叫号模块处理的接口
 * @author Administrator
 *
 */
public interface Call_NumService {
	
	/**
	 * 叫号
	 */
	public Ticket CallNum(Integer no,String username);
	
}
