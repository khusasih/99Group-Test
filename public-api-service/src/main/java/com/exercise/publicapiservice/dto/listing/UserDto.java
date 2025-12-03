package com.exercise.publicapiservice.dto.listing;

public class UserDto {
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
