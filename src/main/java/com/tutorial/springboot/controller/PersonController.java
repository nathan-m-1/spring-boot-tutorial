package com.tutorial.springboot.controller;

import com.tutorial.springboot.model.Person;
import com.tutorial.springboot.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return service.save(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
