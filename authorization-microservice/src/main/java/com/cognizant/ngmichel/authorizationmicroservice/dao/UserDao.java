package com.cognizant.ngmichel.authorizationmicroservice.dao;

import com.cognizant.ngmichel.authorizationmicroservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
