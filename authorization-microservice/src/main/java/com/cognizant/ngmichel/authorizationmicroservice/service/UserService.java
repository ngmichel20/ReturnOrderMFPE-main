package com.cognizant.ngmichel.authorizationmicroservice.service;

import com.cognizant.ngmichel.authorizationmicroservice.model.User;
import com.cognizant.ngmichel.authorizationmicroservice.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);

    List<User> findAll();

    User findOne(String username);
}
