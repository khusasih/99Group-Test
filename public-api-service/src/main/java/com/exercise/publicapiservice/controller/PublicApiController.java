package com.exercise.publicapiservice.controller;

import com.exercise.publicapiservice.dto.listing.*;
import com.exercise.publicapiservice.dto.users.*;
import com.exercise.publicapiservice.service.PublicApiService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public-api")
public class PublicApiController {

    @Autowired
    private PublicApiService publicApiService;

    @GetMapping("/listings")
    public GetListingsResponseDto getListings(
            @RequestParam(defaultValue = "1") @Min(1) Integer pageNum,
            @RequestParam(defaultValue = "10") @Min(1) Integer pageSize,
            @RequestParam(required = false) Integer userId
    ) {
        GetListingsRequestDto request = new GetListingsRequestDto();
        request.setPageNum(pageNum);
        request.setPageSize(pageSize);
        request.setUserId(userId);

        return publicApiService.getListings(request);
    }

    @PostMapping("/users")
    public CreateUserResponseDto createUser(
            @Valid @RequestBody CreateUserRequestDto request
    ) {
        return publicApiService.createUser(request);
    }

    @PostMapping("/listings")
    public ListingDto createListing(
            @Valid @RequestBody ListingDto request
    ) {
        return publicApiService.createListing(request);
    }
}
