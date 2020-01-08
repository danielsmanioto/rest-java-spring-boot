package com.dsmanioto.service;

import com.dsmanioto.domain.Person;
import org.springframework.stereotype.Service;

public interface PersonService {

    Person findById(Long id);

}
