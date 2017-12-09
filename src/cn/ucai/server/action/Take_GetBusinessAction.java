package cn.ucai.server.action;

import java.util.List;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Business;
/**
 * 请求业务
 * @author Administrator
 *
 */
import cn.ucai.server.service.BusinessService;
import cn.ucai.server.service.Impl.BusinessServiceImpl;
public class Take_GetBusinessAction implements BaseAction {
	BusinessService businessService=new BusinessServiceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		
		
		//调用Service
		
		List<Business> businesslist=businessService.selectAll();
		ResponseMsg responseMsg =new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("查询成功");
		responseMsg.setData(businesslist);
		return responseMsg;
	}

}
