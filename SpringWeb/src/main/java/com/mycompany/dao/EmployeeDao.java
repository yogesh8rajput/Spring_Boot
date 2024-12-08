package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.Employee;

public interface EmployeeDao  extends CrudRepository<Employee, Integer>{

}
