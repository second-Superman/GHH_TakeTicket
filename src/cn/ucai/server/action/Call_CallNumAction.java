package cn.ucai.server.action;

import java.util.List;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Ticket;
import cn.ucai.server.service.Call_NumService;
import cn.ucai.server.service.Impl.Call_NumserviceImpl;

/**
 * 请求叫号
 * @author Administrator
 *
 */
public class Call_CallNumAction implements BaseAction{
	Call_NumService CallNumService=new Call_NumserviceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		
		Ticket ticket=CallNumService.CallNum((Integer) requestMsg.getData().get("no"),(String)requestMsg.getData().get("username"));
		//封装响应请求
		ResponseMsg responseMsg=new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("叫号成功");
		responseMsg.setData(ticket);
		return responseMsg;
	}

}
