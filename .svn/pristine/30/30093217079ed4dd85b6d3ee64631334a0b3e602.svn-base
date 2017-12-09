package cn.ucai.server.action;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Ticket;
import cn.ucai.server.service.Call_Dispose_FailService;
import cn.ucai.server.service.Impl.Call_Dispose_FailServiceImpl;

public class Call_Dispose_FailAction implements BaseAction{
	Call_Dispose_FailService Call_D_F=new Call_Dispose_FailServiceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		//
		Ticket ticket=Call_D_F.DisposeFail((Integer) requestMsg.getData().get("id"),(String)requestMsg.getData().get("username"));
		//封装响应的数据
		ResponseMsg responseMsg=new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("办理失败");
		responseMsg.setData(ticket);
		return responseMsg;
	}

}
