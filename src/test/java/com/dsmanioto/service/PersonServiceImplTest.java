package com.dsmanioto.service;

import com.dsmanioto.domain.Person;
import com.dsmanioto.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonServiceImplTest {

    @Test
    public void testFindBiId() {
        Person person = new PersonServiceImpl().findById(1L);

        assertNotNull(person);
        assertEquals(person.getId(), 1L);
    }

}
