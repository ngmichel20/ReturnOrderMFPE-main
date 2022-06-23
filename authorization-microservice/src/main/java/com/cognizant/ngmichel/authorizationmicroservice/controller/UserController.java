package com.cognizant.ngmichel.authorizationmicroservice.controller;

import com.cognizant.ngmichel.authorizationmicroservice.model.LoginUser;
import com.cognizant.ngmichel.authorizationmicroservice.model.AuthToken;
import com.cognizant.ngmichel.authorizationmicroservice.config.TokenProvider;
import com.cognizant.ngmichel.authorizationmicroservice.model.User;
import com.cognizant.ngmichel.authorizationmicroservice.model.UserDto;
import com.cognizant.ngmichel.authorizationmicroservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenUtil;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody LoginUser loginUser) throws AuthenticationException {

        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.generateToken(authentication);
        return ResponseEntity.ok(new AuthToken(token));
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User saveUser(@RequestBody UserDto user) {
        return userService.save(user);
    }

    @PreAuthorize("hasRole('EMPLOYEE')")
    @GetMapping("/employee-access")
    public boolean employeePing() {
        return true;
    }

    @PreAuthorize("hasRole('CUSTOMER')")
    @GetMapping("/customer-access")
    public boolean customerPing() {
        return true;
    }
}
