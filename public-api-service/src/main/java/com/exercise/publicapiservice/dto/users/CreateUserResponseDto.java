package com.exercise.publicapiservice.dto.users;

public class CreateUserResponseDto {

    private UserDto user;

    public UserDto getUser() { return user; }
    public void setUser(UserDto user) { this.user = user; }

    public static class UserDto {
        private Integer id;
        private String name;
        private Long createdAt;
        private Long updatedAt;

        public Integer getId()
        {
            return id;
        }
        public void setId(Integer id)
        {
            this.id = id;
        }

        public String name()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public Long getCreatedAt()
        {
            return createdAt;
        }
        public void setCreatedAt(Long createdAt)
        {
            this.createdAt = createdAt;
        }

        public Long getUpdatedAt()
        {
            return updatedAt;
        }
        public void setUpdatedAt(Long updatedAt)
        {
            this.updatedAt = updatedAt;
        }
    }
}
