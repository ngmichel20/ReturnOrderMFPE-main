package com.cognizant.ngmichel.returnorderportal.service;
//
//import com.cognizant.ngmichel.returnorderportal.dto.User;
//import com.cognizant.ngmichel.returnorderportal.dto.UserCreationStatus;
//import com.cognizant.ngmichel.returnorderportal.model.UserApp;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@FeignClient(name="${user.microservice.name}")
//public interface UserMicroserviceProxy {
//    @PostMapping("${user.microservice.create.path}")
//    public UserCreationStatus postCreateAccount(@RequestBody User customer, @RequestHeader(name = "Authorization", required = false) String bearerToken);
//
//    @GetMapping("${user.microservice.getDetails.path}")
//    public User getCustomerDetails(@RequestParam Long customerId, @RequestHeader(name = "Authorization", required = false) String bearerToken);
//
//    @GetMapping("${user.microservice.getdetailsbyfirstname.path}")
//    public User getUserDetailsByFirstName(@RequestParam String firstName, @RequestHeader(name = "Authorization", required = false) String bearerToken);
//
//    @GetMapping("${user.microservice.getallusers.path}")
//    public List<User> getAllUsersDetails(@RequestHeader(name = "Authorization", required = false) String bearerToken);
//}
