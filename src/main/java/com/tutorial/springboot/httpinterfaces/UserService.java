package com.tutorial.springboot.httpinterfaces;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public User getUserById(int id) {
        return userClient.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userClient.getAllUsers();
    }
}
