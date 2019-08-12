package com.controller;

import com.dao.PersonDao;
import com.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class PersonDaoTest {

    @Autowired
    private PersonDao personDao;

    @Test
    public void selectAll() {
        List<Person> list = personDao.selectAll();
        for (Person p: list
        ) {
            System.out.println(p.toString());
        }
    }
}
