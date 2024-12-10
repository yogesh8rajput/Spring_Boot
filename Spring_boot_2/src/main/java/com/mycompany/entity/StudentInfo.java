package com.mycompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {
     @Id
	Integer rollno;
	String name;
	double per;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
}
