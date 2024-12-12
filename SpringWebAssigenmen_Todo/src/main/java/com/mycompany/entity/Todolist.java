package com.mycompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todolist {

	  @Id
	  Integer t_no;
	  String t_name;
	  String t_msg;
	public Integer getT_no() {
		return t_no;
	}
	public void setT_no(Integer t_no) {
		this.t_no = t_no;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_msg() {
		return t_msg;
	}
	public void setT_msg(String t_msg) {
		this.t_msg = t_msg;
	}
}
