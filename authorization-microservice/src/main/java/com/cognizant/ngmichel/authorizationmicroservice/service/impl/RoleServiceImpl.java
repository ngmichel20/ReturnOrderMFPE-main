package com.cognizant.ngmichel.authorizationmicroservice.service.impl;

import com.cognizant.ngmichel.authorizationmicroservice.dao.RoleDao;
import com.cognizant.ngmichel.authorizationmicroservice.model.Role;
import com.cognizant.ngmichel.authorizationmicroservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }
}
