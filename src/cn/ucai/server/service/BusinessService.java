package cn.ucai.server.service;

import java.util.List;

import cn.ucai.entity.Business;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;

/**
 * 业务模块的业务处理接口
 * @author Administrator
 *
 */
public interface BusinessService {
	
	
	/**
	 * 获取所有可办理的业务
	 * @return
	 */
	public List<Business> selectAll();
		
	
}
