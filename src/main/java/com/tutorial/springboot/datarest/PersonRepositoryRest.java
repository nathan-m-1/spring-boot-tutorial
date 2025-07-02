package com.tutorial.springboot.datarest;


import com.tutorial.springboot.tierarchitecture.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personRest")
public interface PersonRepositoryRest extends CrudRepository<Person, Long> {
}
