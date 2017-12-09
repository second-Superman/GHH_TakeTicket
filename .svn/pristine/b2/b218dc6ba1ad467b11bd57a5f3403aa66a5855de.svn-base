package cn.ucai.server.service.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.ucai.entity.Business;
import cn.ucai.entity.Ticket;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.server.dao.TicketDao;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;
import cn.ucai.server.dao.Impl.TicketDaoImpl;
import cn.ucai.server.service.TakeNumService;

public class TakeNumServiceImpl implements TakeNumService{
	BusinessDao businessDao=new BusinessDaoImpl();
	TicketDao ticketDao=new TicketDaoImpl();
	static final int defaultNum = 1001;
	@Override
	public Ticket TakeNum(Integer b_id) {
		//b_id获取b_code
		Business business=businessDao.selectById(b_id);
		
		Ticket t=new Ticket();
		
		t.setB_code(business.getCode());
		
		
		t.setCreatetime("");
		int number=ticketDao.selectCount(t);
		//排队号：查询Ticket，b_code 时间
		t.setIscalled(0);
		t.setCalledtime("");
		int count=ticketDao.selectCount(t);
		//排队人数：查询Ticket， b_code 时间  isCall
		
		//新增Ticket
		Ticket ticket=new Ticket();
		ticket.setB_code(business.getCode());//业务代码
		ticket.setNumber(defaultNum+number+"");//排队号
		ticket.setCount(count);//排队人数
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ticket.setCreatetime(df.format(date));
		ticket.setIscalled(0);//未叫号
		ticket.setState(0);//未办理
		
		boolean result=ticketDao.insert(ticket);
		if(result){
			return ticket;
		}
		return null;
	}

}
