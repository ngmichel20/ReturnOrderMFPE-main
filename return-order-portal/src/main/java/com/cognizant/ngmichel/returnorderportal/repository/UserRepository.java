package com.cognizant.ngmichel.returnorderportal.repository;

import com.cognizant.ngmichel.returnorderportal.model.UserApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserApp, Long> {
    UserApp findByEmail(String email);
}
