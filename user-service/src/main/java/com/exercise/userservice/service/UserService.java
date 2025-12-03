package com.exercise.userservice.service;

import com.exercise.userservice.dto.CreateUserRequestDto;
import com.exercise.userservice.dto.GetUserRequestDto;
import com.exercise.userservice.dto.GetUserResponseDto;
import com.exercise.userservice.entity.User;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Integer id);

    User createUser(@Valid CreateUserRequestDto user);

    User updateUser(Integer id, User user);

    void deleteUser(Integer id);

    GetUserResponseDto getUsers(GetUserRequestDto request);
}
