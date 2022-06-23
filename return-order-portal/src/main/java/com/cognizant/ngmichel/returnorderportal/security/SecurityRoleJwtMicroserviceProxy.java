//package com.cognizant.ngmichel.returnorderportal.security;
//
//import com.cognizant.ngmichel.returnorderportal.dto.AuthToken;
//import com.cognizant.ngmichel.returnorderportal.dto.LoginUser;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@FeignClient(name="${security.microservice.name}")
//public interface SecurityRoleJwtMicroserviceProxy {
//    @PostMapping("${security.microservice.register.path}")
//    public LoginUser saveUser(@RequestBody LoginUser user);
//
//    @PostMapping("${security.microservice.authenticate.path}")
//    public AuthToken getToken(@RequestBody LoginUser user);
//}
