package com.springjpapractice.restapipractice.controller;

import com.springjpapractice.restapipractice.entity.User;
import com.springjpapractice.restapipractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
@Autowired
    private UserService userService;
    //create user rest api
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    //create a rest api for getUserId
    @GetMapping("{id}")
            public ResponseEntity<User> getUserId(@PathVariable("id")long userId){
        User user = userService.getUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
        }
    //build restapi to get all users
    @GetMapping
    public ResponseEntity<List<User>>getAllUsers(){
        List<User> users = userService.fetchAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
    //build rest api to update a user
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") long userId,@RequestBody User user){
    user.setId(userId);
    User updatedUser = userService.updateUser(user);
    return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
    //build a rest api to delete an user
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User successfully deleted",HttpStatus.OK);
    }

}
