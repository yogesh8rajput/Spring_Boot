package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.Todolist;

public interface TodolistDao extends CrudRepository<Todolist, Integer>{

}
