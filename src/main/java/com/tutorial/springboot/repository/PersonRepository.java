package com.tutorial.springboot.repository;

import com.tutorial.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

