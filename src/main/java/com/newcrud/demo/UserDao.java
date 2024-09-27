package com.newcrud.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<Model, String>  {

}
