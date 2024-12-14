package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.School;

public interface SchoolDao extends CrudRepository<School, Integer> {

}
