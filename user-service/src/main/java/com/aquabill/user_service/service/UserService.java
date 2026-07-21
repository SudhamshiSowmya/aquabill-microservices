package com.aquabill.user_service.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquabill.user_service.model.User;
import com.aquabill.user_service.repository.UserRepository;



@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;



    // CREATE USER
    public User createUser(User user) {

        return userRepository.save(user);
    }



    // GET ALL USERS
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }



    // GET USER BY ID
    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("User not found with id : " + id)
                );
    }



    // UPDATE USER
    public User updateUser(Long id, User user) {


        User existingUser = userRepository.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("User not found with id : " + id)
                );


        existingUser.setName(user.getName());

        existingUser.setEmail(user.getEmail());

        existingUser.setPhone(user.getPhone());


        return userRepository.save(existingUser);
    }



    // DELETE USER
    public void deleteUser(Long id) {


        User existingUser = userRepository.findById(id)
                .orElseThrow(
                    () -> new RuntimeException("User not found with id : " + id)
                );


        userRepository.delete(existingUser);
    }

}