package com.tutorial.springboot.repository;


import com.tutorial.springboot.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personRest")
public interface PersonRepositoryRest extends CrudRepository<Person, Long> {
}
