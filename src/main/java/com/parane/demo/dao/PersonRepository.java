package com.parane.demo.dao;

import com.parane.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>{
}
