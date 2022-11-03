package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    User getUserById(Long id);

    void updateUserById(User user);

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    User getUserByName(String username);

}

