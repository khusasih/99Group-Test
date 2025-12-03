package com.exercise.userservice.controller;

import com.exercise.userservice.dto.GetUserRequestDto;
import com.exercise.userservice.dto.GetUserResponseDto;
import com.exercise.userservice.dto.CreateUserRequestDto;
import com.exercise.userservice.dto.CreateUserResponseDto;
import com.exercise.userservice.entity.User;
import com.exercise.userservice.service.UserService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public GetUserResponseDto getUsers(
            @RequestParam(name = "pageNum", defaultValue = "1") @Min(1) Integer pageNum,
            @RequestParam(name = "pageSize", defaultValue = "10") @Min(1) Integer pageSize
    ) {
        GetUserRequestDto request = new GetUserRequestDto();
        request.setPageNum(pageNum - 1);
        request.setPageSize(pageSize);

        return userService.getUsers(request);
    }

    @GetMapping("/users/{id}")
    public User getUserById(
            @PathVariable @Min(1) Integer id
    ) {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public User createUser(
            @Valid CreateUserRequestDto request
    ) {
        return userService.createUser(request);
    }
}
