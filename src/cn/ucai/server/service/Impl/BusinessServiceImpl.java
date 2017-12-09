package cn.ucai.server.service.Impl;

import java.util.ArrayList;
import java.util.List;

import cn.ucai.entity.Business;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;
import cn.ucai.server.service.BusinessService;

public class BusinessServiceImpl implements BusinessService{

	BusinessDao businessDao=new BusinessDaoImpl();
	@Override
	public List<Business> selectAll() {
		
		List<Business> businesslist=new ArrayList<>();
		Business business=new Business();
		
		business.setDisabled(1);
		return businessDao.selectList(business);
		
	}

}
