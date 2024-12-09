package com.mycompany;

import java.security.spec.MGF1ParameterSpec;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycompany.dao.FacultyDao;
import com.mycompany.entity.Faculty;

@SpringBootApplication
public class SpringWebAssigenmenApplication {

	public static void main(String[] args) {
	ApplicationContext con=	SpringApplication.run(SpringWebAssigenmenApplication.class, args);
	
	FacultyDao fd=con.getBean(FacultyDao.class);
	Scanner sc=new Scanner(System.in);
	Faculty f=new Faculty();
//	System.out.println("Enter your Id:");
//	int id=sc.nextInt();
//	sc.nextLine();
//	System.out.println("Enter your name:");
//	String na=sc.nextLine();
//
//	System.out.println("Enter your Salary:");
//	double sa=sc.nextDouble();
//	f.setF_Id(id);
//	f.setF_Name(na);
//	f.setF_Salary(sa);
//	
//	fd.save(f);
	
//	System.out.println("Enter your Id:");
//	int id=sc.nextInt();
//	sc.nextLine();
	
//	Optional<Faculty> fl=fd.findById(id);
//	if(f.isp)
//	Iterable<Faculty> f1=fd.findAll();
//	for (Faculty fac : f1) {
//		System.out.println(fac.getF_Name());
//	}
	
	Faculty f1=fd.findById(101).get();
	
		System.out.println(f1.getF_Name());
	
	
	}

}
