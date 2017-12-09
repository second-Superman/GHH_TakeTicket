package cn.ucai.server.service.Impl;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.ucai.entity.Systemlog;
import cn.ucai.entity.Ticket;
import cn.ucai.entity.User;
import cn.ucai.server.dao.SystemlogDao;
import cn.ucai.server.dao.TicketDao;
import cn.ucai.server.dao.UserDao;
import cn.ucai.server.dao.Impl.SystemlogDaoImpl;
import cn.ucai.server.dao.Impl.TicketDaoImpl;
import cn.ucai.server.dao.Impl.UserDaoImpl;
import cn.ucai.server.service.Call_Dispose_SuccessService;


public class Call_Dispose_SuccessServiceImpl implements Call_Dispose_SuccessService{
	TicketDao ticketDao=new TicketDaoImpl();
	SystemlogDao syslog=new SystemlogDaoImpl();
	//UserDao ud=new UserDaoImpl();
	@Override
	public Ticket Dispose_Success(Integer id,String username) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		//User u=ud.selectByUsername(username);
		Systemlog s=new Systemlog();
		s.setUsername(username);
		s.setCreatetime(df.format(date));
		s.setContent("办理成功");
		s.setIp("192.168.1.67");
		syslog.insert(s);
		Ticket t=ticketDao.selectById(id);
		if(null==t){
			return null;
		}else{
		boolean result=ticketDao.UpdateByState(1, t.getId());
		Ticket ticket=ticketDao.selectById(t.getId());
		return ticket;
		}
		
	}

}
