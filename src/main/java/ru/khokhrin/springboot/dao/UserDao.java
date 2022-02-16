package ru.khokhrin.springboot.dao;

import ru.khokhrin.springboot.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    User showUser(Long id);
    List<User> showAllUsers();
    void editUser(User user);
    void deleteUser(Long id);
}

