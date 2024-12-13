package com.mycompany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Image {
     @Id
	int i_id;
	String i_name;
	@Column(columnDefinition = "LONGBLOB" )
	  byte[] i_img;
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public byte[] getI_img() {
		return i_img;
	}
	public void setI_img(byte[] i_img) {
		this.i_img = i_img;
	}
	
	
}
