package com.mycompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
	Integer E_Id;
     String E_Name;
     Double E_Salary;
	public Integer getE_Id() {
		return E_Id;
	}
	public void setE_Id(Integer e_Id) {
		E_Id = e_Id;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}
	public Double getE_Salary() {
		return E_Salary;
	}
	public void setE_Salary(Double e_Salary) {
		E_Salary = e_Salary;
	}
     
}
