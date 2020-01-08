package com.dsmanioto.service.impl;

import com.dsmanioto.domain.Person;
import com.dsmanioto.service.PersonService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person findById(Long id) {
        Person p = new Person();
        p.setId(id);
        p.setName("Daniel");
        p.setBirthDate(LocalDate.of(1987, Month.JUNE, 9));
        return p;
    }

}
