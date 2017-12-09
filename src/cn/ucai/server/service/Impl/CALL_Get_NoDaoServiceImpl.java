package cn.ucai.server.service.Impl;

import java.util.ArrayList;
import java.util.List;

import cn.ucai.entity.Business;
import cn.ucai.entity.Window;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.server.dao.WindowDao;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;
import cn.ucai.server.dao.Impl.WindowDaoImpl;
import cn.ucai.server.service.CALL_Get_NoDaoService;

public class CALL_Get_NoDaoServiceImpl implements CALL_Get_NoDaoService{
	WindowDao windowDao=new WindowDaoImpl();
	@Override
	public List<Window> selectAll() {
		List<Window> windowlist=new ArrayList<Window>();
		Window window=new Window();
		
		window.setDisabled(1);
		System.out.println(windowDao.selectList(window));
		return windowDao.selectList(window);
		
	}
	

}
