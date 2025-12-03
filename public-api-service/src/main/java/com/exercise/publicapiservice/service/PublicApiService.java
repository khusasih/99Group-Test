package com.exercise.publicapiservice.service;

import com.exercise.publicapiservice.dto.listing.*;
import com.exercise.publicapiservice.dto.users.CreateUserRequestDto;
import com.exercise.publicapiservice.dto.users.CreateUserResponseDto;
import org.springframework.stereotype.Service;

@Service
public class PublicApiService {

    public GetListingsResponseDto getListings(GetListingsRequestDto request) {
        GetListingsResponseDto response = new GetListingsResponseDto();
        response.setResult(true);
        response.setListings(null);
        return response;
    }

    public CreateUserResponseDto createUser(CreateUserRequestDto request) {
        CreateUserResponseDto.UserDto user = new CreateUserResponseDto.UserDto();
        user.setId(1);
        user.setName(request.getName());
        user.setCreatedAt(System.currentTimeMillis());
        user.setUpdatedAt(System.currentTimeMillis());

        CreateUserResponseDto response = new CreateUserResponseDto();
        response.setUser(user);
        return response;
    }

    public ListingDto createListing(ListingDto listing) {
        listing.setId(100);
        listing.setCreatedAt(System.currentTimeMillis());
        listing.setUpdatedAt(System.currentTimeMillis());
        return listing;
    }
}
