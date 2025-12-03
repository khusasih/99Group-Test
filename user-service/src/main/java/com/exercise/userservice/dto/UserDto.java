package com.exercise.userservice.dto;

public class UserDto {

    private Integer id;
    private String name;
    private Long createdAt;
    private Long updatedAt;

    public UserDto(Integer id, String name, Long createdAt, Long updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public Long getCreatedAt() { return createdAt; }
    public Long getUpdatedAt() { return updatedAt; }
}
