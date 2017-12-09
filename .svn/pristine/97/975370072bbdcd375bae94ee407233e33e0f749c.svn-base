package cn.ucai.server.action;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Ticket;
/**
 * 请求  重复叫号
 * @author Administrator
 *
 */
import cn.ucai.server.service.Call_ReCallService;
import cn.ucai.server.service.Impl.Call_RecallserviceImpl;
public class Call_ReCallAction implements BaseAction{
	Call_ReCallService Call_Re=new Call_RecallserviceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		//
		Ticket ticket=Call_Re.ReCall((Integer) requestMsg.getData().get("id"));
		
		//封装响应对象
		ResponseMsg responseMsg = new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("重复叫号成功");
		responseMsg.setData(ticket);
		return responseMsg;
	}

}
