package com.abolfazl.model.service;

import com.abolfazl.model.entity.Car;
import com.abolfazl.model.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    void save(Person person);

    void update(Person person);

    void remove(Person person);

    List<Person> findAll();

    Optional<Person> findOne(long id);
}
