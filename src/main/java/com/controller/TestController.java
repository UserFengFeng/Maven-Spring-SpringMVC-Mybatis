package com.controller;

import com.model.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/aa")
public class TestController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/test")
    public String test(){
        List<Person> list = personService.selectAll();
        for (Person p: list
             ) {
            System.out.println(p);
        }
        return "test";
    }
}
