package com.aquabill.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aquabill.user_service.model.User;
import com.aquabill.user_service.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;



    // CREATE USER
    @PostMapping
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);
    }



    // GET ALL USERS
    @GetMapping
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }



    // GET USER BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {

        return userService.getUserById(id);
    }



    // UPDATE USER
    @PutMapping("/{id}")
    public User updateUser(
            @PathVariable Long id,
            @RequestBody User user) {

        return userService.updateUser(id, user);
    }



    // DELETE USER
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return "User deleted successfully";
    }

}