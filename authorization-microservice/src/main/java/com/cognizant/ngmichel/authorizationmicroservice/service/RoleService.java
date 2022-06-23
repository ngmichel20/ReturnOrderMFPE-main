package com.cognizant.ngmichel.authorizationmicroservice.service;

import com.cognizant.ngmichel.authorizationmicroservice.model.Role;

public interface RoleService {
    Role findByName(String name);
}
