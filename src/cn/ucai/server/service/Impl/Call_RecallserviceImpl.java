package cn.ucai.server.service.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.ucai.entity.Business;
import cn.ucai.entity.Ticket;
import cn.ucai.entity.Window;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.server.dao.TicketDao;
import cn.ucai.server.dao.WindowDao;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;
import cn.ucai.server.dao.Impl.TicketDaoImpl;
import cn.ucai.server.dao.Impl.WindowDaoImpl;
import cn.ucai.server.service.Call_ReCallService;

public class Call_RecallserviceImpl implements Call_ReCallService{
	TicketDao ticketDao=new TicketDaoImpl();
	

	
	@Override
	public Ticket ReCall(Integer id) {
		//根据小票id，获取小票
		
		
		 Ticket ticket=ticketDao.selectById(id);
		
		
			return ticket;
		
		
	}

}
