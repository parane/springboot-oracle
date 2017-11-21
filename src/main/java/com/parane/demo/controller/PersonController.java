package com.parane.demo.controller;

import com.parane.demo.entity.Person;
import com.parane.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("person/{id}")
    @ResponseBody
    public String showPerson(@PathVariable Integer id){
        Person person = personService.getPerson(1);
        return person.getName();
    }

}
