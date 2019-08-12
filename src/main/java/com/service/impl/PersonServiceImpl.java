package com.service.impl;

import com.dao.PersonDao;
import com.model.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//名字可以不加，默认就是首字母小写的类名
//@Service("personService")
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> selectAll() {

        return personDao.selectAll();
    }
}
