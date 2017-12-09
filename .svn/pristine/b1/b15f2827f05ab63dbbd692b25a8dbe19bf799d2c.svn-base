package cn.ucai.taketicket.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.util.ConfigUtil;

/**
 * 客户端（取号端）的网络层。接收和发送数据
 * 
 * @author Administrator
 *
 */
public class TakeTicketNet {
	private static Socket s;
	String serverHost = null;
	int serverPort = 0;
	private static TakeTicketNet takeTicketNet;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	/**
	 * 客户端的网络层，接收和发送连接
	 */
	private TakeTicketNet() {
		if (serverHost == null) {
			ConfigUtil config = new ConfigUtil("server.properties");
			serverHost = config.getValue("server.ip");
			serverPort = Integer.valueOf(config.getValue("server.port"));
		}

		try {
			s = new Socket(serverHost, serverPort);
			oos = new ObjectOutputStream(s.getOutputStream());
			ois = new ObjectInputStream(s.getInputStream());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * 获取取号端网络传输类的一个实例（单例模型）
	 * 
	 * @return
	 */
	public static TakeTicketNet getInstanse() {
		if (takeTicketNet == null) {
			takeTicketNet = new TakeTicketNet();
		}
		return takeTicketNet;
	}

	/**
	 * 发送数据到服务端
	 * 
	 * @param requestMsg
	 */
	public void sendMsg(RequestMsg requestMsg) {
		try {

			oos.writeObject(requestMsg);
			oos.flush();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * 从服务端接收消息
	 * 
	 * @return
	 */
	public  ResponseMsg reciverMsg() {
		try {

			return (ResponseMsg) ois.readObject();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void finalize() throws Throwable {
		ois.close();
		oos.close();
		s.close();
	}

}
