package com.abolfazl.model.service;

import com.abolfazl.model.entity.Person;
import com.abolfazl.model.repository.PersonDA;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {
    private final PersonDA personDA;

    @Transactional
    public void save(Person person){
        log.info("invoke save . . .");
        personDA.save(person);
    }


    @Transactional
    public void update(Person person){
        log.info("invoke update . . .");
        personDA.save(person);
    }

    @Transactional
    public void remove(Person person){
        log.info("invoke remove . . .");
        personDA.delete(person);
    }

    public List<Person> findAll(){
        log.info("invoke findAll . . .");
        return personDA.findAll();
    }

    public Optional<Person> findOne(Person person){
        log.info("invoke findOne . . .");
        return personDA.findById(person.getId());
    }
}
