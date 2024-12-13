package com.mycompany.dao;



import org.springframework.data.repository.CrudRepository;

import com.mycompany.entity.Image;

public interface ImageDao extends CrudRepository<Image ,Integer> {

}
