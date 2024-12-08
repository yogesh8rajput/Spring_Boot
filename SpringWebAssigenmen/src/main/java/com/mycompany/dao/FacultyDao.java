package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.Faculty;

public interface FacultyDao extends CrudRepository<Faculty, Integer>{

}
