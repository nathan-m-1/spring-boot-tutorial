package com.tutorial.springboot.tierarchitecture;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getById(Long id);
    Person save(Person person);
    void delete(Long id);
}
