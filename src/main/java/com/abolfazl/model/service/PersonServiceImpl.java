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
public class PersonServiceImpl implements PersonService {
    private final PersonDA personDA;

    @Override
    @Transactional
    public void save(Person person) {
        log.info("invoke person save . . .");
        personDA.save(person);
    }

    @Override
    @Transactional
    public void update(Person person) {
        log.info("invoke person update . . .");
        personDA.save(person);
    }

    @Override
    @Transactional
    public void remove(long id) {
        log.info("invoke person remove  . . .");
        personDA.deleteById(id);
    }

    @Override
    public List<Person> findAll() {
        log.info("invoke person findAll . . .");
        return personDA.findAll();
    }

    @Override
    public Optional<Person> findOne(long id) {
        log.info("invoke person findOne . . .");
        return personDA.findById(id);
    }
}
