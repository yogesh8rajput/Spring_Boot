package com.mycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Company {
     
	@Id
	Integer c_id;
	String c_name;
	@Column(columnDefinition = "LONGBLOB" )
	  byte [] c_img;
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public byte[] getC_img() {
		return c_img;
	}
	public void setC_img(byte[] c_img) {
		this.c_img = c_img;
	}
	
	
	
}
