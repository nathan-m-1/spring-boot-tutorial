package com.tutorial.springboot.httpinterfaces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

// Interface del cliente HTTP
@HttpExchange(url = "/users")
public interface UserClient {

    @GetExchange("/{id}")
    User getUserById(@PathVariable int id);

    @GetExchange
    List<User> getAllUsers();
}
