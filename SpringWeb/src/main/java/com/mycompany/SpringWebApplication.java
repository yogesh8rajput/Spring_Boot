package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.dao.EmployeeDao;
import com.mycompany.entity.Employee;



@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		
		
	ApplicationContext con=SpringApplication.run(SpringWebApplication.class, args);
		
		System.out.println("Tis is the insert data ");
	
	EmployeeDao ed=con.getBean(EmployeeDao.class);
	Employee e=new Employee();
	
	//Insert Data
	
	e.setE_Id(101);
	e.setE_Name("Rahul");
	e.setE_Salary(10000.0);
	
	ed.save(e);

	
	//Delete
	
//	e.setE_Id(101);
//	ed.delete(e);
//	
	System.out.println("Done");
	}

}
