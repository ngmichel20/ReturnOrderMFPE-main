//package com.cognizant.ngmichel.returnorderportal.security;
//
//import com.cognizant.ngmichel.returnorderportal.dto.AuthToken;
//import com.cognizant.ngmichel.returnorderportal.dto.LoginUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SecurityService {
//
//    @Autowired
//    private SecurityRoleJwtMicroserviceProxy securityProxy;
//
//    public String getToken(LoginUser user) {
//        try {
//            AuthToken token = this.securityProxy.getToken(user);
//            return token.getToken();
//        } catch(Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public boolean register(LoginUser user) {
//        try {
//            System.out.println(user);
//            System.out.println(this.securityProxy.saveUser(user));
//            return true;
//        } catch(Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//}
