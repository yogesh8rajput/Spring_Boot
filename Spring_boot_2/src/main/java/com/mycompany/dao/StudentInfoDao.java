package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.StudentInfo;

public interface StudentInfoDao extends CrudRepository<StudentInfo, Integer> {

}
