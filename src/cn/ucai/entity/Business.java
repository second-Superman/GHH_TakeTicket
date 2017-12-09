package cn.ucai.entity;

import java.io.Serializable;

/**
 * 业务实体类
 * @author Administrator
 *
 */
public class Business implements Serializable{
	private Integer id;
	private String code;//业务代码
	private String name;//业务名称
	private String description;//业务说明
	private int maxcount;//业务每日办理上限
	private String start_time;//开始受理时间
	private String end_time;//结束受理时间
	private Integer disabled;//是否禁用：1：未禁用 2：禁用
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMaxcount() {
		return maxcount;
	}
	public void setMaxcount(int maxcount) {
		this.maxcount = maxcount;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public Integer getDisabled() {
		return disabled;
	}
	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}
	@Override
	public String toString() {
		return "Business [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description
				+ ", maxcount=" + maxcount + ", start_time=" + start_time + ", end_time=" + end_time + ", disabled="
				+ disabled + "]";
	}
	
	
	
}
