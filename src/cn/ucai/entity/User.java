package cn.ucai.entity;
/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {
	//会根据默认值的区别。能否为空
	private Integer id;
	private  String username;//用户名
	private String  password;//密码
	private String  truename;//姓名 
	private int  sex;//性别	0保密 1男 2女
	private String  phone;//电话
	private int role;//角色	1超级管理员2普通管理员3柜员
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", truename=" + truename
				+ ", sex=" + sex + ", phone=" + phone + ", role=" + role + "]";
	}
	
	
	
}
