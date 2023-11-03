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
@RequestMapping("/person")
public class PersonAPI {

    private final PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Object> save(@RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.ok(person);

    }

    @PostMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Person person) {
        personService.update(person);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<Object> remove(@PathVariable long id) {
        personService.remove(id);
        return ResponseEntity.ok("deleted");
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/findOne/{id}")
    public ResponseEntity<Optional<Person>> findOne(@PathVariable("id") long id) {
        return ResponseEntity.ok(personService.findOne(id));
    }

}
