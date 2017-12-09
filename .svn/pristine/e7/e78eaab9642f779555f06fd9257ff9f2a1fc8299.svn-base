package cn.ucai.server.action;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Ticket;
import cn.ucai.server.service.TakeNumService;
import cn.ucai.server.service.Impl.TakeNumServiceImpl;

/**
 * 处理取号请求
 * 
 * @author Administrator
 *
 */
public class Take_TakeNumAction implements BaseAction {
	TakeNumService takeNumService=new TakeNumServiceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		//获取
		Ticket t=takeNumService.TakeNum((Integer) requestMsg.getData().get("business_id"));
		//封装响应对象
		ResponseMsg responseMsg=new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("取号成功");
		responseMsg.setData(t);
		
		return responseMsg;
	}

}
