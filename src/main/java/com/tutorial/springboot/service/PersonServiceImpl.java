package com.tutorial.springboot.service;

import com.tutorial.springboot.model.Person;
import com.tutorial.springboot.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }

    @Override
    public Person getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }

    @Override
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}