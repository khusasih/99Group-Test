package com.exercise.userservice.service.impl;

import com.exercise.userservice.dto.CreateUserRequestDto;
import com.exercise.userservice.dto.GetUserRequestDto;
import com.exercise.userservice.dto.GetUserResponseDto;
import com.exercise.userservice.entity.User;
import com.exercise.userservice.repository.UserRepository;
import com.exercise.userservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public User createUser(@Valid CreateUserRequestDto user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer id, User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    return userRepository.save(user);
                })
                .orElse(null);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public GetUserResponseDto getUsers(GetUserRequestDto request) {
        return null;
    }
}
