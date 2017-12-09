package cn.ucai.server.service.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.ucai.entity.Systemlog;
import cn.ucai.entity.Ticket;
import cn.ucai.server.dao.SystemlogDao;
import cn.ucai.server.dao.TicketDao;
import cn.ucai.server.dao.Impl.SystemlogDaoImpl;
import cn.ucai.server.dao.Impl.TicketDaoImpl;
import cn.ucai.server.service.Call_Dispose_FailService;


public class Call_Dispose_FailServiceImpl implements Call_Dispose_FailService{
	TicketDao ticketDao=new TicketDaoImpl();
	SystemlogDao sl=new SystemlogDaoImpl();
	@Override
	public Ticket DisposeFail(Integer id,String username) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		Systemlog s=new Systemlog();
		s.setUsername(username);
		s.setCreatetime(df.format(date));
		s.setContent("办理失败");
		s.setIp("192.168.1.67");
		
		sl.insert(s);
		Ticket t=ticketDao.selectById(id);
		if(null==t){
			return null;
		}else{
		boolean result=ticketDao.UpdateByState(2, t.getId());
		Ticket ticket=ticketDao.selectById(t.getId());
		return ticket;
		}
	}

}
