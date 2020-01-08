package com.dsmanioto.service;

import com.dsmanioto.domain.Person;

import java.util.Optional;

public interface PersonService {

    Optional<Person> findById(Long id);

    Iterable<Person> findAll();

    Person save(Person person);

    boolean delete(Long id);

}
