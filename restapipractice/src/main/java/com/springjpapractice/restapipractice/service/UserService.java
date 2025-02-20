package com.springjpapractice.restapipractice.service;

import com.springjpapractice.restapipractice.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserId(Long userId);

    List<User>fetchAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
