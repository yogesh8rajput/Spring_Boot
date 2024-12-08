package com.mycompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Faculty {
   @Id
   private Integer F_Id;
   private String F_Name;
   private Double F_Salary;
public Integer getF_Id() {
	return F_Id;
}
public void setF_Id(Integer f_Id) {
	F_Id = f_Id;
}
public String getF_Name() {
	return F_Name;
}
public void setF_Name(String f_Name) {
	F_Name = f_Name;
}
public Double getF_Salary() {
	return F_Salary;
}
public void setF_Salary(Double f_Salary) {
	F_Salary = f_Salary;
}
   
}
