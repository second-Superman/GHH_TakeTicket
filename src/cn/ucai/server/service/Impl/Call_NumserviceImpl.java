package cn.ucai.server.service.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.ucai.entity.Business;
import cn.ucai.entity.Ticket;
import cn.ucai.entity.User;
import cn.ucai.entity.Window;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.server.dao.TicketDao;
import cn.ucai.server.dao.UserDao;
import cn.ucai.server.dao.WindowDao;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;
import cn.ucai.server.dao.Impl.TicketDaoImpl;
import cn.ucai.server.dao.Impl.UserDaoImpl;
import cn.ucai.server.dao.Impl.WindowDaoImpl;
import cn.ucai.server.service.Call_NumService;

/**
 * 叫号
 * 
 * @author Administrator
 *
 */
public class Call_NumserviceImpl implements Call_NumService {
	TicketDao ticketDao = new TicketDaoImpl();
	WindowDao windowDao = new WindowDaoImpl();
	BusinessDao bDao = new BusinessDaoImpl();

	@Override
	public Ticket CallNum(Integer no,String username) {
		// 根据窗口号，获取业务
		Window window = windowDao.selectByNo(no);
		Business business = bDao.selectById(window.getB_id());

		Ticket ticket = new Ticket();
		ticket.setB_code(business.getCode());
		// 根据bid和iscalled查询第一条数据并返回
		
		UserDao ud=new UserDaoImpl();
		User u=ud.selectByUsername(username);
		u.getId();
		
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		df.format(date);
		ticket = ticketDao.selectByIsCalled(0, business.getCode(), df.format(date));
		if (null != ticket){
			ticketDao.UpdateByIscalled(1,u.getId(), ticket.getId());
		}
		return ticket;
	}

	

	

}
