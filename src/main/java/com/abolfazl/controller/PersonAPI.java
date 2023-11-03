package com.abolfazl.controller;

import com.abolfazl.model.entity.Person;
import com.abolfazl.model.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PersonAPI {
    private final PersonService personService;

    @GetMapping("/save")
    public ResponseEntity<Object> save(@ModelAttribute Person person){
        personService.save(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/update")
    public ResponseEntity<Object> update(@ModelAttribute Person person){
        personService.update(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/remove")
    public ResponseEntity<Object> remove(@ModelAttribute Person person){
        personService.remove(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/findOne")
    public ResponseEntity<Optional<Person>> findOne(@ModelAttribute Person person){
        return ResponseEntity.ok(personService.findOne(person));
    }

}
