package com.practice.scms.model;

/**
 * user is a model, used to transfer details from one layer to other
 */

public class User {
	
	public User() {
	
		System.out.println("USER Started");// TODO Auto-generated constructor stub
	}
	/**
	 * id of user is primary key, and Auto Increment.
	 */
	private Integer id;
	/**
	 * name of user is NN.
	 */
	private String name;
	/**
	 * contact of user.
	 */
	private String contact;
	/**
	 * address of user.
	 */
	private String email;
	/**
	 * email of user
	 */
	
	private String address;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * loginnanme of user is NN.
	 */
	private String loginname;
	/**
	 * password of user is NN.
	 */
	private String password;
	/**
	 * role of user by default 2, 1:Trainer, 2:Trainee.
	 */
	private Integer role;
	/**
	 * status of user is by default 1, 1:Active, 2:Inactive.
	 */
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
