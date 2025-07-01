package com.tutorial.springboot.repository;

import com.tutorial.springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

