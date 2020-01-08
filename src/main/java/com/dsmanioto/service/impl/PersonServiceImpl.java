package com.dsmanioto.service.impl;

import com.dsmanioto.domain.Person;
import com.dsmanioto.repository.PersonRepository;
import com.dsmanioto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public Optional<Person> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    public boolean delete(Long id) {
        Optional<Person> person = repository.findById(id);
        if (person.isPresent()) {
            repository.delete(person.get());
            return true;
        }

        return false;
    }

}
