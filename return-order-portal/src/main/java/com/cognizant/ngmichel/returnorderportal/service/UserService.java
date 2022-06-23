package com.cognizant.ngmichel.returnorderportal.service;
//
//import com.cognizant.ngmichel.returnorderportal.dto.LoginUser;
//import com.cognizant.ngmichel.returnorderportal.dto.User;
//import com.cognizant.ngmichel.returnorderportal.dto.UserCreationStatus;
//import com.cognizant.ngmichel.returnorderportal.model.Authority;
//import com.cognizant.ngmichel.returnorderportal.model.UserApp;
//import com.cognizant.ngmichel.returnorderportal.repository.UserRepository;
////import com.cognizant.ngmichel.returnorderportal.security.SecurityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.List;
//
//@Service
//public class UserService {
////    @Autowired
////    SecurityService securityService;
//
//    @Autowired
//    UserMicroserviceProxy userProxy;
//
//    @Autowired
//    UserRepository userRepo;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//
//    public List<User> getUsers(String bearerToken) {
//        try {
//            return this.userProxy.getAllUsersDetails(bearerToken);
//        } catch(Exception e) {
//            return null;
//        }
//    }
//
//    public UserApp getUser(String email) {
//        return this.userRepo.findByEmail(email);
//    }
//
//    public User getUserDetailsByFirstName(String firstName, String bearerToken) {
//        try {
//            return this.userProxy.getUserDetailsByFirstName(firstName, bearerToken);
//        } catch(Exception e) {
//            return null;
//        }
//    }
//
////    public UserCreationStatus createUser(User user, String bearerToken) {
////        User newUser = this.buildCustomer(user);
////        try {
////            UserCreationStatus status = this.userProxy.postCreateAccount(newUser, bearerToken);
////            UserApp newUserApp = new UserApp();
////            newUserApp.setAuthorities(new HashSet<>());
////            newUserApp.setPassword(this.passwordEncoder.encode(user.getPassword()));
////            newUserApp.setEmail(user.getEmail());
////            newUserApp.setUserFirstName(user.getFirstName());
////            Authority customerAuthority = new Authority();
////            customerAuthority.setName("ROLE_CUSTOMER");
////            newUserApp.getAuthorities().add(customerAuthority);
////            LoginUser login = new LoginUser();
////            login.setPassword(user.getPassword());
////            login.setUsername(newUser.getEmail());
////            if (this.securityService.register(login)) {
////                this.userRepo.save(newUserApp);
////                return status;
////            } else {
////                throw new Exception("User not registered !");
////            }
////        } catch(Exception e) {
////            e.printStackTrace();
////            UserCreationStatus failedStatus = new UserCreationStatus();
////            failedStatus.setMessage("ko");
////            return failedStatus;
////        }
////    }
//
//    private User buildCustomer(User customer) {
//        User newCustomer = new User();
//        newCustomer.setFirstName(customer.getFirstName());
//        newCustomer.setLastName(customer.getLastName());
//        newCustomer.setEmail(customer.getEmail());
//        newCustomer.setMobileNumber(customer.getMobileNumber());
//        newCustomer.setAddress(customer.getAddress1() + "," + customer.getAddress2() + "," + customer.getCountry() + "," + customer.getState() + "," + customer.getZip());
//        newCustomer.setDateOfBirth(customer.getDateOfBirth());
//        return newCustomer;
//
//    }
//}
