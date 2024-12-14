package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.Company;

public interface CompanyDao extends CrudRepository<Company, Long> {

}
