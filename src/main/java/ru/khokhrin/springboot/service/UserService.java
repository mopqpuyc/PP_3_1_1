package ru.khokhrin.springboot.service;

import ru.khokhrin.springboot.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    User showUser(Long id);
    List<User> showAllUsers();
    void editUser(User user);
    void deleteUser(Long id);
}
