package com.parane.demo.service;

import com.parane.demo.dao.PersonRepository;
import com.parane.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public Person getPerson(Integer id) {
        return personRepository.findOne(id);
    }
}
