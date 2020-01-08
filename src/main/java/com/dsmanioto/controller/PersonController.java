package com.dsmanioto.controller;

import com.dsmanioto.domain.Person;
import com.dsmanioto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable("id") Long id) {
        Optional<Person> person = service.findById(id);
        if (person.isPresent()) {
            return ResponseEntity.ok(person.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Person> insert(@RequestBody Person person) {
        Person personSaved = service.save(person);
        return ResponseEntity.ok(personSaved);
    }

    @PutMapping
    public ResponseEntity<Person> update(@RequestBody Person person) {
        Person personSaved = service.save(person);
        return ResponseEntity.ok(personSaved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        if (service.delete(id)) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.ok().build();
    }

}
