package com.dao;

import com.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> selectAll();
}
