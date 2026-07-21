package com.aquabill.user_service.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aquabill.user_service.model.User;
import com.aquabill.user_service.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}