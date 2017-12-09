package cn.ucai.server.action;


import java.util.List;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Window;
import cn.ucai.server.service.CALL_Get_NoDaoService;
import cn.ucai.server.service.Impl.CALL_Get_NoDaoServiceImpl;

/**
 * 获得窗口
 * @author Administrator
 *
 */
public class CALL_Get_NoAction implements BaseAction{
	CALL_Get_NoDaoService  Call_G_N=new CALL_Get_NoDaoServiceImpl();
	@Override
	public ResponseMsg disposeRequest(RequestMsg requestMsg) {
		
		List<Window> windowlist=Call_G_N.selectAll();
		
		ResponseMsg responseMsg =new ResponseMsg();
		responseMsg.setResult(true);
		responseMsg.setMsg("查询成功");
		responseMsg.setData(windowlist);
		return responseMsg;
	}

}
