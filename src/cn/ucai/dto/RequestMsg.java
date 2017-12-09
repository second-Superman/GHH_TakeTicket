package cn.ucai.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求对象
 * @author Administrator
 *
 */
public class RequestMsg  implements Serializable{
	/**
	 * 客户端IP
	 */
	private String client_ip;
	/**
	 * 请求类型
	 */
	private RequestAction action;
	
	
	/**
	 * 请求的数据
	 */
	private Map<String,Object> data=new HashMap<String,Object>();
	
	
	public String getClient_ip() {
		return client_ip;
	}
	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}
	public RequestAction getAction() {
		return action;
	}
	public void setAction(RequestAction action) {
		this.action = action;
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
}
