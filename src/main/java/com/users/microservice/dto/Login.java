package com.users.microservice.dto;

public class Login {
	private int id_user;
	private String name_user;
	private String date_login;
	private String time_days;
	
	public String getTime_days() {
		return time_days;
	}
	public void setTime_days(String time_days) {
		this.time_days = time_days;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getName_user() {
		return name_user;
	}
	public void setName_user(String name_user) {
		this.name_user = name_user;
	}
	public String getDate_login() {
		return date_login;
	}
	public void setDate_login(String date_login) {
		this.date_login = date_login;
	}
	
}
