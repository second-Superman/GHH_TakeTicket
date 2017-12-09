package cn.ucai.util;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import cn.ucai.dto.RequestAction;
import cn.ucai.dto.RequestMsg;
import cn.ucai.taketicket.net.TakeTicketNet;

public class CloseWindowAdapter extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		RequestMsg requestMsg=new RequestMsg();
		requestMsg.setAction(RequestAction.CLOSE_CLIENT);
		TakeTicketNet.getInstanse().sendMsg(requestMsg);
	}

}
