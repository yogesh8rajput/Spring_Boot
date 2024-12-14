package com.mycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class School {
       
	@Id
	Integer s_id;
	String s_name;
	@Column(columnDefinition = "LONGBLOB" )
	byte[] s_img;

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public byte[] getS_img() {
		return s_img;
	}

	public void setS_img(byte[] s_img) {
		this.s_img = s_img;
	}
	
}
