package cn.ucai.entity;

import java.io.Serializable;

/**
 * 小票实体类
 * @author Administrator
 *
 */
public class Ticket  implements Serializable{
	private Integer id;
	private String b_code;//业务代码
	private String number;//排队号
	private int count;//排队人数
	private String createtime;//取票时间
	private int iscalled;//是否被叫号：0未叫号 1已叫号
	private String calledtime;//修改时间
	private int state;//业务办理状态：0未办理 1办理成功 2办理失败 
	private String finishtime;//业务办理结束时间
	private Integer caller_id;//柜员ID
	private int istransact;//是否禁用 0未禁用 1禁用
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getB_code() {
		return b_code;
	}
	public void setB_code(String b_code) {
		this.b_code = b_code;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public int getIscalled() {
		return iscalled;
	}
	public void setIscalled(int iscalled) {
		this.iscalled = iscalled;
	}
	public String getCalledtime() {
		return calledtime;
	}
	public void setCalledtime(String calledtime) {
		this.calledtime = calledtime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getFinishtime() {
		return finishtime;
	}
	public void setFinishtime(String finishtime) {
		this.finishtime = finishtime;
	}
	public Integer getCaller_id() {
		return caller_id;
	}
	public void setCaller_id(Integer caller_id) {
		this.caller_id = caller_id;
	}
	public int getIstransact() {
		return istransact;
	}
	public void setIstransact(int istransact) {
		this.istransact = istransact;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", b_code=" + b_code + ", number=" + number + ", count=" + count + ", createtime="
				+ createtime + ", iscalled=" + iscalled + ", calledtime=" + calledtime + ", state=" + state
				+ ", finishtime=" + finishtime + ", caller_id=" + caller_id + ", istransact=" + istransact + "]";
	}
	
	
}
