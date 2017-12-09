package cn.ucai.server.action;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Ticket;
import cn.ucai.server.service.Call_Dispose_SuccessService;
import cn.ucai.server.service.Impl.Call_Dispose_SuccessServiceImpl;

public class Call_Dispose_SuccessAction implements BaseAction{
	Call_Dispose_SuccessService Call_Dis_Success=new Call_Dispose_SuccessServiceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		//
		Ticket ticket=Call_Dis_Success.Dispose_Success((Integer) requestMsg.getData().get("id"),(String)requestMsg.getData().get("username"));
		//封装响应的请求
		ResponseMsg responseMsg=new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("办理成功");
		responseMsg.setData(ticket);
		return responseMsg;
	}

}
