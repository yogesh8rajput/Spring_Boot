package com.mycompany.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.StudentInfo;

public interface StudentInfoDao extends CrudRepository<StudentInfo, Integer> {

	
	
}
